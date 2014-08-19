//Universidad del Valle de Guatemala
//Algoritmos y estructura de datos
//Autores:
//Mario Barrientos #13039
//Gustavo Gordillo #13254
//DESCRIPCION: esta clase es la base de todas las listas, porque representa al nodo como tal.
package hoja.de.trabajo4;
public class Nodo implements Comparable {                                       //Se implementa Comparable, clase ya dentro de los paquetes de Java.
    
    private int _value;                                                         //Es el valor del Nodo    
    private Nodo next;                                                          //Permite apuntar al siguiente objeto
    private Nodo previous;
    
    
    public Nodo(){                                                              //Nodo predeterminado
        this._value = 1;
        this.next = null;
    }
    
    public Nodo(int _value){                                                    //Nodo que es modificable
        this._value = _value;        
    }
                                                                                 //Settters and Getters
    public int getValue() {
        return _value;
    }

    public void setValue(int _value) {
        this._value = _value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }

    public int compareTo (Object other)                                         //CampareTo, metodo implementado por comparable
   {                                                                            //Aqui se compara el valor que se encuentra en el nodo con el
                                                                                //valor del siguiente nodo.
        int result;
        int valor = ((Nodo)other).getValue();


        if (valor == _value)
           result=  0;
        if (valor<_value){
            result=1;
        }
        else
           result = -1;
         


      return result;
   }    
    
    public String toString ()                                                   //se imprime el el valor del nodo
   {
      return "El valor del nodo es:"+_value;
   }
   //-----------------------------------------------------------------
   //  Returns a description of this contact as a string.
   //-----------------------------------------------------------------
   public boolean equals (Object other)                                         //Regresa un true si los valores son iguales
   {
      return (_value==((Nodo)other).getValue());
              
   }
        
}
