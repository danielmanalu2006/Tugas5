package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

// Kelas Circle: bentuk lingkaran 2D, turunan CircularShape dan implement TwoDimensional
public class Circle extends CircularShape implements TwoDimensional {

    // Konstruktor default: radius & name belum di-set
    public Circle() {}

    // Konstruktor dengan parameter radius
    public Circle(double radius) {
        setRadius(radius);    // Set jari-jari sesuai input
        setName("Circle");    // Set nama bentuk menjadi "Circle"
    }

    // Menghitung luas lingkaran: (PI * r^2) menggunakan PI_NUMERATOR/PI_DENOMINATOR
    @Override
    public double getArea() {
        return (PI_NUMERATOR * getRadius() * getRadius()) / PI_DENOMINATOR;
    }

    // Menghitung keliling lingkaran: (2 * PI * r)
    @Override
    public double getPerimeter() {
        return (2 * PI_NUMERATOR * getRadius()) / PI_DENOMINATOR;
    }

    // Mencetak info lingkaran dengan text block dan format
    @Override
    public void printInfo() {
        System.out.printf("""
            Name               : %s
            Area               : %.0f
            Perimeter          : %.0f
            """,
                getName(),        // Nama bentuk
                getArea(),        // Luas lingkaran (dibulatkan)
                getPerimeter()    // Keliling lingkaran (dibulatkan)
        );
    }
}