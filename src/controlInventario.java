/*Ejercicio 3: Control de inventario*/

import java.util.Scanner;

public class controlInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de productos: ");
        int cantidad_productos = scanner.nextInt();

        int[] disponibilidad = new int[cantidad_productos];
        for (int i = 0; i < cantidad_productos; i++) {
            System.out.print("Ingrese la cantidad disponible de cada producto " + (i+1) + ": ");
            disponibilidad[i] = scanner.nextInt();
        }

        for (int i = 0; i < cantidad_productos; i++) {
            if (disponibilidad[i] < 5) {
                System.out.println("Hay faltante del producto " + (i+1) + " es necesario hacer un pedido, la cantidad disponible es: " + disponibilidad[i] );
            }
        }
    }
}

