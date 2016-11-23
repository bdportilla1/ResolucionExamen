// POLIMORFISMO
package Tres;

// CLASE ABSTRACTA VEHICULO
public abstract class Vehiculo {
    
    // DECLARACION DE LOS ATRIBUTOS DE LA CLASE VEHICULO
    private String matricula;
    private String color;
    private String marca;
    private int dias_alquiler;

    // METODO CONSTRUCTOR DE LA CLASE VEHICULO
    public Vehiculo(String mat, String c, String mar, int d_a) {
        setMatricula(mat);
        setColor(c);
        setMarca(mar);
        setDias_alquiler(d_a);   
    }

    // METODOS GET Y SET DE LA CLASE VEHICULO
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String m) {
        matricula = m;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public void setDias_alquiler(int d_a) {
        dias_alquiler = d_a;
    }

    
    // SE DECLARA EL METODO ABSTRACTO QUE RETORNARA UN FLOAT
    public abstract double obtener_precio_alquiler();
    
    // SE SOBRESCRIBE EL METODO TOSTRING
    @Override
    public String toString() {
        return String.format("Matricula: %s\nColor: %s\nMarca: %s\nDias alquiler: %d", getMatricula(), getColor(), getMarca(), getDias_alquiler());
    }
    
    
    
}
