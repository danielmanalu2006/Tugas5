package praktic.geometry.bases;

// Abstract class dasar untuk semua bentuk (2D & 3D)
public abstract class Shape {
    // Menyimpan nama bentuk
    private String name;

    // Konstruktor default: subclass bisa dibuat dulu, nama diset belakangan
    public Shape() {}

    // Setter: menetapkan nama bentuk dari luar class
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Getter: mengambil nama bentuk saat dibutuhkan
    public String getName() {
        return name;
    }

    // Method abstract: wajib di-override oleh subclass untuk mencetak info bentuk
    public abstract void printInfo();
}