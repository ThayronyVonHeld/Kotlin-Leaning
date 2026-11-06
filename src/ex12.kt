// 6. **Par ou Ímpar:** Leia um número e diga se é par ou ímpar. *Dica: Tente usar o `if` como expressão:

fun main(){

    print("Digite um numero:")
    val n1 = readln().toInt()

    if(n1 % 2 == 0) print("par") else print("impar")

}