package Praktikum.Sesi5;
import java.util.Scanner;
    
    public class Quiz1 {
        public static void main(String[] args) {
            // Membuat objek scanner untuk mengambil input dari pengguna
            Scanner input = new Scanner(System.in);
    
            // Meminta pengguna untuk memasukkan sebuah angka
            System.out.print("Masukkan sebuah angka: ");
            double angka = input.nextDouble();
    
            // Memeriksa apakah angka positif, negatif, atau nol
            if (angka > 0) {
                System.out.println("Angka tersebut adalah angka positif.");
            } else if (angka < 0) {
                System.out.println("Angka tersebut adalah angka negatif.");
            } else {
                System.out.println("Angka tersebut adalah nol.");
            }
    
            // Menutup scanner
            input.close();
        }
        
    }
