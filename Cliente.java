public abstract class Cliente {
    protected String nome;
    protected String email;
    protected String id;
    protected String telefone;
    
    public Cliente(String nome, String email, String id, String telefone) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
