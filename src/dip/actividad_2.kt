package dip

interface Motor {
    fun encender()
}

class MotorElectrico : Motor {
    override fun encender() {
        println("Motor eléctrico encendido")
    }
}
class Vehiculo(private val motor: Motor) {
    fun arrancar() {
        motor.encender()
    }
}
fun main() {
    val motorElectrico = MotorElectrico()
    val vehiculo = Vehiculo(motorElectrico)
    vehiculo.arrancar()
}