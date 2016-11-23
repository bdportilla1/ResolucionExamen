
package Dos;

import java.util.Scanner;

// CLASE EJECUTORA
public class Ejecutor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); // SE DECLARA EL SCANNER PARA LA ENTRADA DE DATOS
        // SE DECLARA LOS ATRIBUTOS
        // SERVIRA PARA INGRESAR LOS DATOS E INSTANCIAR OBJETOS
        String nombre_b;
        double sueldo;
        double monto_prestamo;
        int interes;
        int tiempo;
        String nombre_gar;
        String apellido;
        double sueldo_gar;
        String tipo_v;
        String marca_v;
        String nivel;
        String centro;
        
        // SE INICIALIZA UN ARREGLO DE TIPO PRESTAMOAUTOMOVIL DE TAMAÑO 2
        PrestamosAutomovil prestamos1[] = new PrestamosAutomovil[2];
        // SE INICIALIZA UN ARREGLO DE TIPO PRESTAMOEDUCATIVO DE TAMAÑO 3
        PrestamoEducativo prestamos2[] = new PrestamoEducativo[3];
        
        // SE DECCLARA OBJETOS PARA LUEGO SER INSTANCIADOS 
        Garante gar;
        Garante gar2;
        Garante gar3;
        // OBJETOS DE TIPO PRESTAMO AUTOMVIL Y EDUCATIVO
        PrestamosAutomovil p_a;
        PrestamoEducativo p_e;
        
        
        
        // SE REALIZA UN CICLO FOR HASTA EL 2
        // SE USARA 
        for (int i=0; i<2; i++){
            // SE INGRESA POR TECLADO LOS ATRIBUTOS DE PRESTAMO
            System.out.println("-------PRESTAMO VEHICULO---------");
            System.out.println("Ingrese el nombre del beneficiario:");
            nombre_b = entrada.next();
            System.out.println("Ingrese el sueldo:");
            sueldo = entrada.nextDouble();
            System.out.println("Ingrese el monto del prestamo:");
            monto_prestamo = entrada.nextDouble();
            System.out.println("Ingrese el interes:");
            interes = entrada.nextInt();
            System.out.println("Ingrese el tiempo de prestamo en años:");
            tiempo = entrada.nextInt();
            
            // SE INGRESA LOS ATRIBUTOS DE GARANTE
            System.out.println("-------GARANTE del prestamo-------");
            System.out.println("Ingrese el nombre del garante");
            nombre_gar = entrada.next();
            System.out.println("Ingrese el apellido del garante");
            apellido = entrada.next();
            System.out.println("Ingrese el sueldo del garante");
            sueldo_gar = entrada.nextDouble();
            
            // SE INICIALIZA EL OBJETO DE TIPO GARANTE
            gar = new Garante(nombre_gar, apellido, sueldo_gar);
            // SE INGRESA LAS ATRIBUTOS LOCALES DE PRESTAMMO AUTOMOCIL
            System.out.println("--------Vehiculo---------");
            System.out.println("Ingrese el tipo del vehiculo");
            tipo_v = entrada.next();
            System.out.println("Ingrese la marca del vehiculo");
            marca_v = entrada.next();
                // SE INGRESA GARANTE
            System.out.println("-------GARANTE del vehiculo-------");
            System.out.println("Ingrese el nombre del garante");
            nombre_gar = entrada.next();
            System.out.println("Ingrese el apellido del garante");
            apellido = entrada.next();
            System.out.println("Ingrese el sueldo del garante");
            sueldo_gar = entrada.nextDouble();
            gar2 = new Garante(nombre_gar, apellido, sueldo_gar);
            
            // SE INICIALIZA EL OBJETO PRESTAMO AUTOMOVIL
            p_a = new PrestamosAutomovil(nombre_b, sueldo, monto_prestamo, interes, tiempo, gar, tipo_v, marca_v, gar2);
            // SE LO GUARDA EN EL ARREGLO DEL MISMO TIPO EN LA POSCICION I
            prestamos1[i]= p_a;
            
        }
        
        for (int i=0; i<3; i++){
            // SE INGRESA POR TECLADO LOS ATRIBUTOS DE PRESTAMO
            System.out.println("----------PRESTAMO EDUCATIVO");
            System.out.println("Ingrese el nombre del beneficiario:");
            nombre_b = entrada.next();
            System.out.println("Ingrese el sueldo:");
            sueldo = entrada.nextDouble();
            System.out.println("Ingrese el monto del prestamo:");
            monto_prestamo = entrada.nextDouble();
            System.out.println("Ingrese el interes:");
            interes = entrada.nextInt();
            System.out.println("Ingrese el tiempo de prestamo en años:");
            tiempo = entrada.nextInt();
                // SE INGRESA EL GARANTE
            System.out.println("-------GARANTE del prestamo-------");
            System.out.println("Ingrese el nombre del garante");
            nombre_gar = entrada.next();
            System.out.println("Ingrese el apellido del garante");
            apellido = entrada.next();
            System.out.println("Ingrese el nombre del garante");
            sueldo_gar = entrada.nextDouble();
            // SE INICIALIZA EL GARANTE
            gar = new Garante(nombre_gar, apellido, sueldo_gar);
            
            // SE INGRESA LOS DATOS DE PRESTAMO EDUCATIVO
            System.out.println("--------ECUCATIVO---------");
            System.out.println("Ingrese el nivel de estudia");
            nivel = entrada.next();
            System.out.println("Ingrese el centro educativo");
            centro = entrada.next();
                // SE INGRESA LOS DATOS DE GARANTE 1
            System.out.println("-------GARANTE  1 educativo-------");
            System.out.println("Ingrese el nombre del garante");
            nombre_gar = entrada.next();
            System.out.println("Ingrese el apellido del garante");
            apellido = entrada.next();
            System.out.println("Ingrese el nombre del garante");
            sueldo_gar = entrada.nextDouble();
            // SE INICIALIZA EL GARANTE
            gar2 = new Garante(nombre_gar, apellido, sueldo_gar);
            // SE INGRESA LOS DATOS DE GARANTE 2
             System.out.println("-------GARANTE  2 educativo-------");
            System.out.println("Ingrese el nombre del garante");
            nombre_gar = entrada.next();
            System.out.println("Ingrese el apellido del garante");
            apellido = entrada.next();
            System.out.println("Ingrese el nombre del garante");
            sueldo_gar = entrada.nextDouble();
            // SE INICIALIZA EL GARAMTE 2
            gar3 = new Garante(nombre_gar, apellido, sueldo_gar);
            
            // SE INICIALIZA EL OBJETO PRESTAMO EDUCATIVO
            p_e = new PrestamoEducativo(nombre_b, sueldo, monto_prestamo, interes, tiempo, gar, nivel, centro, gar2, gar3);
            prestamos2[i]= p_e;    
    }
        
        // SE IMPRIMEN LOS OBJETOS PRESTAMO 
        System.out.println("-------------------------------PRESTAMOS-------------------------------------");
        
        // SE IMPRIME OBJETOS PRESTAMO AUTOMOVIL
        for (PrestamosAutomovil x: prestamos1){
            System.out.println("--------------PRESTAMOS AUTOMOVIL-------------");
            System.out.printf("%s\nEl valor del prestamo es: %.2f\n", x, x.obtener_valor_prestamo());
            System.out.println("----------------------------------------------");
        }
        // SE IMPRIME OBJETOS PRESTAMO EDUCTATIVO
        for (PrestamoEducativo x: prestamos2){
            System.out.println("--------------PRESTAMOS Educativo-------------");
            System.out.printf("%s\nEl valor del prestamo es: %.2f\n", x, x.obtener_valor_prestamo());
            System.out.println("----------------------------------------------");
            
        }
    
}
}
