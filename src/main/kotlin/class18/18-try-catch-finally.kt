package org.example.class18

fun main(){
    val emails = listOf<String>("juan@empresa.com","carlos@empresa.com","maria@empresa.com")

    try {
        emails[10]
        throw RuntimeException("Algo paso con el procesamiento de correos")
    }catch(e:ArrayIndexOutOfBoundsException){
        println("La lista no llega a tal longitud ")
    }

    println("Emails procesados")
}