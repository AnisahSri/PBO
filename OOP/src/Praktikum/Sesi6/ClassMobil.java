package Praktikum.Sesi6;
class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;
    
    public mobil (String aktifitas, String warna, int kecepatan){
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan() {
        if (kecepatan==0)
        aktifitas="parkir";
    }
    void cetakAtribut(){
        System.out.println("Aktifitas =" + aktifitas);
        System.out.println("Warna = " + warna);
        System.out.println("Kecepatan =" + kecepatan);
    }
}
public class ClassMobil {
public static void main(String []args){
    Mobil mobilku = new Mobil();
    mobilku.kecepatan=0;
    mobilku.warna="merah";
    mobilku.cekKecepatan();
    mobilku.cetakAtribut();
    }
} 
