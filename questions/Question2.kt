package questions

class Question2 {
    // Funções para calcular o próximo número em cada sequência
    fun nextInSequenceA(numbers: List<Int>): Int {
        return numbers.last() + 2
    }

    fun nextInSequenceB(numbers: List<Int>): Int {
        return numbers.last() * 2
    }

    fun nextInSequenceC(numbers: List<Int>): Int {
        val n = numbers.size
        return n * n
    }

    fun nextInSequenceD(numbers: List<Int>): Int {
        val n = (numbers.size + 1) * 2
        return n * n
    }

    fun nextInSequenceE(numbers: List<Int>): Int {
        return numbers.takeLast(2).sum()
    }

    fun nextInSequenceF(numbers: List<Int>): Int {
        return numbers.last() + 1
    }

    // Função principal para determinar a sequência e calcular o próximo número
    fun calculateNext(sequence: List<Int>) {
        when {
            sequence == listOf(1, 3, 5, 7) -> println("Próximo número da sequência A: ${nextInSequenceA(sequence)}")
            sequence == listOf(2, 4, 8, 16, 32, 64) -> println("Próximo número da sequência B: ${nextInSequenceB(sequence)}")
            sequence == listOf(0, 1, 4, 9, 16, 25, 36) -> println("Próximo número da sequência C: ${nextInSequenceC(sequence)}")
            sequence == listOf(4, 16, 36, 64) -> println("Próximo número da sequência D: ${nextInSequenceD(sequence)}")
            sequence == listOf(1, 1, 2, 3, 5, 8) -> println("Próximo número da sequência E: ${nextInSequenceE(sequence)}")
            sequence == listOf(2, 10, 12, 16, 17, 18, 19) -> println("Próximo número da sequência F: ${nextInSequenceF(sequence)}")
            else -> println("Sequência não reconhecida!")
        }
    }
}