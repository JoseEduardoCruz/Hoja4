//Universidad del Valle de Guatemala
//Algoritmos y estructura de datos
//Autores:
//Mario Barrientos #13039
//Gustavo Gordillo #13254
//DESCRIPCION: esta clase es la encargada de manejar la logica en la creacion de de listas con nodos doblemente enlazados
package hoja.de.trabajo4;


public class ListadoblementeEnlazada {
  private int dato;
  private Nodo adelante;
  private Nodo atras;
  private Nodo referencia;
  private Nodo actual;
  
  public ListadoblementeEnlazada(int entrada){
      this.dato = entrada;
      atras = referencia = null;                  
  }
  
  public void agregarNodo(int valor){                                    
      Nodo nuevoNodo = new Nodo(valor);                       
      if(atras == null){
                referencia = new Nodo(-1);
          atras = referencia;          
          nuevoNodo.setNext(adelante);          
          nuevoNodo.setPrevious(atras);
          actual = nuevoNodo;
          referencia.setNext(actual);                   
          atras = actual;
      }
      else{
          actual.setNext(nuevoNodo);
          nuevoNodo.setNext(adelante);
          nuevoNodo.setPrevious(atras);
          actual = nuevoNodo;
          atras = actual;                              
      }                 
    }
    
    public String toString(){                                                   //Se despliega el valor del nodo acutal.
        Nodo first = referencia.getNext();                
        if(referencia !=null){            
            while(first.getNext() != null){
                System.out.println("El valor del nodo es:"+first.getValue());                
                System.out.println("El valor del nodo anterior es:"+(first.getPrevious()).getValue());
                System.out.println("El valor del nodo siguiente es:"+(first.getNext()).getValue());
                System.out.println("####################################################");
                first = first.getNext();
            }    
       }        
        return "";
    }
    
    
}

  

