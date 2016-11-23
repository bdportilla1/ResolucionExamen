
package Cuatro;
// CLASE PERSONA
public class Persona {
    
    // DECLARACION DE LOS ATRIBUTOS DE LA CLASE PERSONA
    private String nombre;
    private String apellido;
    private String [] calificaciones;
    
    // CONSTRUCTOR DE LA CLASE PERSONA
    public Persona(String n, String a, String [] cali){
        set_nombre(n);
        set_apellido(a);
        set_calificaciones(cali);
    }
    // METODOS GET Y SET DE LA CLASE PERSONA
    public void set_nombre(String n){
        nombre = n.toUpperCase();
    } 
    public void set_apellido(String a){
        apellido = a.toUpperCase();
    }
    public void set_calificaciones(String [] cali){
        calificaciones = cali;
    }
    public String get_nombre(){
        return nombre;
    }
    public String get_apellido(){
        return apellido;
    }
    public String[] get_calificaciones(){
        return calificaciones;
    }
    
    // FUNCION GET_PROMEDIO QUE ME RETORNARA EL CALCULO DEL PROMEDIO
    public double get_promedio(){
        double suma = 0;
        double promedio = 0;
        for(String v: get_calificaciones()){
            suma = suma + Double.parseDouble(v);
        }
        promedio = suma / get_calificaciones().length;
        return promedio;
    }
    
    // SOBRESCRIBIR EL METODO TOSTRING Y PRESENTAR RESULTADOS
    @Override
    public String toString(){
        return   String.format("Nombre   es:   %s   -  Apellido   es   %s   -   Promedio   de   notas:   %f",get_nombre(), get_apellido(), get_promedio());
    
    }
}
    

