package Semana1;

import java.util.Scanner;
public class LecturaDatos {

   
    public static double suma(double a, double b){
        return a+b;
    }
    
    public static void main(String[] args) {
       // Objeto en java 
       Scanner escaner= new Scanner(System.in);
       //Scanner es una clase, esta clase tiene muchos metodos implementados      
       System.out.println("Ingrese el primer valor a sumar");
       double valor1= escaner.nextDouble();
    /* double valor1= Double.parseDouble(escaner.nextLine());
       int valor1= escaner.nextInt();
       boolean valor1= escaner.nextBoolean();
       char valor1= escaner.next();
       String valor1= escaner.nextLine(); 
       */  
       System.out.println("Ingrese el segundo valor a sumar");        
       double valor2= escaner.nextDouble();
       
       System.out.println("La suma es igual a : "+suma(valor1,valor2));
        
       System.out.println("Ingrese un texto");
       String palabra= escaner.next();
       String texto= escaner.nextLine();
       
       System.out.println(texto);
       
        
    }
    
}
