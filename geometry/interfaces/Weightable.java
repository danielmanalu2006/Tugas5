package praktic.geometry.interfaces;

// Interface untuk objek yang memiliki berat
public interface Weightable {
    // Konstanta percepatan gravitasi (m/s^2)
    double g = 9.8;

    // Mengembalikan berat objek dalam Newton
    double getWeight();
}