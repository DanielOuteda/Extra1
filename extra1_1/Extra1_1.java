/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1_1;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Extra1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ticket de compra
        Scanner sc= new Scanner(System.in);
        System.out.println("Cantidad de productos comprados =");
        float unidades = sc.nextFloat();
        Scanner s1c= new Scanner(System.in);
        System.out.println("Precio del producto comprado =");
        float precio = s1c.nextFloat();
        Scanner s2c= new Scanner(System.in);
        System.out.println("Dinero pagado =");
        float pagado = s2c.nextFloat();
        Scanner s3c= new Scanner(System.in);
        System.out.println(" -- Ticket de la compra -- ");
        System.out.println("Cantidad de productos = "+ unidades);
        System.out.println("Precio del producto = "+ precio);
        System.out.println("Precio total = "+ unidades*precio);
        System.out.println("Dinero pagado = "+ pagado);
        System.out.println("Cambio recibido = "+ (pagado-(unidades*precio)));
        System.out.println(" -- Gracias -- ");
    }
    
}
