/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initialize Root Object Delta Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl#getIdOfNewRoot <em>Id Of New Root</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl#getRootType <em>Root Type</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl#getRootTypeString <em>Root Type String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitializeRootObjectDeltaOpImpl extends DeltaOpImpl implements InitializeRootObjectDeltaOp {
	/**
	 * The default value of the '{@link #getIdOfNewRoot() <em>Id Of New Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfNewRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OF_NEW_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdOfNewRoot() <em>Id Of New Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfNewRoot()
	 * @generated
	 * @ordered
	 */
	protected String idOfNewRoot = ID_OF_NEW_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootType() <em>Root Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootType()
	 * @generated
	 * @ordered
	 */
	protected EClass rootType;

	/**
	 * The default value of the '{@link #getRootTypeString() <em>Root Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTypeString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_TYPE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootTypeString() <em>Root Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTypeString()
	 * @generated
	 * @ordered
	 */
	protected String rootTypeString = ROOT_TYPE_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializeRootObjectDeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.INITIALIZE_ROOT_OBJECT_DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdOfNewRoot() {
		return idOfNewRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOfNewRoot(String newIdOfNewRoot) {
		String oldIdOfNewRoot = idOfNewRoot;
		idOfNewRoot = newIdOfNewRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT, oldIdOfNewRoot, idOfNewRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootType() {
		if (rootType != null && rootType.eIsProxy()) {
			InternalEObject oldRootType = (InternalEObject)rootType;
			rootType = (EClass)eResolveProxy(oldRootType);
			if (rootType != oldRootType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE, oldRootType, rootType));
			}
		}
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRootType() {
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootType(EClass newRootType) {
		EClass oldRootType = rootType;
		rootType = newRootType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE, oldRootType, rootType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootTypeString() {
		return rootTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootTypeString(String newRootTypeString) {
		String oldRootTypeString = rootTypeString;
		rootTypeString = newRootTypeString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING, oldRootTypeString, rootTypeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT:
				return getIdOfNewRoot();
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION:
				return getLocation();
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE:
				if (resolve) return getRootType();
				return basicGetRootType();
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING:
				return getRootTypeString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT:
				setIdOfNewRoot((String)newValue);
				return;
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION:
				setLocation((String)newValue);
				return;
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE:
				setRootType((EClass)newValue);
				return;
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING:
				setRootTypeString((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT:
				setIdOfNewRoot(ID_OF_NEW_ROOT_EDEFAULT);
				return;
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE:
				setRootType((EClass)null);
				return;
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING:
				setRootTypeString(ROOT_TYPE_STRING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT:
				return ID_OF_NEW_ROOT_EDEFAULT == null ? idOfNewRoot != null : !ID_OF_NEW_ROOT_EDEFAULT.equals(idOfNewRoot);
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE:
				return rootType != null;
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING:
				return ROOT_TYPE_STRING_EDEFAULT == null ? rootTypeString != null : !ROOT_TYPE_STRING_EDEFAULT.equals(rootTypeString);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idOfNewRoot: ");
		result.append(idOfNewRoot);
		result.append(", location: ");
		result.append(location);
		result.append(", rootTypeString: ");
		result.append(rootTypeString);
		result.append(')');
		return result.toString();
	}

} //InitializeRootObjectDeltaOpImpl
