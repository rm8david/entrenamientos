package tema2.tiendaDeMascotas

class Loro(nombre: String, estado: String, fechaNacimiento: String,  pico:String,  vuela:Boolean, val origen:String,val habla:Boolean):Aves(nombre,estado,fechaNacimiento,pico,vuela) {
    override fun volar(){
        println("El loro esta volando jaja")
    }
    override fun Muestra(){
        super.muestra()
        println("El loro habla? $habla")
    }
}