/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Jeany
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bolsa b = new Bolsa();
        b.poner(5);
        b.poner(4);
        b.poner(3);
        b.poner(2);
        b.poner(1);
        
        System.out.println("Lista vacia es " +b.vacia());
        System.out.println("Cantidad de la lista "+ b.contar());         
    }
    
}
