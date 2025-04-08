class Pet(val nome: String) {
    var fome = 50
    var felicidade = 50
    var cansaço = 0
    var idade = 0
    var vontadeDeBanheiro = 0
    var sujeira = 0
    var vivo = true

    fun alimentar() {
        if (!vivo) return //se não estiver vivo, não faz nada (encerra o programa)
        println("\nVocê alimentou $nome!")
        fome -= 20 //diminui o nível da fome
        if (fome < 0) fome = 0 //não permite fome negativa
        vontadeDeBanheiro += 10 //aumenta a vontade de ir ao banheiro
        passarTempo()
    }

    fun brincar() {
        if (!vivo) return
        println("\nVocê brincou com $nome!")
        felicidade += 15 //aumenta a felicidade
        if (felicidade > 100) felicidade = 100
        cansaço += 10 //brincar aumenta o cansaço
        sujeira += 10 //e também suja
        passarTempo()
    }

    fun descansar(horas: Int) {
        if (!vivo) return
        println("\n$nome está descansando por $horas horas...")
        cansaço -= horas * 10 //reduz o cansaço proporcional ao tempo
        if (cansaço < 0) cansaço = 0
        passarTempo()
    }

    fun irAoBanheiro() {
        if (!vivo) return
        println("\n$nome foi ao banheiro!")
        vontadeDeBanheiro = 0 //zera a vontade ir ao banheiro
        passarTempo()
    }

    fun limpar() {
        if (!vivo) return
        println("\nVocê deu banho em $nome!")
        sujeira -= 30 //reduz a sujeira
        if (sujeira < 0) sujeira = 0
        passarTempo()
    }

    fun verificarStatus() {
        println("\n===== STATUS DE $nome =====")
        println("Idade: $idade anos")
        println("Fome: $fome% ${barra(fome)}")
        println("Felicidade: $felicidade% ${barra(felicidade)}")
        println("Cansaço: $cansaço% ${barra(cansaço)}")
        println("Vontade de ir ao banheiro: $vontadeDeBanheiro% ${barra(vontadeDeBanheiro)}")
        println("Nível de sujeira: $sujeira% ${barra(sujeira)}")
        println("===========================\n")
    }

    //função que gera uma barra proporcional visual para um atributo (de 0 a 100)
    private fun barra(valor: Int): String {
        val total = 20 //total de caracteres da barra
        val proporcao = (valor.coerceIn(0, 100) / 5.0).toInt() // cada 5% representa 1 bloco
        //valor.coerceIn(0, 100): a função coerceIn é usada para garantir que o valor esteja dentro do intervalo de 0 a 100. Se o valor for menor que 0, será ajustado para 0; se for maior que 100, será ajustado para 100.
        //5.0: divide o valor ajustado (de 0 a 100) por 5,0 para calcular quantos blocos de 5% estão presentes. Isso resulta num número decimal.
        //.toInt(): converte o resultado da divisão num número inteiro, descartando a parte decimal. Esse número inteiro, chamado proporção, representa a quantidade de blocos (de 5%) proporcional ao valor.
        val preenchido = "█".repeat(proporcao)
        //"█": caractere que será usado para representar visualmente os blocos preenchidos.
        //.repeat(proporcao): A função repeat cria uma string composta pelo caractere "█", repetido proporcao vezes. Isso gera uma barra de progresso visual, com blocos preenchidos que correspondem à proporção calculada.
        val vazio = "-".repeat(total - proporcao) //blocos vazios
        return "[$preenchido$vazio]"
    }

    private fun passarTempo() {
        idade++ //pet envelhece gradativamente
        fome += 3 //aumenta fome
        felicidade -= 3 //diminui felicidade
        if (felicidade < 0) felicidade = 0
        cansaço += 10 //aumenta cansaço
        checarEstado() //verifica se pet está vivo
    }

    //condições de vitória
    private fun checarEstado() {
        if (fome >= 100) {
            println("$nome morreu de fome...")
            vivo = false
        } else if (felicidade <= 0) {
            println("$nome morreu de tristeza...")
            vivo = false
        } else if (cansaço >= 100) {
            println("$nome morreu de exaustão...")
            vivo = false
        } else if (vontadeDeBanheiro >= 70) {
            println("$nome ficou mal por segurar o xixi demais...")
            vivo = false
        } else if (sujeira >= 70) {
            println("$nome ficou doente de tanto brincar sujo...")
            vivo = false
        } else if (idade >= 50) {
            println("Parabéns! $nome viveu até os 50 anos e teve uma vida feliz!")
            vivo = false
        }
    }
}