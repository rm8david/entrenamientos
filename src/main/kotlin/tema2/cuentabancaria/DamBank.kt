package tema2.cuentabancaria

import java.sql.SQLOutput

fun main() {
    try {
        println("Indique el nombre del titular")
        val titular: String = readln()
        println("Introduzca el IBAN: 2 letras mayusculas y 22 numeros")
        val iban: String = readln()
        val cuenta = CuentaBancaria(iban, titular)


        do {
            println(
                """
            Bienvenido a DamBank
            1.-Datos de la cuenta
            2.-Ingresar dinero
            3.-Retirar dinero
            4.-Consultar movimientos
            5.-Salir
        """.trimIndent()
            )
            var opcion: Int? = readln().toIntOrNull() ?: 5

            when (opcion) {
                1 -> {
                    println("El iban de la cuenta es: ${cuenta.iban} y su titular es: ${cuenta.titular}")
                }

                2 -> {
                    println("Indique la cantidad a ingresar:")
                    val ingreso: Double = readln().toDouble()
                    cuenta.ingreso(ingreso)
                }
                3-> {
                    println("Indique la cantidad a retirar")
                    val retirada: Double = readln().toDouble()
                    cuenta.retirada(retirada)
                }
                4->{
                    cuenta.verMovimientos()
                }
            }

        } while (opcion != 5)

    } catch (e: IllegalArgumentException) {
        println("EL iban no es valido")
    }
}