
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Maricruz",
           apellido_paterno = "Zermeño",
           apellido_materno = "Gonzalez";
    String Numero_de_cuenta = "1840928";
    String Semestre_que_cursas = "cuarto"; 
    String Materias_que_tienes = "6";
    String Horarios = "7:00 a 9:00";
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("su numero de cuenta es:" + Numero_de_cuenta);
        System.out.println("El semestre que cursas es:" + Semestre_que_cursas);
        System.out.println("Las materias que tienes son:" + Materias_que_tienes);
        System.out.println("Tu horario es" + Horarios);
        
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
