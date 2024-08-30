# Algoritmos de Escalonamento

- Autores: Carlos Henrique Rodrigues Paixão, Erica Lima Silva, Karolyne Rodrigues Duarte, Livia Maria Araújo de Lima, Raimunda Nonata Costa Lima, Rayane Silva Duarte, Adina Alves de lima

Este projeto implementa e compara diferentes algoritmos de escalonamento em sistemas operacionais, como **First-Come, First-Served (FCFS)**, **Shortest Job First (SJF)** e **Round Robin (RR)**. O objetivo é analisar o desempenho de cada algoritmo em termos de tempo de execução e uso de memória.

## Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Algoritmos Implementados](#algoritmos-implementados)
  - [First-Come, First-Served (FCFS)](#first-come-first-served-fcfs)
  - [Shortest Job First (SJF)](#shortest-job-first-sjf)
  - [Round Robin (RR)](#round-robin-rr)
- [Como Executar](#como-executar)
  - [Pré-requisitos](#pré-requisitos)
  - [Instalação](#instalação)


## Sobre o Projeto

Este projeto visa estudar e demonstrar o funcionamento de três dos principais algoritmos de escalonamento de processos em sistemas operacionais:

- **First-Come, First-Served (FCFS)**: Processos são executados na ordem em que chegam.
- **Shortest Job First (SJF)**: Processos são ordenados e executados pelo tempo de execução mais curto.
- **Round Robin (RR)**: Processos são executados em ciclos, cada um recebendo um tempo de execução fixo (quantum).

Os algoritmos são comparados em termos de eficiência, considerando o tempo de execução total e a memória utilizada.

## Algoritmos Implementados

### First-Come, First-Served (FCFS)

No **FCFS**, os processos são executados na ordem em que chegam. Este algoritmo é simples, mas pode resultar em tempos de espera elevados para processos que chegam mais tarde.

### Shortest Job First (SJF)

O **SJF** ordena os processos pelo tempo de execução mais curto, minimizando o tempo de espera. Esse algoritmo é eficiente, mas pode levar à "fome" de processos mais longos.

### Round Robin (RR)

O **Round Robin** distribui o tempo de execução entre os processos, usando um quantum fixo. É justo, mas a escolha do quantum é crucial para o desempenho.

## Como Executar

### Pré-requisitos

Antes de começar, certifique-se de ter o Java instalado na sua máquina.

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) - Java 8 ou superior.

### Instalação

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/seuusuario/nome-do-repositorio.git
   cd nome-do-repositorio
