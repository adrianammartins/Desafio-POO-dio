import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao js");
        curso1.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAdriana = new Dev();
        devAdriana.setNome("Adriana");
        devAdriana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Adriana" + devAdriana.getConteudosInscritos());
        devAdriana.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos Inscritos Adriana" + devAdriana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Adriana" + devAdriana.getConteudosConcluidos());
        System.out.println("XP:" + devAdriana.calcularTotalXp());

        Dev devMatheus = new Dev();
        devMatheus.setNome("matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();

        System.out.println("---------");
        System.out.println("Conteúdos Inscritos Matheus" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Matheus" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());


    }
}