package practico4;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Alumno {

    protected int legajo;
    protected String apellido;
    protected String nombre;
    protected HashMap<Integer,Materia> materia;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materia = new HashMap();
    }


    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMaterias(Materia m) {
        if (!materia.containsKey(m.idMateria)) {
            materia.put(m.idMateria,m);
            JOptionPane.showMessageDialog(null, "El alumno se ha registrado a  la materia " + m.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "El alumno ya está cursando esta materia");
        }
    }

    public int cantidadMaterias() {
        return materia.size();  
    }

    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
}
