/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja.de.trabajo4;

import java.util.Vector;

/**
 *
 * @author Jose
 */
public class PilaVector<T> extends Pila {
    public int cant;
     public int operando, operando2;
    public int resultado,res,total;
    public int contador=0;
    private String signo;
    public T cosa;
    public char[] lista;
    Vector vec;
    Vector vec2;
    private int n=0,m=1;
    private char op1,op2,op3;
    
    public PilaVector(int cant)
    {
    this.cant=cant;
    vec = new Vector(cant);
    
    }
    


    public void push(Object valor, int contador) {
        this.valor=valor;
        this.contador=contador;
    vec.add(valor);
    }

    
    public char[] pop() {
        char[] vec1 = new char[cant];
        vec2 = new Vector(cant);
        for (int i=0; i<cant; i++)
        {
        vec1[i]=(char) vec.get(i);
        }
        return vec1;
    }

    
    public int total(char[] lista) {
        
        for (int i=0; i<cant; i++)
        {
        vec2.add(lista[i]);
        }
       op1=(char) vec2.get(n);
    int operando = Character.getNumericValue(op1);
    
    op2=(char) vec2.get(m);
    int resultado = Character.getNumericValue(op2);
    
    op3=(char) vec2.get(m+1);
    String signo = String.valueOf(op3);
    
    total=Operacion(operando,resultado,signo);
    n=n+4;
    m=m+2;
    
    //m es del numero
    //n es del signo
    for(int m=3 ;n<cant;n++)
        
    {    
    op2=(char) vec.get(m);//obtiene el numero a operar
    int operando2 = Character.getNumericValue(op2);
    
    op3=(char) vec.get(n);//obtiene el operando
    String sig = String.valueOf(op3);
    res=total;
    //se obtiene el valor ed la operacion
    total=Operacion(operando2,res,sig);
    //se aumentan los contadores
    n=n+1;
    m=m+2;
    }    
        return total;
    }
    
    private int Operacion(int operando,int resultado, String signo )
    {
    this.operando=operando;
    this.resultado=resultado;
    this.signo=signo;
    
    if(signo.equals("+"))
    {
    resultado=operando+resultado;
    }
    
    if(signo.equals("-"))
    {
    resultado=resultado-operando;
    }
    if(signo.equals("*"))
    {
    resultado=operando*resultado;
    }
    if(signo.equals("/"))
    {
    resultado=resultado/operando;
    }
        
     return resultado;   
    }
    
}
