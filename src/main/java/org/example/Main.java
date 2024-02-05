package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Nombre y apellidos del cliente: ");
        String nombreCliente = leer.nextLine();

        System.out.print("Tipo de cliente (Regular o VIP): ");
        String tipoCliente = leer.nextLine();

        System.out.print("Cantidad de artículos comprados: ");
        int cantidadArticulos = leer.nextInt();

        System.out.print("Precio  de la compra (sin descuento): ");
        Double precioTotal = leer.nextDouble();

        Double descuento = calcularDescuento(tipoCliente, cantidadArticulos, precioTotal);

        Double totalPagar = precioTotal - descuento;

        System.out.println("Resumen de la compra:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Cantidad de artículos: " + cantidadArticulos);
        System.out.println("Precio  (sin descuento)$ " + precioTotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar $ " + totalPagar);


    }


    private static double calcularDescuento(String tipoCliente, int cantidadArticulos, double precioTotal) {
        double descuento = 0.0;


        if (tipoCliente.equalsIgnoreCase("Regular")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = precioTotal * 0.05;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = precioTotal * 0.10;
            } else if (cantidadArticulos > 6) {
                descuento = precioTotal * 0.15;
            }
        } else if (tipoCliente.equalsIgnoreCase("VIP")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = precioTotal * 0.10;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = precioTotal * 0.15;
            } else if (cantidadArticulos > 6) {
                descuento = precioTotal * 0.20;
            }
        }else {
            System.out.println("Opcion invalida le invitamos a elegir entre Regular o VIP");
        }


        return descuento;
    }
}