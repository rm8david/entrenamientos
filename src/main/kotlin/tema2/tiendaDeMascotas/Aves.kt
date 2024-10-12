package tema2.tiendaDeMascotas

open class Aves (nombre: String, estado: String, fechaNacimiento: String, val pico:String, val vuela:Boolean) : Mascota(nombre, estado, fechaNacimiento){
    open fun volar(){
        println("$nombre esta volando!")
    }
    override fun Muestra(){
        super.muestra()
    }
}