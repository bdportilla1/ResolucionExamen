
package Tres;

// CLASE EJECUTOR
public class Ejecutor {
    
    
    public static void main(String[] args) {
        // SE INSTANCIAN LOS OBJETOS CON VALORES
        
        // OBJETO DE TIPO COCHES
        Coches coche = new Coches ("111", "rojo", "chevrolet", 4, 4);
        // OBJETO DE TIPO CAMION
        Camiones camion = new Camiones ("222", "azul", "toyota", 2, 10);
        // OBJETO DE TIPO MICROBUSES
        Microbuses micro = new Microbuses ("333", "negro", "Mazda", 4, 8);
        // OBJETO DE TIPO FURGONETA
        Furgoneta furgoneta = new Furgoneta ("444", "amarillo", "mercedez", 3);
        
        // SE CREA UN ARREGLO DE TIPO VEHICULOS
        Vehiculo vehiculos [] = new Vehiculo[4];
        
        // SE ASIGNAN LOS OBJETOS AL ARREGLO
        vehiculos[0] = coche;
        vehiculos[1] = camion;
        vehiculos[2] = micro;
        vehiculos[3] = furgoneta;
        
        
        // SE PRESENTA EL OBJETO + EL METODO ABSTRACTO DE CADA UNO
        for (Vehiculo carrito: vehiculos){
            System.out.println("----------------------------------");
            System.out.printf("%sPrecio alquiler: %.2f\n\n", carrito, carrito.obtener_precio_alquiler());
            System.out.println("----------------------------------");
        }
        
        
    }
    
}
