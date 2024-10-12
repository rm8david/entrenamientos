package tema2.cuentabancaria
import java.text.SimpleDateFormat
import java.util.*

class Movimientos(val id: Int, val tipo: String, val cantidad: Double) {
    private val fecha: String = obtenerFechaActual()

    private fun obtenerFechaActual(): String {
        val sdf = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
        return sdf.format(Date())
    }

    override fun toString(): String {
        return "ID: $id | Fecha: $fecha | Tipo: $tipo | Cantidad: $cantidad€"
    }
}