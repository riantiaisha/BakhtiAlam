import java.util.Scanner;

public class Sekolah {
    public static void main(String[] args) {
        Sekolah s = new Sekolah();
        s.tampilNama("SMK Telkom Sandhy Putra Malang");
        s.jumlahSiswa(5, 30);
    }
    Scanner scan = new Scanner(System.in);
    public void tampilNama(String nama){
        System.out.println("Saya bersekolah di "+nama);
    }

    public void jumlahSiswa (int rombel, int jumlahSiswa){
        int total=rombel*jumlahSiswa;
        System.out.println("Jumlah Siswa: "+total);
    }
}
