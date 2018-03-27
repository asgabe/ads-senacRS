
import util.Console;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import util.DateTimeUtil;

/**
 *
 * @author gabriel
 */
public class ConsultorioMedico {

    private static ArrayList<Paciente> listaPacientes;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaPacientes = new ArrayList<>();

        int opcao = 0;
        do {

            try {
                System.out.println("\nMenu: ");
                System.out.println("1- Adicionar Paciente");
                System.out.println("2- Listar Pacientes");
                System.out.println("0- Sair");
                opcao = Console.scanInt("Digite a opcao: ");

                switch (opcao) {
                    case 1:
                        adicionarPaciente();
                        break;
                    case 2:
                        listarPacientes();
                        break;
                    case 0:
                        System.out.println("Saindo do Sistema...");
                        break;
                    default:
                        System.err.println("Erro: Escolha a opcao correta!!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro: Escolha a opcao correta!");
            }
        } while (opcao != 0);
    }

    private static void adicionarPaciente() {
        System.out.println("\nAdicionando Paciente...");
        try{
            String rg = Console.scanString("RG: ");
            String nome = Console.scanString("Nome: ");
        
            String dataString = Console.scanString("Data Nascimento:");        
            LocalDate dataNascimento = DateTimeUtil.stringToDate(dataString);
        
            Paciente paciente = new Paciente(rg, nome, dataNascimento);
            listaPacientes.add(paciente);
            System.out.println("Cadastro realizado com sucesso!");
        } catch(Exception e){
            System.out.println("Data de Nascimento invalida!");
        }
    }

    private static void listarPacientes() {
        System.out.println("\nListando Pacientes...");
        if (listaPacientes.isEmpty()) {
            System.out.println("Nao ha pacientes cadastrados!");
        } else {
 if(listaPacientes.isEmpty()){
            System.out.println("Nenhum paciente cadastrado!");
        }
        else{
            System.out.print(String.format("%-10s","|RG"));
            System.out.print(String.format("%-20s","|NOME"));
            System.out.println(String.format("%-10s","|DATA NASCIMENTO"));
            for(Paciente p: listaPacientes){
                System.out.print(String.format("%-10s",p.getRg()));
                System.out.print(String.format("%-20s",p.getNome()));
                String dataUtil = DateTimeUtil.dateToString(p.getDataNascimento());
                System.out.println(String.format("%-10s",dataUtil));

            }
        }        }
    }

}
