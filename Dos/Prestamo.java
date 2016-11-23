
package Dos;

// CLASE PRESTAMO
public class Prestamo {
    
    // ATRIBUTOS DE LA CLASE PRESTAMO
    private String nombre_beneficiario;
    private double sueldo;
    private double monto_prestamo;
    private int interes;
    private int tiempo_prestamo_anios;
    Garante garante1;

    // CONSTRUCTOR DE LA CLASE PRESTAMO
    public Prestamo(String n_b, double s, double m_p, int in, int t_p_a, Garante g1) {
        setNombre_beneficiario(n_b);
        setSueldo(s);
        setMonto_prestamo(m_p);
        setInteres(in);
        setTiempo_prestamo_anios(t_p_a);
        setGarante1(g1);
    }
    
    
    // METODOS GET Y SET DE LA CALSE PRESTAMO
    public String getNombre_beneficiario() {
        return nombre_beneficiario;
    }

    public void setNombre_beneficiario(String n_b) {
        nombre_beneficiario = n_b;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }

    public double getMonto_prestamo() {
        return monto_prestamo;
    }

    public void setMonto_prestamo(double m_p) {
        monto_prestamo = m_p;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int in) {
        interes = in;
    }

    public int getTiempo_prestamo_anios() {
        return tiempo_prestamo_anios;
    }

    public void setTiempo_prestamo_anios(int t_p_a) {
        tiempo_prestamo_anios = t_p_a;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante g1) {
        garante1 = g1;
    }
    
    
    // METODO PROPIO DE LA CLASE PRESTAMO QUE RETORNA EL VALOR DEL PRESTAMO
    public double obtener_valor_prestamo(){
        double aux;
        aux = getMonto_prestamo() / (getTiempo_prestamo_anios()*12);
        aux = aux + (aux * (getInteres()/100.0));
        aux = aux * (getTiempo_prestamo_anios()*12);
        return aux;
    }

    // SOBRESCRIBIR EL METODO TOSTRING
    @Override
    public String toString() {
        return String.format("Nombre beneficiario: %s\nSueldo: %.2f\nMonto prestamo: %.2f\nInteres: %d\nTiempo de prestamo en anios: %d\n", getNombre_beneficiario(), getSueldo(), getMonto_prestamo(), getInteres(), getTiempo_prestamo_anios());
    }
    
        
    
    
    
    
}
