package Praktikum.Sesi3;  // Package declaration

import java.util.Scanner;  // Import Scanner untuk input dari pengguna

public class KalkulatorSederhana {

    // Fungsi utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Membuat objek Scanner untuk input
        boolean lanjut = true;  // Variabel kontrol untuk perulangan

        while (lanjut) {  // Perulangan untuk menampilkan menu sampai pengguna memilih keluar
            // Tampilkan menu
            System.out.println("==== Anisah Sri Utami - 20230801302 ====");
            System.out.println("==== Selamat Datang Di Kalkulator Sederhana ====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int pilihan = scanner.nextInt();  // Input pilihan operasi

            // Cek apakah user ingin keluar
            if (pilihan == 5) {
                lanjut = false;  // Menghentikan perulangan jika pengguna memilih untuk keluar
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                break;  // Keluar dari loop
            }

            // Meminta input dari user untuk angka pertama dan kedua
            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();  // Input angka pertama
            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();  // Input angka kedua

            // Hitung dan tampilkan hasil sesuai pilihan pengguna
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil: " + (num1 + num2));  // Penjumlahan
                    break;
                case 2:
                    System.out.println("Hasil: " + (num1 - num2));  // Pengurangan
                    break;
                case 3:
                    System.out.println("Hasil: " + (num1 * num2));  // Perkalian
                    break;
                case 4:
                    if (num2 != 0) {  // Cek agar tidak terjadi pembagian dengan 0
                        System.out.println("Hasil: " + (num1 / num2));  // Pembagian
                    } else {
                        System.out.println("Pembagian dengan 0 tidak diperbolehkan.");  // Pesan kesalahan jika num2 adalah 0
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");  // Pesan jika pengguna memilih selain 1-5
            }
            System.out.println();  // Membuat jarak antar operasi
        }

        scanner.close();  // Menutup scanner untuk mencegah kebocoran memori
    }
}
