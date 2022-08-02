package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria1 = new Mentoria();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso voltado para OO");
		curso1.setCargaHoraria(50);
		
		curso2.setTitulo("Algoritmo");
		curso2.setDescricao("Curso iniciante para Algoritmo");
		curso2.setCargaHoraria(10);
		
		mentoria1.setData(LocalDate.now());
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descrição da mentoria java");
		
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
	
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		Dev devVinicio = new Dev();
		devVinicio.setNome("Vinicio");
		devVinicio.inscreverBootcamp(bootcamp1);
		
		System.out.println("Conteudos Inscritos Vinicio" + devVinicio.getConteudosInscritos());
		
		devVinicio.progredir();
		devVinicio.progredir();
		devVinicio.progredir();
		System.out.println("Conteudos ainda Inscritos Vinicio" + devVinicio.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Vinicio" + devVinicio.getConteudosConcluidos());
		System.out.println("XP: "+ devVinicio.calcularTotalXp());
		
		System.out.println("----------------------------");
		
		Dev devFulano = new Dev();
		devFulano.setNome("Fulano");
		devFulano.inscreverBootcamp(bootcamp1);
		System.out.println("Conteudos Inscritos Fulano" + devFulano.getConteudosInscritos());

		devFulano.progredir();
		System.out.println("Conteudos ainda Inscritos Fulano" + devFulano.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Fulano" + devFulano.getConteudosConcluidos());
		System.out.println("XP: "+ devFulano.calcularTotalXp());



		
		


		
	}

}
