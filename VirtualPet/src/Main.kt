import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) //crinado um objeto scanner
    print("Digite o nome do seu bichinho virtual: ")
    val nome = scanner.nextLine() //usa o objeto para ler a entrada do usuário (nextLine lê a linha toda digitada)
    val pet = Pet(nome) //cria um pet da classe Pet

    while (pet.vivo) {
        println("\nEscolha uma ação:")
        println("1. Alimentar")
        println("2. Brincar")
        println("3. Descansar")
        println("4. Verificar status")
        println("5. Ir ao banheiro")
        println("6. Dar banho")
        println("7. Sair")
        print("Opção: ")

        val opcao = try {
            scanner.nextInt()
        } catch (e: Exception) {
            scanner.nextLine()
            -1
            //Esse bloco trata a entrada do usuário e lida com possíveis erros:
            //scanner.nextInt(): Tenta ler a entrada como um número inteiro, que representa a opção escolhida pelo jogador.
            //catch (e: Exception): Se o usuário digitar algo inválido (como letras), o erro é tratado; scanner.nextLine() é chamado para descartar a entrada inválida, e a variável opcao recebe o valor -1, indicando uma opção inválida.
        }

        when (opcao) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> {
                print("Por quantas horas o pet vai descansar? ")
                val horas = try {
                    scanner.nextInt()
                } catch (e: Exception) {
                    scanner.nextLine()
                    0
                }
                pet.descansar(horas)
            }

            4 -> pet.verificarStatus()
            5 -> pet.irAoBanheiro()
            6 -> pet.limpar()
            7 -> {
                println("Saindo do jogo. Até logo!")
                return
            }

            else -> println("Opção inválida.")
        }
    }
}