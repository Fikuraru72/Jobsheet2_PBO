package tugas1;

public class DaftarSewa {

    String nama, game;
    int id, day, price, allPrice;

    public DaftarSewa (String nama, String game, int id, int day, int price){
        this.nama = nama;
        this.game = game;
        this.id = id;
        this.day = day;
        this.price = price;
        this.allPrice = price * day;
    }
}
