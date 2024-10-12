package tema2.tiendaDeMascotas

class Perro(nombre: String, estado: String, fechaNacimiento: String, val raza:String,val pulgas:Boolean) : Mascota(nombre, estado, fechaNacimiento) {
    override fun muestra() {
        super.muestra()
        val p =if(pulgas)"si" else "no"
        println("El perro es de raza $raza y $p tiene pulgas")
    }

}