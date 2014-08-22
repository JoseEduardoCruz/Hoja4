
package hoja.de.trabajo4;

/**
 *
 * @author Temp
 */
public class AgregarValor {
        ListadoblementeEnlazada _lista = new ListadoblementeEnlazada(-1);
        ListaCircular _lista1 = new ListaCircular();
        Lista _lista2 = new Lista();  
        Lectura lec = new Lectura();    
        String linea;
        int cant;        
        int[] numero;
        
        public AgregarValor(){            
            linea = lec.Codigo();
            numero = new int[cant=lec.Cantidad()];
            tomaValores();    
        }
        
        public void tomaValores(){            
            
                        
        }
        
        public void agregar(int opcion){            
                    
            switch(opcion)
            {               
                case 2:      
                    System.out.println("---O------O------OLISTA-----O-----O------O");
                    System.out.println(linea.charAt(0));
                    System.out.println(linea.charAt(1));
                    System.out.println(linea.charAt(2));
                    System.out.println(linea.charAt(3));
                    System.out.println(linea.charAt(4));
                    System.out.println(linea.charAt(5));
                    System.out.println(linea.charAt(6));
                    System.out.println(linea.charAt(7));
                    System.out.println(linea.charAt(8));
                    System.out.println(linea.charAt(9));
                    System.out.println(linea.charAt(10));
                    System.out.println(linea.charAt(11));
                    System.out.println(linea.charAt(12));
                    System.out.println(linea.charAt(13));
                    System.out.println(linea.charAt(14));                    
                    
                    System.out.println("\n");
                    
                    break;                    
                    
                case 3: 
                    int r = 0;
                    System.out.println("---O------O------OLISTA-----O-----O------O");
                    while(r != 2){                                                                    
                        System.out.println(linea.charAt(0));
                        System.out.println(linea.charAt(1));
                        System.out.println(linea.charAt(2));
                        System.out.println(linea.charAt(3));
                        System.out.println(linea.charAt(4));
                        System.out.println(linea.charAt(5));
                        System.out.println(linea.charAt(6));
                        System.out.println(linea.charAt(7));
                        System.out.println(linea.charAt(8));
                        System.out.println(linea.charAt(9));
                        System.out.println(linea.charAt(10));
                        System.out.println(linea.charAt(11));
                        System.out.println(linea.charAt(12));
                        System.out.println(linea.charAt(13));
                        System.out.println(linea.charAt(14));                    
                        System.out.println("\n");
                        r++;
                    }
                    break;                    
                case 1:
                    System.out.println("---O------O------OLISTA-----O-----O------O");
                    System.out.println(linea.charAt(0));
                    System.out.println(linea.charAt(1));
                    System.out.println(linea.charAt(2));
                    System.out.println(linea.charAt(3));
                    System.out.println(linea.charAt(4));
                    System.out.println(linea.charAt(5));
                    System.out.println(linea.charAt(6));
                    System.out.println(linea.charAt(7));
                    System.out.println(linea.charAt(8));
                    System.out.println(linea.charAt(9));
                    System.out.println(linea.charAt(10));
                    System.out.println(linea.charAt(11));
                    System.out.println(linea.charAt(12));
                    System.out.println(linea.charAt(13));
                    System.out.println(linea.charAt(14));                    
                    System.out.println("\n");
                    break;                    
            }
        }        
}
