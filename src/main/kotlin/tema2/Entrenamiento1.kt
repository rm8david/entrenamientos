package tema2

fun main(){
    //Entrenamiento2().probar()
    println("Introduce la nota de 0 a 10")
    val calificacion = readlnOrNull()?.toDoubleOrNull() ?: return

    val resultado = when{
        calificacion < 0 || calificacion > 10 -> "Nota fuera de rango, rango valido de 0-10"
        calificacion < 5 -> "suspenso"
        calificacion < 6 -> "aprobado"
        calificacion < 8 || calificacion == 8.0 -> "notable"
        calificacion < 9 -> "sobresaliente"
        calificacion == 10.0 -> "un diez"
        calificacion < 10 -> "sobresaliente alto"

        else -> "Nota fuera de rango, rango valido de 0-10"
    }
    println(resultado)
}