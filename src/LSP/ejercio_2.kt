package LSP

// Interfaz en lugar de clase base
interface Dispositivo {
    fun encender()
}
// Televisor puede encenderse
class Televisor : Dispositivo {
    override fun encender() {
        println("Encendiendo televisor...")
    }
}
// Radio no debería heredar un método que no puede usar
class Radio {
    fun sintonizar() {
        println("Sintonizando radio...")
    }
}
fun main() {
    val televisor: Dispositivo = Televisor()
    televisor.encender()
    val radio = Radio()
    radio.sintonizar() // En lugar de encender
}