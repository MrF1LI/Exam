fun main() {

    fun isPalindrome(word: String): Boolean = word == word.reversed()

    println("შეიყვანეთ სიტყვა, რათა შეამოწმოთ არის თუ არა ის პალინდრომი:")
    val word: String = readLine().toString()

    if (isPalindrome(word)) {
        println("სიტყვა \"$word\" პალინდრომია.")
    } else {
        println("სიტყვა \"$word\" არ არის პალინდრომი.")
    }

}