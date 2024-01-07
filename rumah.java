public class rumah {
    public static void main(String[] args) {
        rumah r = new rumah();
        r.tampilLokasi();
        r.tampilUkuran(10, 8);
    }

    
    public void tampilLokasi(){
        String alamat="Malang";
        System.out.println("Lokari Rumah: "+alamat);
    }
    public void tampilUkuran(int panjang,int lebar){
        int luas = panjang*lebar;
        System.out.println("Ukuran Rumah: "+luas);
    }
    
    
}
