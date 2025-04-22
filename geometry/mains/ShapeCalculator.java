package praktic.geometry.mains;

import praktic.geometry.shapes.*;
import praktic.geometry.interfaces.*;
import java.util.Scanner;

/*
DANIEL SMITE MANALU - 245150701111018

______  ___   _   _ _____ _____ _
|  _  \/ _ \ | \ | |_   _|  ___| |
| | | / /_\ \|  \| | | | | |__ | |
| | | |  _  || . ` | | | |  __|| |
| |/ /| | | || |\  |_| |_| |___| |____
|___/ \_| |_/\_| \_/\___/\____/\_____/

*/

// Ini untuk definisi warna yang dipakai untuk pewarnaan
public class ShapeCalculator {
    // ANSI escape codes untuk pewarnaan teks
    static final String RED    = "\u001B[31m";
    static final String GREEN  = "\u001B[32m";
    static final String BLUE   = "\u001B[34m";
    static final String YELLOW = "\u001B[33m";
    static final String PURPLE = "\u001B[35m";
    static final String RESET  = "\u001B[0m";

    public static void main(String[] args) {
        Scanner niel = new Scanner(System.in);  // Scanner untuk input user

        // ========== HEADER ==========
        System.out.println(RED + "===========================================" + RESET);
        System.out.println(GREEN + "Shape Calculator" + RESET);      // Judul program
        System.out.println(BLUE + "DANIEL SMITE MANALU" + RESET);    // Nama dan NIM
        System.out.println(BLUE + "245150701111018" + RESET);
        System.out.println(RED + "===========================================" + RESET);

        // ========== 2D CIRCLE ==========
        System.out.println(YELLOW + "2D Circle" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter radius");
        double radius = niel.nextDouble();   // Input jari‑jari lingkaran
        System.out.println(RED + "===========================================" + RESET);

        Circle circle = new Circle(radius);  // Buat objek Circle
        circle.printInfo();                  // Cetak area & keliling
        System.out.println(RED + "===========================================" + RESET);

        // ========== 2D SQUARE ==========
        System.out.println(YELLOW + "2D Square" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter side");
        double side = niel.nextDouble();     // Input sisi persegi
        System.out.println(RED + "===========================================" + RESET);

        Square square = new Square(side);    // Buat objek Square
        square.printInfo();                  // Cetak area & keliling
        System.out.println(RED + "===========================================" + RESET);

        // ========== 3D CUBE ==========
        System.out.println(YELLOW + "3D Weightable Cube" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter edge");
        double edge = niel.nextDouble();     // Input panjang sisi kubus
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter mass");
        double cubeMass = niel.nextDouble(); // Input massa kubus
        System.out.println(RED + "===========================================" + RESET);

        Cube cube = new Cube(edge, cubeMass);  // Buat objek Cube
        cube.printInfo();                      // Cetak luas permukaan, volume, berat
        System.out.println(RED + "===========================================" + RESET);

        // ========== 3D SPHERE ==========
        System.out.println(YELLOW + "3D Weightable Sphere" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter radius");
        double sphereRadius = niel.nextDouble(); // Input jari‑jari bola
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter mass");
        double sphereMass = niel.nextDouble();   // Input massa bola
        System.out.println(RED + "===========================================" + RESET);

        Sphere sphere = new Sphere(sphereRadius, sphereMass);  // Buat objek Sphere
        sphere.printInfo();                                   // Cetak luas permukaan, volume, berat
        System.out.println(RED + "===========================================" + RESET);

        // ========== POLYMORPHISM SECTION ==========
        System.out.println(YELLOW + "Volume of Cube and Sphere" + RESET);
        System.out.println(PURPLE + "POLYMORPHISM: INTERFACE" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter edge");
        double polyEdge = niel.nextDouble();       // Edge untuk cube di polymorphism
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter radius");
        double polyRadius = niel.nextDouble();     // Radius untuk sphere di polymorphism
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter mass");
        double polyMass = niel.nextDouble();       // Massa untuk kedua objek
        System.out.println(RED + "===========================================" + RESET);

        // Gunakan interface ThreeDimensional untuk polimorfisme
        ThreeDimensional polyCube   = new Cube(polyEdge, polyMass);
        ThreeDimensional polySphere = new Sphere(polyRadius, polyMass);

        // Cetak volume dan berat dengan satu blok printf
        System.out.printf("""
            Cube's volume      : %.0f
            Sphere's volume    : %.0f
            Weight             : %.0f
            """,
                polyCube.getVolume(),
                polySphere.getVolume(),
                ((Weightable) polyCube).getWeight()
        );

        System.out.println(RED + "===========================================" + RESET);
    }
}