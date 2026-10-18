// Solicita a idade do utilizador e apresenta se é maior ou menor de idade.

fun main() {

    print("Digite sua Idade:")
    val idade = readln().toInt()

    if(idade >= 18){
        print("Você é maior de Idade, pode se registrar")
    } else{
        print("Você é MENOR de idade, não pode se registrar")
    }
}