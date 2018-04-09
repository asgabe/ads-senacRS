package view;

import java.time.format.DateTimeParseException;
import model.Cliente;
import repositorio.RepositorioClientes;
import util.Console;
import view.menu.ClienteMenu;

public class ClienteUI {

    public void executar() {
        
        int opcao = 0;
        
        do {
            System.out.println(ClienteMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case ClienteMenu.OP_CADASTRAR:
                    cadastrarPaciente();
                    break;
                case ClienteMenu.OP_LISTAR:
                    mostrarPacientes();
                    break;
                case ClienteMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu principal..");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != ClienteMenu.OP_VOLTAR);
    }

    private void cadastrarPaciente() {
        
        String rg = Console.scanString("RG: ");
        
        if (RepositorioClientes.getInstance().clienteExiste(rg)) {
            System.out.println("RG já existente no cadastro");
        } else {
            String nome = Console.scanString("Nome: ");
            String dataString = Console.scanString("Telefone: ");
            try {
                RepositorioClientes.getInstance().add(new Cliente(nome, rg, dataString));
                System.out.println("Cliente " + nome + " cadastrado com sucesso!");

            } catch (DateTimeParseException ex) {
                System.out.println("Formato de Data inválido!");
            }
        }
    }

    public void mostrarPacientes() {
        
        if (RepositorioClientes.getInstance().estaVazio()) {
            System.out.println("-----------------------------");
            System.out.println("Nao ha clientes cadastrados");
            System.out.println("-----------------------------\n");
        } else {
            System.out.println("-----------------------------\n");
            System.out.println(String.format("%-10s", "RG") + "\t"
                    + String.format("%-20s", "|NOME") + "\t"
                    + String.format("%-20s", "|TELEFONE"));

            for (Cliente cliente : RepositorioClientes.getInstance().getClientes()) {
                System.out.println(String.format("%-10s", cliente.getRg()) + "\t"
                        + String.format("%-20s", "|" + cliente.getNome()) + "\t"
                        + String.format("%-20s", "|" + cliente.geTelefone()));
            }
        }

    }
}
