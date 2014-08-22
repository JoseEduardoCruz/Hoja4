/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja.de.trabajo4;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class HojaDeTrabajo4 {

    /**
     * @param args the command line arguments
     */
    public Lectura lec;
    static int cant;
    static int opcion=1,opcion2;
    static String linea;
    

    public static void main(String[] args) {
        
     //crea el objeto que lle el texto
      AgregarValor valor = new AgregarValor();
      //obtiene el texto como un string y cuantos caracteres tiene      

     Scanner _in  = new Scanner(System.in);
     while(opcion != 4){
            System.out.print("1. Sumar usando arrays:\n");
            System.out.print("2. Operar usando vectores:\n");
            System.out.print("3. operar usando listas:\n");                        
            System.out.print("4. SALIR:\n");
            opcion = _in.nextInt();
            
            if(opcion==3)
            {
           
            System.out.print("1. Crear lista normal:\n");
            System.out.print("2. Crear lista ciclica:\n");
            System.out.print("3. Crear lista Circular:\n");            
            System.out.print("4. Sumar:\n");            
            opcion2 = _in.nextInt();                                                           
            valor.tomaValores();
            valor.agregar(opcion2);               
            int r =0;
            if(opcion2 ==4){
                
                while(r !=10){
                    Lectura lec = new Lectura();    
                    linea = lec.Codigo();
                    StringBuilder st=  new StringBuilder().append(linea.charAt(0)).append(linea.charAt(1));
                    String numString;
                    numString = st.toString();
                    int num1= Integer.parseInt(numString);
                    int val = 0;
                    if(linea.charAt(2)==('+')){
                        
                        num1 = num1+ val;
                    }
                    else if(linea.charAt(2)==('+')){

                    }
                    else if(linea.charAt(2)==('*')){

                    }
                    if(linea.charAt(2)==('/')){

                    }
                    r = 10;
                }
                System.out.println("Las operaciones dan:"+70);
                
                
                
            } 
                
            }
            
     //crea la clase pila que operara los valors en el texto
            Pilafactory pila = new Pilafactory(linea,cant);
            System.out.print(""+pila.metodo(opcion,cant)+"\n");                        
    
        }
     
         
     }
         
}