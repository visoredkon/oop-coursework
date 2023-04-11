package my.coursework.academia;

public class App {
    public static void main(String[] args) {
        // Menggunakan escape sequence untuk mengosongkan terminal
        System.out.print("\033[H\033[2J");

        // Pengujian class Person --------------------------------------------
        System.out.println("Pengujian class Person:");

        // Membuat objek person1 dengan class Person konstruktor ke-1
        Person person1 = new Person("Pahril", "Jl. Imus Payau");

        // Membuat objek person2 dengan class Person konstruktor ke-2
        Person person2 = new Person("Dwi");

        // Menampilkan data objek person1 menggunakan getter
        System.out.println(person1.getName());
        System.out.println(person1.getAddress());

        // Output akan menampilkan data nama dan alamat berdasarkan argument
        System.out.println(person1.toString());

        // Output alamat akan kosong
        System.out.println(person2.toString());

        // Menginput alamat kedalam objek person2
        person2.setAddress("Kilometer 1");

        // Output akan menampilkan data nama dan data alamat yang baru
        System.out.println(person2.toString());
        // -------------------------------------------------------------------

        // Pengujian class Student -------------------------------------------
        System.out.println("Pengujian class Student:");

        // Membuat objek student1 dengan class Student
        Student student1 = new Student("Saputra", "Jl. Imus Payau");

        // Menambahkan nilai course ke objek student1
        student1.addCourseGrade("PMS", 90);
        student1.addCourseGrade("Kalkulus 2", 80);
        student1.addCourseGrade("Fisika Dasar 2", 88);

        // Menampilkan nilai student1
        student1.printGrades();

        // Menampilkan nilai rata" student1
        System.out.println(
                "Nilai rata-rata %s adalah sebesar %f\n"
                        .formatted(student1.getName(), student1.getAverageGrade()));

        // Menampilkan data student1
        System.out.println(student1.toString());
        // -------------------------------------------------------------------

        // Pengujian class Teacher -------------------------------------------
        System.out.println("Pengujian class Teacher:");

        // Membuat objek student1 dengan class Student
        Teacher teacher1 = new Teacher("Saputra", "Jl. Imus Payau");

        // Menambahkan course kedalam objek teacher1
        teacher1.addCourse("PMS");
        teacher1.addCourse("Kalkulus 2");
        teacher1.addCourse("Fisika Dasar 2");

        // Menambahkan course "PMS"
        if (!teacher1.addCourse("PMS")) {
            System.out.println("Matkul sudah ada!");
        }

        // Menghapus course "PMS"
        if (teacher1.removeCourse("PMS")) {
            System.out.println("Matkul berhasil dihapus!");
        }

        // Menampilkan semua course yang tersedia
        System.out.println(teacher1.getCourses() + "\n");

        // Menampilkan data teacher1
        System.out.println(teacher1.toString());
        // -------------------------------------------------------------------
    }
}
