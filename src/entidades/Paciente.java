package entidades;

import utilidades.Util;

import java.util.ArrayList;

public class Paciente {
    public int id;
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public ArrayList<Consulta> consultas;

    public Paciente(int id, String nome, String cpf, String email, String telefone, ArrayList<Consulta> consultas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.consultas = consultas;
    }

//    public Paciente autenticarPaciente(ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas, ArrayList<Medico> medicos) {
//        Util util = new Util();
//        Paciente foundPaciente = null;
//        System.out.println("Digite seu id:");
//        int id = util.sc.nextInt();
//
//        for (Paciente paciente : pacientes) {
//            if (paciente.id == id) {
//                foundPaciente = paciente;
//                break;
//            }
//        }
//        if (foundPaciente != null) {
//            util.println("Autenticado com sucesso");
//            direcionaParaConsulta(foundPaciente, consultas, medicos);
//        }
//        else {
//            util.println("Não autenticado.\n");
//        }
//        return foundPaciente;
//    }

//    private void direcionaParaConsulta(Paciente paciente, Consulta marcarConsulta, ArrayList<Medico> medicos) {
//        Util util = new Util();
//        Consulta marcarConsulta = new Consulta();
//        util.println("Caríssimo(a), " + paciente.nome + ".\n" +
//                    "Siga para marcarConsulta\n");
//        marcarConsulta.marcaConsulta(paciente);
//    }
}
