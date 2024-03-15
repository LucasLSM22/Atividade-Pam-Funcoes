//Pacote
package collections
//Inicio da funcao
fun main(args: Array<String>) {
    //Variaveis do tipo array com seus valores
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafael", "Pedro", "Leandro", "Gustavo")
    val uniao = numeros + strings
    for(item in uniao) {
        //Resultado final.
        println(item)
    }
}
