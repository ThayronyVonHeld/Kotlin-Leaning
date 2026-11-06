// Pergunte a velocidade de um carro. Se passar de 80Km/h, mostre que foi multado e o valor (R$5 por cada Km acima do limite).

fun main(){

    print("Qual foi sua velocidade maxima? ")
    val n1 = readln().toInt()

    if (n1 > 80){
      val multa = (n1 - 80) * 5
        println("Você ultrapassou o limite de velocidade")
        print("Recebeu uma multa de: R$$multa")
    } else{
        print("Parabéns por respeitar os limites de transito")
    }

}