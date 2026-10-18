fun main(){ //  Leia dois números reais (Double) e mostre a soma, subtração, multiplicação e a média entre eles.

    print("Digite um numero:")
    val n1 = readln().toDouble()

    print("Digite um segundo numero:")
    val n2 = readln().toDouble()

    val soma = n1 + n2
    val subtracao = n1 - n2
    val divisao = n1/n2
    val multiplicacao = n1 * n2

    println("A soma entre $n1 + $n2 é igual a $soma")
    println("A subtração entre $n1 - $n2 é igual a $subtracao")
    println("A divisão entre $n1 / $n2 é igual a $divisao")
    println("A multiplicação entre $n1 * $n2 é igual a $multiplicacao")



}