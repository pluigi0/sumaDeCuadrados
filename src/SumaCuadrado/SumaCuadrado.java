
package SumaCuadrado;

import java.util.Scanner;

public class SumaCuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float a, b; //variable b is neither read or written
        float d;
        
        System.out.println("Please enter the first number: ");
        a = entrada.nextFloat();
        System.out.println("Please enter the second number: ");
        b = entrada.nextFloat();
        
        //Elevando a la segunda potencia el atributo a y b, multiplicando 2 por a y b.
        d = (float) (Math.pow(a,2)+Math.pow(b, 2) + (2*a*b));
        
        System.out.println("aa: "+d);
    }
}
