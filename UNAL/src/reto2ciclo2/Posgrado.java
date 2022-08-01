
package reto2ciclo2;

public class Posgrado extends Estudiante{
    String modalidad;
    
    // Constructor

    public Posgrado(String nombre, int edad, String programa, String tipo_etnia, String modalidad) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }
    
    // Metodos
    @Override
    public String toString (){
        
        return "\tEstudiante Posgrado \n" + 
                "\tNombre: " + this.nombre + "\n" +
                "\tEdad: " + this.edad + " anios" + "\n" +
                "\tPrograma: " + this.programa + "\n" +
                "\tEtnia: " + this.tipo_etnia + "\n" + 
                "\tModalidad: " + this.modalidad;
    }
}
