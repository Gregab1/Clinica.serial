import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Turno implements Serializable {
    private  String fecha;
    private String hora;
    private Paciente paciente;
    private Doctor doctor;
    public Turno(){
    }

    public Turno(String fecha,String hora,  Paciente paciente, Doctor doctor) {

        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
   public void asignarTurno(){


   }
   public boolean validacionTurno(){
       ArrayList<Turno>verT=Modelo.recuperaTurnos();
       boolean retornar=false;
       for (int i=0;i<verT.size();i++){
           if (equals(verT)){
               return true;
           }
       }
       return retornar;
   }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turno)) return false;
        Turno turno = (Turno) o;
        return Objects.equals(hora, turno.hora) && Objects.equals(fecha, turno.fecha) && Objects.equals(paciente, turno.paciente) && Objects.equals(doctor, turno.doctor);
    }



    @Override
    public String toString() {
        return "Turno-->" +
                "fecha; " +  fecha +
                " hora; " + hora+
                " paciente=" + paciente +
                " doctor=" + doctor ;
    }
}
