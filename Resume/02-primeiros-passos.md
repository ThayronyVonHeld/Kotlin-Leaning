- Conhecer as principais ferramentas e os ambientes de desenvolvimento Kotlin.
- Compreender o papel do JDK e da JVM no desenvolvimento e na execução de programas Kotlin.
- Conhecer o IntelliJ IDEA e configurar o ambiente de desenvolvimento.
- Compreender a estrutura básica de um programa Kotlin.

Para programar em Kotlin, precisamos de ferramentas que permitam escrever código, verificar erros, compilar e executar programas.
Ferramenta
Função
Kotlin
Linguagem utilizada para escrever o programa.
IntelliJ IDEA
IDE que permite escrever, organizar, analisar e executar código.
JDK (Java Development Kit)
Conjunto de ferramentas e componentes necessários para desenvolver aplicações destinadas à JVM.
JVM (Java Virtual Machine)
Ambiente que executa o bytecode produzido para a máquina virtual Java.
O Kotlin também pode ser desenvolvido noutros ambientes, mas o IntelliJ IDEA é uma das opções recomendadas para começar, pois possui suporte oficial à linguagem e integração com as ferramentas necessárias.
[image](https://www.google.com/s2/favicons?domain=https://www.jetbrains.com&sz=32)
IntelliJ IDEA Documentation
+1


[Get started with Kotlin | IntelliJ IDEA Documentation](https://images.openai.com/static-rsc-4/CN8kX0-15oog8GjRSyKP3ac887kSxI4oJxkXdFjQnBpeevMPRfGjy3cWf3ltQY3NKPCpSIiiAoP_K1oV6GU0GR6FZEM6vS4K0NAOjPrBrvIHPBGEuA1JpeiqqTHc10Ood1kvuqCmKg3AuxXWIk05RzFupZhLA6tCGqosa2sUzko?purpose=inline)
[jetbrains.com](https://www.jetbrains.com/help/idea/get-started-with-kotlin.html?utm_source=chatgpt.com)
O IntelliJ IDEA disponibiliza suporte para Kotlin, incluindo assistência ao código, análise estática e ferramentas de depuração. O plugin Kotlin já vem incluído e ativado por predefinição.
[image](https://www.google.com/s2/favicons?domain=https://www.jetbrains.com&sz=32)
IntelliJ IDEA Documentation
+1

1. Instala o IntelliJ IDEA através do [site oficial](https://www.jetbrains.com/idea/download/?utm_source=chatgpt.com).
2. Abre o programa e seleciona New Project.
3. Escolhe Kotlin como linguagem do projeto.
4. Dá um nome ao projeto, por exemplo, PrimeiroPrograma.
5. Seleciona um sistema de construção, como o IntelliJ ou Gradle, conforme as opções disponíveis e as indicações do professor.
6. Seleciona um JDK instalado ou utiliza a opção de transferência disponibilizada pelo IntelliJ IDEA.
7. Cria o projeto e abre o ficheiro Kotlin gerado ou cria um ficheiro Main.kt.
   Para os primeiros exercícios, podemos utilizar o sistema de construção nativo do IntelliJ, caso esteja disponível. Gradle será importante quando começarmos a trabalhar com projetos mais estruturados.
   [image](https://www.google.com/s2/favicons?domain=https://www.jetbrains.com&sz=32)
   IntelliJ IDEA Documentation
   +1

O primeiro programa costuma apresentar a mensagem Hello, World! no ecrã.
```
fun main() {
    println("Hello, World!")
}
```
Elemento
Significado
fun
Palavra-chave utilizada para declarar uma função.
main()
Função que serve como ponto de entrada habitual do programa.
{ }
Delimitam o bloco de código da função.
println()
Apresenta informação no ecrã e termina a linha.
"Hello, World!"
Texto, representado por uma cadeia de caracteres (String).
A execução deste programa apresenta:
```
Hello, World!
```
Uma função é um bloco de código que executa uma tarefa. Mais à frente, vamos estudar a sua estrutura, os parâmetros e os valores de retorno.
Embora estas etapas possam ser realizadas automaticamente pelo IntelliJ IDEA, são conceitos diferentes.
1. Escrita do código
   O programador escreve o código Kotlin no ficheiro .kt.
2. Compilação
   O compilador verifica o código e, num projeto JVM, produz bytecode.
3. Execução
   A JVM executa o bytecode e o programa produz o resultado.
   Esta sequência descreve o fluxo habitual de um programa Kotlin/JVM. Kotlin também possui outros destinos de compilação, pelo que nem todos os programas Kotlin são executados na JVM.
   [image](https://www.google.com/s2/favicons?domain=https://www.jetbrains.com&sz=32)
   IntelliJ IDEA Documentation
   +1

Para executar o programa no IntelliJ IDEA, clica no ícone verde de execução junto à função main() e seleciona a opção de execução apresentada. O resultado surgirá na consola da IDE.
[image](https://www.google.com/s2/favicons?domain=https://www.jetbrains.com&sz=32)
IntelliJ IDEA Documentation

- O IntelliJ IDEA é o ambiente de desenvolvimento; Kotlin é a linguagem de programação.
- O JDK fornece as ferramentas necessárias para desenvolver aplicações destinadas à JVM.
- A JVM executa o bytecode compatível com a sua especificação.
- A função main() é o ponto de entrada habitual de um programa Kotlin autónomo.
- println() permite apresentar informação na consola.
- Escrever, compilar e executar são etapas distintas, mesmo quando a IDE as coordena automaticamente.
  Cria um programa Kotlin que apresente três linhas na consola:
```
Nome: O teu nome
Curso: Engenharia Informática e de Computadores
Linguagem: Kotlin
```
Desafio: tenta resolver o exercício utilizando apenas três instruções println(), sem copiar o programa anterior por completo.
Quando terminares, confirma se o resultado apresentado na consola corresponde exatamente ao pretendido.
- [Documentação oficial Kotlin — Getting Started](https://kotlinlang.org/docs/getting-started.html?utm_source=chatgpt.com).
- [JetBrains — primeiros passos com Kotlin no IntelliJ IDEA](https://www.jetbrains.com/help/idea/get-started-with-kotlin.html?utm_source=chatgpt.com).
- [JetBrains — criar e executar a primeira aplicação Kotlin](https://www.jetbrains.com/help/idea/create-your-first-kotlin-app.html?utm_source=chatgpt.com).