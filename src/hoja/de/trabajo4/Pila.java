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
public abstract class Pila <T> {
    public T valor;
    public T[] lista;
    
    abstract public void push(T valor,int contador);    
    
    abstract public char[] pop();
    
    abstract public int total(char[] lista);
    
}
