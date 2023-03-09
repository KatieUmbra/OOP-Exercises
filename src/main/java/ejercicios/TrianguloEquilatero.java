package ejercicios;

import gay.kanwi.oopf.Exercise;
import gay.kanwi.oopf.IsExercise;

import java.util.Scanner;

@IsExercise
public class TrianguloEquilatero implements Exercise {
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("Ingrese el lado del triangulo");
        float lado = scanner.nextFloat();
        float perimetro = lado * 3;
        float altura = (float) (lado * Math.sqrt(3) / 2);
        float area = (lado * altura) / 2;
        System.out.println(
                "El perimetro del triangulo es: " + perimetro
            + "\nLa altura del triangulo es: " + altura +
            "\nEl area del triangulo es: " + area
        );
    }
}
