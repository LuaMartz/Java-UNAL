/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

/**
 *
 * @author usuario1
 */
public class ProblemasFunciones {

    /**
     * @param args the command line arguments
     */
    //función matematica volumenSolido= volumenEsfera+volumenCono
    
    public static double volumenEsfera(double radio){
        double volumenE=(4*Math.PI*Math.pow(radio, 3))/3;
        return volumenE;
        //return ((4*Math.PI*Math.pow(radio, 3))/3);
    }
    
    public static double volumenCono(double radio, double altura){
        double volumenC= (Math.PI*Math.pow(radio, 2)*altura)/3;
        return volumenC;
    }
    

    public static void main(String[] args) {
        double radio= 2;
        double altura= 3;
        double volumenSolido= volumenEsfera(radio)+volumenCono(radio,altura);
        System.out.println("El volumen del solido es: "+volumenSolido);  
    }
    
}
