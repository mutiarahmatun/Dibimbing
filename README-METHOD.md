# 📘 Method di Java

## ❓ Apa itu Method?

**Method** adalah blok kode di dalam sebuah class yang digunakan untuk melakukan tugas tertentu.

Method mirip dengan function, tetapi dalam Java:

* Method selalu berada di dalam **class**
* Method merupakan bagian dari konsep **Object-Oriented Programming (OOP)**

---

## ☕ Analogi Sederhana

Bayangkan method seperti **tombol pada remote TV**:

* Remote TV = Object
* Tombol = Method

Contoh:

* Tombol Volume Up → `tambahVolume()`
* Tombol Channel Next → `gantiChannel()`
* Tombol Power → `nyalakanTV()`

Setiap tombol memiliki fungsi spesifik, dan pengguna cukup menekan tombol tanpa perlu mengetahui proses di dalamnya.

---

## 🔍 Perbedaan Function vs Method

| Aspek         | Function                     | Method                  |
| ------------- | ---------------------------- | ----------------------- |
| Lokasi        | Berdiri sendiri (procedural) | Bagian dari class (OOP) |
| Pemanggilan   | Langsung dengan nama         | Melalui object/class    |
| Contoh Bahasa | C, Pascal                    | Java, Python, C++       |
| Di Java       | Tidak ada function murni     | Semua disebut method    |

📌 **Catatan:**
Di Java, semua function sebenarnya adalah method karena Java merupakan bahasa berbasis OOP.

---

## 🧠 Kenapa Method Penting?

* Membuat kode lebih **terstruktur**
* Mendukung konsep **OOP (Object-Oriented Programming)**
* Memudahkan **reuse code**
* Mempermudah **maintenance dan debugging**

---

## ⚙️ Contoh Sederhana Method

```java
public class Mobil {

    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan...");
    }

    public static void main(String[] args) {
        Mobil m = new Mobil(); // membuat object
        m.nyalakanMesin();     // memanggil method
    }
}
```

---

## 🔄 Cara Kerja Method

1. Program dijalankan dari `main()`
2. Object dibuat dari class
3. Method dipanggil melalui object
4. Method menjalankan kode di dalamnya
5. (Opsional) Method mengembalikan nilai

---

## 📌 Kesimpulan

* Method adalah function yang berada di dalam class
* Digunakan untuk menjalankan tugas tertentu
* Merupakan bagian penting dalam OOP
* Membantu membuat kode lebih rapi dan reusable

---

## 🚀 Next Step

Setelah memahami konsep method, selanjutnya dapat mempelajari:

* Jenis-jenis method (static vs non-static)
* Method dengan parameter & return value
* Method overloading

---

## 1. Method Tanpa Parameter dan Tanpa Return Value (void)

### 📌 Definisi

Method yang tidak menerima input dan tidak mengembalikan nilai.

---

### 🔍 Karakteristik

* Menggunakan keyword `void`
* Tidak memiliki parameter
* Tidak mengembalikan nilai (`return`)
* Biasanya digunakan untuk menampilkan informasi atau menjalankan aksi

---

### 🧾 Syntax

```java id="z9h2ks"
public void namaMethod() {
    // kode yang akan dijalankan
}
```

---

### 💡 Contoh

```java id="p1z4yt"
public void tampilkanHeader() {
    System.out.println("==============================");
    System.out.println("   PROGRAM BELAJAR JAVA - METHOD   ");
    System.out.println("==============================");
}

public void cetakPesanSelamatDatang() {
    System.out.println("Selamat datang di kelas pemrograman!");
    System.out.println("Mari belajar tentang Method di Java");
}

public void tampilkanTanggalHariIni() {
    System.out.println("Tanggal: 1 Februari 2026");
    System.out.println("Hari: Minggu");
}
```

---

### ▶️ Cara Memanggil

```java id="9d3v1x"
TestMethod test = new TestMethod();

test.tampilkanHeader();
test.cetakPesanSelamatDatang();
test.tampilkanTanggalHariIni();
```

---

### 📌 Kapan Digunakan

* Menampilkan informasi statis
* Menjalankan aksi tanpa perlu hasil
* Logging sederhana
* Menampilkan UI/console output

---

## 2. Method Dengan Parameter Tanpa Return Value (void)

### 📌 Definisi

Method yang menerima input (parameter) tetapi tidak mengembalikan nilai.

---

### 🔍 Karakteristik

* Menggunakan keyword `void`
* Memiliki parameter
* Tidak mengembalikan nilai
* Output biasanya langsung ditampilkan

---

### 🧾 Syntax

```java id="o6w2rn"
public void namaMethod(TipeData param1, TipeData param2) {
    // proses menggunakan parameter
}
```

---

### 💡 Contoh

```java id="a7y2nm"
public void sapaUser(String nama) {
    System.out.println("Halo, " + nama + "!");
}

public void tampilkanNilai(int nilai) {
    System.out.println("Nilai Anda: " + nilai);
}

public void tampilkanStatusLulus(int nilai) {
    if (nilai >= 75) {
        System.out.println("Status: LULUS");
    } else {
        System.out.println("Status: TIDAK LULUS");
    }
}
```

---

### ▶️ Cara Memanggil

```java id="d1s8kp"
TestMethod test = new TestMethod();

test.sapaUser("Mutia");
test.tampilkanNilai(88);
test.tampilkanStatusLulus(60);
```

---

### 📌 Kapan Digunakan

* Menampilkan informasi dinamis
* Memproses input tanpa return value
* Validasi yang langsung ditampilkan
* Output langsung ke user

---

## 3. Method Dengan Parameter dan Return Value

