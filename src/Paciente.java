import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Paciente implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private String obrasoical;
    public Paciente(){
    }

    public Paciente(String nombre, String apellido, int edad, int DNI, String obrasoical) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.obrasoical = obrasoical;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getObrasoical() {
        return obrasoical;
    }

    public void setObrasoical(String obrasoical) {
        this.obrasoical = obrasoical;
    }


    public boolean validacion(){
        ArrayList<Paciente> verP=Modelo.recuperaPacientes();
        boolean  retornar=false;
        for(int i=0;i<verP.size();i++){
            if(equals(verP.get(i))){
                retornar= true;
            }
        }
        return retornar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente paciente = (Paciente) o;
        return edad == paciente.edad && DNI == paciente.DNI && Objects.equals(nombre, paciente.nombre) && Objects.equals(apellido, paciente.apellido) && Objects.equals(obrasoical, paciente.obrasoical);
    }


    @Override
    public String toString() {
        return "Paciente-->" +
                "nombre; " + nombre +
                " apellido; " + apellido +
                " edad; " + edad +
                " DNI; " + DNI +
                " obrasoical; " + obrasoical ;
    }


}
