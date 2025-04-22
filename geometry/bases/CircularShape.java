package praktic.geometry.bases;

// Class abstract untuk bentuk berdasar lingkaran (tidak bisa di-instantiate langsung)
public abstract class CircularShape extends Shape {
    // Menyimpan jari‑jari lingkaran
    private double radius;

    // Konstanta PI dalam bentuk pecahan 22/7, agar semua subclass pakai nilai sama
    protected static final int PI_NUMERATOR   = 22;
    protected static final int PI_DENOMINATOR = 7;

    // Konstruktor default: subclass bisa dibuat tanpa harus langsung set radius
    public CircularShape() {}

    // Setter: menetapkan nilai jari‑jari
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    // Getter: mengambil nilai jari‑jari saat dibutuhkan
    public double getRadius() {
        return radius;
    }
}