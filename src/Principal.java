import entidades.Medico;
import entidades.Paciente;
import services.MarcarConsulta;
import services.Service;

import java.util.ArrayList;

import static utilidades.BancoDeDados.MEDICOS;
import static utilidades.BancoDeDados.PACIENTES;

/**
 * Classe principal do sistema de marcação de consultas.
 * Contém o método main que executa o programa.
 */
public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        MarcarConsulta consultas = new MarcarConsulta();

        principal.inicializaPacientes();
        principal.inicializaMedicos();

        consultas.marcarConsulta("Motivo 1", PACIENTES.getFirst(), MEDICOS.getFirst());
        consultas.marcarConsulta("Motivo 2", PACIENTES.get(1), MEDICOS.getFirst());
        consultas.marcarConsulta("Motivo 3", PACIENTES.get(2), MEDICOS.getFirst());
        consultas.marcarConsulta("Motivo 4", PACIENTES.get(2), MEDICOS.get(1));
        consultas.marcarConsulta("Motivo 4", PACIENTES.get(2), MEDICOS.get(2));

        Service service = new Service();
        service.listarConsultas();
    }

    /**
     * Inicializa a lista de pacientes com dados de amostra.
     * Este método popula a lista estática {@link utilidades.BancoDeDados#PACIENTES} que simula um banco de dados, com instâncias da classe {@link entidades.Paciente}.
     * Cada paciente é criado com atributos específicos como ID, nome, CPF, email, telefone e uma lista vazia de consultas.
     */
    private void inicializaPacientes() {
        PACIENTES.add(new Paciente(1, "Elena Toledo", "456.896.123-89", "elenatoledo@gmail.com", "(51) 5453-4562", new ArrayList<>()));
        PACIENTES.add(new Paciente(2, "Oscar Bastos", "123.875.133-86", "oscarbastos@gmail.com", "(49) 4933-6759", new ArrayList<>()));
        PACIENTES.add(new Paciente(3, "Edite Castro", "545.453.321-90", "editecastro@gmail.com", "(50) 5098-6242", new ArrayList<>()));
        PACIENTES.add(new Paciente(4, "Lucas Almeida", "321.654.987-01", "lucasalmeida@gmail.com", "(47) 4723-5562", new ArrayList<>()));
        PACIENTES.add(new Paciente(5, "Beatriz Fernandes", "987.654.321-00", "beatrizfernandes@gmail.com", "(43) 4312-2345", new ArrayList<>()));
        PACIENTES.add(new Paciente(6, "Mateus Santos", "111.222.333-44", "mateussantos@gmail.com", "(42) 4212-2233", new ArrayList<>()));
        PACIENTES.add(new Paciente(7, "Clara Mota", "555.666.777-88", "claramota@gmail.com", "(41) 4111-1122", new ArrayList<>()));
        PACIENTES.add(new Paciente(8, "Rafael Lima", "999.888.777-66", "rafaellima@gmail.com", "(46) 4633-3322", new ArrayList<>()));
        PACIENTES.add(new Paciente(9, "Sofia Pereira", "444.333.222-11", "sofiapereira@gmail.com", "(45) 4522-2234", new ArrayList<>()));
    }

    /**
     * Inicializa a lista de médicos com dados de amostra.
     * Este método popula a lista estática {@link utilidades.BancoDeDados#MEDICOS} que simula um banco de dados, com instâncias da classe {@link entidades.Medico}.
     * Cada médico é criado com atributos específicos como CRM, nome, telefone e email.
     */
    private void inicializaMedicos() {
        MEDICOS.add(new Medico("123456", "Dr. João Silva", "(11) 98765-4321", "joao.silva@hospital.com", new ArrayList<>()));
        MEDICOS.add(new Medico("789012", "Dra. Maria Oliveira", "(21) 99876-5432", "maria.oliveira@clinicamedica.com", new ArrayList<>()));
        MEDICOS.add(new Medico("345678", "Dr. Carlos Pereira", "(31) 91234-5678", "carlos.pereira@saude.com", new ArrayList<>()));
        MEDICOS.add(new Medico("567890", "Dr. Pedro Costa", "(51) 93456-7890", "pedro.costa@hospitalbrasil.com", new ArrayList<>()));
    }
}