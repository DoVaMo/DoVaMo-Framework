package org.educsos.dovamo.presentation.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 * Represents a recursive submenu action.
 * <p>
 * A {@code SubmenuAction} can contain one or multiple {@link Action Actions},
 * or one or multiple nested {@link SubmenuAction SubmenuActions}.
 * This allows the creation of hierarchical, recursive menu structures.
 */
public class SubmenuAction extends Action {
	private IEditorPart activeEditorPart;
	private ISelection selection;
	private List<CommandParameter> childrenParameter;
	private Function<CommandParameter, String> groupKeyProvider;
	private List<Action> submenuItems;
	private boolean isChild;

	/**
	 * 
	 * @param label The label that the subgroup should have.
	 * @param activeEditorPart Just delegate this through for the later creation of <code>CreateChildAction</code> and <code>CreateSiblingAction</code>
	 * @param selection Just delegate this through for the later creation of <code>CreateChildAction</code> and <code>CreateSiblingAction</code>
	 * @param children One information-object per Action.
	 * @param groupKeyProvider A function to retrieve the attribute by which sub-actions should be grouped. 
	 * @param isChild <code>true</code> -> ChildAction; <code>false</code> -> SiblingAction
	 */
	public SubmenuAction(String label, IEditorPart activeEditorPart, ISelection selection,
			List<CommandParameter> children, Function<CommandParameter, String> groupKeyProvider, boolean isChild) {
		super(label);
		this.activeEditorPart = activeEditorPart;
		this.selection = selection;

		this.childrenParameter = children;
		this.groupKeyProvider = groupKeyProvider;
		this.isChild = isChild;

		// do not subgroup the application package
		if (groupKeyProvider == null || label.equals("applicability") || label.equals("genericdeltametamodel")) {
			this.initLeafActions();
		} else {
			this.furtherSubgroup();
		}
	}

	/**
	 * Initializes the list of {@link Action} objects for this submenu,
	 * based on the command descriptors provided in {@code childrenParameter}.
	 * <p>
	 * Depending on whether this submenu represents child actions or sibling actions
	 * (controlled by the {@code isChild} flag), either {@link CreateChildAction}
	 * or {@link CreateSiblingAction} instances are created and added to the
	 * internal submenu list.
	 * </p>
	 */
	private void initLeafActions() {
		this.submenuItems = new ArrayList<Action>();
		for (CommandParameter descriptor : this.childrenParameter) {
			if(this.isChild) {
				this.submenuItems.add(new CreateChildAction(this.activeEditorPart, this.selection, descriptor));				
			} else {
				this.submenuItems.add(new CreateSiblingAction(this.activeEditorPart, this.selection, descriptor));
			}
		}
	}

	/**
	 * Creates subgroups of menu items by grouping the contained
	 * {@link CommandParameter} instances according to a key provided
	 * by {@code groupKeyProvider}.
	 * <p>
	 * For each group a dedicated {@link SubmenuAction} is created and added
	 * to the internal submenu list, effectively building a hierarchical
	 * submenu structure.
	 * </p>
	 * <p>
	 * If either {@code childrenParameter} or {@code groupKeyProvider} is not set,
	 * no further subgrouping is performed.
	 * </p>
	 */
	private void furtherSubgroup() {
		this.submenuItems = new ArrayList<Action>();
		if (this.childrenParameter == null || this.groupKeyProvider == null)
			return;

		// Gruppieren nach groupKeyProvider
		Map<String, List<CommandParameter>> grouped = new LinkedHashMap<>();
		for (CommandParameter cp : this.childrenParameter) {
			String key = this.groupKeyProvider.apply(cp);
			grouped.computeIfAbsent(key, _ -> new ArrayList<>()).add(cp);
		}

		// Für jede Gruppe eine neue SubmenuAction erzeugen
		for (Map.Entry<String, List<CommandParameter>> entry : grouped.entrySet()) {
			String label = entry.getKey();
			SubmenuAction sub = new SubmenuAction(label, this.activeEditorPart, this.selection, entry.getValue(), null, this.isChild);
			this.submenuItems.add(sub);
		}
	}

	/**
	 * Returns the currently generated submenu items for this submenu.
	 *
	 * @return a list of {@link Action} objects,
	 *         which may include direct actions or nested {@link SubmenuAction} elements
	 */
	public List<Action> getSubmenuItems() {
		return this.submenuItems;
	}

	/**
	 * Builds a recursive {@link MenuManager} structure that contains this submenu
	 * along with all nested {@link SubmenuAction} instances.
	 * <p>
	 * Each submenu is recursively expanded by calling
	 * {@link #getSubmenuRecursively()}, resulting in a complete hierarchical
	 * menu structure.
	 * </p>
	 *
	 * @return a {@link MenuManager} representing this submenu and all of its children
	 */
	public MenuManager getSubmenuRecursively() {
		MenuManager menu = new MenuManager(this.getText());

		if (this.submenuItems == null)
			return menu;

		for (Action a : this.submenuItems) {
			if (a instanceof SubmenuAction sub) {
				// If small subgroups should be flattened:
//				if (sub.getSubmenuItems().size() < 2) {
//					for (Action a2 : sub.getSubmenuItems()) {
//						if (a2 instanceof SubmenuAction sub2) {
//							menu.add(sub2.getSubmenuRecursively());
//						} else {
//							menu.add(a2);
//						}
//					}
//				} 
//				else {
				// Rekursiv Submenus hinzufügen
				MenuManager submenu = sub.getSubmenuRecursively();
				menu.add(submenu);
//				}
			} else {
				menu.add(a);
			}
		}

		return menu;
	}

	/**
	 * 
	 * @param activeEditorPart Just delegate this through for the later creation of <code>CreateChildAction</code> and <code>CreateSiblingAction</code>
	 * @param selection Just delegate this through for the later creation of <code>CreateChildAction</code> and <code>CreateSiblingAction</code>
	 * @param descriptors Needed, since later the <code>CommandParameter</code> is no retrievable from an <code>Action</code>
	 * @param isChild <code>true</code> -> ChildAction; <code>false</code> -> SiblingAction
	 * @return
	 */
	public static Collection<IAction> getActions(IEditorPart activeEditorPart, ISelection selection,
			Collection<?> descriptors, boolean isChild) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors == null) {
			return actions;
		}

		Map<EPackage, List<CommandParameter>> groupedByPackage = new LinkedHashMap<>();
		for (Object descriptor : descriptors) {
			if (descriptor instanceof CommandParameter cp && cp.getValue() instanceof EObject value) {
				EPackage ePkg = value.eClass().getEPackage();
				groupedByPackage.computeIfAbsent(ePkg, _ -> new ArrayList<CommandParameter>()).add(cp);
			}
		}

		// Creating the delegate to further sub-group actions
		Function<CommandParameter, String> groupingDelegate = cp -> {
			String name = cp.getEValue().eClass().getName();
			// split at first uppercase after first char
			for (int i = 1; i < name.length(); i++) {
				if (Character.isUpperCase(name.charAt(i)))
					return name.substring(0, i);
			}
			return name;
		};

		for (Map.Entry<EPackage, List<CommandParameter>> entry : groupedByPackage.entrySet()) {
			String pkgLabel = entry.getKey().getName();
			List<CommandParameter> val = entry.getValue();			
			val.sort(Comparator.comparing(cp -> cp.getEValue().eClass().getName()));
			actions.add(new SubmenuAction(pkgLabel, activeEditorPart, selection, entry.getValue(), groupingDelegate, isChild));
		}

		return actions;
	}
}