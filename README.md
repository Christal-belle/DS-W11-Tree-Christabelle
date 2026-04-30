4.3h Kapan Pre-order dan Breadth-first Traversal Memberikan Hasil yang Sama?

Hasil dari Pre-order Traversal dan Breadth-first Traversal akan sama jika dan hanya jika pohon tersebut berbentuk seperti garis lurus ke bawah karena tidak ada node ke samping, maka urutan "mendalam" dan urutan "melebar" akan melewati jalur yang sama persis, yaitu satu demi satu node dari atas ke bawah.


4.3i Analisis Struktur Direktori 

Bayangkan sebuah folder (directory) sebagai node pohon, dan file di dalamnya sebagai isi dari node tersebut. Kita punya n direktori dan N file.

a. Berapa waktu (run time) untuk mencetak semua nama direktori?
Waktunya adalah O(n) karena kita harus mengunjungi setiap direktori tepat satu kali untuk mencetak namanya, maka waktu yang dibutuhkan sebanding dengan jumlah direktori (n).

b. Berapa waktu (run time) untuk mencetak semua nama file?
Waktunya adalah O(n + N).
Untuk mencetak semua file, sistem harus:
    1.  Membuka/mengunjungi semua direktori (n).
    2.  Membaca dan mencetak setiap file yang ada di dalamnya (N).
    Jadi, total pekerjaannya adalah jumlah direktori ditambah jumlah file.
