
package InterfaceEjemplo;

// extends es para heredar clases
// implements es para heredar interfaces (permite herencia multiple)
// Al heredar interface, la clase esta obligada a implementar todos los metodos abstractos de la interfaz

public class InterfaceEjemplo implements OperacionesMat, OperacionesMat2{

    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    // Implementar parametros implements
    @Override
    public double suma(double x, double y) {
        return x+y;
    }

    @Override
    public double resta(double x, double y) {
        return x-y;
    }

    @Override
    public double multiplicacion(double x, double y) {
        return x*y;
    }

    @Override
    public double division(double x, double y) {
        return x/y;
    }
    
    
    
}
