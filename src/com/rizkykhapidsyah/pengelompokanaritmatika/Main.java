package com.rizkykhapidsyah.pengelompokanaritmatika;

public class Main {
    public static void main(String[] args) {
        double a, b, c, d, e;

        /*
            Perkalian atau Pembagian akan dilakukan terlebih dahulu.
            Jika dilakukan perkalian dan pembagian, maka akan dilakukan
            operasinya dari kiri ke kanan.
         */

        a = 3 + 4 * 12 / 6 - 3;
        b = 3 * 4 - 12 + 6 / 2;
        c = 3 - 4 / 12 * 6 + 2;
        d = 3 / 4 + (12 - 6) * 2;
        e = 3 / (4 + 12) - 6 * 2;

        System.out.println("Hasil a adalah : " + a);
        System.out.println("Hasil b adalah : " + b);
        System.out.println("Hasil c adalah : " + c);
        System.out.println("Hasil d adalah : " + d);
        System.out.println("Hasil e adalah : " + e);
    }
}
