fun main() {
    var likes = 111
    val chel = "человеку"
    val lud = "людям"
    println(
        "Понравилось $likes " + if (likes.mod(10) == 1
            && likes.mod(100) != 11
        ) chel else if (likes.mod(10) in 2..4
            && likes.mod(100) < 10 || likes.mod(100) >= 20
        ) lud else lud
    )
}






