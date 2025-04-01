package ISP

interface trabajador {
    fun Trabajar()
}
interface administrador{
    fun Administrar()
}
interface auditor{
    fun Auditar()
}
class Desarrollador:trabajador{
    override fun Trabajar() {
        println("el trabajador esta trabajando trabajantemente")
    }
}
class Gerente:administrador{
    override fun Administrar() {


        println("el gerente esta administrando")
    }
}
class Auditorio:auditor{
    override fun Auditar() {

        println("se pudo auditar correctamente ")
    }
}

fun main() {
    val desarrollador=Desarrollador()
    desarrollador.Trabajar()
    val gerente = Gerente()
    gerente.Administrar()
    val auditorio= Auditorio()
    auditorio.auditar
}