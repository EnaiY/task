import java.util.ArrayList;

public class Course {

    private static int count = 0;
    private int id;
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private Lecturer lecturer;

    public Course(String name) {
        this.id = ++count;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Lecturer getLecturer() {
        return this.lecturer;
    }

    public void addLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
