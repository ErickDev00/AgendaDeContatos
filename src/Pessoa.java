public class Pessoa {

    private String nome;
    private double numero;
    private String email;


    Pessoa(String nome, double numero){
        this.nome = nome;
        this.numero = numero;
    }

    Pessoa(String nome, double numero, String email){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
