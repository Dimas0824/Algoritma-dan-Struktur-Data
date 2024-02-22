# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama : Muhammad Irsyad Dimas Abdillah </p>
<p align = "center"> Absen: 20 </p>
<p align = "center"> NIM  : 2341720088 </p>
<p align = "center"> Prodi: TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas: 1B </p>

# Percobaan 1: Deklarasi Class, Atribut dan Method

![alt text](docs/img/Percobaan1.png)

## Pertanyaan

1.  Sebutkan dua karakteristik class atau object!<br>
    jawab: object memiliki krakteristik atribut dan behavior.<br>
2.  Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
    Buku? Sebutkan apa saja atributnya!<br>
    jawab: ada 5 atribut pada class Buku, yaitu judul, pengarang, halaman, stok, dan harga. <br>
3.  Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!<br>
    jawab: ada 4 method, yaitu tampilInformasi(); terjual(int jml); restock(int jml); gantiHarga(int hrg); <br>
4.  Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
    sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!<br>
    jawab: <br>kode hasil modifikasi ![alt text](docs/img/P1pertanyaan4.png)<br>
    output run
    ![alt text](docs/img/runP1pertanyaan4.png)
5.  Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?<br>
    jawab: agar pengguna hanya dibatasi dengan input nilai berupa bilangan bulat. <br><br>

# Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

![alt text](docs/img/Percobaan2.png)

## pertanyaan

1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?<br>
   jawab: **Buku bk1 = new Buku();** adalah program yang digunakan untuk proses instasiasi. <br>
   Dan nama objek yang dihasilkan adalah bk1. <br>
   ![alt text](docs/img/P2pertanyaan1.png)

2. Bagaimana cara mengakses atribut dan method dari suatu objek?<br>
   jawab: cara memanggil atribut dan method dari suatu objek adalah dengan cara memanggil nama diikuti dengan titik (.) dan nama atribut atau nama method yang ingin dipanggil.
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?<br>
   jawab: Karena method terjual() dan gantiHarga() mengubah nilai atribut stok dan harga.<br><br>

# Percobaan 3: Membuat Konstruktor

![alt text](docs/img/P3bk.png)
![alt text](docs/img/P3bkMain.png)

## Pertanyaan

1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
   mendeklarasikan konstruktor berparameter!<br>
   jawab: pada class Buku yang menjadi konstruktor berparameter adalah **public Buku(String jud, String pg, int hal, int stok, int har) {
   judul = jud;
   pengarang = pg;
   halaman = hal;
   this.stok = stok;
   harga = har;
   }**.

2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
   ![alt text](docs/img/SoalP3.png)<br>
   jawab: baris program tersebut membuat objek baru dari class buku dengan nama bk2. objek bk2 memiliki nilai sebagai berikut: judul= Self Reward, pengarang= Maheera Ayesha, halaman= 160, stok= 29, harga= 59000.
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!<br>
   jawab: Hasilnya akan menunjukkan error. The constructor Buku() is undifined. Hal itu bisa terjadi karena tidak ada konstruktor yang cocok dengan arguen yang diberikan. <br> ![alt text](docs/img/P3pertanyaan2.png)
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses
   secara berurutan? Jelaskan alasannya!<br>
   jawab: Tidak, method di dalam class Buku tidak harus diakses secara berurutan. Akses terhadap method di dalam class Buku tidak bergantung pada urutan instansiasi object.
5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor
   berparameter dari class Buku!<br>
   jawab:![alt text](docs/img/P3pertanyaan5.png) <br><br>

# Latihan Praktikum

1. Latihan praktikum 1<br>
   ![alt text](docs/Img/Buku20new.png)<br><br>
2. Membuat program dengan nama class Dragon
   <br> **Code** <br>![alt text](docs/img/Dragon20.png)
   <br> **Output** <br>![alt text](docs/Img/OutputDragon20.png)
