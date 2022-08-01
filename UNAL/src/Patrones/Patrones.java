
package Patrones;


public class Patrones {
    
    public String decorar(int n){
        /*
        x=15
        ****
        *15*
        ****
    */
        String s = "" + n; //Casteo de enteros a cadena de caracteres
        String linea = "*"; // Se agrega primer *
        for (int i = 0; i < s.length(); i++) {
            linea += "*"; // Se agrega * equivalentes a la cantidad de digitos
        }
        linea += "*"; // Se agrega ultimo *
        return linea + "\n*" + s + "*\n" + linea;
    }
    public String decorar(double n){
        /*
        x=15
        ******
        *15.8*
        ******
    */
        String s = "" + n; //Casteo de enteros a cadena de caracteres
        String linea = "*"; // Se agrega primer *
        for (int i = 0; i < s.length(); i++) {
            linea += "*"; // Se agrega * equivalentes a la cantidad de digitos
        }
        linea += "*"; // Se agrega ultimo *
        return linea + "\n*" + s + "*\n" + linea;
    }
    
    public String decorar(String n){
        /*
        x=15
        ****
        *no*
        ****
    */
        String linea = "*"; // Se agrega primer *
        for (int i = 0; i < n.length(); i++) {
            linea += "*"; // Se agrega * equivalentes a la cantidad de digitos
        }
        linea += "*"; // Se agrega ultimo *
        return linea + "\n*" + n + "*\n" + linea;
    }
    
    public String decorar(Object n){
        /*
        x=15
        ****
        *15*
        ****
    */
        String s = n.toString(); //Casteo de object a cadena de caracteres
        String linea = "*"; // Se agrega primer *
        for (int i = 0; i < s.length(); i++) {
            linea += "*"; // Se agrega * equivalentes a la cantidad de digitos
        }
        linea += "*"; // Se agrega ultimo *
        return linea + "\n*" + s + "*\n" + linea;
    }
    
    public static void main(String[] args) {
        String h = "Hola";
        // Al almacenar el dato en un Object se pierden las propiedades iniciales
        Object x = h;
        h.length();
        int y = (x.toString().length());
        double m = 15.5;
        x = m;
        double l = Double.parseDouble(x.toString());
    }
    
}
