package org.example.class14

class Email(
    val mensaje: String,
    val subject: String,
    val remitente: String,
){
    var read: Boolean = false

    fun marcarLeido(){
        read = true
    }

    fun getterLeido(): Boolean{
        return read
    }

    fun setterLeido(flag: Boolean){
        read = flag
    }

    fun marcarNoRead(){
        read = false
    }

    fun mostrarLaInformacion(){
        println("De: $remitente | Asunto: $subject | Leido: $read")
    }
}

class BandejaEmails{
    val EmailsList = mutableListOf<Email>()

    fun agregarEmail(email: Email){
        EmailsList.add(email)
    }

    fun contarNoLeidos(): Int{
        var contador = 0;
        for (email in EmailsList){
            if (!email.read)
                contador ++
        }

        return contador
    }
}

class Contacto(
    val nombre:String,
    val email:String
){
    fun mostrarContacto(){
        println("Informacion de contacto:")
        println(nombre)
        println(email)
    }
}

fun main(){
    val email01 = Email(
        mensaje = "No se te olvide la reunion del viernes",
        subject = "Reunion viernes",
        remitente = "Johan"
    )

    val email02 = Email(
        mensaje = "Entrega de documentos en ventanilla el dia miercoles",
        subject = "Entrega de papeles",
        remitente = "Gestion Escolar"
    )

    val email03 = Email(
        mensaje = "Confirmacion de compra de boletos para partido Mexico v Portugal el proximo 27 de marzo del 2026",
        subject = "Confirmacion de compra de boletos",
        remitente = "Ticketmaster"
    )

    email01.marcarLeido()
    val bandejaEmails = BandejaEmails()
    bandejaEmails.agregarEmail(email01)
    bandejaEmails.agregarEmail(email02)
    bandejaEmails.agregarEmail(email03)

    println("Faltan por leer ${bandejaEmails.contarNoLeidos()}")

    val contacto1 = Contacto("Fernanda","fernanda@correo.com")
    val contacto2 = Contacto("Ximena","ximena@correo.com")
    val contacto3 = Contacto("Evelin","evlin@correo.com")

    contacto1.mostrarContacto()
}