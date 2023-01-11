package Main;

import java.util.Scanner;

public class Cliente {
	private static String nome;
	private static int idade;
	private static Main.Endereco Endereco;
	private static double custoPagar;

	public static void cadastroCompleto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome:");
		Cliente.nome = scan.nextLine();
		

		//falta completar esse cadastro
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Cliente.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		Cliente.idade = idade;
	}

	public Main.Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Main.Endereco endereco) {
		Endereco = endereco;
	}

	public double getCustoPagar() {
		return custoPagar;
	}

	public void setCustoPagar(double custoPagar) {
		Cliente.custoPagar = custoPagar;
	}
}
