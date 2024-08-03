package utilidades;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;

import java.util.ArrayList;

/**
 * Esta classe representa um banco de dados simulado para armazenar e gerenciar dados de pacientes, médicos e consultas.
 * Ela fornece ArrayLists estáticos para armazenar instâncias das respectivas classes.
 */
public class BancoDeDados {
    public static final ArrayList<Paciente> PACIENTES = new ArrayList<>();
    public static final ArrayList<Medico> MEDICOS = new ArrayList<>();
    public static final ArrayList<Consulta> CONSULTAS = new ArrayList<>();
}