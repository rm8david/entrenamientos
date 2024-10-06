package tema2
fun main(){
    print("Introduzca la hora")
    var hora: Int = readlnOrNull()?.toInt() ?: return
    print("introduzca los minutos")
    var min: Int = readlnOrNull()?.toInt() ?: return
    print("introduzca los segundos")
    var sec: Int = readlnOrNull()?.toInt() ?: return

   //validar los formatos
    if(hora !in 0..23 || min !in 0..59 || sec !in 0..59){
        print("FOrmato de hora incorrecto")
        return
    }else{
        sec++

        if(sec == 60){
            sec = 0
            min++
        }
        if(min == 60){
            min = 0
            hora++
        }
        if(hora == 24){
            hora=0

        }
    }

    //mostrar el resultado
    print("%01d:%01d:%01d".format(hora,min,sec))





}



