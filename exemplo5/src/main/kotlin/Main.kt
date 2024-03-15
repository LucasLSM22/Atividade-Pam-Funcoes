//Pacote
package collections
//Funcao Main com Array
fun main(args: Array<String>) {
    //Variavel Array com valorese tipos diferentes
    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')
    for(item in listaMix) {
        if(item is String) { // smart cast
            println(item.toUpperCase())
        }
        else {
            //Exibicao de resultados
            println(item)
        }
    }
}


