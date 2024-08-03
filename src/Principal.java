import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import utilidades.Util;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Consulta> consultas = new ArrayList<>();
        Principal principal = new Principal();
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        principal.direcionaOpçoes(paciente.inicializaPacientes(), consultas, medico.inicializaMedicos());
    }

    private int direcionaOpçoes(ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas, ArrayList<Medico> medicos) {
        Util util = new Util();
        Paciente paciente = new Paciente();
        Consulta consulta = new Consulta();
        int opcao = 0;

        do {
            opcao = ofertaOpcoesNoConsole();

            switch (opcao) {
                case 1 -> {
                    paciente.autenticarPaciente(pacientes, consultas, medicos);
                }
                case 2 -> {
                    consulta.listarConsultasPorPaciente(consultas);
                }
                case 3 -> {
                    consulta.listarConsultasPorMedico(consultas);
                }
                case 4 -> {
                    util.println("Até mais!\n");
                    System.exit(0);
                }
                default -> {
                    util.println("Opção indisponível.\n");
                }
            }
        } while (opcao != 0);
        return opcao;
    }

    private int ofertaOpcoesNoConsole() {
        Util util = new Util();
        util.println("Qual sua escolha ");
        System.out.println(" 1 - Marcar consulta:\n" +
                " 2 - Listar consultas por paciente:\n" +
                " 3 - Listar consultas por medico:\n" +
                " 4 - Sair\n");
        return util.sc.nextInt();
    }
}