package tugas1;

import tugas1.DaftarSewa;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in); /*angka*/
        Scanner sc = new Scanner(System.in); /*Huruf*/

        LinkedList<DaftarSewa> df = new LinkedList<>();
        List<Game> gm = new ArrayList<>();

        Game gm1 = new Game("Assasin Cread", 25000);
        Game gm2 = new Game("Genshin Impact", 30000);
        Game gm3 = new Game("PES 2020", 20000);
        gm.addAll(Arrays.asList(gm1,gm2,gm3));

        boolean key = true;
        while (true) {
            System.out.println("=========Sewa Game=========");
            System.out.println("1. Daftar Game");
            System.out.println("2. Sewa Game");
            System.out.println("3. Daftar Sewa");
            System.out.println("4. Exit");
            System.out.print("Pilih : ");
            int in = scr.nextInt();
            if (in == 1){
                int idx = 0;
                for (Game game : gm) {
                    System.out.println("Nama  : " + gm.get(idx).nama );
                    System.out.println("Price : " + gm.get(idx).price);
                    System.out.println("-----------------------------------");
                    idx++;
                }
            } else if (in == 2) {
                System.out.println("Masukan Data : ");
                System.out.print("Nama : ");
                String nama = sc.nextLine();

                System.out.print("ID : ");
                int id = scr.nextInt();

                System.out.print("Game : ");
                String game = sc.nextLine();

                System.out.print("Day : ");
                int day = scr.nextInt();

                int price = 0;

                int idx = 0;
                for (Game games : gm) {

                    if (gm.get(idx).nama.equalsIgnoreCase(game)){
                        price = gm.get(idx).price;
                    }
                    idx++;
                }

                DaftarSewa df1 = new DaftarSewa(nama, game, id, day, price);
                df.add(df1);

            } else if (in == 3) {
                int idx = 0;
                for ( DaftarSewa daf : df ) {
                    System.out.println("Nama        : " + df.get(idx).nama);
                    System.out.println("ID          : " + df.get(idx).id);
                    System.out.println("Game        : " + df.get(idx).game);
                    System.out.println("Price       : " + df.get(idx).price);
                    System.out.println("Day         : " + df.get(idx).day);
                    System.out.println("PriceAll    : " + df.get(idx).allPrice);
                }
            } else if ( in == 4) {
                key = false;
            }

        }




    }


}
