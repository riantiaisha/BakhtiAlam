public class Tampil {
    public static void main(String[] args) {
        rumah r = new rumah();
        Sekolah s = new Sekolah();
        System.out.println("DATA RUMAH");
        r.tampilLokasi();
        r.tampilUkuran(10, 8);
        System.out.println("DATA SEKOLAH");
        s.tampilNama("SMK Telkom Sandhy Putra Malang");
        s.jumlahSiswa(5, 30);
    }
    
}
