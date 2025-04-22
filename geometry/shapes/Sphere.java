package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

// Kelas Sphere mewakili bentuk bola 3D
// Turunan dari CircularShape, mengimplementasi ThreeDimensional & Weightable
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass; // Massa bola (diperlukan untuk menghitung berat)

    // Konstruktor
    public Sphere() {
        setName("3D Sphere"); // Set nama objek menjadi "3D Sphere"
    }

    // Konstruktor dengan parameter radius dan massa
    public Sphere(double radius, double mass) {
        setRadius(radius);   // Set nilai radius
        this.mass = mass;    // Set nilai massa
        setName("Sphere");   // Nama bentuk di-set menjadi "Sphere"
    }

    // Menghitung luas permukaan bola
    @Override
    public double getSurfaceArea() {
        // Rumus: 4 * π * r², dengan π ≈ 22/7
        return (4 * ((double) PI_NUMERATOR / PI_DENOMINATOR) * getRadius() * getRadius());
    }

    // Menghitung volume bola
    @Override
    public double getVolume() {
        // Rumus: (4/3) * π * r³
        return ((double) 4 / 3) * ((double) PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 3);
    }

    // Menghitung berat bola
    @Override
    public double getWeight() {
        // Rumus: massa * gravitasi
        return mass * g;
    }

    // Menampilkan informasi bola secara lengkap
    @Override
    public void printInfo() {
        System.out.printf("""
        Name               : %s
        Surface area       : %.0f
        Volume             : %.0f
        Weight             : %.0f
        """, getName(), getSurfaceArea(), getVolume(), getWeight());
    }
}
