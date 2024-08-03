package entidades;

import utilidades.Util;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class Consulta {
    public UUID id = UUID.randomUUID();
    public String motivo;
    public LocalDateTime agora = LocalDateTime.now();
    public Medico medico;
    public Paciente paciente;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public Consulta(String motivo, Medico medico, Paciente paciente) {
        this.motivo = motivo;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String agoraFormated() {
        return agora.format(formatter);
    }
}
