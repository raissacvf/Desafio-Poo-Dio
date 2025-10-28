package dominio;

// Curso herda de Conteudo (Herança).
public class Curso extends Conteudo {

    private int cargaHoraria;

    // Polimorfismo: Implementação específica do XP para Cursos.
    @Override
    public double calcularXp() {
        // XP é base * carga horária.
        return XP_PADRAO * cargaHoraria;
    }

    // Getters e Setters específicos.
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
