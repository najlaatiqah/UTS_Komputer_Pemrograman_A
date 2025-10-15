import java.util.ArrayList;
import java.util.List;

public class Pembeli {
    
    private String nama;
    private List<Barang> daftarBarang;

    
    public Pembeli(String nama) {
        this.nama = nama;
        this.daftarBarang = new ArrayList<>();
    }

    
    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
    }

    
    public int hitungTotalHarga() {
        int total = 0;
        for (Barang b : daftarBarang) {
            total += b.hitungTotalHarga();
        }
        return total;
    }

    
    public void tampilkanInfo() {
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Daftar Barang yang Dibeli:");
        System.out.println("----------------------------------");

        for (Barang b : daftarBarang) {
            System.out.println("Nama Barang  : " + b.getNama());
            System.out.println("Harga Satuan : Rp " + b.getHargaSatuan());
            System.out.println("Jumlah       : " + b.getJumlah());
            System.out.println("Total Harga  : Rp " + b.hitungTotalHarga());
            System.out.println("----------------------------------");
        }

        System.out.println("TOTAL PEMBAYARAN : Rp " + hitungTotalHarga());
   }
}