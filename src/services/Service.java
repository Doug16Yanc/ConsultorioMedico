package services;

import entidades.Consulta;
import utilidades.Util;

import static utilidades.BancoDeDados.CONSULTAS;

public class Service {
    public void listarConsultas() {
        Util util = new Util();

        while (true) {

            System.out.println("Escolha uma opção");
            System.out.println("1 - Listar por pacientes");
            System.out.println("2 - Listar por médicos");
            System.out.println("3 - Listar todos");
            System.out.println("0 - Sair");

            int opcao = util.sc.nextInt();

            switch (opcao) {
                case 1:
                    new MarcarConsulta().listarConsultasPorPaciente();
                    break;
                case 2:
                    new MarcarConsulta().listarConsultasPorMedico();
                    break;
                case 3:
                    for (Consulta consulta : CONSULTAS) {
                        System.out.println("ID da marcarConsulta: " + consulta.id);
                        System.out.println("Data e hora da marcarConsulta: " + consulta.agoraFormated());
                        System.out.println("Motivo: " + consulta.motivo);
                        System.out.println("Médico CRM: " + consulta.medico.crm);
                        System.out.println("Paciente CPF: " + consulta.paciente.cpf);
                        System.out.println("Paciente Nome: " + consulta.paciente.nome);
                        System.out.println("---------------------------\n");
                    }
                    break;
                case 4:
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.exit(0);
            }

        }
    }
}

