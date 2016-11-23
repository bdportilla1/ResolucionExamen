
package Tres;

// CLASE COCHES QUE HEREDA DE VEHICULO
public class Coches extends Vehiculo {
    
    // ATRIBUTO DE LA CLASE COCHES
    private int numero_pasajeros;
    
    // CONSTRUCTOR DE LA CLASE COCHES
    public Coches(String mat, String c, String mar, int d_a, int n_p) {
        super(mat, c, mar, d_a);
        setNumero_pasajeros(n_p);
    }
    
    // GET Y SET DEL ATRIBUTO
    public int getNumero_pasajeros() {
        return numero_pasajeros;
    }
    public void setNumero_pasajeros(int n_p) {
        numero_pasajeros = n_p;
    }

    // METODO ABSTRACTO DE LA SUPERCLASE
    @Override
    public double obtener_precio_alquiler(){
        return (50 * getDias_alquiler() + (5 * getNumero_pasajeros())); // SE CALCULA EL PRECIO ALQUILER
    }
    
    // SE SOBRESCRIBE EL METODO TOSTRING
    @Override
    public String toString() {
        return String.format("COCHE\n%s\n", super.toString());
    }
    
    
    

    
    
}
