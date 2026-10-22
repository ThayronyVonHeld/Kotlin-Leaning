fun noRepeats(){
    var check: Boolean
    var s: String
    val iterador = s.indices

    check = true

    for (i in iterador){
        var teste = s[i]
        if (teste == s[i] - 1){
            check = false;
            break
        }
    }

    return check
}