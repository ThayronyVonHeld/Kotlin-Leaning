/* Solicita um número (1-7) e utiliza o `when` para apresentar o dia correspondente.
 Trata as entradas inválidas com o bloco `else`.
*/

fun main(){

    print("Digite um numero no intervalo 1-7: ")
    val dia = readln().trim().toInt()// trim para remover os possiveis espaços

    println("Você Digitou o numero equivalente a")

    when (dia){
        1 -> println("Domingo")
        2 -> println("Segunda-Feira")
        3 -> println("Terça-Feira")
        4 -> println("Quarta-Feira")
        5 -> println("Quinta-Feira")
        6 -> println("Sexta-Feira")
        7 -> println("Sabado")
        else -> print("Digita um valor no intervalo Correto! ")
    }

}