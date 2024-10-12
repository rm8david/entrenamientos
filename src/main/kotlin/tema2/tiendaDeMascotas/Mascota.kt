package tema2.tiendaDeMascotas

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Mascota(val nombre: String, private var estado: String, val fechaNacimiento: String) {

    init {
        val edad = obtenerEdad()
    }

     open fun muestra() {
        println("nombre: $nombre,edad: ${obtenerEdad()} años, estado: $estado")
    }

    open fun cumpleaños() {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val fecha = LocalDate.parse(fechaNacimiento, formatter)
        val dia = fecha.dayOfMonth
        val mes = fecha.monthValue
        val nombreMes:String = when(mes){
            1->"enero"
            2->"febrero"
            3->"marzo"
            4->"abril"
            5->"mayo"
            6->"junio"
            7->"julio"
            8->"agosto"
            9->"septiembre"
            10->"octubre"
            11->"noviembre"
            12->"diciembre"
            else ->""

        }
        println("El cumpleaños de $nombre es el $dia de $nombreMes")

    }

    open fun obtenerEdad(): Int {
        // Definir el formato de la fecha

        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

        // Convertir el String a LocalDate
        val fechaNac = LocalDate.parse(fechaNacimiento, formatter)

        // Obtener la fecha actual
        val fechaActual = LocalDate.now()

        // Calcular la diferencia en años entre la fecha actual y la fecha de nacimiento
        return Period.between(fechaNac, fechaActual).years
    }

    open fun morir() {
        estado = "fallecido/a"
        println("Hoy es un dia triste, $nombre esta $estado")
    }

    open fun habla() {

    }


    open fun Muestra() {}
}