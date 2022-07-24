import java.time.LocalDate;

import domain.Bootcamp;
import domain.Course;
import domain.Dev;
import domain.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        
        var courseJava = new Course();
        courseJava.setTitle("Curso Java");
        courseJava.setDescription("Descrição do curso de Java.");
        courseJava.setWorkload(8);

        var courseJs = new Course();
        courseJs.setTitle("Curso JavaScript");
        courseJs.setDescription("Descrição do curso de JavaScript.");
        courseJs.setWorkload(4);

        var mentorship = new Mentorship();
        mentorship.setTitle("Princípios da Orientação a Objetos com Java");
        mentorship.setDescription("Descrição da mentoria de princípios da Orientação a objecos com Java.");
        mentorship.setDate(LocalDate.now());

        /*
        System.out.println(courseJava);
        System.out.println(courseJs);
        System.out.println(mentorship);
        */

        var bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição do bootcamp Java Developer");
        bootcamp.getContents().add(courseJava);
        bootcamp.getContents().add(courseJs);
        bootcamp.getContents().add(mentorship);

        var devAlexandre = new Dev();
        devAlexandre.setName("Alexandre");
        devAlexandre.subscribe(bootcamp);

        System.out.println("Alexandre");

        System.out.println("Conteúdos Inscritos: " + devAlexandre.getSubscribedContents());
        
        devAlexandre.progress();

        System.out.println("Conteúdos Inscritos: " + devAlexandre.getSubscribedContents());
        System.out.println("Conteúdos Concluídos: " + devAlexandre.getCompletedContents());
        System.out.println("XP: " + devAlexandre.calculateTotalXp());

        System.out.println("");

        var devJoao = new Dev();
        devJoao.setName("João");
        devJoao.subscribe(bootcamp);

        System.out.println("João");

        System.out.println("Conteúdos Inscritos: " + devJoao.getSubscribedContents());

        devJoao.progress();
        devJoao.progress();
        devJoao.progress();

        System.out.println("Conteúdos Inscritos: " + devJoao.getSubscribedContents());
        System.out.println("Conteúdos Concluídos: " + devJoao.getCompletedContents());
        System.out.println("XP: " + devJoao.calculateTotalXp());

    }
}
