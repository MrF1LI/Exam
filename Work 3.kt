fun main() {
    fun minSplit(numberList: ArrayList<Int>): Int {
        var result = 1

        while (true) {

            val minNumber = numberList.minOrNull()!!.toInt()

            if (result != minNumber) {
                return result
                break
            } else {
                result++
                if (numberList.size > 1) {
                    numberList.remove(minNumber)
                }
            }

        }
    }

    var numberList = arrayListOf(3, 7, 2, 4, 1, 5, 6, 8)

    println("მინიმალური რიცხვი: ${minSplit(numberList)}")
}