// Crie um programa que leia o preço de um produto e o salário de um funcionário. Mostre o preço do produto com 5% de desconto e o salário com 15% de aumento.

fun main(){

    print("Digite o valor do salario:")
    val salario = readln().toDouble()
    print("Digite o valor do produto:")
    val valor = readln().toDouble()

    val desconto = valor - (valor * 0.05)
    val aumentoSal = salario + (salario * 0.15)

    println("Você ganhou 15% de aumento! Seu salario de $salario, foi para $aumentoSal")
    print("Seu produto ganhou 5% de desconto saindo de $valor para $desconto!! ")
}