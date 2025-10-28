package dominio;

// Classe abstrata para ser a base de Cursos e Mentorias.
// Aplica o princípio da Abstração.
public abstract class Conteudo {

    // Constante estática para o valor base de XP.
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // Método abstrato: força as subclasses a definirem sua própria regra de cálculo de XP
    public abstract double calcularXp();

    // Getters e Setters (Encapsulamento)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
