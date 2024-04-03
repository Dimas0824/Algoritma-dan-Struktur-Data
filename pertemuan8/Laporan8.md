# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="33%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama : Muhammad Irsyad Dimas Abdillah </p>
<p align = "center"> Absen: 20 </p>
<p align = "center"> NIM  : 2341720088 </p>
<p align = "center"> Prodi: TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas: 1B </p>

<br><br><br>

# Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang

Code<br>

```java
package pertemuan8.fileJava;

public class Barang20 {
    int kode;
    String nama;
    String kategori;

    Barang20(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}

```

```java
package pertemuan8.fileJava;

public class Gudang20 {
    Barang20[] tumpukan;
    int size;
    int top;

    public Gudang20(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang20[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang20 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang20 ambilBarang() {
        if (!cekKosong()) {
            Barang20 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang masih kosong");
            return null;
        }
    }

    public Barang20 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang20 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}

```

```java
package pertemuan8.fileJava;

import java.util.Scanner;

public class Utama20 {
    public static void main(String[] args) {
        Gudang20 gudang = new Gudang20(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang20 barangBaru = new Barang20(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    // exit program
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}

```

Output<br>![alt text](img/otpP1.1.png) <br> ![alt text](img/otpP1.2.png)<br>

## Pertanyaan

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki? <br>
   jawab: perbaikan perlu dilakukan pada bagian methods tampilkanBarang, pada bagian perulangannya, yang awalnya menggunakan int i = 0; diganti menggunakan int i = top; agar menampilkan barang sesuai urutan stack nya. <br>
   Code

```java
public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
```

2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya! <br>
   jawab: ada 7 data barang yang dapat ditampung dalam tumpukan.<br>

```java
Gudang20 gudang = new Gudang20(7);
```

3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya? <br>
   jawab: methods tersebut berguna untuk mengecek apakah tumpukan kosong atau tidak sebelum menampilkan barang didalam tumpukan. Jika dihapus, maka proram tidak akan mengecek apakah tumpukan kosong atau ada barangnya, dan akan selalu menampilkan output "Rincian tumpukan barang di Gudang:" <br>

```java
    public void tampilkanBarang() {
        System.out.println("Rincian tumpukan barang di Gudang:");
        for (int i = top; i >= 0; i--) {
            System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                    tumpukan[i].kategori);
        }
    }
```

Output<br> ![alt text](img/soalP1.3.png)

4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!<br>
   jawab: <br>
   Code

```java
package pertemuan8.fileJava;

import java.util.Scanner;

public class Utama20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();

        Gudang20 gudang = new Gudang20(kapasitas);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang20 barangBaru = new Barang20(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;

                case 5:
                    // exit program
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
```

Output<br>![alt text](img/otpsoalP4.png)

5. Commit dan push kode program ke Github <br>
   jawab: <br>

# Percobaan 2: Penyimpanan Tumpukan Barang dalam Gudang

Code<br>

```java

```

Output<br>

# Percobaan 3: Penyimpanan Tumpukan Barang dalam Gudang

Code<br>

```java

```

Output<br>
