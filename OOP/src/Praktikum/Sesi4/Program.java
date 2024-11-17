package Praktikum.Sesi4 ;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama : Anisah Sri.U");
        System.out.println("NIM  : 20230801302");
        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("===== Menu Program =====");
            System.out.println("1. Switch ");
            System.out.println("2. If ");
            System.out.println("3. For ");
            System.out.println("4. While ");
            System.out.println("5. Do-While ");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi(1/2/3/4/5/6) : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka (1/2/3): ");
                    System.out.println("1. Permen Yupi");
                    System.out.println("2. Permen Foxs");
                    System.out.println("3. Permen Milkita");
                    int num = scanner.nextInt();
                    switch (num) {
                        case 1: System.out.println("Anda memilih Permen Yupi");
                        break;
                        case 2: System.out.println("Anda memilih Permen Foxs"); 
                        break;
                        case 3: System.out.println("Anda memilih Permen Milkita"); 
                        break;
                        default: System.out.println("Angka tidak valid."); 
                    }
                    break;

                case 2:
                    System.out.print("Masukkan angka: ");
                    int angka = scanner.nextInt();
                    if (angka > 0) {
                        System.out.println("Angka positif.");
                    } else if (angka < 0) {
                        System.out.println("Angka negatif.");
                    } else {
                        System.out.println("Angka nol.");
                    }
                    break;

                case 3:
                    for (int a = 1; a <= 10; a +=2) { 
                        System.out.println(a); // Mencetak Angka Ganjil
                    }
                    break;

                case 4:
                    int a = 1;
                    while (a <= 5) {
                        System.out.println(a);
                        ++a;
                    }
                    break;

                case 5:
                int number;
                // Meminta input dari pengguna sampai mereka memasukkan angka antara 1 sampai 10
                do {
                    System.out.print("Masukkan angka antara 1 dan 10: ");
                    number = scanner.nextInt();
                } while (number < 1 || number > 10);
                System.out.println("Terima kasih, Anda memasukkan angka: " + number);
                    break;

                case 6:
                    System.out.println("Keluar dari program. Terima Kasih Anda Telah Menggunakan Program Ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
        
        scanner.close();
    }
}
