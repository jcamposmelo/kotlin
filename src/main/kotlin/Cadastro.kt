import java.util.Scanner

class Cadastro(var nome: String, var email: String, var senha: String)

fun main() {
    val scanner = Scanner(System.`in`)
    val listaUsuarios = mutableListOf<Cadastro>()

    while (true) {
        println("1 - Cadastrar usuario")
        println("2 - Listar usuarios cadastrados")
        println("3 - Sair")
        print("Escolha uma opcao: ")

        val opcao = scanner.nextInt()

        when (opcao) {
            1 -> {
                print("Nome: ")
                val nome = scanner.next()
                print("E-mail: ")
                val email = scanner.next()
                print("Senha: ")
                val senha = scanner.next()

                val novoUsuario = Cadastro(nome, email, senha)
                listaUsuarios.add(novoUsuario)

                println("Usuário cadastrado com sucesso!\n")
            }
            2 -> {
                if (listaUsuarios.isEmpty()) {
                    println("Nenhum usuário cadastrado.\n")
                } else {
                    println("Usuários cadastrados:")
                    for (usuario in listaUsuarios) {
                        println("Nome: ${usuario.nome}")
                        println("E-mail: ${usuario.email}")
                        println()
                    }
                }
            }
            3 -> {
                println("Saindo do programa. Até logo!")
                return
            }
            else -> {
                println("Opção inválida. Tente novamente.\n")
            }
        }
    }
}