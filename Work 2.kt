fun main() {

    fun minSplit(amount1: Int) {

        var amount = amount1

        var count50 = 0
        var count20 = 0
        var count10 = 0
        var count5 = 0
        var count1 = 0

        if (amount >= 50) {
            do {
                count50++
                amount -= 50
            } while (amount - 50 >= 0)
        }

        if (amount in 20..49) {
            do {
                count20++
                amount -= 20
            } while (amount - 20 >= 0)
        }

        if (amount in 10..19) {
            do {
                count10++
                amount -= 10
            } while (amount - 10 >= 0)
        }

        if (amount in 5..9) {
            do {
                count5++
                amount -= 5
            } while (amount - 5 >= 0)
        }

        if (amount in 1..4) {
            do {
                count1++
                amount -= 1
            } while (amount - 1 >= 0)
        }

        println("\n$amount1 თეთრის დასახურდავებლად საჭიროა:")
        if (count50 != 0) { println("$count50 - 50 თეთრიანი") }
        if (count20 != 0) { println("$count20 - 20 თეთრიანი") }
        if (count10 != 0) { println("$count10 - 10 თეთრიანი") }
        if (count5 != 0) { println("$count5 - 5 თეთრიანი") }
        if (count1 != 0) { println("$count1 - 1 თეთრიანი") }

    }

    println("შეიყვანეთ თანხა (თეთრებში): ")
    val amount = readLine()!!.toInt()

    minSplit(amount)

}