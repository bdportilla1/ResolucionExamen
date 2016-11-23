
package Tres;

// CLSE CAMINONES QUE HEREDA DE VEHICULO
public class Camiones extends Vehiculo{
    
    // ATRIBUTO DE LA CLASE CAMIONES
    private int toneladas;

    // CONSTRUCTOR DE LA CLASE CAMIONES 
    public Camiones(String mat, String c, String mar, int d_a,int t) {
        super(mat, c, mar, d_a);
        setToneladas(t);
    }

    // GET Y SET DEL ATRIBUTO
    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int t) {
        toneladas = t;
    }
    
    // SE SOBRESCRIBE EL METODO ABSTRACTO DE LA SUPERCLASE 
    @Override
    public double obtener_precio_alquiler(){
        return (50 * getDias_alquiler() + (20 * getToneladas())); // SECALCULA EL PRECIO ALQUILER
    }
    
    // SE SOBRESCRIBE EL METODO TOSTRING
    @Override
    public String toString() {
        return String.format("CAMION\n%s\n", super.toString());
    }
    
    
    
}
