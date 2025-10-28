Modelagem de Sistema Bootcamp em Java (POO)

Este repositório contém a solução para o desafio de modelagem de domínio, cujo objetivo é aplicar e demonstrar os 4 pilares da Programação Orientada a Objetos (POO) em um contexto prático: a gestão de um Bootcamp e o progresso dos Desenvolvedores (Devs).

Conceitos de POO Aplicados:

Abstração: A classe abstrata Conteudo define o comportamento comum (título, descrição, calcularXp()) de todo material de ensino.

Herança: As classes Curso e Mentoria herdam de Conteudo.

Polimorfismo: O método calcularXp() é sobrescrito em Curso e Mentoria, com regras de cálculo diferentes.

Encapsulamento: Todos os atributos são privados, acessados via Getters e Setters, protegendo a integridade dos dados.

Tecnologias e Pré-Requisitos:

Linguagem Java: JDK 11 ou superior

Ambiente: IDE para desenvolvimento Java (IntelliJ, Eclipse, VS Code)

Controle de Versão: Git

Hospedagem: Conta no GitHub

Estrutura do Domínio:

Conteudo (Classe Abstrata): Base para Cursos e Mentorias.

Curso / Mentoria: Implementações de Conteudo.

Dev: Gerencia seu progresso e calcula o XP total.

Bootcamp: Agrega Conteúdos e Devs.

