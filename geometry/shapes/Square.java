package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

// Kelas Square merepresentasikan bangun datar persegi
// Meng-extend Shape (abstract class) dan mengimplementasi TwoDimensional (interface)
public class Square extends Shape implements TwoDimensional {
    private double side; // Panjang sisi persegi

    // Konstruktor
    public Square() {
        setName("2D Square"); // Set nama objek menjadi "Square"
    }

    // Konstruktor dengan parameter sisi
    public Square(double side) {
        this.side = side;      // Inisialisasi panjang sisi
        setName("Square");     // Set nama bentuk menjadi "Square"
    }

    // Menghitung luas persegi: sisi * sisi
    @Override
    public double getArea() {
        return side * side;
    }

    // Menghitung keliling persegi: 4 * sisi
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Menampilkan informasi persegi
    @Override
    public void printInfo() {
        System.out.printf("""
            Name               : %s
            Area               : %.0f
            Perimeter          : %.0f
            """,
                getName(),
                getArea(),
                getPerimeter()
        );
    }
}
