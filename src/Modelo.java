import java.io.*;
import java.util.ArrayList;

public class Modelo {
    public static void GuardarPaciente(Paciente p) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.addAll(Modelo.recuperaPacientes());
        pacientes.add(p);
        try {
            ObjectOutputStream copiarDatos = new ObjectOutputStream(new FileOutputStream("C:/datosClinica/Paciente.txt"));
            copiarDatos.writeObject(pacientes);
            copiarDatos.close();
        } catch (Exception e) {

        }
    }

    public static ArrayList recuperaPacientes() {
        ArrayList<Paciente> recuperarP = new ArrayList<>();
        try {
            ObjectInputStream obtenerDatos = new ObjectInputStream(new FileInputStream("C:/datosClinica/Paciente.txt"));
            recuperarP = (ArrayList<Paciente>) obtenerDatos.readObject();
        } catch (Exception e) {

        }
        return recuperarP;
    }

    public static void GuardarDoctor(Doctor d) {
        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.addAll(Modelo.recuperaDoctores());
        doctores.add(d);

        try {
            ObjectOutputStream copiarDatos = new ObjectOutputStream(new FileOutputStream("C:/datosClinica/Doctor.txt"));
            copiarDatos.writeObject(doctores);
            copiarDatos.close();
        } catch (Exception e) {

        }
    }

    public static ArrayList recuperaDoctores() {
        ArrayList<Doctor> recuperarD = new ArrayList<>();
        try {
            ObjectInputStream obtenerDatos = new ObjectInputStream(new FileInputStream("C:/datosClinica/Doctor.txt"));
            recuperarD = (ArrayList<Doctor>) obtenerDatos.readObject();

        } catch (Exception e) {

        }
        return recuperarD;
    }

    public static void GuardarTurno(Turno t) {
        ArrayList<Turno> turnos = new ArrayList<>();
        turnos.addAll(Modelo.recuperaTurnos());
        turnos.add(t);
        try {
            ObjectOutputStream copiarDatos = new ObjectOutputStream(new FileOutputStream("C:/datosClinica/Turno.txt"));
            copiarDatos.writeObject(turnos);
            copiarDatos.close();
        } catch (Exception e) {

        }
    }

    public static ArrayList recuperaTurnos() {
        ArrayList<Turno> recuperarT = new ArrayList<>();
        try {
            ObjectInputStream obtenerDatos = new ObjectInputStream(new FileInputStream("C:/datosClinica/Turno.txt"));
            recuperarT = (ArrayList<Turno>) obtenerDatos.readObject();
        } catch (Exception e) {

        }
        return recuperarT;
    }

    public static void Eliminarturno(Turno t) {
        ArrayList<Turno> turnos = new ArrayList<>();
        turnos.addAll(Modelo.recuperaTurnos());
        turnos.remove(t);
        try {
            ObjectOutputStream copiarDatos = new ObjectOutputStream(new FileOutputStream("C:/datosClinica/Turno.txt"));
            copiarDatos.writeObject(turnos);
            copiarDatos.close();
        } catch (Exception e) {

        }
    }
}