package tema2


fun main(){

    println("El juego de piedra, papel, tijeras")
    println("Tienes que decidir cual de los tres va a usar")
    println("Piedra gana a tijeras y pierde ante papel")
    println("papel gana a piedra y pierde ante tijeras")
    println("tijeras gana a papel y pierde ante piedra")
    println("¿que eliges esta vez?")
    val opcion = readln()
    val opcionMaquina = aleatoria()
    println("El computador ha escogido: "+opcionMaquina)
    if(opcion==opcionMaquina) {
        println("¡Empate! Ambos habeis escogido " + opcionMaquina)
    }else{
            if(opcion.equals("tijeras")){
            when(opcionMaquina) {
                "papel" -> println("Tu ganas! tijeras gana a papel!")
                "piedra" -> println(":( tu pierdes, piedra gana a tijeras!")
                else -> println("numero desconocido")
            }
            }
            if(opcion.equals("papel")){
                when(opcionMaquina) {
                    "piedra" -> println("Tu ganas! papel gana a piedra!")
                    "tijeras" -> println(":( tu pierdes, tijeras gana a papel!")
                    else -> println("numero desconocido")

                }
                }
            if(opcion.equals("piedra")){
                when(opcionMaquina) {
                    "tijeras" -> println("Tu ganas! piedra gana a tijeras!")
                    "papel" -> println(":( tu pierdes, papel gana a piedra!")
                    else -> println("numero desconocido")

                }
            }
        }
    }



val t = "tijeras"
val pa = "papel"
val pi = "piedra"

fun aleatoria(): String{
    val opciones = listOf(t,pa,pi)
    return opciones.random()
}