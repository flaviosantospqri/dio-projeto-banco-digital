import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private List<Conta> contas;
    

    public String getNome() {
        return nome;
    }
    
    
    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Conta> getContas() {
        return contas;
    }


    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
