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

## 💡 Contoh Method Overloading

### 1. Overloading Berdasarkan Jumlah Parameter

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

### 2. Overloading dengan void (Tanpa Return Value)

```java
// 1 parameter
public void tampilkanInfo(String nama) {
    System.out.println("Nama: " + nama);
}

// 2 parameter
public void tampilkanInfo(String nama, int umur) {
    System.out.println("Nama: " + nama);
    System.out.println("Umur: " + umur + " tahun");
}

// 3 parameter
public void tampilkanInfo(String nama, int umur, String kota) {
    System.out.println("Nama: " + nama);
    System.out.println("Umur: " + umur + " tahun");
    System.out.println("Kota: " + kota);
}
```

---

### ▶️ Cara Memanggil

```java
MethodTest test = new MethodTest();

// Overloading hitung
System.out.println(test.hitung(5));
System.out.println(test.hitung(8, 6));
System.out.println(test.hitung(10, 5, 4));

// Overloading tampilkanInfo
test.tampilkanInfo("Mutia");
test.tampilkanInfo("Mutia", 26);
test.tampilkanInfo("Mutia", 26, "Jakarta");
```

---

### 📌 Kapan Digunakan

* Saat satu aksi memiliki **beberapa variasi input**
* Saat ingin menjaga **nama method tetap konsisten**
* Saat membuat API yang fleksibel
* Saat menghindari terlalu banyak nama method berbeda

---

## 🧠 Kesimpulan

* Method overloading = satu nama, banyak versi
* Perbedaan harus di parameter
* Return type tidak mempengaruhi overloading
* Membuat kode lebih clean, fleksibel, dan mudah dipahami
