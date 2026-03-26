package org.example.class16

// Clase normal
class EmailNormal( val asunto: String, val remitente: String, var leido: Boolean)

// Data class
data class EmailData(val asunto:String, val remitente: String, var leido: Boolean)

fun main(){
    val emailNormal1 = EmailNormal( asunto = "Reunion", remitente = "jefe@empresa.com", leido = false)
    val emailNormal2 = EmailNormal( asunto = "Reunion", remitente = "jefe@empresa.com", leido = false)

    val emailData1 = EmailData("Reunion", "jefe@empresa.com", false)
    val emailData2 = EmailData("Reunion", "jefe@empresa.com", false)

    println("Clase normal: ${emailNormal1}")
    println("Data class: ${emailData1}")

    println("Comparacion clase normal: ${emailNormal1 == emailNormal2}")
    println("Comparacion Data class: ${emailData1 == emailData2}")
}
