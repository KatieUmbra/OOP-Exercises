@file:Suppress("unused")

package exercises

import gay.kanwi.oopf.Exercise
import gay.kanwi.oopf.IsExercise

@IsExercise
class EdadJuan: Exercise {
    companion object {
        const val enunciado = "A la mama de Juan le preguntan su edad y contesta: tengo 3 hijos, pregúntele a Juan su edad. Alberto tiene 2/3 de la edad de Juan. Ana tiene 4/3 de la edad de Juan y mi edad es la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro"
    }
    override fun run() {
        println("¿Cuántos años tiene Juan?: ")
        val edadJuan = readln().toInt()
        val edadAlberto = edadJuan * 2 / 3
        val edadAna = edadJuan * 4 / 3
        val edadMama = edadJuan + edadAlberto + edadAna
        println("La edad de Juan es $edadJuan\n" +
                "La edad de Alberto es $edadAlberto\n" +
                "La edad de Ana es $edadAna\n" +
                "La edad de la mama es $edadMama\n")
    }
}