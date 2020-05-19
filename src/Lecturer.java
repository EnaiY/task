import java.util.ArrayList;

public class Lecturer {


    private static int count = 0;
    private int id;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Lecturer(String name) {
        this.id = ++count;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public int getId() {
        return this.id;
    }

    public void addCourse(Course lecturer) {
        courses.add(lecturer);
    }

}
