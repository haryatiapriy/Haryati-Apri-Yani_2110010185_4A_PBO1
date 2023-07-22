# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama mobil,warna,dan tahun produksi dan memberikan output berupa informasi detail dari tahun produksi tersebut seperti tipe dan transmisi 

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `MobilBeraksi`, dan `MobilDetail` adalah contoh dari class.

```bash
public class Mobil {
    ...
}

public class MobilDetail extends Mobil {
    ...
}

public class MobilBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mbl[i] = new MobilDetail(nama, warna, tahun);` adalah contoh pembuatan object.

```bash
mbl[i] = new MobilDetail(nama, warna, tahun);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` 'warna' dan `tahun` adalah contoh atribut.

```bash
String nama;
String warna;
String tahun;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil` dan `MobilDetail`.

```bash
public Mobil(String nama, String warna, String tahun) {
    this.nama = nama;
    this.warna = warna;
    this.tahun = tahun;
}

public MobilDetail(String nama, String warna, String tahun) {
    super(nama, warna, tahun);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` `setWarna` dan `setNpm` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setWarna(String warna) {
    this.warna = warna;
}

public void setTahun(String tahun){
  this.tahun = tahun;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getWarna`, `getTahun`, `getTipe`, `getTransmisi`, adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getWarna() {
    return warna;
}

public String getWarna() {
    return warna;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `warna ` dan `tahun` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String warna;
private String tahun;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MobilDetail` mewarisi `Mobil` dengan sintaks `extends`.

```bash
public class MobilDetail extends Mobil {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mobil` merupakan overloading method `displayInfo` dan `displayInfo` di `MobilDetail` merupakan override dari method `displayInfo` di `Mobil`.

```bash
public String displayInfo(String Tipe) {
    return displayInfo() + "\ntipe: " + tipe;
}

@Override
public String displayInfo() {
    ...
}
```


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
|     | **TOTAL**      | **50** |

## Pembuat

Nama: Haryati Apri Yani
NPM: 2110010185
