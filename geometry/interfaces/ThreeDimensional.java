package praktic.geometry.interfaces;

// Interface untuk bentuk 3D: kelas yang mengimplement ini
// wajib menyediakan perhitungan luas permukaan dan volume
public interface ThreeDimensional {
    // Mengembalikan luas permukaan objek 3D
    // Implementasi di kelas seperti Cube, Sphere, dll.
    double getSurfaceArea();

    // Mengembalikan volume objek 3D
    // Implementasi di kelas seperti Cube, Sphere, dll.
    double getVolume();
}