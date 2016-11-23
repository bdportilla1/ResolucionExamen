// EXCEPCIONES
package Cuatro;

import java.util.Scanner;

// CLASE EJECUTOR
public class Ejecutor {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // SE DECLARA EL SCANNER PARA LA ENTRADA DE DATOS  
        
        try // USO DEL TRY PARA QUE EJECUTE EL CODIGO
        {
            // EN CASO DE QUE SE INGRESE UN DATO INCORRECTO EJECUTARA EL CATCH
            System.out.println("Ingrese su nombre");
            String nombre = scan.next();
            System.out.println("Ingrese su apellido");
            String apellido = scan.next();
            String[] calificaciones = {"10", "15", "l"};
            Persona p = new Persona(nombre, apellido, calificaciones);
            System.out.println(p);

            

        } // fin de bloque try
        
        // EN CASO DE LA EXCEPCION SE EJECUTA LO SIGUIENTE
        catch (Exception e) {
            System.err.printf("\nExcepcion: %s\n", // SE PRESENTA LA EXCEPCION
                    e);
            scan.nextLine(); 
            // NOS MUESTRA UN MENSAJE
            System.out.println(
                    "DATOS INCORRECTOS\n--------------------------------------");
        }
            
        }
        
        
        
        
        
        
 }

    
