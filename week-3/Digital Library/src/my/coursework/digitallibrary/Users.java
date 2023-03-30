package my.coursework.digitallibrary;

// Deklarasi class DigitalLibrary
public class Users {
    // Deklarasi variabel instance
    public String name, email;
    public int phoneNumber;

// Konstruktor ke-1 dengan 3 parameter
public Users(String name, String email, int phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
}

// Konstruktor ke-2 dengan 2 parameter
public Users(String name, String email) {
    this(name, email, 0);
}

// Konstruktor ke-3 dengan 1 parameter
public Users(String name) {
    this(name, "", 0);
}

// Method untuk mengambil data user
public Object[] getUser() {
    return new Object[]{name, email, phoneNumber};
}

// Method untuk menambahkan user
public void addUser(String name, String email, int phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
}

// Method untuk mengubah data user
public void updateUser(String name, String email, int phoneNumber) {
    addUser(name, email, phoneNumber);
}

// Method main untuk menjalankan program
public static void main(String[] args) {
        // Membuat objek person1 dengan konstruktor ke-2
        Users person1 = new Users("Pahril", "11221056@student.itk.ac.id");
        // Membuat objek person2 dengan konstruktor ke-3
        Users person2 = new Users(null);

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
