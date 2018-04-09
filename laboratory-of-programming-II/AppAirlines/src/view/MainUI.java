package view;

import util.Console;
import view.menu.MainMenu;

public class MainUI {

    public void executar() {
        
        int opcao = 0;
        
        do {
            System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case MainMenu.OP_CLIENTES:
                    new ClienteUI().executar();
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != MainMenu.OP_SAIR);
    }
}
