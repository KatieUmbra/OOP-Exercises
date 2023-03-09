package ejercicios;

import gay.kanwi.oopf.Exercise;
import gay.kanwi.oopf.IsExercise;

import java.util.Scanner;

@IsExercise
public class EmpleadoRetencion implements Exercise {
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        String enunciado = "Se tiene la siguiente informacion de un empleado: codigo del empleado, nombres, numero de horas trabajadas al mes, valor hora trabajada, porcentaje de retencion en la fuente";
        System.out.println("Ingrese el codigo del empleado");
        int codigo = scanner.nextInt();
        System.out.println("Ingrese el nombre del empleado");
        String nombre = scanner.next();
        System.out.println("Ingrese el numero de horas trabajadas al mes");
        int horas = scanner.nextInt();
        System.out.println("Ingrese el valor por hora trabajada");
        float valorHora = scanner.nextFloat();
        System.out.println("Ingrese el porcentaje de retencion en la fuente");
        float porcentaje = scanner.nextFloat();

        float salarioBruto = horas * valorHora;
        float salarioNeto = salarioBruto - (salarioBruto * porcentaje / 100);

        System.out.println("Codigo del empleado: " + codigo
            + "\nNombre del empleado: " + nombre +
            "\nSalario bruto: " + salarioBruto +
                "\nSalario neto: " + salarioNeto
        );
    }
}
