# 📚 Resumo 02 - Ambiente de Desenvolvimento e Estrutura Básica em Kotlin

---

## 🎯 Objetivos da Aula

* Conhecer as principais ferramentas e os ambientes de desenvolvimento Kotlin
* Compreender o papel do JDK e da JVM no desenvolvimento e na execução
* Conhecer o IntelliJ IDEA e saber configurar o ambiente de desenvolvimento
* Compreender a estrutura básica de um programa Kotlin

---

## 🛠️ Ferramentas e Ambiente de Desenvolvimento

Para programar em Kotlin, precisamos de ferramentas que permitam escrever, verificar erros, compilar e executar o código.

| Ferramenta | Função |
| --- | --- |
| **Kotlin** | Linguagem utilizada para escrever o programa. |
| **IntelliJ IDEA** | IDE (Ambiente de Desenvolvimento Integrado) que permite escrever, organizar, analisar e executar código. |
| **JDK** | *(Java Development Kit)* Conjunto de ferramentas necessárias para desenvolver aplicações destinadas à JVM. |
| **JVM** | *(Java Virtual Machine)* Máquina virtual que executa *bytecode* compatível com a sua especificação. |

> 💡 **Nota**: O Kotlin pode ser desenvolvido em diferentes ambientes, mas o **IntelliJ IDEA** (criado pela própria JetBrains) é a opção mais recomendada, pois já traz suporte nativo ativado por predefinição.

---

## ⚙️ Instalação e Configuração do IntelliJ IDEA

O IntelliJ IDEA disponibiliza assistência ao código, deteção de erros e ferramentas de depuração (debug).

### Passos para criar um projeto:

1. Instala o IntelliJ IDEA.
2. Abre o programa e seleciona **New Project**.
3. Escolhe **Kotlin** como linguagem do projeto.
4. Define um nome para o projeto (ex: `PrimeiroPrograma`).
5. Seleciona o sistema de construção (**IntelliJ** ou **Gradle**), conforme as necessidades.
6. Seleciona um **JDK** instalado ou utiliza a opção de transferência disponibilizada pela IDE.
7. Cria o projeto e abre o ficheiro Kotlin gerado (ou cria um novo ficheiro `Main.kt`).

> 🌐 **Contexto**: O sistema **Gradle** será especialmente útil mais à frente, quando começares a trabalhar com projetos maiores e precisares de gerir dependências externas.

---

## 💻 O Primeiro Programa em Kotlin

O programa inaugural clássico em qualquer linguagem serve para apresentar uma mensagem no ecrã.

```kotlin
fun main() {
    println("Hello, World!")
}

```

### Estrutura do Programa

| Elemento | Significado |
| --- | --- |
| `fun` | Palavra-chave utilizada para declarar uma função. |
| `main()` | Função que serve como ponto de entrada habitual de um programa Kotlin autónomo. |
| `{ }` | Chaves que delimitam o bloco de código da função. |
| `println()` | Instrução que apresenta informação na consola e termina a linha. |
| `"Hello, World!"` | Texto representado pelo tipo `String`. |

**Resultado da execução na consola:**

```text
Hello, World!

```

---

## 🔄 Escrita, Compilação e Execução

Embora o IntelliJ IDEA automatize estas etapas com um simples clique no botão verde de "Run" (▶️), cada fase tem uma finalidade distinta.

```mermaid
flowchart LR
    A[Escrita<br>Ficheiro .kt] -->|Compilador| B(Bytecode<br>.class)
    B -->|Execução| C{JVM}
    C --> D[Resultado<br>na Consola]
```

1. **Escrita do código**: O programador escreve as instruções num ficheiro (normalmente com a extensão `.kt`).
2. **Compilação**: O compilador verifica o código e transforma-o em *bytecode* específico para a JVM.
3. **Execução**: A JVM lê e executa esse *bytecode*, produzindo o resultado final na consola da IDE.

> 💡 **Curiosidade**: Este é o fluxo para a JVM, mas o Kotlin é versátil! Ele também permite compilar código para outros destinos (como JavaScript ou binários nativos), não dependendo exclusivamente de uma JVM.

---