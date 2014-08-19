/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo4;

/**
 *
 * @author Temp
 */
public class ListaCircular {

    
    private Nodo _first;                                                        //Se define el nodo pivote    
    private Nodo _siguiente;                                                       //Se define el nodo actual
    
    public ListaCircular(){
        _siguiente = _first;                                                       //El nodo actual apunta al pivote al inicio
        _first = _siguiente;
        
    }
    
    public void agregarNodo(int valor){                                         //Permite agregar otro nodo a la cadena din�mica
        Nodo nuevoNodo = new Nodo(valor);                                       
        if(_first == null){                                                     //Si el pivote no tiene nada se le asigna un nodo y actual apunta al pivote
            _first = nuevoNodo;                                                 //para tener una referencia
            _first.setNext(_first);            
        }
        else{
            nuevoNodo.setNext(_first.getNext());                                         //El nodo acutal apunta a un nuevo nodo y ese nuevo nodo se convierte en el actual
            _first.setNext(nuevoNodo);
        }                
    }
    
    public String toString(){                                                   //Se despliega el valor del nodo acutal.
        Nodo first = _first;        
        if(_first !=null){
            while(first.getNext() != null){
                System.out.println("El valor del Nodo es: "+first.getValue());
                first = first.getNext();
            }
        }        
        return "";
    }    
    
}
   

