fun main(){ //Escreva um programa que leia o nome e o salário de um funcionário e imprima uma mensagem usando String Templates.

    print("Digite seu nome:")
    val nome = readln()

    print("Digite seu salario:")
    val salario = readln().toDouble()

    print("O nome do funcionario é $nome, e seu salario é de €$salario")
}