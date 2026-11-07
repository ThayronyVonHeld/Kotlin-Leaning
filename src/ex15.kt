/*
Calculadora de IMC (Uso do when): Leia o peso e a altura, calcule o IMC (peso / altura²) e use a estrutura when para classificar:
* Menor que 18.5: Abaixo do peso
* 18.5 a 24.9: Peso ideal
* 25.0 a 29.9: Sobrepeso
* 30 ou mais: Obesidade
 */

fun main() {

    print("Digite a sua altura:")
    val altura = readln().toDouble()

    print("Digite seu peso:")
    val peso = readln().toDouble()

    val imc = peso / (altura * altura)

    when(imc){
        in 0.0..18.4 -> print("Abaixo do peso")
        in 18.5..24.9 -> print("Peso Ideal")
        in 25.0..29.9 -> print("Sobrepeso")
        else -> print("Obesidade")
    }

}