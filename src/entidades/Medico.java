package entidades;

import utilidades.Util;

import java.util.ArrayList;

public class Medico {
    public String crm;
    public String nome;
    public String telefone;
    public String email;
    public ArrayList<Consulta> consultas;

    public Medico(String crm, String nome, String telefone, String email, ArrayList<Consulta> consultas) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.consultas = consultas;
    }
}
