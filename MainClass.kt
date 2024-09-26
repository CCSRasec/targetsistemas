import questions.Question1
import questions.Question2
import questions.Question3
import questions.Question5

fun main() {
    execQuestion1()
    execQuestion2()
    execQuestion3()
    execQuestion5()
}


private fun execQuestion1() {
    val qt1 = Question1()
    qt1.main()
}

private fun execQuestion2() {
    // Sequências de teste
    val sequenceA = listOf(1, 3, 5, 7)
    val sequenceB = listOf(2, 4, 8, 16, 32, 64)
    val sequenceC = listOf(0, 1, 4, 9, 16, 25, 36)
    val sequenceD = listOf(4, 16, 36, 64)
    val sequenceE = listOf(1, 1, 2, 3, 5, 8)
    val sequenceF = listOf(2, 10, 12, 16, 17, 18, 19)

    // Calculando o próximo número para cada sequência
    val qt2 = Question2()
    qt2.calculateNext(sequenceA)
    qt2.calculateNext(sequenceB)
    qt2.calculateNext(sequenceC)
    qt2.calculateNext(sequenceD)
    qt2.calculateNext(sequenceE)
    qt2.calculateNext(sequenceF)
}

private fun execQuestion3() {
    val qt3 = Question3()
    val faturamento = listOf(0.0, 150.0, 230.0, 0.0, 450.0, 210.0, 310.0, 0.0, 0.0, 500.0)
    qt3.calc(faturamento)
}

private fun execQuestion5() {
    val qt5 = Question5()
    qt5.main()
}