package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    
    // Datas finais são fixas (final) e calculadas a partir da inicial (Encapsulamento).
    private final LocalDate dataInicial = LocalDate.now(); 
    private final LocalDate dataFinal = dataInicial.plusDays(45); 

    // Conjuntos para garantir unicidade.
    private Set<Dev> devsInscritos = new HashSet<>(); 
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); 

    // Getters e Setters (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // Implementação obrigatória para que objetos Bootcamp funcionem corretamente em Coleções.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        // Igualdade baseada em atributos essenciais.
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, conteudos);
    }
}
