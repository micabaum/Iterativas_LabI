/*Ejercicio 5: Cálculo de horas extras*/

import java.util.Scanner;
public class horasExtra {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int total_empleados = 0;
        int horas_trabajadas = 0;

        System.out.println("Ingrese la cantidad de empleados");
        total_empleados = sc.nextInt();
        int empleado = 1;
        do {
            System.out.print("Ingrese la cantidad de horas trabajadas por el empleado " + empleado + " ");
            horas_trabajadas = sc.nextInt();

            if (horas_trabajadas > 40) {
                int horas_extra = horas_trabajadas - 40;
                System.out.println("El empleado " + empleado + " trabajó " + horas_extra + " horas extra.");
            }
            empleado++;
        }
        while (empleado<=total_empleados);
    }
}

