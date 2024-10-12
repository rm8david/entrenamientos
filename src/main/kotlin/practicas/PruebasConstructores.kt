package practicas

fun main(){
    val textoImportante: String = """
        Lo mas importante es la tranquilidad
        Saber estar bien consigo mismo
        para eso es muy importante la meditacion
        y sentir el cuerpo a través del ejercicio
        
        
        Yo
  
        
    """.trimIndent()
    val texto2: String = """
        Lorem ipsum
        lorem lorem
    """.trimIndent()
    //println(textoImportante)
    var nulos = arrayOfNulls<Int>(3)
    val array = arrayOf(textoImportante,texto2,"juan lanas")
    /*for (i in array){
        println(i)
    }*/

    fun equation(x:Int, y:Int, z:Int):Int = 5*x-3*y+7*z
    fun saludar (nombre:String): Unit
    {
        println("Hola $nombre")
    }
    //Argumentos por defecto y argumentos nombrados
/*
    fun suma(a: Int = 3, b: Int = 4) = a + b
    //println(suma(b=13,a=-200))
    val edad: Int = readln().toInt()
    if (edad >= 18) {
        println("mayor de edad")
    } else {
        println("menor de edad")
    }
*/
   /*val entrada: Int = (Math.random()*200).toInt()
    when(entrada){
        in 0..49 -> print("$entrada pertenece a [0..49]")
        in 50..100 -> print("$entrada:pertenece a [50..100] ")
        else -> print("Fuera de los rangos contemplados")
    }
    println(entrada)*/
   /* val a = -5
    when{
        a>0 -> print("Es positivo")
        a==0 -> print("Es cero")
        else-> print("Es negativo")
    }*/

    /*val factorSuerte = 0.2
    val bonus = 0.3*/

    /*when (val damage:Double = factorSuerte+bonus){
        in 0.0..0.3 -> print("Daño recibido:${damage*10}")
        in 0.3..0.6 -> print("Daño recibido:${damage*20}")
        in 0.6..1.0 -> print("Daño recibido:${damage*30}")
    }*/
  /*  val lenguajes = arrayOf("Java", "Kotlin", "JavaScript","HTML")
    for(l:String in lenguajes ) println("Estoy programando en $l")
*/

    val pp = Persona("juan lanas",63)
    pp.peso = 85.0
    println("¿Sobrepeso?:${if(pp.sobrePeso)"SI" else "NO"}"+" Es mayor de edad?: ${if (pp.isMayorEdad) "SI" else "NO"}")
}