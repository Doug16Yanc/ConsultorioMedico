package entidades;

import utilidades.Util;

import java.util.ArrayList;

public class Paciente {
    int id;
    String nome;
    String cpf;
    String email;
    String telefone;


    public Paciente() {

    }
    public Paciente(int id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public ArrayList<Paciente> inicializaPacientes() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(1, "Elena Toledo", "456.896.123-89", "elenatoledo@gmail.com", "(51) 5453-4562"));
        pacientes.add(new Paciente(2, "Oscar Bastos", "123.875.133-86", "oscarbastos@gmail.com", "(49) 4933-6759"));
        pacientes.add(new Paciente(3, "Edite Castro", "545.453.321-90", "editecastro@gmail.com", "(50) 5098-6242"));
        return pacientes;
    }



    public Paciente autenticarPaciente(ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas, ArrayList<Medico> medicos) {
        Util util = new Util();
        Paciente foundPaciente = null;
        System.out.println("Digite seu identificador :");
        int id = util.sc.nextInt();

        for (Paciente paciente : pacientes) {
            if (paciente.id == id) {
                foundPaciente = paciente;
                break;
            }
        }
        if (foundPaciente != null) {
            util.println("Autenticado com sucesso");
            direcionaParaConsulta(foundPaciente, consultas, medicos);
        }
        else {
            util.println("Não autenticado.\n");
        }
        return foundPaciente;
    }

    private void direcionaParaConsulta(Paciente paciente, ArrayList<Consulta> consultas, ArrayList<Medico> medicos) {
        Util util = new Util();
        Consulta consulta = new Consulta();
        util.println("Caríssimo(a), " + paciente.nome + ".\n" +
                    "Siga para consulta\n");
        consulta.marcaConsulta(paciente, consultas, medicos);
    }
}
