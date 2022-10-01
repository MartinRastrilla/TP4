
package practico4;

public class Practico4 {

    public static void main(String[] args) {
        Materia ingles = new Materia(1,"Ingles",1);
        Materia mate = new Materia(2,"Matematicas",1);
        Materia lab = new Materia(3,"Laboratorio",1);
        Alumno alum1 = new Alumno(1001,"Lopez","Martin");
        Alumno alum2 = new Alumno(1002,"Martinez","Brenda");
        alum1.agregarMaterias(lab);
        alum1.agregarMaterias(mate);
        alum1.agregarMaterias(ingles);
        alum2.agregarMaterias(mate);
        alum2.agregarMaterias(ingles);
        alum2.agregarMaterias(lab);
        alum2.agregarMaterias(lab);
        System.out.println("El alumno esta inscripto en "+alum1.cantidadMaterias()+" materias");
        System.out.println("El alumno esta inscripto en "+alum2.cantidadMaterias()+" materias");
        
    }
}
