import java.time.LocalDate;

public class ClientePF extends Cliente {
    private String cpf;
    private LocalDate dataNascimento;

    public ClientePF(String nome, String email, String id, String telefone, String cPF, LocalDate dataNascimento) {
        super(nome, email, id, telefone);
        this.cpf = cPF;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdentificadorUnico() {
        return this.cpf;
    }
    
}