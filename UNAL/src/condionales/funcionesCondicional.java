/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condionales;

/**
 *
 * @author usuario1
 */
public class funcionesCondicional {
    
    // Valor Absoluto |x| --> x es positivo, |x|=x 
    // x es negativo, |x|= -x
    
    public static double valorAbsoluto(double x){
        if(x<0){
            x=-x;   
        }
        return x; 
    }
    
    public static double valorAbsoluto2(double x){       
        x=(x<0)?-x:x; 
        return x;
    }
    
    public static void elMayor(double a, double b){
        /*
            if(a>=b){
                mayor= a;
        }else{
                mayor=b;
        }
        */
        
        double mayor= (a>=b)?a:b;
        
        System.out.println("el mayor es "+mayor);
    }
    /* Clasificación de población respecto a su edad:
         1. Entre 1 y 4 años --> primera infancia   
         2. Entre 5 y 13 años --> niñez
         3. Entre 14 y 17 años --> adolescente
         4. Entre 18 y 40 años --> adulto
         5. Entre 40 y 55 años --> adulto mayor
         6. Entre 55 en adelante --> anciano
    */
    public static void clasificacionPoblacion(int edad){
        // AND --> && , OR --> ||
       if(edad<=0){
             System.out.println("No se pueden buscar categorias para ese valor");                      
       }
       else{
            if(edad>=1 && edad<=4){
                System.out.println("Este usuario esta en la categoria de Primera Infancia");
            }else if(edad>=5 && edad<=13){
                System.out.println("Este usuario esta en la categoria de Niñez");
            }else if(edad>=14 && edad<=17){
                System.out.println("Este usuario esta en la categoria de Adolescente");                
            }else if(edad>=18 && edad<=40){
                System.out.println("Este usuario esta en la categoria de Adulto");        
            }else if(edad>40 && edad<=55){
                System.out.println("Este usuario esta en la categoria de Adulto Mayor");        
            }else{
                System.out.println("Este usuario esta en la categoria de Anciano");
            }
       }
    }
    /*una función que dada una opción nos permita traer otra función:
        5 --> valorAbsoluto
        6 --> valorAbsoluto2
        7 --> elMayor
        8 --> clasificacionPoblacion
    */
    
    public static void activarFunciones(int opcion){
        
        switch(opcion){
            case 5:
                System.out.println(valorAbsoluto(-10));
            break;
            case 6:
                System.out.println(valorAbsoluto2(20));
            break;
            case 7:
                elMayor(55,90);
            break;
            case 8:
                clasificacionPoblacion(40);
            break;
            default:
                System.out.println("No exite función para esa opción");
            break;
        }
    }
    
    public static boolean esVocalMinuscula(char letra){
        boolean value;
        switch(letra){
            case 'a':
                value=true;
            break;
            case 'e':
                value=true;
            break;
            case 'i':
                value=true;
            break;
            case 'o':
                value=true;
            break;
            case 'u':
                value=true;
            break;
            default:
                value=false;
        }
        return value;
    } 
    
     public static boolean esVocalMinuscula2(char letra){
        switch(letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
    //Hacer la función esVocalMinuscula2 con condicional IF
    public static boolean esVocalMinuscula3(char letra){
        if(letra=='a' || letra=='e'|| letra=='i' || letra=='o'|| letra=='u'){
            return true;
        }else{
            return false;
        }
        // return letra=='a' || letra=='e'|| letra=='i' || letra=='o'|| letra=='u';
    }
}


