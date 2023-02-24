
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas () {
    
    //int valor1 = 10, valor2 = 8;
    float suma, resta, multiplicación, division;

        
    public void Suma (int valor1, int valor2) { 
       suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);  
    }
       
        
    public void Resta (int valor1, int valor2) {
        
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }
        
     public void multiplicación (int valor1, int valor2) {
        
         multiplicación = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicación);
        
     }
        
    public void division (int valor1, int valor2) {
        
         division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }
       
   
                       
    public static void main(String[] args) {        
        OperacionesBasicas suma= new OperacionesBasicas();
        suma.Suma(7,5);
        OperacionesBasicas resta= new OperacionesBasicas ();
        resta.Resta (8,9) ;
        OperacionesBasicas multiplicación= new OperacionesBasicas ();
        multiplicación.multiplicación (10,5) ;
        OperacionesBasicas division= new OperacionesBasicas ();
        division.division (20,5 ) ;
        
    }
    
}
