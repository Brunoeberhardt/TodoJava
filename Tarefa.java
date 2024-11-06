import java.time.LocalDate;

public class Tarefa {
    private String nome;
    private String nota;
    private String status;
    private LocalDate dataCriacao;

    // Construtor
    public Tarefa(String nome, String nota, String status) {
        this.nome = nome;
        this.nota = nota;
        this.status = status;
        this.dataCriacao = LocalDate.now();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nome + "\n" +
                "Status: " + status + "\n" +
                "Nota: " + nota + "\n" +
                "Data de Criação: " + dataCriacao;
    }
}
