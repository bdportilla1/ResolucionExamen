
package Uno;

//CLASE ALUMNO
public class Alumno {
    // DECLARACION DE ATRIBUTOS DE LA CLASE ALUMNO
    private String nombre;
    private String apellido;
    Docente docente_programacion;
    Docente docente_base_datos;

    // METODO CONSTRUCTOR DE LA CLASE ALUMNO
    public Alumno(String n, String a, Docente d_p, Docente d_b_d) {
        
        setNombre(n);
        setApellido(a);
        setDocente_programacion(d_p);
        setDocente_base_datos(d_b_d);
    
    }
    // METODOS GET Y SET DE LOS ATRIBUTOS DE LA CLASE ALUMNO
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

    public Docente getDocente_programacion() {
        return docente_programacion;
    }

    public void setDocente_programacion(Docente d_p) {
        docente_programacion = d_p;
    }

    public Docente getDocente_base_datos() {
        return docente_base_datos;
    }

    public void setDocente_base_datos(Docente d_b_d) {
        docente_base_datos = d_b_d;
    }

    // METODO TO STRING DE LA CLASE ALUMNO
    @Override
    public String toString() {
        String c;
        c = String.format("Nombre: %s\nApellido: %s\n", getNombre(), getApellido());
        c = c + String.format("DOCENTE PROGRAMACION\nNombre: %s\nApellido: %s\nTitulo: %s\n", getDocente_programacion().getNombre(), getDocente_programacion().getApellido(), getDocente_programacion().getTitulo());
        c = c + String.format("DOCENTE BASE DE DATOS\nNombre: %s\nApellido: %s\nTitulo: %s\n", getDocente_base_datos().getNombre(), getDocente_base_datos().getApellido(), getDocente_base_datos().getTitulo());
        return c;
}
    
}

