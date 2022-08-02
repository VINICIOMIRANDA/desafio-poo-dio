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
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
	
		
	}

}
