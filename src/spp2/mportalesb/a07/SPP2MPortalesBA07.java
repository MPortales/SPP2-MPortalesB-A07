/*Maythe Portales Barrios
A01411461
Acttividad 07
 Ingenieria Industrial y de Sistemas
 */
package spp2.mportalesb.a07;

import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalesBA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[] telefono = new long[10];
        int num = 0, opEntrada = 0;
        boolean flag = true;
        Scanner teclado = new Scanner(System.in);

        do {
            try {
                for (int i = 0; i < telefono.length; i++) {
                    System.out.println("Introduce el numero telefonico de la persona " + i);
                    telefono[i] = teclado.nextLong();
                    flag = false;
                }
            } catch (Exception ex) {
                System.out.println("No introdujiste numeros");
                flag = true;
                teclado.next();
            }
        } while (flag);

        do {
            System.out.println("Menu: Introduce el numero de la opcion deseada");
            try {
                System.out.println(" 1. Buscar un numero de telefono de acuerdo a su posición");
                System.out.println("2. salir ");
                opEntrada = teclado.nextInt();
                flag = false;
            } catch (Exception ex) {
                System.out.println("No es un numero del menu");
                flag = true;
                teclado.next();
            }
        } while (flag);

        while (opEntrada < 0 || opEntrada > 2) {
            System.out.println("NO es un numero del menu");
            System.out.println("Introduce un numero del menu");
            opEntrada = teclado.nextInt();
        }

        switch (opEntrada) {
            case 1:
                System.out.println("Introduce el numero de persona (de 0 a 9) para ver su telefono ");
                num = teclado.nextInt();
                while (num < 0 || num > 9) {
                    System.out.println("Fuera del rango");
                    System.out.println("Introduce un numero de persona");
                    num = teclado.nextInt();
                }
                if (num == 0) {
                    System.out.println("El telefono de la persona es " + telefono[0]);
                } else if (num == 1) {
                    System.out.println("El telefono de la persona es " + telefono[1]);
                } else if (num == 2) {
                    System.out.println("El telefono de la persona es " + telefono[2]);
                } else if (num == 3) {
                    System.out.println("El telefono de la persona es " + telefono[3]);
                } else if (num == 4) {
                    System.out.println("El telefono de la persona es " + telefono[4]);
                } else if (num == 5) {
                    System.out.println("El telefono de la persona es " + telefono[5]);
                } else if (num == 6) {
                    System.out.println("El telefono de la persona es " + telefono[6]);
                } else if (num == 7) {
                    System.out.println("El telefono de la persona es " + telefono[7]);
                } else if (num == 8) {
                    System.out.println("El telefono de la persona es " + telefono[8]);
                } else if (num == 9) {
                    System.out.println("El telefono de la persona es " + telefono[9]);
                } 
                break;
            default:
                System.out.println("Gracias");

        }
    }
}
