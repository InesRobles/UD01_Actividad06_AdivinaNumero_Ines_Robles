import java.util.Scanner
import kotlin.random.Random

class Funciones {
    private val scan = Scanner(System.`in`)
    val numAleatorio=Random.nextInt(1, 100 +1)
/*Lee el número introducido por el usuario, si es igual al random finaliza el programa.
Si falla va sumando en un contador y le vuelve a pedir que introduzca un número hasta que lo acierte*/
    fun adivinar() {
        var num: Int
        var contador=0;
        print("Escriba el número: ")
        while (true) {
            if (scan.hasNextInt()) {
                num = scan.nextInt()
                if (num == numAleatorio) {
                    //Acierto del número random
                    println("¡Acertaste el número!.")
                    println("Número de fallos: $contador.")
                    break // Entrada correcta
                } else {
                    //Fallo del número, suma al contador
                    println("No acertaste el número.")
                    contador= contador+1
                    if (numAleatorio<num){
                        println("El número aletorio es menor al introducido ($num).")
                    }else{
                        println("El número aletorio es mayor al introducido ($num).")
                    }
                }
            } else {
                //Depuración del número introducido por el usuario
                println("Error, introduce un número entre el 1 y el 100.")
                scan.next()
            }
        }
    }
}
