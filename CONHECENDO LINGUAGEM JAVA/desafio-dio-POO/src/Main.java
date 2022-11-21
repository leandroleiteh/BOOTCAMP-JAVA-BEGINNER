import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp(); 
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição  Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLeandro = new Dev();
		devLeandro.setNome("Leandro");
		devLeandro.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Leandro" + devLeandro.getConteudoInscritos());
		
		devLeandro.progredir();
		devLeandro.progredir();
		
		System.out.println("Conteudos Inscritos Leandro" + devLeandro.getConteudoInscritos());
		System.out.println("Conteudos Concluídos Leandro" + devLeandro.getConteudoConcluidos());
		System.out.println("XP..." + devLeandro.calcularTotalXp());
		
		Dev devLarissa = new Dev();
		devLarissa.setNome("Larissa");
		devLarissa.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Larissa" + devLarissa.getConteudoInscritos());
		
		devLarissa.progredir();
		devLarissa.progredir();
		devLarissa.progredir();
		
		System.out.println("Conteudos Inscritos Larissa" + devLarissa.getConteudoInscritos());
		System.out.println("Conteudos concluídos Larissa" + devLarissa.getConteudoConcluidos());
		System.out.println("XP..." + devLarissa.calcularTotalXp());
		
	}
	
	

}
