
package unal;

import java.util.Scanner;

public class UNAL {

    
    public static void main(String[] args) {

//        //Definición de variables y casteo de tipos de datos
//        byte c= 1;
//        short b= 13658;
//        int a= 1554444554;
//        long d= 1523423547899631L;
//        float e= 15.235647F;
//        double f= 16.258956;
//        //jerarquia de tipos de datos (clases)
//        // Númericos la mayor jerarquia la tienen Int y Double
//        boolean g= true;
//        String h= "Misión TIC 2022";
//        char i= 'a';
//
//        System.out.println(a+" - "+b+" - "+ c);
//
//        //Casteos o conversión de tipos de datos
//        int entero= 65;
//        //De entero a real (int a double)
//        double real= entero;
//        //De entero a texto (int a String)
//        String texto= entero+"";
//        String texto2= Integer.toString(entero);        
//        //De entero a caracter (int a char);
//        char caracter = (char)entero;
//        //Real a entero (double a int)
//        double real2= 78.69;
//        int entero2= (int)real2;
//        double real3= entero2;  
//       // System.out.println(real2+" - "+entero2+" - "+ real3);
//
//        //real a texto (double a String)
//        String texto3= real2+"";
//        String texto4= Double.toString(real2);
//        
//        //texto a entero (String a int)
//        String texto5= "15";
//        int entero3= Integer.parseInt(texto5);
//        //texto a real (String a double)
//        double real4= Double.parseDouble(texto5);
//        
//        System.out.println(real4);
//        
//        //caracter a entero (char a int)
//        char caracterA= 'A';
//        int entero4= (int) caracterA; 
//        System.out.println(entero4);
        

        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el valor a sumar");
        double val = leer.nextDouble(), val2 = leer.nextDouble();
        
        
        System.out.println("Total: " + (val+val2));
    }
    
}
