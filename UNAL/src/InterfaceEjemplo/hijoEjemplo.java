/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceEjemplo;
/*
Dependencia de clases es cuando tiene como uno de sus atributos un objeto de
de otra clase, si la relacion es fuerte, es decir, el funcionamiento de una
clase depende del onjeto de otra clase se conoce como Composicion y se expresa
con un rombi negro y una flecha apuntando a la otra clase hijoEjemplo♦-->InterfaceEjemplo
En caso de que el funcionamiento de la clase no dependa del onjeto de la 
otra clase, entonces es Asociacion claseA <> ----> claseB
*/
public class hijoEjemplo {
    InterfaceEjemplo x;
    public hijoEjemplo(){
        x = new InterfaceEjemplo();
    }
    
    public void imprimirSuma(){
        x.resta(0, 0);
    }
}
