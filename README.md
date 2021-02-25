# Jawaban Soal

### Perbedaaan Linear, Relative, Constraint?

• Perbedaannya adalah untuk Linear Layout sebuah tampilan yang objeknya tertata dan hanya terdepat mode vertical dan horizontal (baris atau kolom) serta tidak dapat digerakkan bebas.

• Sedangkan untuk Relative Layout sebuah tampilan yang objeknya bisa ditata secara abstrak atau bebas dimanapun.

• Dan Constraint Layout hampir sama dengan Relative Layout dengan kelebihan lebih fleksibel untuk editor Android Studio dan bisa membuat tata letak yang lebih kompleks.

### Arti dari method OnCreate dan OnPause?

• OnCreate: dilakukan saat sebuah Activity baru dijalankan.

• OnPause: kondisi yang dipanggil saat ada Activity lain yang terbuka.

### Apa itu Fragment?

Fragment merupakan salah satu komponen pada Android Studio dengan fungsi yang hampir sama seperti activity tetapi memiliki “lifecycle” yang berbeda. Fragment merupakan bagian dari sebuah activity yang mana sebuah fragment tidak akan ada bila tidak ada sebuah activity karena fragment membutuhkan akses dari activity untuk dapat dijalankan.

Kelebihan yang didapatkan bila menggunakan fragment adalah sebagai berikut:

• Tidak perlu memasukkan nama file fragment ke dalam “AndroidManifest” yang diperlukan oleh activity.

• Fungsi yang berada pada activity dapat langsung digunakan dalam fragment tersebut tanpa harus membuat ulang. Contoh: pada saat back, fragment hanya perlu memanggil fungsi getactivity

### LifeCycle Fragment?

Perbedaan LifeCycle Fragment VS Activity

<img src="https://socs.binus.ac.id/files/2017/09/wi-2.jpg" width="25%" height="25%"> VS <img src="https://4.bp.blogspot.com/-OsecPY-xoo0/VvnpGNNCt3I/AAAAAAAAFNQ/rYnT3EUVYygLMh2wJ-dh7mY32AxhygcVw/s400/activity-lifecyle.png" width="50%" height="50%">

Jadi kesimpulannya adalah, Fragment tidak bisa hidup atau berdiri sendiri(standalone) . tanpa adanya minimal 1 Activity ,dan Activity dapat memuat banyak Fragment ,dan yang pasti keduanya digunakan untuk keperluan user inteface pada Aplikasi Android.

# Penjelasan Materi I-V

#### -Materi Tambahan

Untuk fitur tambahan saya menambahkan, 

• Tampilan splashscreen yang menjadikan MAIN/LAUNCHER/Activity pertama yang akan dijalankan, untuk splashscreenya saya hanya menggunakan method Intent dan menambahkan waktu untuk menambah durasi splashscreen

• Lalu saya juga menggabungkan semua Materi I-III menjadi 1 project dengan menambahkan tombol Intent kembali ke Home pada setiap Activity

![Code](https://github.com/NextDvn/S2_Materi1/blob/master/Code.PNG)

#### -Materi I

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

#### -Materi IV

Intent Result adalah sebuah komunikasi antar activity dengan racikan tambahan "SAVEDATA" yang dapat menyimpan data maupun variabel, dalam materi ini diilustrasikan sebuah activity yang didalamnya terdapat sebuah string dan sebuah tombol untuk mengganti ke variabel baru dengan menggunakan metode SAVEDATA

<img src="https://i.stack.imgur.com/Tyhf8.png" width="50%" height="50%">

#### -Materi V

Fragment adalah komponen yang memiliki fungsi untuk menampilkan antarmuka ke pengguna melalui activity dengan memiliki layout xml sendiri, Fragment digunakan agar komponen tampillan aplikasi menjadi fleksibel dan dapat digunakan kembali ( reusable). Fragment juga bisa disebut sub nya activity, satu activity bisa memiliki lebih dari satu fragment. Satu kelas Java dinyatakan sebagai sebuah fragment ketika kelas tersebut meng-extends (inherit) kelas Fragment.

![Fragment](https://miro.medium.com/max/1520/1*zkDZ_-Ekh63Nncq7AEeC6Q.png)

## Hasil ScreenShot App

### -Splash Screen

<img src="https://github.com/NextDvn/S2_Materi1/blob/master/M1_1.PNG">

### -Materi 1 [HOME]

![2](https://github.com/NextDvn/S2_Materi1/blob/master/M1_2.PNG)

### -Materi 2

![3](https://github.com/NextDvn/S2_Materi1/blob/master/M1_3.PNG)

### -Materi 3

![4](https://github.com/NextDvn/S2_Materi1/blob/master/M1_4.PNG) ![5](https://github.com/NextDvn/S2_Materi1/blob/master/M1_5.PNG)

### -Materi 4

![6](https://github.com/NextDvn/S2_Materi1/blob/master/M1_6.PNG) ![7](https://github.com/NextDvn/S2_Materi1/blob/master/M1_7.PNG) ![8](https://github.com/NextDvn/S2_Materi1/blob/master/M1_8.PNG)

### -Materi 5

![6](https://github.com/NextDvn/S2_Materi1/blob/master/M1_9.PNG) ![7](https://github.com/NextDvn/S2_Materi1/blob/master/M1_10.PNG)
