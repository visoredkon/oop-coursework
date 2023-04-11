// Package lokasi class berada
package my.coursework.academia;

// Deklarasi class Person
public class Person {
    // Deklarasi variabel instance
    private String name, address;

    // Konstruktor ke-1 dengan 2 parameter
    public Person(String name, String address) {
        this.name = name == null ? "" : name;
        this.address = address == null ? "" : address;
    }

    // Konstruktor ke-2 dengan 1 parameter
    public Person(String name) {
        this(name, null);
    }

    // Method untuk mengambil nama
    public String getName() {
        return name;
    }

    // Mehtod untuk mengambil alamat
    public String getAddress() {
        return address;
    }

    // Method untuk mengambil data user
    public Object[] getUser() {
        return new Object[] {name, address};
    }

    // Method untuk menambahkan user
    public void setAddress(String address) {
        this.address = address;
    }

    // Method untuk mengembalikan value dalam bentuk string
    public String toString() {
        return """
            ======= PERSON DATA =======
            Name    : %s
            Address : %s
            ===========================
            """
                .formatted(name, address);
    }
}
