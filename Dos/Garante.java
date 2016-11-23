
package Dos;

// CLASE GARANTE
public class Garante {
    
    // ATRIBUTPS DE LA CLASE GARANTE
    private String nombre;
    private String apellido;
    private double sueldo;

    
    // CONSTRUCTOR DE LA CLASE GARANTE
    public Garante(String n, String a, double s) {
        setNombre(n);
        setApellido(a);
        setSueldo(s);
        
    }
    
    // METODO GET Y SET DE LA CLASE GARANTE
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }

    // SOBRESCRIBIR METODO TOSTRING 
    @Override
    public String toString() {
        return String.format("-----Garante----\nNombre: %s\nApellido: %s\nSueldo: %.2f\n", getNombre(), getApellido(), getSueldo());
    }
    
    
    
    
}
