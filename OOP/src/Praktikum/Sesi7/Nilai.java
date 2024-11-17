// Definisi kelas Nilai
public class Nilai {
    // Atribut untuk menyimpan nilai Quis, UTS, dan UAS
    private double quis; 
    private double uts;  
    private double uas;  
    
    // Metode untuk mengisi nilai Quis
    public void setQuis(double quis) {
        this.quis = quis;
    }

    // Metode untuk mengisi nilai UTS
    public void setUTS(double uts) {
        this.uts = uts;
    }

    // Metode untuk mengisi nilai UAS
    public void setUAS(double uas) {
        this.uas = uas;
    }

    // Metode untuk menghitung nilai akhir (NA) berdasarkan rumus
    public double getNA() {
        return 0.2 * quis + 0.3 * uts + 0.5 * uas; // 20% Quis, 30% UTS, 50% UAS
    }

    // Metode untuk menentukan index berdasarkan nilai akhir
    public char getIndex() {
        double na = getNA();
        if (na >= 80 && na <= 100) {
            return 'A'; // Sangat Baik
        } else if (na >= 68 && na < 80) {
            return 'B'; // Baik
        } else if (na >= 56 && na < 68) {
            return 'C'; // Cukup
        } else if (na >= 45 && na < 56) {
            return 'D'; // Kurang
        } else {
            return 'E'; // Sangat Kurang
        }
    }

    // Metode untuk memberikan keterangan berdasarkan index
    public String getKeterangan() {
        switch (getIndex()) {
            case 'A': return "Sangat Baik";
            case 'B': return "Baik";
            case 'C': return "Cukup";
            case 'D': return "Kurang";
            case 'E': return "Sangat Kurang";
            default: return "Tidak Valid";
        }
    }

    // Main method untuk menguji kelas Nilai
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        // Mengisi nilai
        nilai.setQuis(85);  // Mengisi nilai Quis
        nilai.setUTS(70);   // Mengisi nilai UTS
        nilai.setUAS(90);   // Mengisi nilai UAS
        
        // Menampilkan hasil
        System.out.println("Nilai Akhir: " + nilai.getNA());
        System.out.println("Index: " + nilai.getIndex());
        System.out.println("Keterangan: " + nilai.getKeterangan());
    }
}
