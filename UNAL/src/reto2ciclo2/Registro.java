
package reto2ciclo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    // Atributos
    // ArrayList arreglos dinamicos su tamaño no es fijo
    ArrayList<Estudiante>estudianteLista = new ArrayList<Estudiante>();
    ArrayList<Object>todosDatos;
    
    public static void main(String[] args) {
        Registro regis = new Registro();
        regis.procesarComandos();
        
    }
    
    // Constructor
    
    public Registro() {
    }

    //1&Pregrado&Luis Parra&21&Medicina&Raizal&15
    public void agregarEstudiante(String[]comandos){
        if (comandos[1].equals("Pregrado")) {
            String nombre= comandos[2];
            Integer edad = Integer.parseInt(comandos[3]);
            String programa = comandos[4];
            String etnia = comandos[5];
            Integer creditos = Integer.parseInt(comandos[6]);
            
            Pregrado estudiante = new Pregrado(nombre, edad, programa, etnia, creditos); 
            estudianteLista.add(estudiante);
        }else if (comandos[1].equals("Posgrado")) {
            String nombre= comandos[2];
            Integer edad = Integer.parseInt(comandos[3]);
            String programa = comandos[4];
            String etnia = comandos[5];
            String modalidad = comandos[6];
            
            Posgrado estudiante = new Posgrado(nombre, edad, programa, etnia, modalidad); 
            estudianteLista.add(estudiante);
        }
    }
    public void listarEstudiantes(){
        System.out.println("***Listado de estudiantes***");
        for (Estudiante i: estudianteLista) {
            System.out.println(i);
        }
    }
    public void procesarComandos(){
        Scanner sc = new Scanner(System.in);
        String opcion;
        
        do {
            String datos = sc.nextLine();            
            String[]partes = datos.split("&");
            opcion = partes[0];
            
            if (opcion.equals("1")) {
                this.agregarEstudiante(partes);
            }else if (opcion.equals("2")){
                this.listarEstudiantes();
              
            }
        } while (!opcion.equals("3"));
        
            
        }
    
}
