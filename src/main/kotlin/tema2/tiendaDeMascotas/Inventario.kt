package tema2.tiendaDeMascotas
fun main(){
    val coco = Perro("coco","sano","15/02/2020","Snawtzer",false)
    println(coco.muestra())
    coco.cumpleaños()
    val pepe = Loro("pepe","salud perfecta","10/04/2014","pico blanco",true,"Ecuador",true)
    pepe.muestra()
}
