package entidades;

import utilidades.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class Consulta {
    UUID id;
    String motivo;
    LocalDateTime agora = LocalDateTime.now();
    Medico medico;

    public Consulta() {

    }
    public Consulta(UUID id, LocalDateTime agora, Medico medico) {
        this.id = id;
        this.agora = agora;
        this.medico = medico;
    }

    public Boolean marcaConsulta(ArrayList<Consulta> consultas) {
        Util util = new Util();
        UUID id = UUID.randomUUID();

        System.out.println("Cite o motivo da consulta:");
        String motivo = util.sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        agora.format(formatter);



        return true;
    }
}
