package practicas

import java.util.UUID

private operator fun Boolean.invoke(value: () -> Unit) {

}

class Coche (val matricula:String, val marca: String){
    var bastidor:String

    init {
        bastidor = UUID.randomUUID().toString()
    }
    constructor(bastidor:String,marca: String,matricula: String) : this(matricula,marca){
        this.bastidor=bastidor
    }

}