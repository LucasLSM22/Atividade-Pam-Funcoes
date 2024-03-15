//Pacote
package collections

//inicio da funçao com Array
fun main(args: Array<String>) {
    //Declaracao de vavriavel com seus valores
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")
    for(item in strings) {
        //Resultado final.
        println(item.toUpperCase())
    }
}
