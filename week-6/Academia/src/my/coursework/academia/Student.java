package my.coursework.academia;

import java.util.Arrays;

public class Student extends Person {
    // Deklarasi variabel instance
    private int numCourses, grades[] = {};
    private String[] courses = {};

    // Konstruktor
    public Student(String name, String address) {
        super(name, address);
    }

    // Method untuk menambahkan nilai
    public void addCourseGrade(String course, int grade) {
        courses = Arrays.copyOf(courses, numCourses + 1);
        grades = Arrays.copyOf(grades, numCourses + 1);

        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // Method untuk menampilkan nilai kedalam terminal
    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    // Method untuk mendapatkan nilai rata"
    public double getAverageGrade() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        // Jika numCourse == 0 return 0 jika tidak hitung rata"
        // (double) casting operator : untuk konversi tipe data
        return numCourses == 0 ? 0 : (double) sum / numCourses;
    }

    // Method untuk mengembalikan value dalam bentuk string
    @Override
    public String toString() {
        return """
            ======= STUDENT DATA =======
            Name            : %s
            Address         : %s
            Nilai rata-rata : %f
            ============================
            """
                .formatted(getName(), getAddress(), getAverageGrade());
    }
}
