
package Tres;

// CLASE MICROBUSES QUE HEREDA DE LA CLASE VEHICULO
public class Microbuses extends Vehiculo{
    
    // ATRIBUTO DE LA CLAE MICROBUSES
    private int numero_rutas_diarias;

    // CONSTRUCTOR DE LA CLASE MICROBUSES
    public Microbuses(String mat, String c, String mar, int d_a, int n_r_d) {
        super(mat, c, mar, d_a);
        setNumero_rutas_diarias(n_r_d);
    }

    // GET Y SET DE LA CLASE MICROBUSES
    public int getNumero_rutas_diarias() {
        return numero_rutas_diarias;
    }

    public void setNumero_rutas_diarias(int n_r_d) {
        numero_rutas_diarias = n_r_d;
    }
    
    // SOBRSCRIBIR EL METODO ABSTRACTO DE LA SUPERCLASE
    @Override
    public double obtener_precio_alquiler(){
        return (50 * getDias_alquiler() + (10 * getNumero_rutas_diarias()));
    }
    
    // SOBRESCRIBIR EL METODO TOSTRING
    @Override
    public String toString() {
        return String.format("MICROBUS\n%s\n", super.toString());
    }
    
    
    
    
    
}
