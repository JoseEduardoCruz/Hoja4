/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja.de.trabajo4;

/**
 *
 * @author Jose
 */
public class PilaArray<T> {
    public T[] arreglo;
    public int valor=10;
    
    public PilaArray(int valor)
    {
    this.valor=valor;
    Object[] arreglo = new Object[valor];
    }
    
    public void push();
    
     public T[] pop();
}
