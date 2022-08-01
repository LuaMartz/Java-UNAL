
package Patrones;

// La genericidad se debe indicar desde la clase <T> y puede ser de max 2 elementos
public class Caja <T> {
    /*
    //Atributos
    public T elem;
    
    // Constructor
    public Caja(T elem) {
        this.elem = elem;
    }
    */
    // Metodos
    public String decorar(T elem){
        String s = elem.toString();
        String linea = "*"; // Se agrega primer *
        for (int i = 0; i < s.length(); i++) {
            linea += "*"; // Se agrega * equivalentes a la cantidad de digitos
        }
        linea += "*"; // Se agrega ultimo *
        return linea + "\n*" + s + "*\n" + linea;
    }
}
