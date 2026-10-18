//Calcule o preço total de um aluguel de carro,
//perguntando a quantidade de Km percorridos e os dias alugados. (R$90/dia e R$0,20/Km).

fun main(){

    println("--------------------------")
    println("Formulario Aluguel Veiculo")
    println("--------------------------")

    print("Digite quantos dias alugou o veiculo?")
    val aluguel = readln().toInt()

    print("Digite quantos km foram percorridos?")
    val distancia = readln().toDouble()

    val valortot = (aluguel * 90) + (distancia * 0.2)

    println("--------------------------")
    println("Valor a Pagar: $valortot")
    println("--------------------------")
}