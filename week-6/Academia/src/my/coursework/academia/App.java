package my.coursework.academia;

public class App {
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek person1 dengan konstruktor ke-2
        Person person1 = new Person("Pahril", "Jl. Imus Payau");
        // Membuat objek person2 dengan konstruktor ke-3
        Person person2 = new Person("Saputra");

        // System.out.print("\033[H\033[2J");

        System.out.println("==== PERSON DATA ====");
        System.out.println("Nama    : " + person1.getName());
        System.out.println("Alamat  : " + person1.getAddress());
        System.out.println("=====================\n");

        person2.setAddress("Kilometer 1");

        System.out.println("==== PERSON 2 DATA ====");
        System.out.println(person2.toString());
        System.out.println("=======================\n");
    }
}
