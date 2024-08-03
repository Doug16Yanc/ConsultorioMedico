package entidades;

import utilidades.Util;

import java.util.ArrayList;

public class Medico {
    int id;
    String nome;
    String CRM;
    String especialidade;
    String sexo;

    public Medico() {}

    public Medico(int id, String nome, String CRM, String especialidade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.sexo = sexo;
    }


    public ArrayList<Medico> inicializaMedicos() {
        ArrayList<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(123, "Dra .Denise Yanasse", "123456789-87", "Clínica geral", "Feminino"));
        medicos.add(new Medico(987, "Dr. Douglas Calderoni", "987654321-78", "Clínico geral", "Masculino"));
        return medicos;
    }

    public int selecionaMedico(Paciente paciente, Consulta consulta, ArrayList<Medico> medicos) {
        Util util = new Util();
        Medico foundMedico = null;
        int chances = 3;
        util.println("Médicos disponíveis.\n");
        for (Medico medico : medicos) {
            System.out.println("Identificador : " + medico.id);
            System.out.println("Nome : " + medico.nome);
            System.out.println("\n");
        }

        do {
            System.out.println("Selecione o medico (três tentativas pelo identificador) : ");
            int id = util.sc.nextInt();

            for (Medico medico : medicos) {
                if (medico.id == id) {
                    foundMedico = medico;
                    break;
                }
            }

            if (foundMedico != null) {
                util.println("Médico " + foundMedico.nome + " selecionado com sucesso.\n");
                consulta.medico = foundMedico;
                oficializaConsultaComMedico(paciente, consulta, foundMedico);
                break;
            } else {
                util.println("Médico não encontrado.\n");
                chances--;
            }
        } while (chances > 0);
        return id;
    }

    private void oficializaConsultaComMedico(Paciente paciente, Consulta consulta, Medico medico) {
        Util util = new Util();
        util.println("Consulta com sucesso.\n");
        util.println("Identificador do(a) paciente : " + paciente.id + "\n" +
                    "Nome do(a) paciente : " + paciente.nome + "\n" +
                    "Código da consulta : " + consulta.id + "\n" +
                    "Motivo : " + consulta.motivo + "\n" +
                    "Identificador do(a) médico(a) : " + medico.id + "\n" +
                    "Nome do(a) médico(a) : " + medico.nome);

    }
}
