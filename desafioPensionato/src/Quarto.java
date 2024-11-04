public class Quarto {

    private String nome;
    private String email;
    int numero;

    public Quarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", room=" + numero +
                '}';
    }
}
