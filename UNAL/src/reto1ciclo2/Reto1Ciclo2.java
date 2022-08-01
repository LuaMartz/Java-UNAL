
package reto1ciclo2;

import java.util.Scanner;
        
public class Reto1Ciclo2 {

    public static void main(String[] args) {
        /*
        Entrada:
        La entrada es un número entero que representa la distancia a la casa de 
        Goku.

        Salida:
        Tres enteros separados por espacio que imprima la distancia a la casa 
        de Goku, la distancia a la próxima esfera y el tiempo de duración del 
        viaje, separados por un espacio. En la siguiente línea en letras el 
        nombre de la esfera que están buscando.

        Ejemplo

            Entrada
                178
            Salida
                178 360 107
                cuatro

            Entrada
                73
            Salida
                73 150 44
                tres

        */

        Scanner leer = new Scanner(System.in);
        
        // System.out.println("Ingrese Distancia casa de Goku");
        int DCG = leer.nextInt();
        int DPX = DCG * 2 + 4;
        int DUR = (DPX + DCG) / 5;
        
        System.out.println(DCG + " " + DPX + " " + DUR);
        
        if (DUR >= 0 && DUR <= 20) {
            System.out.println("uno");
        } else if (DUR >= 21 && DUR <= 30) {
            System.out.println("dos");
        } else if (DUR >= 31 && DUR <= 50) {
            System.out.println("tres");
        } else if (DUR > 50) {
            System.out.println("cuatro");
        }
    }
    
}
