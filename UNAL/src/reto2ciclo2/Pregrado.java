
package reto2ciclo2;

public class Pregrado extends Estudiante {
    // Atributo
    int cantidad_creditos;
    
    // Constructor
    public Pregrado(String nombre, int edad, String programa, String tipo_etnia, int cantidad_creditos) {
        super(nombre, edad, programa, tipo_etnia);
        this.cantidad_creditos = cantidad_creditos;
    }
    
    // Metodos
    @Override
    public String toString (){
        
        return "\tEstudiante Pregrado \n" + 
                "\tNombre: " + this.nombre + "\n" +
                "\tEdad: " + this.edad + " anios" + "\n" +
                "\tPrograma: " + this.programa + "\n" +
                "\tEtnia: " + this.tipo_etnia + "\n" +
                "\tCreditos aprobados: " + this.cantidad_creditos;
    }
}
