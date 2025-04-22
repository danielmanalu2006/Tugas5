package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

// Kelas Cube mewakili bentuk kubus 3D
// Mengimplementasikan antarmuka ThreeDimensional & Weightable
public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge;  // Panjang sisi kubus
    private double mass;  // Massa kubus (diperlukan untuk menghitung berat)

    // Konstruktor
    public Cube() {
        setName("3D Cube"); // Set nama objek menjadi "3D Cube"
    }

    // Konstruktor dengan parameter sisi dan massa
    public Cube(double edge, double mass) {
        this.edge = edge;     // Set panjang sisi kubus
        this.mass = mass;     // Set massa kubus
        setName("Cube");      // Set nama objek menjadi "Cube"
    }

    // Menghitung luas permukaan kubus
    @Override
    public double getSurfaceArea() {
        // Rumus: 6 * sisi^2
        return 6 * edge * edge;
    }

    // Menghitung volume kubus
    @Override
    public double getVolume() {
        // Rumus: sisi^3
        return edge * edge * edge;
    }

    // Menghitung berat kubus berdasarkan massa dan gravitasi
    @Override
    public double getWeight() {
        // Rumus: massa * gravitasi (g = 9.8)
        return mass * g;
    }

    // Menampilkan informasi detail tentang kubus
    @Override
    public void printInfo() {
        // Menggunakan String format untuk tampilan yang rapi
        System.out.printf("""
        Name               : %s
        Surface area       : %.0f
        Volume             : %.0f
        Weight             : %.0f
        """,
                getName(),         // Nama bentuk
                getSurfaceArea(),  // Luas permukaan kubus
                getVolume(),       // Volume kubus
                getWeight()        // Berat kubus
        );
    }
}
