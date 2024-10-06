package tema2.entrenamiento4

class CuentaBancaria(private var iban: Long, private var titular: String, private var saldo: Double) {
    fun saldo(){
        println(this.saldo)
    }
    fun ingreso(cantidad: Double){
        this.saldo += cantidad
    }
    fun retirada(cantidad: Double){
        if((this.saldo-cantidad)>-50){
            this.saldo -= cantidad
        }else println("no se ha podido hacer la retirada, cuenta en numero rojos")
    }
}