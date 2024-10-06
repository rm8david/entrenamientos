package tema2.cuentabancaria

import java.text.SimpleDateFormat
import java.util.*

class Movimiento(private val id: Int, private val tipo: String, val cantidad: Double) {
    private val fecha: String = obtenerFechaActual()

    private fun obtenerFechaActual(): String {
        val sdf = SimpleDateFormat("dd/MM/yyyy")
        return sdf.format(Date())
    }

    override fun toString(): String {
        return "ID: $id | Fecha: $fecha | Tipo: $tipo | Cantidad: $cantidad€"
    }
}