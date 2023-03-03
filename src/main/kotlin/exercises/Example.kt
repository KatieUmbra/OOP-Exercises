@file:Suppress("unused")

package exercises

import gay.kanwi.oopf.Exercise
import gay.kanwi.oopf.IsExercise

@IsExercise
class Example: Exercise {
    override fun run() {
        println("Example exercise!")
    }
}