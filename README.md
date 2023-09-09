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
1. ![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/15bed33f-3a81-483d-9104-4de89ceb3e0b)

2. Class Karyawan dan class Jabatan
3. Class Karyawan (idKaryawan"Long", Nama"String", JenisKelamin"String"), Class Jabatan (Jabatan"String", Gaji"Long")
4. Karyawan ( AddKaryawan() void, GantiJabatan(long id) void, TampilData() void ), Jabatan ( AddJabatan() Void, Tampil Jabatan&Gaji(int idx) Void, SearchJabatan(String jabatana) int)

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
   
4. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
   Pendeklarasian atribut pada potongan program ini :

       public int nim;
       public String nama, alamat, kelas;
   
5. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
   Pendeklarasian Method Pada Potongan Program ini :

        public void tampilBiodata() {
                    System.out.println("Nim     : "+ nim);
                    System.out.println("Nama    : "+ nama);
                    System.out.println("Alamat  : "+ alamat);
                    System.out.println("Kelas   : "+ kelas);
       }
   
6. Berapa banyak objek yang di instansiasi pada program diatas!
   Terdapat 1 objek dengan nama "mhs1"
   
7. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?
    Pada potongan code tersebut merupakan pemberian nilai/data pada variable nim pada objek mhs1
   
8. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?
    Pada potongan code tersebut merupakan cara untuk memanggil method tampilBiodata pada objek mhs1
    
9. Instansiasi 2 objek lagi pada program diatas!
    
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
    
10. Hasil Run Program : 
![image](https://github.com/Fikuraru72/Jobsheet2_PBO/assets/115953049/c8ce489c-cca6-4563-a2e2-1217ed63b5d7)

        

