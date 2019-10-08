/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1_2;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Extra1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Area de un circulo
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce radio =");
        float radio = sc.nextFloat();
        System.out.println("Area = "+ (Math.PI*Math.pow(radio, 2)));
    }
    
}
