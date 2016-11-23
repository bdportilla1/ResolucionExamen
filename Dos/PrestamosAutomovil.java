
package Dos;

// CALSE PRESTAMOS AUTOMOVIL QUE HEREDA DE LA CLASE PRESTAMO
public class PrestamosAutomovil extends Prestamo{

    // CONSTRUCTOR DE CLASE PRESTAMO AUTOMOVIL
    public PrestamosAutomovil(String n_b, double s, double m_p, int in, int t_p_a, Garante g1, String t, String m, Garante g2) {
        super(n_b, s, m_p, in, t_p_a, g1);
        setTipo_vehiculo(t);
        setMarca_vehiculo(m);
        setGarante2(g2);
    }
    
    // ATRIBUTOS DE LA CALSE PRESTAMO AUTOMOVIL
    private String tipo_vehiculo;
    private String marca_vehiculo;
    Garante garante2;

    // METODO GET Y SET DE LA CLASE PRESTAMO AUTOMOVIL
    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String t) {
        tipo_vehiculo = t;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(String m) {
        marca_vehiculo = m;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    
    // SOBRESCRIBIR EL METODO TOSTRING 
    @Override
    public String toString() {
        return String.format("PRESTAMO AUTOMOVIL\n%sTipo Vehiculo: %s\nMarca vehiculo: %s\nGARANTE 2\nNombre: %s\nApellido: %s\nSueldo: %.2f",
                super.toString(), getTipo_vehiculo(), getMarca_vehiculo(), getGarante2().getNombre(), getGarante2().getApellido(), getGarante2().getSueldo());
    }
    
    
    
}
