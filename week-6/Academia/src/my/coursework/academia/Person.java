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

    // Method untuk mengambil nama
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Method untuk mengambil data user
    public Object[] getUser() {
        return new Object[]{name, address};
    }

    // Method untuk menambahkan user
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Nama:   ${name}\nAlamat:    ${alamat}";
    }
}
