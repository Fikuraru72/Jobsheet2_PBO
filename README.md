# tugas-praktikum-2-Fikuraru72
tugas-praktikum-2-Fikuraru72 created by GitHub Classroom

# Jobsheet2_PBO

Nama   : Abiyyu Fiqlal Sholeh Wicaksono 

Nim    : 2241720014 

Kelas  : 2-F

Percobaan 1 
1. Gambarkan desain class diagram dari studi kasus 1!
2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!
3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing
class dari studi kasus 1!
4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi
kasus 1!

Jawaban : 

1. Gambar Class Diagram : 

![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/15bed33f-3a81-483d-9104-4de89ceb3e0b)

2. Class Karyawan dan class Jabatan
3. a. Class Karyawan :
   - idKaryawan"Long"
   - Nama"String",
   -  JenisKelamin"String"
   
   b. Class Jabatan :

   - Jabatan"String"
   - Gaji"Long"

   
6. a. Karyawan :
      - AddKaryawan() void
      - GantiJabatan(long id) void
      - TampilData() void
   
   b. Jabatan
      - AddJabatan() Void
      - Tampil Jabatan&Gaji(int idx) Void
      -  SearchJabatan(String jabatana) int)

Percobaan 2 
1. Class Mahasiswa :
   
       package Percobaan2;
  
        public class Mahasiswa {
        
            public int nim;
            public String nama, alamat, kelas;
        
            public void tampilBiodata() {
                System.out.println("Nim     : "+ nim);
                System.out.println("Nama    : "+ nama);
                System.out.println("Alamat  : "+ alamat);
                System.out.println("Kelas   : "+ kelas);
            }
            
        }
   
2. Class TestMahasiswa :

        package Percobaan2;
        public class TestMahasiswa {
            public static void main(String[] args) {
                Mahasiswa mhs1 = new Mahasiswa();
                mhs1.nim = 101;
                mhs1.nama = "Lestari";
                mhs1.alamat = "Jl. Vinolia No. 1A ";
        
                mhs1.tampilBiodata();
            }
        }

3. Hasil Run Code :

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/db2a95a6-def8-4e72-8a5f-6849fc4a0e79)
   
5. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

   Pendeklarasian atribut pada potongan program ini :

       public int nim;
       public String nama, alamat, kelas;
   
6. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!

   Pendeklarasian Method Pada Potongan Program ini :

        public void tampilBiodata() {
                    System.out.println("Nim     : "+ nim);
                    System.out.println("Nama    : "+ nama);
                    System.out.println("Alamat  : "+ alamat);
                    System.out.println("Kelas   : "+ kelas);
       }
   
7. Berapa banyak objek yang di instansiasi pada program diatas!

   Terdapat 1 objek dengan nama "mhs1"
   
8. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?

   Pada potongan code tersebut merupakan pemberian nilai/data pada variable nim pada objek mhs1
   
9. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?

   Pada potongan code tersebut merupakan cara untuk memanggil method tampilBiodata pada objek mhs1
    
10. Instansiasi 2 objek lagi pada program diatas!
    
        package Percobaan2;
            public class TestMahasiswa {
                public static void main(String[] args) {
                    Mahasiswa mhs1 = new Mahasiswa();
                    mhs1.nim = 101;
                    mhs1.nama = "Lestari";
                    mhs1.alamat = "Jl. Vinolia No. 1A ";
            
                    mhs1.tampilBiodata();
                    System.out.println();
            
                    Mahasiswa mhs2 = new Mahasiswa();
                    mhs2.nim = 102;
                    mhs2.nama = "Rahmat";
                    mhs2.alamat = "Jl. Melati No. 2A ";
            
                    mhs2.tampilBiodata();
                    System.out.println();
            
                    Mahasiswa mhs3 = new Mahasiswa();
                    mhs3.nim = 103;
                    mhs3.nama = "Riansya";
                    mhs3.alamat = "Jl. Mentari No. 1A ";
            
                    mhs3.tampilBiodata();
                    System.out.println();
                }
            }
    
11. Hasil Run Program :

![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/c8ce489c-cca6-4563-a2e2-1217ed63b5d7)


Percobaan 3 : 
1. Class Barang :

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

3. Class TestBarang :

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

5. Apakah fungsi argumen dalam suatu method?

   Argument pada sebuah methid digunakan sebagai nilai input untuk di olah di dalam method

   
7. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!

   Return pada method digunakan untuk mengenmbalikan nilai, suatu method akan mengemnbalikan niali apabila dibutuhkannya sebuah nilai kembalian dari sebuah method yang diproses


Tugas : 
1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana
data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama
member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa
menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class
diagram pada studi kasus diatas!

   Penjelasan
      - Harga yang harus dibayar diperoleh dari lama sewa x harga.
      - Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.

   Jawaban : 

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/8c6eeb84-bdc8-46c6-884c-fbaa1e07f1d7)

     
2. Buatlah program dari class diagram yang sudah anda buat di no 1!

   Class DaftarSewa :

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

   Class Game :
            
         public class Game {
         
             String nama;
             int price;
         
             public Game (String nama, int price){
                 this.nama = nama;
                 this.price = price;
             }
         
         
         }

   Class Main :

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


   Hasil :

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/b2543e75-5c10-44e2-b936-a9eeae4a8b8c)
   
   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/f2ef2504-c8e4-4810-baf1-2f2227ab0eb4)

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/30037315-540d-442d-ab1e-8fbbb24c6873)

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/5e52dd18-4ad9-41c7-8e07-fc131252b4d7)





   
3. Buatlah program sesuai dengan class diagram berikut ini:

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/e50035e1-7172-4d92-8088-f47c401d8021)

   Class Lingkaran :

         public class lingkaran {
             double phi = 3.14;
             double r;
         
             public lingkaran (double r){
                 this.r = r;
             }
         
             public double Luas (){
                 return phi * r * r;
             }
         
             public double keliling (){
                 return 2 * phi * r;
             }
         
         }

   Class Main :

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

   Hasil Run : 

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/0ef46e4b-78f1-4e70-b844-e56bed8254a6)




4. Buatlah program sesuai dengan class diagram berikut ini:

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/55065e87-bb9a-4a54-84fa-f899024dc632)

   Deskripsi :
   - Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam %
   - Method hitungHargaJual() digunakan untuk menghitung harga jual dengan perhitungan berikut ini :

           harga jual = harga dasar – (diskon x harga dasar)

   Class Barang :

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

   Class Main :

         public class main {
             public static void main(String[] args) {
                 barang br1 = new barang("089", "Teh Pucuk", 3000, 0.2);
                 barang br2 = new barang("034", "Parfume", 20000, 0.5);
         
         
                 br1.tampilData();
                 System.out.println("===========================");
                 br2.tampilData();
             }
         }


   Hasil Run :

   ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/524774a6-bd0e-4fca-a050-706d7f479b0c)




