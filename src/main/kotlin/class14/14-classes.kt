package org.example.class14

class Email(
    val email: String,
    val subject: String,
    val remitente: String,
    val destinatario: String,
    val password: String,
){
    var read: Boolean = false

    fun marcarLeido(){
        read = true
    }

    fun marcarNoRead(){
        read = false
    }
}