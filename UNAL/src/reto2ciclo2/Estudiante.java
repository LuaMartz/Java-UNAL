
package reto2ciclo2;

public abstract class Estudiante {
    
    // Atributos
 
    String nombre;
    int edad;
    String programa;
    String tipo_etnia;
    
    // Constructores

    public Estudiante(String nombre, int edad, String programa, String tipo_etnia) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipo_etnia = tipo_etnia;
    }

    // Metodos
    
    @Override
    public String toString(){
        //1&Pregrado&nombreEstudiante&edad&programa&etnia&creditosAprobados
        //1&Posgrado&nombreEstudiante&edad&programa&etnia&modalida
        //"&" + this.programa + "&" + this.nombre + "&" + this.edad + "&";
        return "\tEstudiante Pregrado \n" + 
                "\tNombre: " + this.nombre + "\n" +
                "\tEdad: " + this.edad + " anios" + "\n" +
                "\tPrograma: " + this.programa + "\n" +
                "\tEtnia: " + this.tipo_etnia;
    }
    
}