### 📌 Definisi

Method yang menerima input (parameter) dan mengembalikan hasil (return value).

---

### 🔍 Karakteristik

* Memiliki parameter
* Menggunakan `return`
* Menghasilkan nilai
* Bisa digunakan dalam kondisi atau perhitungan lanjutan

---

### 🧾 Syntax

```java id="q2f9wr"
public TipeDataReturn namaMethod(TipeData param1, TipeData param2) {
    // proses
    return hasil;
}
```

---

### 💡 Contoh

```java id="k3v7yx"
public int hitungTotal(int a, int b) {
    return a + b;
}

public boolean isLulus(int nilai) {
    return nilai >= 75;
}

public String getGrade(int nilai) {
    if (nilai >= 85) return "A";
    else if (nilai >= 75) return "B";
    else return "D";
}
```

---

### ▶️ Cara Memanggil

```java id="l8p2zn"
TestMethod test = new TestMethod();

int total = test.hitungTotal(10, 5);
boolean status = test.isLulus(80);
String grade = test.getGrade(88);

System.out.println(total);
System.out.println(status);
System.out.println(grade);
```

---

### 📌 Kapan Digunakan

* Perhitungan matematika
* Validasi (boolean)
* Pengambilan data (getter)
* Pengolahan data
* Digunakan dalam kondisi (if/loop)

---

## 🧠 Kesimpulan

* Method tanpa parameter → sederhana dan statis
* Method dengan parameter → fleksibel
* Method dengan return → menghasilkan nilai dan reusable
* Pemilihan jenis method menentukan struktur program

---

## 🔁 Method Overloading

### ❓ Apa itu Method Overloading?

Method Overloading adalah kemampuan untuk membuat beberapa method dengan nama yang sama tetapi dengan parameter yang berbeda dalam satu class.

---

### ⭐ Mengapa Method Overloading Penting?

* ✅ **Konsistensi Penamaan** → Tidak perlu banyak nama method berbeda
* ✅ **Fleksibilitas** → Satu method bisa menangani berbagai jenis input
* ✅ **Readability** → Kode lebih mudah dibaca dan dipahami
* ✅ **User-Friendly** → API lebih mudah digunakan

---

### 📏 Aturan Method Overloading

Method dianggap overloading jika:

1. ✅ Nama method **SAMA**
2. ✅ Jumlah parameter **BERBEDA**, atau
3. ✅ Tipe data parameter **BERBEDA**, atau
4. ✅ Urutan parameter **BERBEDA**

---

### ⚠️ Penting

* Return type **TIDAK menentukan overloading**

```java
// ❌ TIDAK VALID (hanya beda return type)

public int hitung(int a) {
    return a;
}

public double hitung(int a) {
    return a;
}
```

---

### 🧾 Syntax

```java id="y7k2sd"
public TipeData namaMethod(TipeData param1) {
    // versi 1
}

public TipeData namaMethod(TipeData param1, TipeData param2) {
    // versi 2
}
```

---

### 💡 Contoh

#### 1. Overloading Berdasarkan Jumlah Parameter

```java
// Method 1 parameter → luas persegi
public int hitung(int sisi) {
    System.out.println("Menghitung luas persegi");
    return sisi * sisi;
}

// Method 2 parameter → luas persegi panjang
public int hitung(int panjang, int lebar) {
    System.out.println("Menghitung luas persegi panjang");
    return panjang * lebar;
}

// Method 3 parameter → volume balok
public int hitung(int panjang, int lebar, int tinggi) {
    System.out.println("Menghitung volume balok");
    return panjang * lebar * tinggi;
}
```

---

### 🧠 Penjelasan

Java akan menentukan method mana yang dipanggil berdasarkan **jumlah argument**:

* `hitung(5)` → method 1 parameter
* `hitung(8, 6)` → method 2 parameter
* `hitung(10, 5, 4)` → method 3 parameter

---

#### 2. Overloading Berdasarkan Tipe Data

```java id="q4m8zn"
public int tambah(int a, int b) {
    return a + b;
}

public double tambah(double a, double b) {
    return a + b;
}
```

---

#### 3. Overloading Berdasarkan Urutan Parameter

```java id="l9v3yt"
public void tampilkan(String nama, int umur) {
    System.out.println("Nama: " + nama + ", Umur: " + umur);
}

public void tampilkan(int umur, String nama) {
    System.out.println("Umur: " + umur + ", Nama: " + nama);
}
```

---

### ▶️ Cara Memanggil

```java id="d8w2kp"
TestMethod test = new TestMethod();

System.out.println(test.tambah(5, 3));
System.out.println(test.tambah(5, 3, 2));

System.out.println(test.tambah(2.5, 3.5));

test.tampilkan("Mutia", 26);
test.tampilkan(26, "Mutia");
```

---

### 📌 Kapan Digunakan

* Saat ingin menggunakan **nama method yang sama** untuk berbagai kebutuhan
* Untuk meningkatkan **readability kode**
* Untuk menangani berbagai jenis input tanpa membuat banyak nama method
* Saat membuat API yang lebih fleksibel

---

### ❌ Hal yang Tidak Termasuk Overloading

```java id="x2p8sn"
public int tambah(int a, int b) {
    return a + b;
}

public int tambah(int x, int y) { // ❌ ERROR (parameter sama)
    return x + y;
}
```

👉 Parameter harus benar-benar berbeda, bukan hanya beda nama variabel.

---

### 🧠 Kesimpulan

* Method overloading memungkinkan satu nama method memiliki banyak versi
* Perbedaan harus ada di parameter
* Membuat kode lebih fleksibel dan mudah dibaca
