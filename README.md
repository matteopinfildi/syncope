<!--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->

# Progetto di Software Testing: Apache Syncope
 **Corso:** Ingegneria del Software 2 (2025/2026)

Questo repository è un fork del progetto originale Apache Syncope, utilizzato per l'ambiente di lavoro isolato dedicato alle sperimentazioni di testing. Per garantire il corretto funzionamento, è stato implementato un ambiente di Continuous Integration su GitHub Actions isolato tramite un file personalizzato `maven.yml`.

 **[Clicca qui per scaricare e leggere il Report completo del Progetto (Report_Pinfildi_ISW2.pdf)](#)**

## Obiettivi e Contenuto del Progetto
L'obiettivo principale di questo lavoro è stato l'applicazione di tecniche di verifica e validazione su due classi del framework: `ResourceLogic` e `DefaultRealmPullResultHandler`.

Nel report sono documentate le seguenti fasi di analisi:
*   **Manual Testing:** Progettazione dei test funzionali Black-Box utilizzando la tecnica del Category Partition e successiva ottimizzazione White-Box per intercettare le porzioni di codice sfuggite all'approccio funzionale.
*   **Analisi della Copertura e Mutation Testing:** Valutazione dell'adeguatezza delle test suite attraverso JaCoCo (Statement e Branch coverage) e misurazione della robustezza tramite iniezione di mutanti con PIT.
*   **Generazione Automatica (Randoop ed EvoSuite):** Valutazione dei limiti strutturali dei tool automatizzati nell'istanziare le complesse dipendenze del SUT, parzialmente risolti tramite l'implementazione di classi helper per la risoluzione dell'iniezione.
*   **Generazione tramite LLM:** Confronto tra approccio Zero-Shot e Guided Tree prompting tramite Copilot, evidenziando il divario tra le elevate metriche quantitative (raggiunte aggirando il normale flusso logico) e l'effettiva qualità strutturale dei test generati.
*   **Refactoring Automatico:** Valutazione di quattro varianti refactorizzate tramite LLM (C1, C2, C3, C4) per la risoluzione dei code smell, misurando l'impatto delle modifiche sulla testabilità e sull'equivalenza funzionale.

---
*(Di seguito, il README originale del progetto Apache Syncope)*

The mission of **Apache Syncope** is the creation and maintenance of software related to managing
digital identities in enterprise environments.

More information at https://syncope.apache.org

<a href="https://bestpractices.coreinfrastructure.org/projects/154">
  <img src="https://bestpractices.coreinfrastructure.org/projects/154/badge"/>
</a>
<a href="#">
  <img src="https://img.shields.io/maven-central/v/org.apache.syncope/syncope.svg"/>
</a>
<a href="https://github.com/apache/syncope/actions/workflows/crosschecks.yml">
  <img src="https://github.com/apache/syncope/actions/workflows/crosschecks.yml/badge.svg"/>
</a>
<a href="https://github.com/apache/syncope/actions/workflows/codeql-analysis.yml">
  <img src="https://github.com/apache/syncope/actions/workflows/codeql-analysis.yml/badge.svg"/>
</a>
