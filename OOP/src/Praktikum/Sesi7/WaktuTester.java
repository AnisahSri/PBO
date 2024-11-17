// Kelas Waktu untuk merepresentasikan waktu dalam satuan menit sejak jam 00:00
class Waktu {
    // Atribut menitWaktu menyimpan total menit sejak jam 00:00
    private int menitWaktu;

    // Konstruktor default untuk inisialisasi menitWaktu dengan nilai 0
    public Waktu() {
        this.menitWaktu = 0;
    }

    // Method untuk mendapatkan bagian jam dari menitWaktu
    public int getJam() {
        return menitWaktu / 60; // Menghitung jam dengan membagi total menit dengan 60
    }

    // Method untuk mendapatkan bagian menit dari menitWaktu
    public int getMenit() {
        return menitWaktu % 60; // Menghitung menit dengan mengambil sisa dari pembagian 60
    }

    // Method untuk mengatur jumlah jam, tanpa mengubah bagian menit
    public void setJam(int j) {
        // Mengatur menitWaktu menjadi (jam * 60) + menit yang ada
        menitWaktu = j * 60 + getMenit();
    }

    // Method untuk mengatur jumlah menit, tanpa mengubah bagian jam
    public void setMenit(int m) {
        // Mengatur menitWaktu menjadi (jam yang ada * 60) + menit
        menitWaktu = getJam() * 60 + m;
    }

    // Method untuk mendapatkan total menit sejak jam 00:00
    public int getTotalMenit() {
        return menitWaktu; // Mengembalikan nilai menitWaktu
    }

    // Method untuk menambahkan jam (dalam satuan jam) ke menitWaktu
    public void tambahJam(int j) {
        menitWaktu += j * 60; // Menambahkan j jam dalam satuan menit (j * 60) ke menitWaktu
    }

    // Method untuk menambahkan menit ke menitWaktu
    public void tambahMenit(int m) {
        menitWaktu += m; // Menambahkan m menit langsung ke menitWaktu
    }

    // Method untuk menambahkan waktu dengan jam dan menit ke menitWaktu
    public void tambahWaktu(int j, int m) {
        menitWaktu += j * 60 + m; // Menambahkan (jam * 60) + menit ke menitWaktu
    }

    // Method untuk menampilkan waktu dalam format jam:menit
    public void tampilWaktu() {
        // Menampilkan waktu dalam format "Waktu : HH:MM"
        System.out.println("Waktu : " + getJam() + ":" + getMenit());
    }
}

// Kelas WaktuTester untuk menguji fungsionalitas kelas Waktu
public class WaktuTester {
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Waktu baru
        Waktu w = new Waktu();

        // Menampilkan total menit awal (seharusnya 0)
        System.out.println("1. Total Menit : " + w.getTotalMenit());

        // Mengatur jam menjadi 10
        w.setJam(10);
        // Menampilkan total menit setelah mengatur jam menjadi 10 (seharusnya 600)
        System.out.println("2. Total Menit : " + w.getTotalMenit());

        // Mengatur menit menjadi 57
        w.setMenit(57);
        // Menampilkan total menit setelah mengatur menit menjadi 57 (seharusnya 657)
        System.out.println("3. Total Menit : " + w.getTotalMenit());

        // Menampilkan waktu dalam format jam:menit (seharusnya 10:57)
        w.tampilWaktu();

        // Menambahkan 7 jam ke waktu saat ini
        w.tambahJam(7);
        // Menampilkan jam dan menit setelah penambahan 7 jam (seharusnya 17:57)
        System.out.println("4. JAM : " + w.getJam() + " MENIT : " + w.getMenit());

        // Menambahkan 40 menit ke waktu saat ini
        w.tambahMenit(40);
        // Menampilkan jam dan menit setelah penambahan 40 menit (seharusnya 18:37)
        System.out.println("5. JAM : " + w.getJam() + " MENIT : " + w.getMenit());
    }
}
