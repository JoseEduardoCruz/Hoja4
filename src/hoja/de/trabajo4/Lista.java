//Universidad del Valle de Guatemala
//Algoritmos y estructura de datos
//Autores:
//Mario Barrientos #13039
//Gustavo Gordillo #13254
//DESCRIPCION: esta clase es la encargada de manejar la logica en la creacion de de listas con nodos  enlazados simples
package hoja.de.trabajo4;
public class Lista {
    
    private Nodo _first;                                                        //Se define el nodo pivote    
    private Nodo _Actual;                                                       //Se define el nodo actual
    
    public Lista(){
        _Actual = _first;                                                       //El nodo actual apunta al pivote al inicio
        
    }
    
    public void agregarNodo(int valor){                                         //Permite agregar otro nodo a la cadena din�mica
        Nodo nuevoNodo = new Nodo(valor);                                       
        if(_first == null){                                                     //Si el pivote no tiene nada se le asigna un nodo y actual apunta al pivote
            _first = nuevoNodo;                                                 //para tener una referencia
            _Actual = _first;
        }
        else{
            _Actual.setNext(nuevoNodo);                                         //El nodo acutal apunta a un nuevo nodo y ese nuevo nodo se convierte en el actual
            _Actual = nuevoNodo;            
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
