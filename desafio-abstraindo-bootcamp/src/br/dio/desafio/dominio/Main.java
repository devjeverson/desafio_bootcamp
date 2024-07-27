package br.dio.desafio.dominio;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("Descricao curso js");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("Descricao curso java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJeverson = new Dev();
        devJeverson.setNome("Jeverson");
        devJeverson.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jeverson" + devJeverson.getConteudosInscritos());

        devJeverson.progredir();
        devJeverson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Jeverson" + devJeverson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jeverson" + devJeverson.getConteudosConcluidos());
        System.out.println("XP:" + devJeverson.calcularTotalXp());
        System.out.println("Parabens pelo seu progresso no bootcamp!");

        System.out.println("----------");

        Dev devLaurinha = new Dev();
        devLaurinha.setNome("Laurinha");
        devLaurinha.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Laurinha" + devLaurinha.getConteudosInscritos());

        devLaurinha.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Laurinha" + devLaurinha.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jeverson" + devLaurinha.getConteudosConcluidos());
        System.out.println("XP:" + devLaurinha.calcularTotalXp());
        System.out.println("Parabens pelo seu progresso no bootcamp!");


    }

}
