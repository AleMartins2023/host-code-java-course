import java.time.LocalDate;
import java.util.Scanner;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;


public class Main {
    public static void main(String[] args) {
        
        //exemplo com entrada do usuário
            //atributos para o curso

        /*Curso curso = new Curso();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o título do curso: ");
        String titulo = scanner.nextLine();
        curso.setTitulo(titulo);

        System.out.print("Escreva a descricao do curso: ");
        String descricao = scanner.nextLine();
        curso.setDescricao(descricao);

        System.out.print("Escreva a carga horaria do curso: ");
        int cargaHoraria = scanner.nextInt();
        curso.setCargaHoraria(cargaHoraria);

        System.out.println(curso);
        */


        //entrada pelo programador

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Introducao");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Introducao");
        curso2.setCargaHoraria(5);

        System.out.println(curso2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Dicas para realizacao do desafio");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        


    }
}
