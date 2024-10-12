package tema2.cuentabancaria

class CuentaBancaria(val iban: String, val titular: String) {
    private var saldo: Double = 0.0
    private val movimientos: MutableList<Movimientos> = mutableListOf()
    private var idMovimiento = 1

    init {
        if (!validarIban(iban)) throw IllegalArgumentException("El iban no es valido")
    }

    private fun validarIban(iban: String): Boolean {
        return iban.matches(Regex("[A-Z]{2}[0-9]{22}"))
    }

    public fun ingreso(cantidad: Double) {
        if (cantidad > 0) {
            val mov = Movimientos(idMovimiento, "ingreso", cantidad)
            if (movimientos.size == 100) {
                movimientos.removeFirst()
            }
            movimientos.add(mov)
            idMovimiento++
            this.saldo += cantidad
            println("Cantidad de $cantidad € ingresada con exito")
            println("Ahora el saldo es de $saldo €")
        } else println("No se aceptan cantidades negativas")


    }

    public fun retirada(cantidad: Double) {
        if (((this.saldo - cantidad) > -50) && cantidad > 0) {
            val mov = Movimientos(idMovimiento, "retirada", cantidad)
            if (movimientos.size == 100) {
                movimientos.removeFirst()
            }
            movimientos.add(mov)
            idMovimiento++
            this.saldo -= cantidad
            println("Se ha retirado $cantidad euros")
            println("El saldo actual es de $saldo €")
        } else println("ALERTA saldo negativo")
    }

    public fun verMovimientos() {
        for (Movimiento in movimientos) {
            println(Movimiento.toString())
        }
        if(movimientos.size==0) println("No hay movimientos")
        println("El saldo acual de la cuenta es: $saldo")
    }
}