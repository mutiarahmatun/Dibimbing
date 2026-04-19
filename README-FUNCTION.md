# 📘 Function di Java

## ❓ Apa itu Function?

**Function (atau Method dalam Java)** adalah blok kode yang dirancang untuk melakukan tugas tertentu dan dapat digunakan berulang kali tanpa perlu menulis ulang kode yang sama.

Dengan menggunakan function, program menjadi lebih efisien, terstruktur, dan mudah untuk dikelola.

---

## ☕ Analogi Sederhana

Bayangkan function seperti **mesin kopi otomatis**:

- Pengguna memberikan input (kopi, gula, susu)  
- Mesin memproses input tersebut  
- Mesin menghasilkan output (kopi yang sudah jadi)  

Pengguna tidak perlu mengetahui bagaimana proses di dalam mesin bekerja, cukup memahami cara menggunakannya.

---

## 🎯 Mengapa Function Penting?

### 1. ♻️ Reusability (Dapat Digunakan Kembali)

Tanpa function (kode berulang):
```java
System.out.println("Halo, Budi!");
System.out.println("Halo, Ani!");
System.out.println("Halo, Citra!");
```

Dengan function (lebih efisien):
```java
public static void sapaNama(String nama) {
    System.out.println("Halo, " + nama + "!");
}
```

Pemanggilan:
```java
sapaNama("Budi");
sapaNama("Ani");
sapaNama("Citra");
```

Dengan function, kode menjadi lebih ringkas dan tidak perlu ditulis berulang.

---

### 2. 🔧 Maintainability (Mudah Dipelihara)

Jika terjadi perubahan, cukup dilakukan di satu tempat (di dalam function), tanpa harus mengubah banyak bagian kode.

---

### 3. 📖 Readability (Mudah Dibaca)

Kode menjadi lebih terstruktur dan mudah dipahami karena setiap function memiliki tanggung jawab tertentu.

---

### 4. 🐞 Debugging Lebih Mudah

Kesalahan (error) lebih mudah dilacak karena kode terpisah dalam function yang spesifik.

---

### 5. 🤝 Teamwork

Dalam pengembangan tim, setiap anggota dapat fokus pada function tertentu, sehingga kolaborasi menjadi lebih efektif.

---

## 🧠 Kesimpulan

Function membantu:
- Mengurangi pengulangan kode  
- Membuat kode lebih rapi dan terstruktur  
- Mempermudah perawatan dan pengembangan program  
- Mendukung kerja tim dalam pengembangan software  

---

# 📘 Jenis-Jenis Function di Java

## 1. Function Tanpa Parameter dan Tanpa Return Value (void)

### Definisi

Function yang tidak menerima input dan tidak mengembalikan nilai.

### Syntax

```java
public void namaFunction() {
    // kode yang akan dijalankan
}
```

### Contoh

```java
public void tampilkanSalam() {
    System.out.println("Selamat datang di Program Java!");
    System.out.println("Semoga hari Anda menyenangkan 😊");
}

public void tampilkanGaris() {
    System.out.println("====================================");
}

public void tampilkanInfoSekolah() {
    System.out.println("Nama Sekolah: Sekolah Coding Indonesia");
    System.out.println("Alamat: Jl. Pemrograman No. 123");
    System.out.println("Telepon: (021) 12345678");
}
```

### Cara Memanggil

```java
tampilkanSalam();
tampilkanGaris();
tampilkanInfoSekolah();
```

### Kapan Digunakan

* Menampilkan pesan/informasi statis
* Membersihkan layar
* Inisialisasi tanpa parameter
* Logging sederhana

---

## 2. Function Dengan Parameter Tanpa Return Value (void)

### Definisi

Function yang menerima input (parameter) tapi tidak mengembalikan nilai.

### Syntax

```java
public void namaFunction(TipeData parameter1, TipeData parameter2) {
    // kode yang menggunakan parameter
}
```

### Contoh

```java
public void sapaNama(String nama) {
    System.out.println("Halo, " + nama + "! Selamat belajar Java!");
}

public void tampilkanBiodata(String nama, int umur, String kota) {
    System.out.println("=== BIODATA ===");
    System.out.println("Nama  : " + nama);
    System.out.println("Umur  : " + umur + " tahun");
    System.out.println("Kota  : " + kota);
    System.out.println("================");
}

public void hitungLuasPersegiPanjang(int panjang, int lebar) {
    int luas = panjang * lebar;
    System.out.println("Persegi panjang dengan panjang " + panjang + " cm dan lebar " + lebar + " cm");
    System.out.println("Luas = " + luas + " cm2");
}
```

### Cara Memanggil

```java
sapaNama("Budi");
sapaNama("Ani");

tampilkanBiodata("Citra", 20, "Jakarta");
tampilkanBiodata("Doni", 22, "Bandung");

hitungLuasPersegiPanjang(10, 5);
hitungLuasPersegiPanjang(8, 6);
```

### Kapan Digunakan

* Menampilkan informasi yang dinamis
* Proses tanpa perlu mengembalikan nilai
* Mencetak laporan dengan data yang berbeda
* Update data (Setter methods)

---

## 3. Function Dengan Parameter dan Return Value

### 📌 Definisi

Function yang menerima input (parameter) dan mengembalikan hasil (return value).

---

### 🧾 Syntax

```java
public TipeDataReturn namaFunction(TipeData parameter1, TipeData parameter2) {
    // proses
    return hasil;
}
```

---

### 💡 Contoh Sederhana

```java
public int tambah(int a, int b) {
    return a + b;
}
```

---

