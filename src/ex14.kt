//  Leia o ano de nascimento de uma pessoa. Mostre a sua idade e se ela: ainda vai se alistar
//  (quantos anos faltam), se é o ano de se alistar, ou se já passou do tempo.

fun main(){

    print("Digite o ano de nascimento: ")
    val n1 = readln().toInt()
    val idade = 2026 - n1

    println("Sua idade é: $idade")
    if (idade < 18){
        val ali1 = 18 - idade
        println("Falta $ali1 anos para o seu alistamento")
    } else if (idade > 18){
        val ali2 = idade - 18
        print("Você precisa se alistar! Já passou $ali2 anos, desde o ano do seu alistamento")
    }else{
        print("Você está no ano do alistamento obrigatorio")
    }
}