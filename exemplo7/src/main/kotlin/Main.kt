
//Pacote
package collection;
//inicio da classe
data class Frutas(var nome: String, var preco: Double)
//Funcao
fun main(args: Array<String>) {
    //variavel do tipo Array com seus valores
    var frutas = arrayListOf(Frutas("Banana", 1.50), Frutas("Laranja", 3.20))

    for (fruta in frutas) {
        //Exibicao dos resultados
        println("Nome: ${fruta.nome} - R$ ${fruta.preco}")
    }
}
