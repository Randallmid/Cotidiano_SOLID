package SRP.con

// Clase que representa un cliente
class Cliente(val nombre: String, val edad: Int)

// Clase responsable de guardar clientes
class ClienteRepository {
    fun guardarCliente(cliente: Cliente) {
        println("Guardando cliente: ${cliente.nombre}")
    }
}

// Clase responsable de enviar correos
class CorreoService {
    fun enviarCorreo(cliente: Cliente) {
        println("Enviando correo a: ${cliente.nombre}")
    }
}

// Función principal
fun main() {
    // Crear un cliente
    val cliente = Cliente("culiolo", 18)

    // Crear instancias de las clases de almacenamiento y de envío de correo
    val clienteRepository = ClienteRepository()
    val correoService = CorreoService()

    // Guardar el cliente y enviar un correo
    clienteRepository.guardarCliente(cliente)
    correoService.enviarCorreo(cliente)
}