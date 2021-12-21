fun main() {
    fun isProperly(brackets: String): Boolean {
        val bracketsStack = arrayListOf<Char>()

        for (c in brackets) {
            if (c == '(') {
                bracketsStack.add(c)
            } else if (c == ')') {
                try {
                    bracketsStack.removeFirst()
                } catch (e: Exception) {
                    return false
                }
            }
        }

        return bracketsStack.isEmpty()

    }

    println("შეიყვანეთ სტრინგი: ")
    val brackets = readLine().toString()

    if (isProperly(brackets)) {
        println("მიმდევრობა სწორია.")
    } else {
        println("მიმდევრობა არასწორია.")
    }

}