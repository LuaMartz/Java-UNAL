
//package reto3ciclo2;

import java.util.ArrayList;

public class Obra {
    public static ArrayList<Integer>clases(ArrayList<Integer>categorias){
        ArrayList<Integer> salida = new ArrayList<>();
        for (Integer i:categorias) {
            if (!salida.contains(i)) {
                salida.add(i);
            }
        }
        return salida;
    }
    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer>museo1,ArrayList<Integer>museo2,int numero){
        ArrayList<Integer> salida = new ArrayList<>();
        for (Integer i: museo1) {
            if (museo2.get(i).equals(numero)) {
                salida.add(i);
            }
        }
        return salida;
    }
    public static ArrayList<Integer> noTengo(ArrayList<Integer>museoA, ArrayList<Integer>museoB){
        ArrayList<Integer> salida = new ArrayList<>();
        for (Integer i: museoA) {
            if (!museoB.contains(i)) {
                salida.add(i);
            }
        }
        return salida;
    }
    public static Integer puedoCambiar(ArrayList<Integer>museoA, ArrayList<Integer>museoB){
        ArrayList<Integer> interesA = new ArrayList<>();
        ArrayList<Integer> interesB = new ArrayList<>();
        for (Integer i: museoA) {
            if (!museoB.contains(i)) {
                interesA.add(i);
            }
        }
        for (Integer i: museoB) {
            if (!museoA.contains(i)) {
                interesB.add(i);
            }
        }
        Integer NumeroA = interesA.size();
        Integer NumeroB = interesB.size();
        if (NumeroA<=NumeroB) {
            return NumeroA;
        }else{
            return NumeroB;
        }
    }
}
