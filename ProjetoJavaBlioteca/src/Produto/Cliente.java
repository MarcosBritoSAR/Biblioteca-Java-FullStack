
package Produto;

public class Cliente {
    
    private String nomeCliente;
    private String cpf;
    private long  data;
    private String endereco;
    private String telefone;
    private int idade;
    private double taxa;
    
    public Cliente(String nomeCliente, String cpf, int idade, String endereco, String telefone){
        this.cpf = cpf;
        this.data = data;
        this.endereco = endereco;
        this.idade = idade;
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
    }

    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
    
}
