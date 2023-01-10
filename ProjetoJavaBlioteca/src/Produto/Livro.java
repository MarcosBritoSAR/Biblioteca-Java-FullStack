
package Produto;


public class Livro{
    
    private String nomeDoLivro;
    private String autor;
    private String edicao;
    private String editora;
    private double preco;
    private String descricao;
    private int id;
    
    public Livro(String nomeDoLivro, int id, String autor,String descricao, String edicao, String editora, double preco){
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.nomeDoLivro = nomeDoLivro;
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
    }
    
    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

     public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
