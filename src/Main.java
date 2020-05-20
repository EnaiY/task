import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Institution institution = new Institution("Институт", "г. Город");
        Student student = new Student("");

        institution.addCourse(new Course("Физика"));
        institution.addCourse(new Course("Математика"));
        institution.addCourse(new Course("Информатика"));

        institution.addLecturer(new Lecturer("Математик"));
        institution.addLecturer(new Lecturer("Физик"));
        institution.addLecturer(new Lecturer("Информатик Петренко Вениамин Фёдорович"));

        institution.addStudents(new Student("Иванов Иван Иванович"));
        institution.addStudents(new Student("Петров Петр Петрович"));
        institution.addStudents(new Student("Сидоров Сидор Сидорович"));

        for (int i = 1; i < 3; i++) {
            new LecturerForCourseAssigner(institution.getLecturers(i), institution.getCourses(i)).assign();
            for (int j = 1; j < 3; j++) {
                new StudentForCourseAssigner(institution.getStudents(j), institution.getCourses(i)).assign();
            }
        }


        Student s = institution.getStudents(2);
        System.out.println(s.getName() + " изучает предметы:");
        s.getCourses().forEach(c -> System.out.println(c.getName()));
        System.out.println("\n");

        Student v = institution.getStudents(1);
        System.out.println(v.getName() + " изучает предметы:");
        v.getCourses().forEach(c -> System.out.println(c.getName()));

        System.out.println("\nпредмет " + institution.getCourse("Физика").getName() + " изучают:");
        institution.getCourse("Физика").getStudents().forEach(st -> System.out.println(st.getName()));

        System.out.println("\nпредмет " + institution.getCourse("Физика").getName() + " ведёт:");
        System.out.println(institution.getCourse("Физика").getLecturer().getName());

        System.out.println("\nНовые поступающие студенты:");
        try {
            File file = new File("C:/Users/Галина/IdeaProjects/testis/src/Students.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}