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
public class PilaArray<T> extends Pila {
    public char[] arreglo1,lista;
    public int valor=100;
    public int contador=50;
    public T cosa;
    private int n=0,m=1,total,i=0;
    private char op1,op2,op3;
    public int operando, operando2;
    public int resultado,res,cant;
    public String signo,sig,linea;
    
    char[] arreglo = new char[valor];
    char[] arreglo2 = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
    public PilaArray(int valor)
    {
    this.valor=valor;
    
    }
        
     public char[] pop()
     {
     return arreglo;
     }

    @Override
    public void push(Object cosa,int contador) {
        this.cosa=(T) cosa;
        this.contador=contador;
        
        arreglo[contador]=(char) cosa;
        arreglo2[contador]=arreglo[contador];
        System.out.print(""+arreglo);
        System.out.print(""+arreglo2+"\n");
        i=i+1;
    }

    @Override
    public int total(char[] lista) {
        this.lista=lista;
        
        op1=(char) lista[n];
    int operando = Character.getNumericValue(op1);
    
    op2=(char) lista[m];
    int resultado = Character.getNumericValue(op2);
    
    op3=(char) lista[m+1];
    String signo = String.valueOf(op3);
    
    total=Operacion(operando,resultado,signo);
    n=n+4;
    m=m+2;
    
    //m es del numero
    //n es del signo
    for(int m=3 ;n<cant;n++)
        
    {    
    op2=(char) lista[m];//obtiene el numero a operar
    int operando2 = Character.getNumericValue(op2);
    
    op3=(char) lista[n];//obtiene el operando
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
