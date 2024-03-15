//Inicio da funçao com array
fun main(args: Array<String>) {

    //Solicitando o valor do numero 1
    println("Digite o primeiro número: ")
    // Atribuindo o valor, a uma variavel.
    val primeiroNumero: Int = readLine()!!.toInt()

    //Solicitando o valor do numero 2
    println("Digite o segundo número: ")
    // Atribuindo o valor, a uma variavel.
    val segundoNumero: Int = readLine()!!.toInt()

    //Multiplicando dois numeros e atribuindo o resultado.
    val resultado: Int = primeiroNumero * segundoNumero

    //Resultado da multiplicação
    println("O resultado da multiplicação é $resultado")
}
