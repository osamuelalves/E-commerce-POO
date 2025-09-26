public class ClientePJ extends Cliente{
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(String nome, String email, String id, String telefone, String cNPJ, String razaoSocial, String inscricaoEstadual) {
        super(nome, email, id, telefone);
        this.cnpj = cNPJ;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getIdentificadorUnico() {
        return this.cnpj;
    }
    
}
