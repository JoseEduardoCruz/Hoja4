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
public class Pilafactory<T> {
    public Pila pila;
    public int total,opcion,cant;
    public String linea;
    public char[] lista;

    public Pilafactory(String linea, int cant)
    {
    this.cant=cant;
    this.linea=linea;
    }
    
    public int metodo(int opcion, int cant)
    {
        this.cant=cant;
        this.opcion=opcion;
    if(opcion==1)
    {
    PilaArray pila =new PilaArray(cant);
    for(int contador=0;contador<cant;contador++)
    {
        char aChar = linea.charAt(contador);
        
     pila.push(aChar, contador);
     
    }
        lista=pila.pop();
      
            
    total=pila.total(lista);
    return total;
    }
   if(opcion==2)
    {
    PilaVector pila =new PilaVector(cant);
    for(int i=0;i<cant;i++)
    {
        char aChar = linea.charAt(i);
        
     pila.push(aChar, i);
    }
    lista=(char[])pila.pop();
    total=pila.total(lista);
    return total;
    
    }
   return total;
    }

    
}
