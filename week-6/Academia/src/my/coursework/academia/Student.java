package my.coursework.academia;

public class Student extends Person {
    int numCourses, grades[];
    String[] courses;

    // Konstruktor ke-1 dengan 2 parameter
    public Student(String name, String address) {
        super(name, address);
    }

    // Konstruktor ke-2 dengan 1 parameter
    public Student(String name) {
        this(name, "");
    }

    public String toString() {
        return "Nama    : " + super.getName() + "\nAlamat  : " + super.getAddress();
    }

    public void addCourseGrade(String course, int grade) {}

    public double getAverageGrade() {
        return 0.0;
    }
}
