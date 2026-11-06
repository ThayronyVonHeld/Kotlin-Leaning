fun main(){
    val l1: List<String> = listOf("PG", "ISEL", "2025", "2026")

    val l2 = l1.reversed()

    println(l2.map{it.length}.filter{it<=2025})

}