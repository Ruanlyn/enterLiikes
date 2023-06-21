fun main() {

    val likes = 1

    when (likes) {
        0 -> println("Никто не поставил лайк $likes")
        1 -> println("Один человек поставил лайк $likes")
        in 2..10 -> println("$likes человек поставил лайк")
        in 11..100 -> println("$likes людей поставило лайк")
        else -> println("$likes человек поставило лайк")
    }
}


