package org.example.class12

fun main(){
    //Array 0,1,2
    val emails = arrayOf("diego@empresa.com", "fernando@empresa.com", "eduardo@empresa.com")
    val cantidadCorreos = arrayOf(1,15,50,100);

    //emails
    println("El primer correo es ${emails[0]}")
    println("El segundo correo es ${emails[1]}")
    println("El tercer correo es ${emails[2]}")

    emails[0]="sajit@empresa.com"
    emails.set(1,"barquera@empresa.com")
    //println("El primer correo es ${emails[0]}")
    println("la lista (arreglo) de correos es ${emails.joinToString()}")

    println("El tamaño del correo es ${emails.size}")

    val nuevaListaDeEmails = mutableListOf<String>()
    println("Nueva lista : ${nuevaListaDeEmails.toString()} tamaño: ${nuevaListaDeEmails.size}")
    nuevaListaDeEmails.addAll(arrayOf("diego@empresa.com", "fernando@empresa.com", "eduardo@empresa.com"))
    nuevaListaDeEmails.remove(element = "fernando@empresa.com")
    nuevaListaDeEmails.add(index = 1,  "esau@empresa.com")
    println("Nueva lista (mutable) : ${nuevaListaDeEmails.toString()} tamaño: ${nuevaListaDeEmails.size}")


    val listOfEmails = listOf<String>("barquera@empresa.com", "johan@empresa.com", "job@empresa.com")
    println("Nueva lista : ${listOfEmails.toString()}")
    val sublista = listOfEmails.subList(0,3)
    println("Sublista: ${sublista.joinToString()}")

    val primerElemento = listOfEmails.first()
    val ultimoElemento = listOfEmails.last()
    val indexLastElement = listOfEmails.lastIndex
    println("Primer elemento $primerElemento")
    println("Ultimo elemento $ultimoElemento y su indice es el $indexLastElement")

    //Ejercicio
    val asuntosEmail = mutableListOf<String>("Solicitud de beca", "Revision de CV", "Confirmacion de boletos")
    println("[1] Asuntos de emails: ${asuntosEmail.toString()}")
    asuntosEmail.set(1,"Contratación para puesto de desarrollador de software")
    println("[2] Asuntos de emails: ${asuntosEmail.toString()}")
    asuntosEmail.removeFirst();
    println("[3] Asuntos de emails lista final: ${asuntosEmail.toString()} y tamaño de ${asuntosEmail.size}")


}