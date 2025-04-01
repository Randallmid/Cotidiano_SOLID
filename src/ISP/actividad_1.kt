package ISP

interface EncenderApagar{
    fun encender()
    fun apagar()
}
interface WifiFirmware{
    fun ConectarWifi()
    fun ActualizarFirmware()
}
class Lampara:EncenderApagar{
    override fun encender() {
        println("la lampara se encendio papu")
    }

    override fun apagar() {
        println("la lampara se apago :(")
    }
}
class Smartv:WifiFirmware{
    override fun ConectarWifi() {
        println("el wifi fue conectadisimo ")

    }

    override fun ActualizarFirmware() {
        println("el firmware se actualizo correctamente ")
    }
}

fun main() {
    val lampara = Lampara()
    lampara.encender()
    lampara.apagar()
    val smartv = Smartv()
    smartv.ConectarWifi()
    smartv.ActualizarFirmware()
}