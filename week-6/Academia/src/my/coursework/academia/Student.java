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
}
