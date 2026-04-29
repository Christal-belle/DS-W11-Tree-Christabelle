4.3h Kapan Pre-order dan Breadth-first Traversal Memberikan Hasil yang Sama?

Hasil dari Pre-order Traversal dan Breadth-first Traversal akan sama jika dan hanya jika pohon tersebut berbentuk seperti garis lurus ke bawah karena tidak ada node ke samping, maka urutan "mendalam" dan urutan "melebar" akan melewati jalur yang sama persis, yaitu satu demi satu node dari atas ke bawah.


4.3i Analisis Struktur Direktori 

Bayangkan sebuah folder (*directory*) sebagai node pohon, dan file di dalamnya sebagai isi dari node tersebut. Kita punya $n$ direktori dan $N$ file.

#### a. Berapa waktu (run time) untuk mencetak semua nama direktori?
Waktunya adalah **$\Theta(n)$**.
* **Penjelasan:** Karena kita harus mengunjungi setiap direktori tepat satu kali untuk mencetak namanya, maka waktu yang dibutuhkan sebanding dengan jumlah direktori ($n$).

#### b. Berapa waktu (run time) untuk mencetak semua nama file?
Waktunya adalah **$\Theta(n + N)$**.
* **Penjelasan:** Untuk mencetak semua file, sistem harus:
    1.  Membuka/mengunjungi semua direktori ($n$).
    2.  Membaca dan mencetak setiap file yang ada di dalamnya ($N$).
    Jadi, total pekerjaannya adalah jumlah direktori ditambah jumlah file.

#### c. Bagaimana jawaban bagian (b) berubah jika diketahui $N = \Omega(n)$?
Waktunya menjadi **$\Theta(N)$**.
* **Penjelasan:** Simbol $\Omega(n)$ artinya jumlah file ($N$) jauh lebih banyak atau setidaknya sebanding dengan jumlah direktori ($n$).
* Dalam analisis algoritma (Big-O), jika $N$ jauh lebih mendominasi daripada $n$, kita hanya mengambil variabel yang paling besar/berpengaruh. Karena jumlah file jauh lebih banyak, maka waktu untuk memproses file akan menutupi waktu untuk membuka direktori.

---

**Ringkasan Sederhana:**
* Pohon lurus = Hasil traversal sama.
* Cetak direktori = Tergantung jumlah direktori ($n$).
* Cetak file = Tergantung jumlah direktori + file ($n + N$).
* Jika file sangat banyak ($N > n$) = Tergantung jumlah file saja ($N$).