package services;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;

import static utilidades.BancoDeDados.*;

/**
 * Esta classe fornece métodos para gerenciar consultas médicas.
 */
public class MarcarConsulta {

    /**
     * Marca uma consulta médica para um paciente específico com um médico específico.
     *
     * @param motivo O motivo da consulta.
     * @param paciente O paciente que irá atender à consulta.
     * @param medico O médico que irá realizar a consulta.
     */
    public void marcarConsulta(String motivo, Paciente paciente, Medico medico) {
        System.out.println("Marcando consulta para " + paciente.nome + "...");
        Consulta consulta = new Consulta(motivo, medico, paciente);

        if(medico.consultas.size() >= 5) {
            System.out.println("Limite de pacientes atingido!");
            return;
        }

        System.out.println("Consulta marcada para " + paciente.nome + "!");
        System.out.println("------------------------------------------------");
        CONSULTAS.add(consulta);
        paciente.consultas.add(consulta);
        medico.consultas.add(consulta);
    }

    /**
     * Lista todas as consultas médicas marcadas para cada paciente.
     */
    public void listarConsultasPorPaciente() {
        System.out.println("\n========= LISTAR CONSULTAS POR PACIENTE ========");

        for (Paciente paciente: PACIENTES) {
            if (paciente.consultas.isEmpty())
                break;

            System.out.println("\tPaciente " + paciente.nome);
            System.out.println("CPF do paciente: " + paciente.cpf);

            for (Consulta consulta : paciente.consultas) {
                System.out.println("\nID da consulta: " + consulta.id);
                System.out.println("Data e hora da consulta: " + consulta.agoraFormated());
                System.out.println("Motivo: " + consulta.motivo);
                System.out.println("CRM do médico: " + consulta.medico.crm);

                System.out.println("---------------------------\n");
            }
        }
    }

    /**
     * Lista todas as consultas médicas marcadas para cada médico.
     */
    public void listarConsultasPorMedico() {
        System.out.println("\n========= LISTAR CONSULTAS POR MÉDICO ========");

        for (Medico medico : MEDICOS) {
            if (medico.consultas.isEmpty()) {
                continue;
            }

            System.out.println("\tCRM do médico: " + medico.crm);
            System.out.println("\tNome do médico: " + medico.nome + "\n");

            for (Consulta consulta : medico.consultas) {
                System.out.println("ID da consulta: " + consulta.id);
                System.out.println("Data e hora da consulta: " + consulta.agoraFormated());
                System.out.println("Motivo: " + consulta.motivo);
                System.out.println("CPF do paciente: " + consulta.paciente.cpf);
                System.out.println("Nome do paciente: " + consulta.paciente.nome);

                System.out.println("---------------------------\n");
            }
        }
    }

}
