/* Lê dois números inteiros e utiliza um if como expressão para guardar
numa nova variável chamada maior qual o maior dos dois números, imprimindo-a no final.
*/

fun main(){

    print("Digite um numero: ")
    val n1 = readln().toInt()

    print("Digite um numero: ")
    val n2 = readln().toInt()

    val maior = if (n1 > n2) n1 else n2
    print("O maior numero é: $maior")


}