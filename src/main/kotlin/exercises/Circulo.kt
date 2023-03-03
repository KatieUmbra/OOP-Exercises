@file:Suppress("unused")

package exercises

import gay.kanwi.oopf.Exercise
import gay.kanwi.oopf.IsExercise

@IsExercise
class Circulo: Exercise {
    companion object {
        const val enunciado = "Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud\n" +
                "de la circunferencia. (Área = π * radio^2, Longitud = 2 * π * radio)"
    }

    override fun run() {
        println("Ingrese el radio del círculo: ")
        val radio = readln().toFloat()
        val area = Math.PI * radio * radio
        val longitud = 2 * Math.PI * radio
        println("El área del círculo es $area y la longitud es $longitud")
    }
}