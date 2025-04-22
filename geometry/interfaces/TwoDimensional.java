package praktic.geometry.interfaces;

// Interface untuk bentuk 2D: subclass wajib menghitung luas dan keliling
public interface TwoDimensional {
    // Mengembalikan luas objek 2D (contoh: persegi, lingkaran)
    double getArea();

    // Mengembalikan keliling objek 2D (contoh: persegi, lingkaran)
    double getPerimeter();
}