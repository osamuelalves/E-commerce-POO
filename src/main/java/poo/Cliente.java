package poo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


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
    public static Cliente CadastramentoCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de acordo com o tipo de cliente:\n1 - Pessoa Física\n2 - Pessoa Jurídica\n");
        int tipo = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente
        if(tipo == 1) {
            System.out.println("Digite o nome do cliente:");
            String nome = sc.nextLine();
            System.out.println(nome);

            System.out.println("Digite o email do cliente:");
            String email = sc.nextLine();
            System.out.println(email);

            System.out.println("Digite o ID do cliente:");
            String id = sc.nextLine();
            System.out.println(id);

            System.out.println("Digite o telefone do cliente:");
            String telefone = sc.nextLine();
            System.out.println(telefone);

            System.out.println("Digite o CPF do cliente:");
            String cpf = sc.nextLine();
            System.out.println(cpf);

            System.out.println("Digite a data de nascimento do cliente (DD-MM-AAAA):");
            String dataNasc = sc.next();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dataNascimento = LocalDate.parse(dataNasc, formatter);

            System.out.println(dataNascimento);

            return new ClientePF(nome, email, id, telefone, cpf, dataNascimento);
        } else if(tipo == 2) {
            System.out.println("Digite o nome do cliente:");
            String nome = sc.nextLine();

            System.out.println("Digite o email do cliente:");
            String email = sc.nextLine();

            System.out.println("Digite o ID do cliente:");
            String id = sc.nextLine();

            System.out.println("Digite o telefone do cliente:");
            String telefone = sc.nextLine();

            System.out.println("Digite o CNPJ do cliente:");
            String cnpj = sc.nextLine();

            System.out.println("Digite a razão social do cliente:");
            String razaoSocial = sc.nextLine();

            System.out.println("Digite a inscrição estadual do cliente:");
            String inscricaoEstadual = sc.nextLine();
            
            return new ClientePJ(nome, email, id, telefone, cnpj, razaoSocial, inscricaoEstadual);
        } else {
            System.out.println("Opção inválida!");
            CadastramentoCliente();
        }
        return null;
    }
}
