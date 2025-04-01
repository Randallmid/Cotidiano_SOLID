package dip
interface ServicioMensaje {
    fun enviarMensaje(mensaje: String)
}
class EmailService : ServicioMensaje {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando correo: $mensaje")
    }
}
class Notificador(private val servicioMensaje: ServicioMensaje) {
    fun notificar(mensaje: String) {
        servicioMensaje.enviarMensaje(mensaje)
    }
}
fun main() {
    val emailService = EmailService()
    val notificador = Notificador(emailService)
    notificador.notificar("Hola Mundo!")
}