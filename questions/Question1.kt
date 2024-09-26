package questions

class Question1 {
    fun main() {
        var INDICE = 12
        var SOMA = 0
        var K = 1

        // Loop que realiza a soma acumulativa enquanto K for menor que INDICE
        while (K < INDICE) {
            K += 1 // Incrementa K
            SOMA += K // Adiciona o valor de K à variável SOMA
        }

        // Imprime o valor final da soma
        println("O valor final da soma é: $SOMA")
    }

}