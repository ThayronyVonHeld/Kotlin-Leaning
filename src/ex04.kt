fun main(){ // Leia uma distância em metros e mostre os valores em Quilômetros e Centímetros.

    print("Digite a distancia em m para converter:")
    val distancia = readln().toDouble()

    val km = distancia / 1000
    val cm = distancia * 100

    print("A distancia $distancia m é igual a $km km e $cm cm")
}