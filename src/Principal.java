import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        ArrayList<Consulta> consultas = new ArrayList<>();

        var paciente = new Paciente();
        paciente.autenticarPaciente(principal.inicializaPacientes(), consultas, principal.inicializaMedicos());
    }

    private ArrayList<Paciente> inicializaPacientes() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(1, "Elena Toledo", "456.896.123-89", "elenatoledo@gmail.com", "(51) 5453-4562", null));
        pacientes.add(new Paciente(2, "Oscar Bastos", "123.875.133-86", "oscarbastos@gmail.com", "(49) 4933-6759", null));
        pacientes.add(new Paciente(3, "Edite Castro", "545.453.321-90", "editecastro@gmail.com", "(50) 5098-6242", null));
        return pacientes;
    }

    private ArrayList<Medico> inicializaMedicos() {
        ArrayList<Medico> medicos = new ArrayList<>();
        return medicos;
    }
}