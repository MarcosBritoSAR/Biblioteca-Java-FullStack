package Main;

import java.util.Scanner;

public class Implementos extends Livro {

	public Implementos(String titulo, String autor, String genero, String lingua, String edicao, String editora,
			double valor, int quant) {
		super(titulo, autor, genero, lingua, edicao, editora, valor, quant);
	}

	static Scanner scan = new Scanner(System.in);

	// ----------------Cadastrando--------------------------------
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

	// ----------------Atualizando--------------------------------
	public static void atualizar() {

		System.out.println("Digite o título que você está procurando:");

		String nome = scan.nextLine();

		int indice = EstoqueLivro.procurar(nome);

		if (indice == -1) {
			System.out.println("Titulo não encontrado, Tente novamente");

		} else {

			System.out.println("New título: ");
			EstoqueLivro.estoque.get(indice).setTitulo(scan.nextLine());

			System.out.println("New nome do Autor: ");
			EstoqueLivro.estoque.get(indice).setAutor(scan.nextLine());

			System.out.println("New edicao: ");
			EstoqueLivro.estoque.get(indice).setEdicao(scan.nextLine());

			System.out.println("New genero: ");
			EstoqueLivro.estoque.get(indice).setGenero(scan.nextLine());

			System.out.println("New lingua: ");
			EstoqueLivro.estoque.get(indice).setLingua(scan.nextLine());

			System.out.println("New editora: ");
			EstoqueLivro.estoque.get(indice).setEditora(scan.nextLine());

			System.out.println("New valor: ");
			EstoqueLivro.estoque.get(indice).setValor(scan.nextDouble());

			System.out.println("New quantidade de livros que deseja inserir: ");
			EstoqueLivro.estoque.get(indice).setQuantidade(scan.nextInt());

		}
	}

	// ----------------Retirando--------------------------------
	public static void retirar() {
		System.out.println("Digite o título que deseja levar");
		String nome = scan.nextLine();
		int indice = EstoqueLivro.procurar(nome);
		
		if(indice == -1) {
			System.out.println("Livro não encontrado no sistema");
		}else {
			System.out.println("Ok, livro encontrado, me informe os dados de quem irá receber o livro");
		}

	}

	public static void devolver() {

	}

	public static void consultar() {

		System.out.println("Digite o nome do livro que você está propocurando");
		String nome = (String) scan.nextLine();
		System.out.println(EstoqueLivro.mostrar(nome));

	}

}
