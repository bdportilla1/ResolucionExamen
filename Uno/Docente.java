
package Uno;

// CLASE DOCENTE
public class Docente {
    // ATRIBUTOS DE LA CLASE DOCENTE
    private String nombre;
    private String apellido;
    private String titulo;

    // CONSTRUCTOR DE LA CLASE DOCENTE
    public Docente(String n, String a, String t) {
        setNombre(n);
        setApellido(a);   
        setTitulo(t);
    }

    // METODOS GET Y SET DE LOS ATRIBUTOS DE LA CLASE DOCENTE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        titulo = t;
    }
    
    
    
    
}
