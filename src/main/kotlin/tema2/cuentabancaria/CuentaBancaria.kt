package tema2.cuentabancaria

import tema2.Movimientos

class CuentaBancaria(val iban:String,val titular:String) {
    private var saldo:Double = 0.0
    private val movimientos: MutableList<Movimientos> = mutableListOf()
    private var idMovimiento = 0

    init{
        if(!validarIban(iban)) throw IllegalArgumentException("El iban no es valido")
    }

    private fun validarIban(iban: String): Boolean {
        return iban.matches(Regex("[A-Z]{2}[0-9]{22}"))
    }
    public fun ingreso(cantidad:Double){
        val mov = Movimientos(1,cantidad,"ingreso")
        this.saldo += cantidad
        println("Cantidad de $cantidad € ingresada con exito")
        println("Ahora el saldo es de $saldo €")

    }
    public fun retirada(cantidad:Double){
        if((this.saldo-cantidad)>-50-0){
            this.saldo-=cantidad
            println("Se ha retirado $cantidad euros")
            println("El saldo actual es de $saldo €")
        }else println("La cantidad a retirar es demasiado alta")
    }
}