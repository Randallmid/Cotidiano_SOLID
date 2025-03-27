package SRP.con
// Clase que representa un producto
class Producto(val nombre: String, val precio: Double)

// Clase responsable de calcular descuentos
class CalcularDescuento {
    fun calcularDescuento(producto: Producto, porcentaje: Double): Double {
        return producto.precio - (producto.precio * porcentaje / 100)
    }
}

// Clase responsable de imprimir detalles del producto
class Imprimir {
    fun imprimirDetalles(producto: Producto) {
        println("Producto: ${producto.nombre}, Precio: ${producto.precio}")
    }
}

// Función principal
fun main() {
    // Crear un producto
    val producto = Producto("Laptop", 150000.0)

    // Crear instancias de las clases de cálculo y de impresión
    val calculadorDescuento = CalcularDescuento()
    val impresor = Imprimir()

    // Calcular el precio con descuento
    val precioConDescuento = calculadorDescuento.calcularDescuento(producto, 10.0)
    println("Precio con descuento: $precioConDescuento")

    // Imprimir detalles del producto
    impresor.imprimirDetalles(producto)
}