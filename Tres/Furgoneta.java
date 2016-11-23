
package Tres;

// CLASE FURGONETA QUE HEREDA DE LA CLASE VEHICULO
public class Furgoneta extends Vehiculo{
    
    // CONSRUCTOR DE LA CLASE FURGONETA
    public Furgoneta(String mat, String c, String mar, int d_a) {
        super(mat, c, mar, d_a);
    }
    
    // SOBRESCRIBIR METODO ABSTRACTO DE LA SUPERCLASE
    @Override
    public double obtener_precio_alquiler(){
        return (50 * getDias_alquiler() + 100);
    }
    
    // SOBRSCRIBIR EL METODO TOSTRING
    @Override
    public String toString() {
        return String.format("FURGONETA\n%s\n", super.toString());
    }
}
