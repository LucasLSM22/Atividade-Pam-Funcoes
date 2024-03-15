//Pacote
package collections
//Inicio da funcao main, com Array
fun main(args: Array<String>) {
    //Variaveis de lista com os numeros impares e pares
    val pares = arrayListOf(2, 4, 6)
    val impares = intArrayOf(1, 3, 5)

    for (n in impares.union(pares).sorted()) {
        //Resultado final
        print("$n ")
    }
}

