package DbDviagem.Crud;

public class Cliente {
    private int idCliente;
    private int CPF;
    private String nome;
    private String email;
    

    public Cliente(int idCliente, int cPF, String nome, String email) {
        this.idCliente = idCliente;
        this.CPF = cPF;
        this.nome = nome;
        this.email = email;
    }

    public Cliente(){
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
}
