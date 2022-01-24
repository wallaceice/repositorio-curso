import Dio.Cursos;
import Dio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso = new Cursos();
        Cursos curso2 = new Cursos();
        Mentoria mentoria = new Mentoria();

        curso.setTitulos("Java");
        curso.setDescricao("Desenvolver Bootcamp");
        curso.setCargaHoraria(56);

        curso2.setTitulos("POO");
        curso2.setDescricao("Elaborar programa utilizando paradigma POO");
        curso2.setCargaHoraria(56);

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Instrucoes sobre o curso");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
