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
public class Bolsa {
    int cuenta = 0;
    class elemento
    {
        int e; 
        elemento siguiente;
        elemento anterior;
    }
    elemento inicio = null;
    elemento fin = null;
    
    void poner (int val1)
    {
        elemento temp = new elemento();
        temp.e = val1;
        if(inicio == null)
        {
            //temp.siguiente = temp;
            //temp.anterior = temp;
            inicio = temp;
        }
        else
        {
            fin.siguiente = temp;
            temp.anterior = fin;
        }
        fin = temp;
        fin.siguiente = inicio;
        inicio.anterior = fin;
    }
    
    public boolean vacia()
    {
        return inicio == null;
    }
    
    public int contar()
    {
        if(inicio != null)
        {
            elemento recorrer = inicio;
            do
            {
                cuenta = cuenta+ 1;
                recorrer = recorrer.siguiente;
            }
            while(recorrer != inicio);
        }
        return cuenta; 
    }
    
}
