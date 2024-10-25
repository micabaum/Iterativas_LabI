/*Ejercicio 2: Cálculo de salarios semanales*/

import java.util.Scanner;

public class salariosSemanales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario = 15;
        System.out.print("Introduce la cantidad de empleados de tu empresa: ");
        int empleados = sc.nextInt();
        for (int i = 1; i<=empleados; i++) {
            System.out.print("Introduce las horas de trabajo por empleado " + i + ": ");
            int horas_trabajo = sc.nextInt();
            int salario_empleado = horas_trabajo*salario;
            System.out.println("El salario semanal del empleado " + i + "es de: $" + salario_empleado);
        }
    }
}

