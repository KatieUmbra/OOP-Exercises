@file:Suppress("unused")

package exercises

import gay.kanwi.oopf.Exercise
import gay.kanwi.oopf.IsExercise

@IsExercise
class Suma: Exercise {
    companion object {
        const val enunciado = "Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones." +
                "INICIO" +
                "   SUMA = 0" +
                "   X = 20" +
                "   SUMA = SUMA + X" +
                "   Y = 40" +
                "   X = X + Y ** 2" +
                "   SUMA = SUMA + X / Y" +
                "   ESCRIBA: 'El valor de la suma es:', SUMA" +
                "FIN_INICIO"
    }
    override fun run() {
        var suma = 0
        var x = 20
        suma += x
        val y = 40
        x += y*y
        suma += x/y
        println("El valor de la suma es: $suma")
    }
}