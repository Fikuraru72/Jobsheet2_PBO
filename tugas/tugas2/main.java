package tugas2;

public class main {
    public static void main(String[] args) {
        lingkaran lk1 = new lingkaran(2);
        lingkaran lk2 = new lingkaran(5);

        System.out.println("Luas Lingkaran 1     : " + lk1.Luas() );
        System.out.println("Keliling Lingkaran 1 : " + lk1.keliling() );
        System.out.println("==========================================");
        System.out.println("Luas Lingkaran 2     : " + lk2.Luas() );
        System.out.println("Keliling Lingkaran 2 : " + lk2.keliling() );
    }
}
