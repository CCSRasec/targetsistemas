package questions

class Question3 {
    fun calc(faturamento: List<Double>) {
        // Filtra os dias com faturamento
        val faturamentoValidos = faturamento.filter { it > 0 }

        if (faturamentoValidos.isEmpty()) {
            println("Não há dias com faturamento.")
            return
        }

        // Menor valor de faturamento
        val menorFaturamento = faturamentoValidos.minOrNull() ?: 0.0

        // Maior valor de faturamento
        val maiorFaturamento = faturamentoValidos.maxOrNull() ?: 0.0

        // Média anual considerando apenas os dias com faturamento
        val mediaAnual = faturamentoValidos.average()

        // Dias com faturamento acima da média
        val diasAcimaDaMedia = faturamentoValidos.count { it > mediaAnual }

        // Exibe os resultados
        println("Menor valor de faturamento: $menorFaturamento")
        println("Maior valor de faturamento: $maiorFaturamento")
        println("Número de dias com faturamento acima da média anual: $diasAcimaDaMedia")
    }
}