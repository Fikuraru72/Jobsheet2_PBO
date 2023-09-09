public class Barang {
    public String namaBrg, jenisBrg;
    public int stock;

    public void TampilBarang() {
        System.out.println("Nama Barang     : "+ namaBrg);
        System.out.println("Jenis Barang     : "+ jenisBrg);
        System.out.println("Stock Barang     : "+ stock);
    }

    public int TambahStock (int barangMsk){
        int stockBaru = barangMsk + stock;
        return stockBaru;
    }
}
