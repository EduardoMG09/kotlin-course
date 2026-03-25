package org.example.class9

fun mostrarBienvenida() {
    println("====Sistema de email====")
    println("Bienvenido al gestor de email")
}

fun saludarUsuario(name: String = "Usuario") {
    println("Hola $name, tiene nuevos emails")
}

fun leerEmail(): String {
    print("Ingresa tu Email: ")
    val email = readLine()?.trim() ?: "Sin correos nuevos"

    return email
}

fun leerAsunto(): String {
    print("Ingresa tu asunto: ")
    val asunto = readLine()?.trim() ?: "Sin asunto"

    return asunto
}

fun leerMensaje(): String {
    print("Ingresa el mensaje: ")
    val mensaje = readLine()?.trim() ?: "Sin mensaje existente"

    return mensaje
}

fun createMessageEmail(destinatario: String, asunto: String, message: String) {
    println("===============")
    println("Email creado")
    println("===============")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("Message: $message")
    println("===============")
}

fun enviarEmail() {
    println("Email enviado!")
}

fun leerDatosCompletos() {
    print("Ingresa tu Email: ")
    val email = readLine()?.trim() ?: "Sin correo"

    print("Ingresa tu Nombre: ")
    val name = readLine()?.trim() ?: "Sin nombre"

    print("Ingresa tu asunto: ")
    val asunto = readLine()?.trim() ?: "Sin asunto"

    print("Ingresa tu mensaje: ")
    val mensaje = readLine()?.trim() ?: "Sin mensaje"

    println("name: $name")
    println("email: $email")
    println("asunto: $asunto")
    println("mensaje: $mensaje")

    createMessageEmail(
        destinatario = email,
        asunto = asunto,
        message = mensaje
    )

    enviarEmail()
}

fun main() {
    mostrarBienvenida()
    saludarUsuario("Fernando")
    //val email= leerEmail()
    leerDatosCompletos()
}

