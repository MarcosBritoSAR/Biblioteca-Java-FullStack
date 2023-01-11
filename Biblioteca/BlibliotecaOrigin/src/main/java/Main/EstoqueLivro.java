package Main;

import java.util.ArrayList;

public class EstoqueLivro {

    static ArrayList<Livro> estoque = new ArrayList();

    public static void Adicionar(Livro outro) {

        estoque.add(outro);

    }

    public static String mostrar(String nome) {
        int i = procurar(nome);
        
        if(i == -1){
            return "Titulo não encontrado";
        }

        return "Titulo: " + estoque.get(i).getTitulo() + "\n"
                + "autor: " + estoque.get(i).getAutor() + "\n"
                + "genero: " + estoque.get(i).getGenero() + "\n"
                + "lingua: " + estoque.get(i).getLingua() + "\n"
                + "edicao: " + estoque.get(i).getEdicao() + "\n"
                + "editora: " + estoque.get(i).getEditora() + "\n"
                + "valor: " + estoque.get(i).getValor() + "\n"
                + "quantidade: " + estoque.get(i).getQuantidade() + "\n";

    }

    public static void atualizar(Livro outro, String nome) {

    }

    public static int procurar(String nome) {

        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getTitulo().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1; //Se o método retornar -1 significa o meu array list não possui o titulo procurado
    }
}
