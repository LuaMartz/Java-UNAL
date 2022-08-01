
package MapasDiccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapasDiccionarios {

    public static void main(String[] args) {
        
        //HashMap = Diccionario con orden aleatorio qque no se puede cambiar
        HashMap<String,Double>notas= new HashMap<>();
        
        //Agregar elementos
        notas.put("Reto 6", 5.0);
        notas.put("Reto 1", 4.5);
        notas.put("Reto 5", 4.0);
        notas.put("Reto 3", 5.0);
        notas.put("Reto 4", 3.5);
        notas.put("Reto 2", 5.0);
        
        //Imprimir
        System.out.println(notas);
        
        //LinkedHashMap = Diccionario que deja el mismo orden que se establece
        LinkedHashMap<String,Double>notasLinked= new LinkedHashMap<>();
        
        //Agregar elementos
        notasLinked.put("Reto 5", 4.0);
        notasLinked.put("Reto 3", 5.0);
        notasLinked.put("Reto 4", 3.5);
        notasLinked.put("Reto 1", 4.5);
        notasLinked.put("Reto 2", 5.0);
        notasLinked.put("Reto 6", 5.0);
        
        //Imprimir
        System.out.println(notasLinked);
        
        //TreeMap = Diccionario ordenado
        TreeMap<String,Double>notasTree= new TreeMap<>();
        
        //Agregar elementos
        notasTree.put("Reto 7", 3.2);
        notasTree.put("Reto 5", 4.0);
        notasTree.put("Reto 3", 5.0);
        notasTree.put("Reto 4", 3.5);
        notasTree.put("Reto 1", 4.5);
        notasTree.put("Reto 2", 5.0);
        notasTree.put("Reto 6", 5.0);
        
        //Imprimir
        System.out.println(notasTree);
        
//        //Eliminar
//        notas.remove("Reto 6");
//        System.out.println(notas);
        
        //Recorrer
        double notaFinal=0.0;
        // ciclo
        for (Map.Entry<String,Double>i:notas.entrySet()) {
            notaFinal+=i.getValue(); 
        }
        // operacion funcional
//        notaFinal = notas.entrySet().stream().map((i) -> i.getValue()).reduce(notaFinal, (accumulator, _item) -> accumulator + _item);
        System.out.println(notaFinal/notas.size());
        
        
    }
    
}
