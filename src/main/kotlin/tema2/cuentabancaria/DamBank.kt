package tema2.cuentabancaria

fun main(){
    val mibanco = CuentaBancaria("ES1212454578787878787811","David")

    mibanco.ingreso(300.0)
    mibanco.ingreso(400.0)
    mibanco.retirada(600.0)
    mibanco.retirada(800.0)
}