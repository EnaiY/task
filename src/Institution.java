import java.util.ArrayList;

public class Institution  {

    private String name;
    private String address;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Lecturer> lecturers = new ArrayList<>();

    public Institution(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addCourse(Course name) {
        courses.add(name);
    }

    public void addStudents(Student name) {
        students.add(name);
    }

    public void addLecturer(Lecturer name) {
        lecturers.add(name);
    }

    public Course getCourse(String name) {
        return courses.stream().filter(c -> c.getName() == name).findFirst().get();
    }

    public Course getCourses(int id) {
        return courses.stream().filter(c -> c.getId() == id).findFirst().get();
    }

    public ArrayList<Course> getAllCourses() {
        return courses;
    }

    public Student getStudents(int id) {
        return students.get(id);
        //students.stream().filter(c -> c.getId() == id).findFirst().get();
    }

    public ArrayList<Student> getAllStudents() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(students.get(i));
        }
        return null;
    }

    public Lecturer getLecturers(int id) {
        return lecturers.get(id);//lecturers.stream().filter(c -> c.getId() == id).findFirst().get();
    }

    public ArrayList<Lecturer> getAllLecturers() {
        return lecturers;
    }

}
