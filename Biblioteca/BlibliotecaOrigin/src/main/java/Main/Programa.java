package Main;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("Deseja abrir o menu? S/N");
            String res = scan.next();
            
            if (res.equalsIgnoreCase("s")) {
                Menu.SelectionMenu();
            } else {
                break;
            }
        }
    }
}
