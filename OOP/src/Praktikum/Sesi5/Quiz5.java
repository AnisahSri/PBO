package Praktikum.Sesi5;
import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan batas bawah : ");
        int batasBawah = input.nextInt();

        System.out.println("Masukkan batas atas : ");
        int batasAtas = input.nextInt();

        System.out.println("Bilangan genap : ");
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("\nBilangan ganjil : ");
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }

        input.close();
    }
}
