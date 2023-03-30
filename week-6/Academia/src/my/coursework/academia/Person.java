package my.coursework.academia;

// Deklarasi class DigitalLibrary
public class Person {
    // Deklarasi variabel instance
    public String name, address;

    // Konstruktor ke-1 dengan 2 parameter
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Konstruktor ke-2 dengan 1 parameter
    public Person(String name) {
        this(name, "");
    }

    // Method untuk mengambil data user
    public Object[] getUser() {
        return new Object[]{name, address};
    }

    // Method untuk menambahkan user
    public void addUser(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method untuk mengubah data user
    public void updateUser(String name, String address) {
        addUser(name, address);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
            // Membuat objek person1 dengan konstruktor ke-2
            Person person1 = new Person("Pahril", "11221056@student.itk.ac.id");
            // Membuat objek person2 dengan konstruktor ke-3
            Person person2 = new Person(null);

            System.out.print("\033[H\033[2J");

            System.out.println("==== PERSON DATA ====");
            Object[] user1 = person1.getUser();
            System.out.println("Nama : " + user1[0]);
            System.out.println("Email : " + user1[1]);
            System.out.println("=====================\n");

            person1.updateUser("Pahril", "pahril@student.itk.ac.id", 911);

            System.out.println("==== UPDATED PERSON DATA ====");
            Object[] user2 = person1.getUser();
            System.out.println("Nama : " + user2[0]);
            System.out.println("Email : " + user2[1]);
            System.out.println("Phone : " + user2[2]);
            System.out.println("=============================\n");

            person2.addUser("Saputra", "11221056@student.itk.ac.id", 112);

            System.out.println("==== PERSON 2 DATA ====");
            Object[] user3 = person2.getUser();
            System.out.println("Nama : " + user3[0]);
            System.out.println("Email : " + user3[1]);
            System.out.println("Phone : " + user3[2]);
            System.out.println("=======================\n");
    }
}
