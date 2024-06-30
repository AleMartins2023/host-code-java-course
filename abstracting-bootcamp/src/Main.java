import java.time.LocalDate;
import java.util.Scanner;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;

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
        
        //podemos criar um curso a partir da classe abstrata
            //polimorfismo
                //Conteudo conteudo = new Curso();
                //outros exemplos de polimorfismo: list<String> palavras = new ArrayList<>();
        
        //instanciando o bootcamp e dev

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao do bootcamp de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Fulano");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos do dev1: " + dev1.getConteudoInscritos());
        System.out.println("Conteudos concluidos do dev1: " + dev1.getConteudoConcluidos());
        System.out.println("XP " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Siclano");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos do dev2 " + dev2.getConteudoInscritos());
        System.out.println("Conteudos concluidos do dev2 " + dev2.getConteudoConcluidos());
        

    }
}
