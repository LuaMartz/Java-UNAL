
package InterfaceEjemplo;

// Las interfaces son plantillas de metodos abstractos
// Herencia entre interfaces se hace con extends
public interface OperacionesMat extends OperacionesMat2{
    
    // Definir constantes (simepre en mayusculas)
    final int NIT = 78789869;
    final String NOMBRE = "Pruebas SA";
    
    //Metodos abstractos (no tinen cuerpo o logica
    public double suma(double x, double y);
    
    public double resta(double x, double y);
}
