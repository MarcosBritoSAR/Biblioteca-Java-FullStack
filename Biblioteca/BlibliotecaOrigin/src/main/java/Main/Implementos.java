package Main;

import java.util.Scanner;

public class Implementos extends Livro {

    public Implementos(String titulo, String autor, String genero, String lingua, String edicao, String editora, double valor, int quant) {
        super(titulo, autor, genero, lingua, edicao, editora, valor, quant);
    }
    static Scanner scan = new Scanner(System.in);

    public static void cadastrar() {

        System.out.println("Escreva o título: ");
        String titulo = scan.nextLine();
        System.out.println("digite o nome do Autor: ");
        String autor = scan.nextLine();
        System.out.println("Digite a edicao: ");
        String edicao = scan.nextLine();
        System.out.println("Digite o genero: ");
        String genero = scan.nextLine();
        System.out.println("Digite a lingua: ");
        String lingua = scan.nextLine();
        System.out.println("Digite a editora: ");
        String editora = scan.nextLine();
        System.out.println("Digite o valor: ");
        double valor = scan.nextDouble();
        System.out.println("Digite a quantidade de livros que deseja inserir: ");
        int quant = scan.nextInt();

        EstoqueLivro.Adicionar(new Livro(titulo, autor, genero, lingua, edicao, editora, valor, quant));
    }

    public static void atualizar() {

    }

    public static void retirar() {

    }

    public static void devolver() {

    }

    public static void consultar() {
        
        System.out.println("Digite o nome do livro que você está propocurando");
        String nome = (String) scan.nextLine();
        System.out.println(EstoqueLivro.mostrar(nome));
     

    }

}
