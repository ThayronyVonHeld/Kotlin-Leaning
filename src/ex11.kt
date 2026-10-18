/* Utilizando o when e intervalos (in), devolve a seguinte análise da classificação:
90 a 100: "Grau A"
75 a 89: "Grau B"
50 a 74: "Grau C"
0 a 49: "Grau D"
*/

fun main(){

    print("Digite um numero seu Grau de 0 a 100: ")
    val grau = readln().toInt()

    when(grau){
        in 0..49 -> print("Grau D")
        in 50..74 -> print("Grau C")
        in 75..89 -> print("Grau B")
        in 90..100 -> print("Grau A")
        else -> print("Digite um valor Valido")
    }
}