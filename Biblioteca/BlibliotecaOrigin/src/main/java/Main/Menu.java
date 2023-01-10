package Main;

import java.util.Scanner;

public class Menu {

    public static void SelectionMenu() {
        int escolha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite" + "\n"
                + "1 to: Cadastrar" + "\n"
                + "2 to: Atualizar" + "\n"
                + "3 to: Retirar" + "\n"
                + "4 to: Devolver" + "\n"
                + "5 to: Consultar histórico");
        escolha = scan.nextInt();

        if (escolha == 1) {
            Implementos.cadastrar();
        }
        if (escolha == 2) {
            Implementos.atualizar();
        }
        if (escolha == 3) {
            Implementos.retirar();
        }
        if (escolha == 4) {
            Implementos.devolver();
        }
        if (escolha == 5) {
            Implementos.consultar();
        }
    }

}
