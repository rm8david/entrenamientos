package tema2

import java.time.Instant
import java.util.Date

class Movimientos(val id:Int, val cantidad:Double, private var tipo:String) {
    init{
        val fecha = Date.from(Instant.now())
        when(tipo){
            "ingreso"-> this.tipo = "ingreso"
            "retirada"-> this.tipo = "retirada"
            else-> print("Error en el tipo de movimiento")
        }
    }
}