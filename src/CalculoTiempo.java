
/*Ejercicio 1: Cálculo del tiempo dedicado a cada actividad*/

import java.util.Scanner;

public class CalculoTiempo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de horas de estudio diarias (sin minutos): ");
        int horas_estudio = sc.nextInt();

        System.out.print("Introduce la cantidad de horas de ejercicio diarias (sin minutos): ");
        int horas_ejercicio = sc.nextInt();

        System.out.print("Introduce la cantidad de horas de lectura diarias (sin minutos): ");
        int horas_lectura = sc.nextInt();

        System.out.print("Introduce la cantidad de horas libres diarias (sin minutos): ");
        int horas_libres = sc.nextInt();

        int horas_totales = horas_ejercicio+horas_estudio+horas_libres+horas_lectura;
        System.out.println("Las horas totales son: " + horas_totales);

        }
    }


