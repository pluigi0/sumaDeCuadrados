
package SumaCuadrado;

import java.util.Scanner;

public class SumaCuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float primer, segundo, operacion; 
        
        System.out.println("Please enter the first number: ");
        primer = entrada.nextFloat();
        System.out.println("Please enter the second number: ");
        segundo = entrada.nextFloat();
        
        //Elevando a la segunda potencia el atributo a y b, multiplicando 2 por a y b.
        operacion = (float) (Math.pow(primer,2)+Math.pow(segundo, 2) + (2*primer*segundo));
        
        System.out.println("aa: "+operacion);
    }
}
