package org.example.class15

class Email(var remitente: String, val mensaje: String){
    var asunto: String = ""
        set(value) {
            field = if (value.trim().isNotEmpty()) value.trim() else "Sin asunto"
        }

    val esImportante: Boolean
        get() = asunto.contains("urgente", ignoreCase = true)
}

class Contacto(
    val nombre: String ,
){
    var email: String = ""
        set(value) {
            field = if(value.contains("@")) value else ""
        }

    val esValido : Boolean
    get() = email.contains("@") && email.contains(".com")
}

fun main(){
    val email1 = Email("esau@correo.com","este es el mensaje")

    email1.asunto = "   "
    println("[1] El asunto es: ${email1.asunto}")

    email1.asunto="urgente"
    println("[2] El asunto es: ${email1.asunto}")

    val contacto1 = Contacto("evelin")
    contacto1.email = "eveli@correo.com"

    val contacto2 = Contacto("gaby")
    contacto2.email = "gabyacorreo.com"

    println("Email: ${contacto1.email}, valido: ${contacto1.esValido}")
    println("Email: ${contacto2.email}, valido: ${contacto2.esValido}")
}