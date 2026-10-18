// Solicita uma nota (0-20) e apresenta: "Excelente" (>= 18), "Aprovado" (10-17) ou "Reprovado" (< 10).

fun main(){

    print("Digite sua nome")
    val nota = readln().toInt()

    if (nota >= 18){
        print("Excelente! Sua nota é $nota")
    } else if(nota in 10..<18) {
        print("Aprovado, sua nota é $nota")
    } else {
        print("Reprovado, ESTUDE MAIS!")
    }
}