## 🔁 Contoh Return Berdasarkan Tipe Data di Java

### 1. 🔢 int

```java
public int getAngka() {
    return 10;
}
```

---

### 2. 🔢 double

```java
public double getNilaiDouble() {
    return 3.14;
}
```

---

### 3. 🔡 char

```java
public char getHuruf() {
    return 'A';
}
```

---

### 4. ✅ boolean

```java
public boolean isLogin() {
    return true;
}
```

---

### 5. 🔤 String (Non-Primitive)

```java
public String getNama() {
    return "Mutia";
}
```

---

### 6. 🔢 long

```java
public long getLongValue() {
    return 100000L;
}
```

---

### 7. 🔢 float

```java
public float getFloatValue() {
    return 5.5f;
}
```

---

### 8. 🔢 short

```java
public short getShortValue() {
    return 100;
}
```

---

### 9. 🔢 byte

```java
public byte getByteValue() {
    return 10;
}
```

---

## 🧪 Contoh Penggunaan

```java
public class Main {

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.getAngka());
        System.out.println(obj.getNilaiDouble());
        System.out.println(obj.getHuruf());
        System.out.println(obj.isLogin());
        System.out.println(obj.getNama());
    }

    public int getAngka() {
        return 10;
    }

    public double getNilaiDouble() {
        return 3.14;
    }

    public char getHuruf() {
        return 'A';
    }

    public boolean isLogin() {
        return true;
    }

    public String getNama() {
        return "Mutia";
    }
}
```

---

## 📌 Kapan Digunakan

Function dengan return value digunakan ketika program membutuhkan hasil dari suatu proses untuk digunakan kembali.

Beberapa kasus penggunaannya:

* **Perhitungan matematika**
  Contoh: menghitung luas, total harga, diskon, dll

* **Validasi data (boolean)**
  Contoh: mengecek apakah user login, input valid, dll

* **Konversi data**
  Contoh: konversi suhu, tipe data, format string

* **Pengambilan data (getter method)**
  Contoh: mengambil nilai dari object atau database

* **Pengolahan data**
  Contoh: mengolah input menjadi output baru

* **Digunakan dalam kondisi (if/loop)**
  Contoh:

  ```java
  if (isLogin()) {
      System.out.println("Welcome!");
  }
  ```

* **Digunakan untuk assignment ke variabel**

  ```java
  int total = hitungTotal(10000, 2000);
  ```

* **Chaining antar method (logic berantai)**
  Method satu digunakan sebagai input method lain


---

## 🧠 Kesimpulan

* Function dengan return value digunakan untuk **menghasilkan nilai**
* Return type harus sesuai dengan tipe data yang dikembalikan
* Membantu membuat program lebih fleksibel dan reusable

---

## ⚙️ Cara Kerja Function

### 🧩 Struktur Function

```java
[modifier] [returnType] namaFunction([parameters]) {
    // body function
    return value; // jika ada return type
}
```

---

### 📖 Penjelasan

* **modifier**: public, private, protected, static
* **returnType**: void, int, double, String, boolean, dll
* **namaFunction**: nama yang mendeskripsikan fungsi
* **parameters**: input yang diterima (bisa 0, 1, atau lebih)
* **body**: kode yang dijalankan
* **return**: nilai yang dikembalikan (jika bukan void)

---

### 🔄 Alur Eksekusi Function

```java
public class Contoh {

    public static void main(String[] args) {
        int hasil = tambah(5, 3); // memanggil function
        System.out.println("Hasil: " + hasil);
    }

    public static int tambah(int a, int b) {
        int hasil = a + b; // proses
        return hasil; // dikembalikan ke pemanggil
    }
}
```

---

### 🧠 Penjelasan Alur

1. Program dimulai dari `main()`
2. Function `tambah(5, 3)` dipanggil
3. Nilai `5` dan `3` dikirim sebagai parameter
4. Function menjalankan proses (`a + b`)
5. Hasil dikembalikan (`return`)
6. Nilai disimpan ke variabel `hasil`
7. Ditampilkan ke layar

---

## 🏷️ Penamaan Function yang Baik

Penamaan function sangat penting karena akan mempengaruhi **readability** dan kemudahan memahami kode.

Function yang baik seharusnya langsung menjelaskan **apa yang dilakukan**.

---

### 📌 Prinsip Penamaan

* Gunakan **kata kerja (verb)** di awal
  Contoh: `hitungTotal()`, `getUserData()`, `validateLogin()`

* Gunakan **camelCase**
  Contoh: `hitungLuasPersegi()`

* Gunakan nama yang **jelas dan deskriptif**
  ❌ `fn1()`
  ❌ `proses()`
  ✅ `hitungDiskon()`
  ✅ `cekStatusLogin()`

---

### ✅ Contoh yang Baik

```java
public int hitungTotalHarga(int harga, int jumlah) {
    return harga * jumlah;
}

public boolean isUserLogin() {
    return true;
}

public String getNamaUser() {
    return "Mutia";
}
```

---

### ❌ Contoh yang Kurang Baik

```java
public int a(int x, int y) {
    return x * y;
}

public boolean cek() {
    return true;
}
```

---

### 📌 Tips Tambahan

* `get` → mengambil data → `getNama()`

* `set` → mengubah data → `setNama()`

* `is` / `has` → boolean → `isValid()`

* Gunakan **single responsibility** (1 function = 1 tugas)

---

### 🧠 Kesimpulan

Penamaan function yang baik akan:

* Membuat kode lebih mudah dibaca
* Memudahkan debugging
* Mempermudah kolaborasi tim
