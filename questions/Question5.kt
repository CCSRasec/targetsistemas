package questions

class Question5 {
    fun main() {
        val distanciaTotal = 125.0 // Distância total entre Ribeirão Preto e Barretos em km
        val velocidadeCarro = 90.0 // Velocidade do carro em km/h
        val velocidadeCaminhao = 80.0 // Velocidade do caminhão em km/h
        val numeroPedagios = 3
        val atrasoPorPedagio = 5.0 / 60.0 // 5 minutos de atraso por pedágio (convertido para horas)

        // Calcular o tempo total de atraso do carro devido aos pedágios
        val atrasoTotalCarro = numeroPedagios * atrasoPorPedagio // Tempo total de atraso em horas

        // Calcular o tempo de viagem sem pedágios
        val tempoSemPedagios = distanciaTotal / (velocidadeCarro + velocidadeCaminhao) // Tempo em que se cruzam sem contar o atraso

        // Calcular a distância percorrida pelo carro e pelo caminhão até o ponto de cruzamento
        val distanciaCarro = velocidadeCarro * (tempoSemPedagios + atrasoTotalCarro)
        val distanciaCaminhao = velocidadeCaminhao * tempoSemPedagios

        // Exibir resultados
        println("Distância percorrida pelo carro até o ponto de cruzamento: %.2f km".format(distanciaCarro))
        println("Distância percorrida pelo caminhão até o ponto de cruzamento: %.2f km".format(distanciaCaminhao))

        // Verificar qual veículo está mais próximo de Ribeirão Preto
        if (distanciaCarro < distanciaCaminhao) {
            println("O carro estará mais próximo de Ribeirão Preto no momento do cruzamento.")
        } else {
            println("O caminhão estará mais próximo de Ribeirão Preto no momento do cruzamento.")
        }
    }

}