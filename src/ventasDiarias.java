/*Ejercicio 4: Registro de ventas diarias.*/

import java.util.Scanner;
public class ventasDiarias {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int dia = 1;
        int venta_diaria = 0;
        int venta_semanal = 0;

        while (dia <= 7) {
            System.out.println("Ingrese el monto total de las ventas del día " + dia + ": $ ");
            venta_diaria = sc.nextInt();
            venta_semanal += venta_diaria;
            dia++;
        }
        System.out.print("El monto total recaudado de las ventas de la semana es de: $" + venta_semanal);
    }

}

