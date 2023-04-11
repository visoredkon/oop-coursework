package my.coursework.academia;

import java.util.Arrays;

public class Teacher extends Person {
    // Deklarasi variabel instance
    private int numCourses = 0;
    private String[] courses = {};

    // Konstruktor
    public Teacher(String name, String address) {
        super(name, address);
    }

    // Method untuk menambahkan course
    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
        }

        courses = Arrays.copyOf(courses, courses.length + 1);
        courses[numCourses] = course;
        numCourses++;

        return true;
    }

    // Method untuk menghapus course
    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }

                courses = Arrays.copyOf(courses, courses.length - 1);
                numCourses--;

                return true;
            }
        }

        return false;
    }

    // Method untuk mengambil semua course tersedia
    public String getCourses() {
        String result = "";
        for (int i = 0; i < numCourses; i++) {
            result += courses[i];
            if (i != numCourses - 1) {
                result += ", ";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return """
            ======= TEACHER DATA =======
            Name    : %s
            Address : %s
            Courses : %s
            ============================
            """
                .formatted(getName(), getAddress(), getCourses());
    }
}
