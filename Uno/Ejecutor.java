
package Uno;

import java.util.Scanner;

// CALSE EJECUTORA PARA EL EJERCICIO 1
public class Ejecutor {
    
    // MAIN
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); // SE DECLARA EL SCANNER PARA LA ENTRADA POR TECLADO 
        
        // DECLARACION DE VARIABKES 
        String nombre;
        String apellido;
        String titulo;
        String nombre_p;
        String apellido_p;  
        boolean proceso = true; // BANDERA PARA CONTROLAR QUE EL PROGRAMA SE SIGA EJECUTANDO
        int c = 1;
        int el;
       
        // DECLARACION DE OBEJETOS DOCENTE Y ALUMNO
        Docente d_pro;
        Docente d_ba;
        Alumno alu;
        
        // PROCESO
        while(proceso){
            // SE INGRESAN LOS DATOS DEL ALUMNO NOMBRE, APELLIDO
            System.out.println("------------------------------------");
            System.out.printf("-----------ALUMNO %d-----------\n", (c));
            System.out.println("Ingrese el nombre de alumno");
            nombre = entrada.next();
            System.out.println("Ingrese el apellido del alumno");
            apellido = entrada.next();
            
            // SE INGRESAN LOS DATOS DEL PROFESOR DE PROGRAMACION
            System.out.println("--------Profesor PROGRAMACION-----------");
            System.out.println("Ingrese el nombre del Profesor de programacion:");
            nombre_p = entrada.next();
            System.out.println("Ingrese el apellido del Profesor de programacion");
            apellido_p = entrada.next();
            System.out.println("Ingrse su titulo:");
            titulo = entrada.next();
            // SE INSTANCIA EL OBJETO DE TIPO DOCENTE
            d_pro = new Docente(nombre_p, apellido_p, titulo);
            
            // SE INGRESAN LOS DATOS DEL PROFESOR BASE DE DATOS
            System.out.println("--------Profesor BASE DE DATOS-----------");
            System.out.println("Ingrese el nombre del Profesor de base de datos:");
            nombre_p = entrada.next();
            System.out.println("Ingrese el apellido del Profesor de base de datos");
            apellido_p = entrada.next();
            System.out.println("Ingrse su titulo:");
            titulo = entrada.next();
            // SE INSTANCIA EL ONJETO DOCENTE
            d_ba = new Docente(nombre_p, apellido_p, titulo);
            
            // FINALMENET PODEMOS INSTANCIAR EL OBJETO DE TIPO ALUMNO
            alu = new Alumno(nombre, apellido, d_pro, d_ba);
            
            
            // PRESENTAMOS EL METODO TO STRING DEL OBJETO ALUMNO
            System.out.println("-----------------------------");
            System.out.println("DATOS DEL ALUMNO");
            System.out.printf(alu.toString());  
            System.out.println("-----------------------------");
            
            // SE PREGUNTA SI SE DESEA INGRESAR OTRO ALUMNO
            
            System.out.println("ALUMNO INGRESADO CORRECTAMENTE!");
            System.out.println("Desea ingresar otro:   1[SI]    2[NO]");
            el = entrada.nextInt();
            if (el != 1){
                proceso = false; // SI NO ES ASI ENTONCES EL PROCESO SE TERMINARA
            }else{
                c = c+1;           
            }
        }
        
        
        
        
    }
    
}
