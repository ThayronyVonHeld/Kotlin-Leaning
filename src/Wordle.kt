const val MAX_ATTEMPTS = 6
const val WRONG = '_'
const val CORRECT = '+'
const val SWAPPED = '#'

fun main() {
    val secret = words.random() // words.filter{ noRepeats(it) }.random()
    println("Adivinhar uma palavra com ${secret.length} letras em $MAX_ATTEMPTS tentativas.")
    var attempts = 1
    do {
        println("${attempts}ª tentativa")
        val guess: String = readGuess(secret.length)
        val result: String = getResult(secret, guess)
        println(guess)
        println(result)
        if (allCorrect(result)) break
        attempts++
    } while (attempts <= MAX_ATTEMPTS)

    val status = if (attempts > MAX_ATTEMPTS) "LOSE" else "WIN"
    println("YOU $status -> Word=$secret")
}

val words = listOf(
    "ARRAY", "CICLO", "DADOS", "DEBUG", "ERROS", "FLUXO", "LISTA", "PILHA",
    "TEXTO", "VALOR", "VETOR", "CHAVE", "CAMPO", "FONTE", "FORMA", "LINHA",
    "MUNDO", "PORTA", "PRAIA", "LIVRO", "CASAR", "PEDRA", "NUVEM", "SONHO",
    "TEMPO", "VERDE", "BANCO", "BEBER", "BRAVO", "CARRO", "COISA", "FOLHA",
    "GENTE", "GRUPO", "JOVEM", "MASSA", "NOITE", "PAPEL", "RAPAZ", "TERRA"
)

fun noRepeats(s: String): Boolean {
    for (i in s.indices)
        for (j in i + 1 until s.length)
            if (s[i] == s[j]) return false
    return true
}

fun allCorrect(result: String): Boolean{
    for(c in result)
        if(c != CORRECT) return false
    return true
}


fun readGuess(length: Int): String {
    var guess: String

    do {
        print("Palavra: ")
        guess = readln().uppercase()

        if (guess.length != length || !guess.all { it in 'A'..'Z' }) {
            println("Palavra inválida.")
        }

    } while (guess.length != length || !guess.all { it in 'A'..'Z' })

    return guess
}

fun getResult(secret: String, guess: String): String {
    var result = ""
    for (i in guess.indices)
        if(guess[i] == secret[i]) result += CORRECT
        else{
            var livres = 0
            var usadas = 0
            for (j in  secret.indices)
                if(secret[j] == guess[i] && secret[j] != guess[j]) livres++
            for (j in 0 until i)
                if(guess[j] == guess[i] && guess[j] != secret[j]) usadas++
            if(livres > usadas) result += SWAPPED
            else result += WRONG
        }
    return result
}
