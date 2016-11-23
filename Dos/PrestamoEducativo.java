
package Dos;

// CLASE PRESTAMOEDUCATIVO QUE HEREDA DE LA CLASE PRESTAMO
public class PrestamoEducativo extends Prestamo {

    // CONSTRUCTOR DE CLASE PRESTAMOEDUATIVO
    public PrestamoEducativo(String n_b, double s, double m_p, int in, int t_p_a, Garante g1, String n_e, String n_c_e, Garante g2, Garante g3) {
        super(n_b, s, m_p, in, t_p_a, g1);
        setNivel_estudio(n_e);
        setNombre_centro_educativo(n_c_e);
        setGarante2(g2);
        setGarante3(g3);

    }
    
    // ATRIBUTOS DE LA CLASE PRESTAMOEDUCATIVO
    private String nivel_estudio;
    private String nombre_centro_educativo;
    Garante garante2;
    Garante garante3;

    // METODO GET Y SET DE LA CLASE PRESTAMO EDUCATIVO
    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String n_e) {
        nivel_estudio = n_e;
    }

    public String getNombre_centro_educativo() {
        return nombre_centro_educativo;
    }

    public void setNombre_centro_educativo(String n_c_e) {
        nombre_centro_educativo = n_c_e;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante g3) {
        garante3 = g3;
    }
    
    
    // SOBRESCRIBIR METODO TOSTRING
    @Override
    public String toString() {
        return String.format("PRESTAMO EDUCATIVO\n%sNivel estudio: %s\nCentro Educativo: %s\nGARANTE 2\nNombre: %s\nApellido: %s\nSueldo: %.2f\nGARANTE 3\nNombre: %s\nApellido: %s\nSueldo: %.2f",
                super.toString(),getNivel_estudio(), getNombre_centro_educativo(), getGarante2().getNombre(), getGarante2().getApellido(), getGarante2().getSueldo(), getGarante3().getNombre(), getGarante3().getApellido(), getGarante3().getSueldo());
    }
    
    
    
    
}
