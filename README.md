# Jawaban Soal

### Perbedaaan Linear, Relative, Constraint?

• Perbedaannya adalah untuk Linear Layout sebuah tampilan yang objeknya tertata dan hanya terdepat mode vertical dan horizontal (baris atau kolom) serta tidak dapat digerakkan bebas.

• Sedangkan untuk Relative Layout sebuah tampilan yang objeknya bisa ditata secara abstrak atau bebas dimanapun.

• Dan Constraint Layout hampir sama dengan Relative Layout dengan kelebihan lebih fleksibel untuk editor Android Studio dan bisa membuat tata letak yang lebih kompleks.

### Arti dari method OnCreate dan OnPause?

• OnCreate: dilakukan saat sebuah Activity baru dijalankan.

• OnPause: kondisi yang dipanggil saat ada Activity lain yang terbuka.

# Penjelasan Materi I-III

#### -Materi Tambahan

Untuk fitur tambahan saya menambahkan, 

• Tampilan splashscreen yang menjadikan MAIN/LAUNCHER/Activity pertama yang akan dijalankan, untuk splashscreenya saya hanya menggunakan method Intent dan menambahkan waktu untuk menambah durasi splashscreen

• Lalu saya juga menggabungkan semua Materi I-III menjadi 1 project dengan menambahkan tombol Intent kembali ke Home pada setiap Activity

#### -Materi I (HOME)

LinearLayout adalah susunan tata letak yang paling simple dapat digunakan para developer android. Karena layout ini hanya memberikan susunan tata letak komponen secara garis lurus. Bisa secara horizontal maupun vertical.

![Linear](https://static.cdn-cdpl.com/source/c7a41e9ac693eba07e1b036591d95601/linearlayout.png)

#### -Materi II

Relative Layout adalah layout yang penataan nya ini adalah penataan yang menempatkan widget-widget didalamnya seperti layer, sehingga sebuah widget dapat berada di atas/di bawah widget lainnya atau dengan kata lain Relative merupakan layout yang penataannya lebih bebas (Relative) sehingga bisa di tata di mana saja.

![Relative](https://static.cdn-cdpl.com/source/c7a41e9ac693eba07e1b036591d95601/relativelayout.png)

Jadi dapat diartikan bahwa Relative Layout adalah desain tampilan pada aplikasi dengan tata letak objek atau komponen secara bebas tanpa aturan sesuai orientasi (horizontal atau vertical) seperti yang diterapkan pada Linear Layout.

#### -Materi III

Intent  adalah  mekanisme  untuk  melakukan  sebuah  action  dan  komunikasi  antar komponen aplikasi misal activity, services, dan broadcast receiver. Ada tiga penggunaan umum intent dalam aplikasi Android yaitu:
• Memindahkan satu activity ke activity lain dengan atau tidak membawa data.

•	Menjalankan background service, misalnya melakukan sinkronisasi ke server dan menjalankan proses berulang (periodic/scheduler task).

•	Mengirimkan obyek broadcast ke aplikasi yang membutuhkan. Misal, ketika aplikasi membutuhkan proses menjalankan sebuah background service setiap kali aplikasi selesai melakukan booting. Aplikasi harus bisa menerima obyek broadcast yang dikirimkan oleh sistem Android untuk event booting tersebut.

![Intent](https://miro.medium.com/max/400/1*E1lY86KKiFmkyXoLrZ1XQA.jpeg)

## Hasil ScreenShot App

### -Splash Screen

![1](https://github.com/NextDvn/S2_Materi1/blob/master/M1_1.PNG)

### -Materi 1

![2](https://github.com/NextDvn/S2_Materi1/blob/master/M1_2.PNG)

### -Materi 2

![3](https://github.com/NextDvn/S2_Materi1/blob/master/M1_3.PNG)

### -Materi 3

![4](https://github.com/NextDvn/S2_Materi1/blob/master/M1_4.PNG)

![5](https://github.com/NextDvn/S2_Materi1/blob/master/M1_5.PNG)
