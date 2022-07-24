import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import domain.Course;
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

        System.out.println(courseJava);
        System.out.println(courseJs);
        System.out.println(mentorship);

    }
}
