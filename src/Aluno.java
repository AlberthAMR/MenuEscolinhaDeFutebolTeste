public class Aluno {
    private String nome;
    private String dataNascimento;
    private String posicao;
    private String telefone;
    private String cpf;
    private String email;

    public Aluno(String nome, String dataNascimento, String posicao, String telefone, String cpf, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.posicao = posicao;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}