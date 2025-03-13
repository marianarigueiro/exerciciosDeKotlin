import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val senhaCorreta = "1234" 
    val tentativasMaximas = 3

    println("Digite a senha de acesso:")

    for (i in 1..tentativasMaximas) {
        print("Tentativa $i: ")
        val senhaDigitada = scanner.nextLine()

        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido!")
            return  
        } else {
            println("Senha incorreta.")
            if (i == tentativasMaximas) {
                println("Número máximo de tentativas atingido. Acesso bloqueado.")
            }
        }
    }

    scanner.close()
}