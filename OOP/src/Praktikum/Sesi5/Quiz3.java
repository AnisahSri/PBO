package Praktikum.Sesi5;
import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        // Membuat objek scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        int angka;

        // Perulangan while untuk meminta angka dari pengguna sampai memasukkan angka 0
        do {
            // Meminta pengguna memasukkan angka
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            angka = input.nextInt();

            // Menampilkan angka yang dimasukkan jika bukan 0
            if (angka != 0) {
                System.out.println("Anda memasukkan angka: " + angka);
            }
        } while (angka != 0); // Perulangan berhenti jika angka = 0

        // Pesan ketika perulangan selesai
        System.out.println("Program berhenti. Anda telah memasukkan angka 0.");

        // Menutup scanner
        input.close();
    }
}
