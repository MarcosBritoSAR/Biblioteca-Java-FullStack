package Main;

import java.util.ArrayList;

public class EstoqueLivro {

    static ArrayList<Livro> estoque = new ArrayList();

    public static void Adicionar(Livro outro) {

        estoque.add(outro);

    }

    public static String mostrar(String nome) {

        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getTitulo().equalsIgnoreCase(nome)) {

                return "Titulo: " + estoque.get(i).getTitulo() + "\n"
                        + "autor: " + estoque.get(i).getAutor() + "\n"
                        + "genero: " + estoque.get(i).getGenero() + "\n"
                        + "lingua: " + estoque.get(i).getLingua() + "\n"
                        + "edicao: " + estoque.get(i).getEdicao() + "\n"
                        + "editora: " + estoque.get(i).getEditora() + "\n"
                        + "valor: " + estoque.get(i).getValor() + "\n"
                        + "quantidade: " + estoque.get(i).getQuantidade() + "\n";
            }
            System.out.println("busca "+(i+1)+" Completa");
        }
        return "Titulo nao encontrado";
    }
}
