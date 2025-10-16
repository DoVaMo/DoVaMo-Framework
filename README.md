# 🧩 DoVaMo – *Delta-Oriented Variability Modeling*

[![Java](https://img.shields.io/badge/Java-25%2B-orange)]()
[![Maven](https://img.shields.io/badge/Maven-3.8%2B-red)]()
[![Eclipse](https://img.shields.io/badge/Eclipse-Platform-2C2255?logo=eclipseide&logoColor=white)](https://www.eclipse.org/)
[![EMF](https://img.shields.io/badge/EMF-Eclipse_Modeling_Framework-FFD54F?logo=eclipseide&logoColor=white)](https://www.eclipse.org/modeling/emf/)
[![Xtext](https://img.shields.io/badge/Xtext-DSL_Framework-4CAF50?logo=eclipseide&logoColor=white)](https://www.eclipse.org/Xtext/)
[![Version](https://img.shields.io/badge/version-1.0.0-green.svg)]()
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](./LICENSE)

> **DoVaMo** (*Delta-Oriented Variability Modeling Framework*) is a modular toolkit for defining, generating, and managing delta-oriented extensions of domain-specific modeling languages.
> It enables model-based variability handling, feature-driven customization, and automated generation of delta-enabled modeling environments.

---

---

## 📘 Documentation

For detailed diagrams and an overview of the system architecture, see:

➡️ [**DoVaMo Architecture Overview**](./docs/architecture.md)


## 🏗️ Project Structure

DoVaMo is organized as a **multi-module Maven/Eclipse project**.
Each submodule provides specific functionality for working with *delta metamodels*, *feature integration*, and *domain transformations*.

### ⚙️ Core Modules

| Module | Description |
|---------|--------------|
| **`dovamo-delta`** | Defines the **generic delta metamodel** used as the foundation for all other components. |
| **`dovamo-delta-consistency-check`** | Implements **consistency checks** on the delta level (e.g., ensuring logical and structural correctness). Example rule: `∀ Δ d : d.idOfAffectedObject ⇒ ∃ ΔOp do : do...` |
| **`dovamo-delta-algebra`** | Provides **algebraic operations** on deltas, such as:<br>– *Delta negation*<br>– *Delta rebasing*<br>– *Delta refactoring*<br>– Analysis of “mandatory after” vs. “optional after” relationships |

---

### 🌲 Feature Integration

| Module | Description |
|---------|--------------|
| **`dovamo-feature`** | Integrates the **Feature Model** perspective into DoVaMo:<br>– Supports both *Problem Space* and *Solution Space* feature models<br>– Handles *implicit constraints* and *cross-domain delta mappings* (e.g. 25 component deltas vs. 40 state machine deltas)<br>– Enables *variable variability* through transformations like `renameFeature`, `mandatory2optional`<br>– Transforms `featureMetamodel.ecore` → `delta_featureMetamodel.ecore` |

---

### 🧬 Delta-ification of Domains

| Module | Description |
|---------|--------------|
| **`dovamo-gen-dialect`** | Automatically **generates delta dialects** for a given domain metamodel:<br>`domain.ecore → delta_domain.ecore` |
| **`dovamo-gen-project`** | Generates complete **Eclipse delta projects**:<br>`domain.ecore → delta_domain.pom`<br>Includes project scaffolding and delta editors.|
| **`dovamo-gen-grammar`** | Creates Xtext-based **delta grammars**:<br>`domain.ecore → delta_domain.xtext`<br>Supports Language Server Protocol features (syntax highlighting, autocompletion, etc.) |
| **`dovamo-gen-editor`** | Generates **graphical editors** (Sirius-based):<br>`domain.ecore → delta_domain.sirius`<br>Provides visual editing and delta monitoring solution). |

---

### 💻 Interfaces

| Module | Description |
|---------|--------------|
| **`dovamo-cli`** | Command-line interface (CLI) for running DoVaMo tools and generators via terminal. |
| **`dovamo-web`** | Web-based frontend providing a REST API and UI for remote delta modeling and visualization. |

---

## 🧠 Vision & Future Work

- 🔗 **UVL Integration** – Seamless connection to the [Universal Variability Language (UVL)](https://github.com/Universal-Variability-Language) for interoperable variability modeling.
- 🔄 **CI/CD Pipeline** – Automated validation and delta-generation pipeline for continuous integration environments.
- 🧩 **Cross-domain Mapping** – Expand delta synchronization across multiple modeling domains.
- 📦 **Plug-in Marketplace Integration** – Make DoVaMo modules available via Eclipse/VSCode extensions.

---

## 🚀 Getting Started

### Prerequisites
- Java **25+**
- Maven **3.8+**
- Eclipse Modeling Tools (with EMF, Xtext, and Sirius plugins)

### Build
```bash
mvn clean build
```

## 📚 References

- **Delta Modeling:** Schaefer, I., et al. “Delta-Oriented Programming of Software Product Lines.”

---

## 🧩 License

Distributed under the **Apache License 2.0**.
See [`LICENSE`](./LICENSE) for details.

---

## 👥 Maintainers

**DoVaMo Team**
A collaboration between the **TVA KASTEL** research group at the **Karlsruhe Institute of Technology (KIT)**
and the **CDL VaSiCS** laboratory at the **Johannes Kepler University Linz (JKU)**.

This project is jointly maintained by researchers and developers from both institutions,
focusing on model-driven engineering, variability management, and delta-oriented modeling.

---

### 🧑‍💻 Maintainers List

| Name | Affiliation | Role |
|------|--------------|------|
| Dirk Neumann | KIT – TVA KASTEL | Core Developer / Tooling |
| Malte Grave | JKU – CDL VaSiCS | Core Developer / Grammer generation and Delta Consistency |


---

> For general inquiries or collaboration opportunities, please contact
> **[tva.kastel.kit.edu](https://tva.kastel.kit.edu/)** or **[jku.at/cdl-vasics/](https://www.jku.at/cdl-vasics/)**.

---
