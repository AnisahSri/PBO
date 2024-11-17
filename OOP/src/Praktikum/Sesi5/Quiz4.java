package Praktikum.Sesi5;
import java.util.Scanner;
public class Quiz4 {
    public static void main(String[] args) {
        int jumlahGenap = 0;
    
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                jumlahGenap++;
                System.out.print(i + " ");
            }
        }
    
        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlahGenap);
    }
}