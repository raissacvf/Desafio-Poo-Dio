import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        // 1. Criação dos Conteúdos (Objetos de Curso e Mentoria)
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Aprenda a sintaxe e conceitos fundamentais de Java.");
        curso1.setCargaHoraria(8); // Carga Horária de 8 horas

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO Avançado");
        curso2.setDescricao("Aprenda Abstração, Encapsulamento, Herança e Polimorfismo.");
        curso2.setCargaHoraria(4); // Carga Horária de 4 horas

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java na Prática");
        mentoria.setDescricao("Sessão ao vivo de dúvidas e projeto prático.");
        mentoria.setData(LocalDate.now().plusDays(7)); // Mentoria na próxima semana

        System.out.println("--- Conteúdos Criados ---");
        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println("-------------------------");
        
        // 2. Criação do Bootcamp (Objeto Bootcamp)
        
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Foco em Spring Boot e Microsserviços.");
        
        // Adiciona os conteúdos ao Bootcamp
        bootcampJava.setConteudos(new LinkedHashSet<>(Arrays.asList(curso1, curso2, mentoria)));

        System.out.println("\n--- Bootcamp Criado ---");
        System.out.println("Nome: " + bootcampJava.getNome());
        System.out.println("Início: " + bootcampJava.getDataInicial());
        System.out.println("Conteúdos: " + bootcampJava.getConteudos().size());
        System.out.println("-------------------------");
        

        // 3. Criação e Interação com a Dev (Objeto Dev)
        
        Dev devRaissa = new Dev();
        devRaissa.setNome("Raissa");
        
        System.out.println("\n--- Interações de " + devRaissa.getNome() + " ---");
        
        // INSCRIÇÃO: Raissa se inscreve no Bootcamp
        devRaissa.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos: " + devRaissa.getConteudosInscritos());
        System.out.println("XP Inicial: " + devRaissa.calcularTotalXp());
        
        // PROGRESSO: Raissa conclui o primeiro conteúdo (Curso Java Básico)
        devRaissa.progredir();
        
        // PROGRESSO: Raissa conclui o segundo conteúdo (Curso POO Avançado)
        devRaissa.progredir();
        
        System.out.println("\n--- Pós-Progressão ---");
        System.out.println("Conteúdos inscritos (Restantes): " + devRaissa.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devRaissa.getConteudosConcluidos());
        
        // CÁLCULO FINAL DE XP
        double xpFinal = devRaissa.calcularTotalXp();
        System.out.println("\nXP Total (Final): " + xpFinal); // Deve ser a soma dos XPs dos 2 Cursos concluídos
        
        // Testando a lógica de XP:
        // XP Curso 1 (8h): 10 * 8 = 80
        // XP Curso 2 (4h): 10 * 4 = 40
        // Total esperado: 120.0
        
        // 4. Testando outro Dev (Opcional, para demonstrar o isolamento de objetos)
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJava);
        devJoao.progredir(); // Conclui apenas 1 item

        System.out.println("\n--- Interações de João ---");
        System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total de João: " + devJoao.calcularTotalXp());
        // XP esperado (Curso 1 de 8h): 80.0
    }
}
