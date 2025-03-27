package OCP.con

open class Grafico {
    open fun dibujar() {
        println("Dibujando gráfico")
    }
}

// Clase para gráfico de barras
class GraficoBarras : Grafico() {
    override fun dibujar() {
        println("Dibujando gráfica de barras")
    }
}

// Clase para gráfico de líneas
class GraficoLineas : Grafico() {
    override fun dibujar() {
        println("Dibujando gráfica de líneas")
    }
}

// Clase responsable de gestionar gráficos
class Grafica {
    fun dibujar(grafico: Grafico) {
        grafico.dibujar()
    }
}

// Función principal
fun main() {
    val grafica = Grafica()

    // Crear instancias de diferentes tipos de gráficos
    val graficoBarras = GraficoBarras()
    val graficoLineas = GraficoLineas()

    // Dibujar gráficos
    grafica.dibujar(graficoBarras)
    grafica.dibujar(graficoLineas)
}