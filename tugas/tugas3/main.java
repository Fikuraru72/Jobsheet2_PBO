package tugas3;

public class main {
    public static void main(String[] args) {
        barang br1 = new barang("089", "Teh Pucuk", 3000, 0.2);
        barang br2 = new barang("034", "Parfume", 20000, 0.5);


        br1.tampilData();
        System.out.println("===========================");
        br2.tampilData();
    }
}
