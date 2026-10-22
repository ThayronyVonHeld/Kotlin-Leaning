
const val MAX_ATTEMPTS = 6
const val WRONG = '_'
const val CORRECT = '+'
const val SWAPPED = '#'

fun main() {
    val secret = words.random()
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

fun noRepeats(s: String): Boolean{
    var check = true
    val iterador = s.indices

    for (i in iterador){
        var teste = s[i]
        for (j in iterador ){
            if (teste == s[j] && i != j){
                check = false
                break
            }
        }
    }
    return check
}


fun allCorrect(result: String): Boolean{

    var verificador = true
    val tamanho = result.indices

    for (i in tamanho){
        if (result[i] != CORRECT) {
            verificador = false
            break }
    }

    return verificador
}

fun readGuess(length: Int): String {
    var palavrafinal: String

    do {
       println("Palavra: ")
       val s = readln()
       palavrafinal = s.uppercase();

        if (palavrafinal.length != length) {
            println("Palavra inválida. Introduza uma palavra com exatamente $length letras.") }

        } while (palavrafinal.length != length)

    return palavrafinal
}


fun getResult(secret: String, guess: String): String {
    val res = CharArray(guess.length) { WRONG }
    val used = BooleanArray(secret.length) { false }

    for (i in guess.indices) {
        if (guess[i] == secret[i]) {
            res[i] = CORRECT
            used[i] = true
        }
    }

    for (i in guess.indices) {
        if (res[i] != CORRECT) {
            for (j in secret.indices) {
                if (guess[i] == secret[j] && !used[j]) {
                    res[i] = SWAPPED
                    used[j] = true
                    break
                }
            }
        }
    }

    return String(res)
}

