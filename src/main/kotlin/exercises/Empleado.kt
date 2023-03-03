@file:Suppress("unused")

package exercises

import gay.kanwi.oopf.Exercise
import gay.kanwi.oopf.IsExercise

@IsExercise
class Empleado: Exercise {
    companion object {
        const val enunciado = "Un empleado trabaja 48 horas en la semana a razón de \$5.000 hora. El porcentaje de\n" +
                "retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,\n" +
                "la retención en la fuente y el salario neto del trabajador."
    }

    override fun run() {
        val salarioHora = 5000
        val horasSemana = 48
        val salarioBruto = salarioHora * horasSemana
        val retencion = 0.125
        val retencionTotal = salarioBruto * retencion
        val salarioNeto = salarioBruto - retencionTotal
        println("El salario bruto es: $salarioBruto\n" +
                "La retención en la fuente es: $retencionTotal\n" +
                "El salario neto es: $salarioNeto")
    }
}