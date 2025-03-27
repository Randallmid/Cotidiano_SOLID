package OCP.con

open class EnvioArchivo {
    open fun enviar(archivo: String) {
        println("Enviando archivo: $archivo")
    }
}

// Clase para el envío por FTP
class EnvioPorFtp : EnvioArchivo() {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}

// Clase para el envío por HTTP
class EnvioPorHttp : EnvioArchivo() {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}

// Clase responsable de gestionar el envío de archivos
class GestorEnvioArchivos {
    fun enviar(archivo: String, envio: EnvioArchivo) {
        envio.enviar(archivo)
    }
}

// Función principal
fun main() {
    val gestorEnvio = GestorEnvioArchivos()

    // Crear instancias de diferentes tipos de envío
    val envioFtp = EnvioPorFtp()
    val envioHttp = EnvioPorHttp()

    // Enviar archivos
    gestorEnvio.enviar("documento.txt", envioFtp)
    gestorEnvio.enviar("imagen.png", envioHttp)
}