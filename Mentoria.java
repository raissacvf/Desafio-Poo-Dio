package dominio;

import java.time.LocalDate;

// Mentoria herda de Conteudo (Herança).
public class Mentoria extends Conteudo {

    private LocalDate data;

    // Polimorfismo: Implementação específica do XP para Mentorias.
    @Override
    public double calcularXp() {
        // XP de mentoria é um valor fixo um pouco maior.
        return XP_PADRAO + 20d;
    }

    // Getters e Setters específicos.
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", data=" + data +
                '}';
    }
}
