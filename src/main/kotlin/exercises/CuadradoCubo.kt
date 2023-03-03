@file:Suppress("unused")

package exercises

import gay.kanwi.oopf.Exercise
import gay.kanwi.oopf.IsExercise
import kotlin.math.pow

@IsExercise
class CuadradoCubo: Exercise {
    companion object {
        const val enunciado = "Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo."
    }

    override fun run() {
        println("Ingrese un número: ")
        val numero = readln().toFloat()
        val cubo = numero.pow(3)
        val cuadrado = numero.pow(2)
        println("El cuadrado es $cuadrado y el cubo es $cubo")
    }
}