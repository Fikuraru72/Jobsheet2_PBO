package tugas3;

public class barang {
    String kode, namaBarang;
    int hargaDasar;
    double diskon;
    
    public barang(String kode, String nama, int harga, Double diskon) {
        this.kode = kode;
        this.namaBarang = nama;
        this.hargaDasar = harga;
        this.diskon = diskon;
    }

    public int hitungHargaJual() {
        // int dis = (int) Math.floor(diskon);
        double hit = hargaDasar - (diskon * hargaDasar);
        int jual = (int) Math.floor(hit);
        return jual;
    }

    public void tampilData() {
        System.out.println("Kode            : " + this.kode);
        System.out.println("Nama Barang     : " + this.namaBarang);
        System.out.println("Harga Dasar     : " + this.hargaDasar);
        System.out.println("Diskon          : " + this.diskon*100 + "%");
        System.out.println("Harga Jual      : " + hitungHargaJual());
    }
}
