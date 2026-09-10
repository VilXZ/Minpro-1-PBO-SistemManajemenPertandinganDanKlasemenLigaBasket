# Sistem Manajemen Pertandingan dan Klasemen Liga Basket

## Deskripsi Singkat Program

Program **Sistem Manajemen Pertandingan dan Klasemen Liga Basket** merupakan program berbasis Java yang digunakan untuk mengelola data dalam sebuah liga basket. Program ini memungkinkan pengguna untuk mengelola data tim, pertandingan, hasil pertandingan, dan klasemen.

Program menerapkan konsep **CRUD (Create, Read, Update, Delete)** serta menggunakan `ArrayList` untuk menyimpan data selama program berjalan. Program juga menggunakan beberapa class, yaitu `Tim`, `Pertandingan`, `HasilPertandingan`, dan `Klasemen`.

## Alur Program

Saat program dijalankan, pengguna akan diberikan menu utama yang terdiri dari beberapa pilihan:

<img width="272" height="165" alt="image" src="https://github.com/user-attachments/assets/f553d4cf-f744-40d0-bfa4-858d680d7075" />

1. **Manajemen Data Tim**
   - Menambahkan data tim.
   - Menampilkan data tim.
   - Mengubah data tim.
   - Menghapus data tim.

     <img width="267" height="159" alt="image" src="https://github.com/user-attachments/assets/22e79209-7b98-45e5-9606-19822afb8950" />
     <img width="311" height="441" alt="image" src="https://github.com/user-attachments/assets/c5bff1a3-b32d-45cc-ab75-6528dae75305" />


2. **Manajemen Pertandingan**
   - Menambahkan data pertandingan.
   - Menampilkan data pertandingan.
   - Mengubah data pertandingan.
   - Menghapus data pertandingan.
  
     <img width="392" height="700" alt="image" src="https://github.com/user-attachments/assets/822bcf61-bc86-4576-a590-a39698e77632" />


3. **Manajemen Hasil Pertandingan**
   - Menambahkan hasil pertandingan.
   - Menampilkan hasil pertandingan.
   - Mengubah hasil pertandingan.
   - Menghapus hasil pertandingan.
  
     <img width="452" height="629" alt="image" src="https://github.com/user-attachments/assets/88e31acb-23af-45aa-aa0f-f3f4afc4f8e1" />


4. **Manajemen Klasemen**
   - Menambahkan data klasemen.
   - Menampilkan data klasemen.
   - Mengubah data klasemen.
   - Menghapus data klasemen.
  
     <img width="509" height="758" alt="image" src="https://github.com/user-attachments/assets/e538a8e8-a4f3-4103-87a6-e6c8177ac9ea" />


5. **Keluar**
   - Mengakhiri program.

Pengguna memilih menu dengan memasukkan nomor pilihan melalui `Scanner`. Setiap menu memiliki submenu untuk melakukan proses CRUD. Program menggunakan perulangan sehingga menu akan terus ditampilkan dan dapat digunakan kembali sampai pengguna memilih pilihan **Keluar**.

Data yang dimasukkan pengguna akan disimpan ke dalam `ArrayList` sesuai dengan jenis datanya. Data tim disimpan pada `ArrayList<Tim>`, data pertandingan pada `ArrayList<Pertandingan>`, data hasil pertandingan pada `ArrayList<HasilPertandingan>`, dan data klasemen pada `ArrayList<Klasemen>`.
