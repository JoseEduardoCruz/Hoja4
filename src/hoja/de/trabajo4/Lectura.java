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
import java.io.*;

public class Lectura {
    public String strLinea;
    public int cant;

    public String getStrLinea() {
        return strLinea;
    }

    public void setStrLinea(String strLinea) {
        this.strLinea = strLinea;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
public String Codigo()
{
try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("Datos.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                //System.out.println (strLinea);
                 return strLinea;
            }
            // Cerramos el archivo
            entrada.close();
        }
    catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }	
    
    return strLinea;
}

public int Cantidad()
{
try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("Datos.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                cant= strLinea.length();
            }
            // Cerramos el archivo
            entrada.close();
        }
    catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }	
    
    return cant;
}
}


