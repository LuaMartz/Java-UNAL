
package Listas;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;

public class FuncionesListas {
   //Función que me genere de forma aleatoria una lista de enteros
    //y me retorne la lista
    public static ArrayList<Integer> listaAleatoria(ArrayList<Integer>lista){
        int cant= (int)(Math.random()*(200-1)+1);
        for(int i=0;i<cant;i++){
            int random = (int)(Math.random()*(1000-1)+1);
            lista.add(random);
        }      
        return lista;
    }
    
    // función que dada una lista de nombres se busque a un persona por su
    // nombre y se le cambie el nombre por el valor ingresado
    // Devolver la nueva lista
    
    public static ArrayList<String> cambiarNombre(ArrayList<String>nombres,String nombre, String cambiar){
        for(int i=0;i<nombres.size();i++){
            if(nombres.get(i).equals(nombre)){
                 nombres.set(i, cambiar);
            }
        }
        return nombres;
    }
    
    // Dada una lista de numeros, eliminar los duplicados e imprimir la lista procesada
    
    public static void duplicados(ArrayList<Integer>lista){
        ArrayList<Integer>listaNueva = new ArrayList<>();
        ArrayList<Integer>duplicadoss = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (!listaNueva.contains(lista.get(i))){ //Si no esta en la lista lo agrega
                listaNueva.add(lista.get(i));
            }else{
                duplicadoss.add(lista.get(i));
            }
        }
        sort(listaNueva); // Ordenamiento Ascendente
        Collections.reverse(listaNueva); // Ordenamiento Descendente
        System.out.println(listaNueva);
    }
    
    // Eliminar todos los sofia y carlos y devolvel la nueva lista
    
    public static ArrayList<String>eliminarNombres(ArrayList<String>nombress){
//        //Solucion 1
//        ArrayList<String>listaNueva = new ArrayList<>();
//        for (int i = 0; i < nombress.size(); i++) {
//            if (!nombress.get(i).equals("Carlos")&& !nombress.get(i).equals("Sofia")) {
//                listaNueva.add(nombress.get(i));
//            }
//        }
//        return nombress;
   //Solucion 2
//        for (int i = 0; i < nombress.size(); i++) {
//            if (nombress.get(i).equals("Sofia")|| nombress.get(i).equals("Carlos")) {
//                nombress.remove(i);
//            }
//        }
//        return nombress;
    //Solucion 3
//        for (String i:nombress) {
//            if (i.equals("Sofia")|| i.equals("Carlos")) {
//                nombress.remove(i);
//            }
//        }
//        return nombress;
//    
    // Solucion 4
      ArrayList<String>eliminar= new ArrayList<>();
       eliminar.add("Sofia");
       eliminar.add("Carlos");
       nombress.removeAll(eliminar);//removeAll elimina la intersección de ambas lista
       
       //Quinta solución
       nombress.removeIf(i->i.equals("Sofia"));
       nombress.removeIf(i->i.contains("Carlos"));
       //Ordenamiento
       sort(nombress);//asc
       Collections.reverse(nombress);//desc
       return nombress;
    }
    
}
        
