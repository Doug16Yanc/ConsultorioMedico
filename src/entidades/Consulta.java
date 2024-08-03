package entidades;

import utilidades.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;


public class Consulta {
    UUID id;
    String motivo;
    String agora;
    Paciente paciente;
    Medico medico;

    public Consulta() {

    }
    public Consulta(UUID id, String motivo, String agora, Paciente paciente, Medico medico) {
        this.id = id;
        this.motivo = motivo;
        this.agora = agora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public void listarConsultasPorPaciente(ArrayList<Consulta> consultas) {
        if (!consultas.isEmpty()){
        for (Consulta consulta : consultas) {
                mostraConsultaPaciente(consulta);
            }
        }else {
            System.out.println("Nenhuma consulta marcada ainda.\n");
        }
    }

    private void mostraConsultaPaciente(Consulta consulta) {
        Util util = new Util();
        util.println("Identificador do(a) paciente : " + consulta.paciente.id + "\n" +
                "Nome do(a) paciente : " + consulta.paciente.nome + "\n" +
                "CPF : " + consulta.paciente.cpf + "\n" +
                "Email : " + consulta.paciente.email + "\n" +
                "Telefone : " + consulta.paciente.telefone + "\n" +
                "Identificador da consulta : " + consulta.id + "\n" +
                "Motivo da consulta : " + consulta.motivo + "\n" +
                "Data e hora da consulta : " + consulta.agora);

    }

    public void listarConsultasPorMedico(ArrayList<Consulta> consultas) {
        if (!consultas.isEmpty()) {
            for (Consulta consulta : consultas) {
                mostraConsultaMedico(consulta);
            }
        } else {
            System.out.println("Nenhuma consulta marcada ainda.\n");
        }
    }

    private void mostraConsultaMedico(Consulta consulta) {
        Util util = new Util();
        util.println("Identificador do(a) médico : " + consulta.medico.id + "\n" +
                "Nome do(a) médico(a) : " + consulta.medico.nome + util.devolveIconeMedico(consulta.medico.sexo) + "\n" +
                "CRM : " + consulta.medico.CRM + "\n" +
                "Especialidade : " + consulta.medico.especialidade + "\n" +
                "Identificador da consulta : " + consulta.id + "\n" +
                "Motivo da consulta : " + consulta.motivo + "\n" +
                "Data e hora da consulta : " + consulta.agora);
    }

    public Boolean marcaConsulta(Paciente paciente, ArrayList<Consulta> consultas, ArrayList<Medico> medicos) {
        Medico medico = new Medico();
        Util util = new Util();
        UUID id = UUID.randomUUID();

        System.out.println("Cite o motivo da consulta:");
        String motivo = util.sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String agora = LocalDateTime.now().format(formatter);

        util.println("Consulta " + id + " em solicitação...\n");

        Consulta consulta = new Consulta(id, motivo, agora, paciente, null);

        consultas.add(consulta);
        medico.selecionaMedico(paciente, consulta, medicos);

        return true;
    }
}

