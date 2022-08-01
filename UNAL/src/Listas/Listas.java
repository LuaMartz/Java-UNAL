
package Listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class Listas {

    public static void main(String[] args) {
        //Definición de las listas
        ArrayList<String>nombres= new ArrayList<>();
        nombres.add("Carlos"); // [Carlos]
        nombres.add("Luisa");  //  [Carlos, Luisa]
        nombres.add("Juan");   //  [Carlos, Luisa, Juan]
        nombres.add("Andrea"); //  [Carlos, Luisa, Juan, Andrea]
        nombres.add(3,"Miguel");// [Carlos, Luisa, Juan,Miguel,Andrea]
        nombres.add("Luisa");//[Carlos, Luisa, Juan,Miguel,Andrea, Luisa]
        nombres.set(1, "Luisa Fernanda");//[Carlos, Luisa Fernanda, Juan,Miguel,Andrea, Luisa]
        nombres.add(2, "Juan Felipe"); //[Carlos, Luisa Fernanda,Juan Felipe,Juan,Miguel,Andrea, Luisa]
        
        System.out.println(nombres);
        nombres.add(3,"Miguel");// [Carlos, Luisa, Juan,Miguel,Andrea]
        nombres.add("Luisa");//[Carlos, Luisa, Juan,Miguel,Andrea, Luisa]
        nombres.set(1, "Luisa Fernanda");//[Carlos, Luisa Fernanda, Juan,Miguel,Andrea, Luisa]
        nombres.add(2, "Juan Felipe"); //[Carlos, Luisa Fernanda,Juan Felipe,Juan,Miguel,Andrea, Luisa]
        
        System.out.println(nombres);
        
//        //Random genera un número aleatorio entre 0-1 y returna un double
//        /*  for(int i=0; i<10;i++){
//            double x= Math.random();
//            System.out.println(x);
//        }*/
//        //Random de enteros de 0 a n
//        /* for(int i=0; i<100;i++){
//            int x=(int) (Math.random()*10);//casteo de double a int
//            System.out.println(x);
//        }*/
//     
//        //Random desde un limite inferior a un limite superior
//        for(int i=0; i<100;i++){
//            int x=(int) (Math.random()*(21-10)+10);//(max-min)+min 
//            System.out.println(x);
//        }

        ArrayList<Integer>lista= new ArrayList<>();
        lista= FuncionesListas.listaAleatoria(lista);
        System.out.println(lista);
        FuncionesListas.duplicados(lista);
        
        System.out.println(FuncionesListas.cambiarNombre(nombres, "Carlos", "Carlos Mario"));
    
        ArrayList<String>nombress= new ArrayList<>();
        nombres.add("Sofia");
        nombres.add("Juan");
        nombres.add("Luisa");
        nombres.add("Carlos");
        nombres.add("Sofia");
        nombres.add("Santiago");
        nombres.add("Luisa");
        nombres.add("Carlos");
        nombres.add("Sofia");
        nombres.add("Sofia");
        nombres.add("Luisa");
        nombres.add("Maria");
        
        ArrayList<String>listaa= new ArrayList<>();
        System.out.println(listaa);
        FuncionesListas.eliminarNombres(listaa);
        
        //---
        
        //Vector --> Clase Obsoleta
        Vector x= new Vector();
        x.add(1);
        x.add(false);
        x.add("Hola");
        
        //ArrayList es mejor y hace lo mismo
        ArrayList<Object>y= new ArrayList<>();
        y.add(1);
        y.add(false);
        y.add("Hola");
        
        //LinkedList--> Listas enlazadas, se usan 
        //para estructuras con un orden de entrada y salida
        //Son más rápidos para la búsqueda de datos, pero más lentos
        //al almacenar
        /*  
            FIFO --> First In First Out
            FILO --> First In Last Out
            LIFO --> Last In First Out   
            LILO --> Last In Last Out   
        */
        LinkedList<String> enlaces= new LinkedList<>();
        
    }
}
