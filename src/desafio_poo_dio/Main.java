package desafio_poo_dio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso java 2");
		curso2.setDescricao("Descricao curso java 2");
		curso2.setCargaHoraria(9);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);	*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descrição Bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Dev dev1 = new Dev();
		dev1.setNome("Gabriel");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println(" ------------- // ------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Nelson");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
