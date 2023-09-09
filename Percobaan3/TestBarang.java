    public class TestBarang {
        public static void main(String[] args) {
            Barang br1 = new Barang();
            br1.namaBrg = "Pensil";
            br1.jenisBrg = "ATK";
            br1.stock = 10;
            br1.TampilBarang();

            System.out.println("Stock Baru Adalah "+ br1.TambahStock(20));

        }
    }
