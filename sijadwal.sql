-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2018 at 12:23 PM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sijadwal`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id_dosen` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `nomor` varchar(50) NOT NULL,
  `users_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`id_dosen`, `nama`, `nomor`, `users_id`) VALUES
(6, 'Rangga Sidik S.Kom', '081', 1),
(7, 'Lusi Melian', '081', 1),
(8, 'Erna Susilawati', '081', 1),
(9, 'Mia Fitriawati', '081', 1),
(10, 'Myra Dwirahmatya', '081', 1),
(11, 'Annisa Paratmitha Fadilah', '081', 1),
(12, 'Julian Chandra Wibawa', '081', 1),
(13, 'PHP Indonesia', '081', 1),
(14, 'Ruby On Rails', '081', 1);

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `id_kelas` int(11) NOT NULL,
  `nama_kelas` varchar(20) NOT NULL,
  `users_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `nama_kelas`, `users_id`) VALUES
(11, 'SO-4', 1),
(12, 'MENSA-5', 1),
(13, 'KEB-5', 1),
(14, 'BD-5', 1),
(15, 'LBD.1-5', 1),
(16, 'APBO-5', 1),
(17, 'LP2-6', 1),
(18, 'PHP Indonesia', 1),
(19, 'test', 1);

-- --------------------------------------------------------

--
-- Table structure for table `list_days`
--

CREATE TABLE `list_days` (
  `id_days` int(11) NOT NULL,
  `hari` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `list_days`
--

INSERT INTO `list_days` (`id_days`, `hari`) VALUES
(5, 'Jum\'at'),
(4, 'Kamis'),
(7, 'Minggu'),
(3, 'Rabu'),
(6, 'Sabtu'),
(2, 'Selasa'),
(1, 'Senin');

-- --------------------------------------------------------

--
-- Table structure for table `materi`
--

CREATE TABLE `materi` (
  `id_materi` int(11) NOT NULL,
  `judul_materi` varchar(50) NOT NULL,
  `isi_materi` text NOT NULL,
  `users_id` int(11) NOT NULL,
  `matkul_id` int(11) NOT NULL,
  `tgl_input` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `materi`
--

INSERT INTO `materi` (`id_materi`, `judul_materi`, `isi_materi`, `users_id`, `matkul_id`, `tgl_input`) VALUES
(1, 'Materi Pertemuan Awal', '&lt;p&gt;Sains Manajemen Adalah peneapan ilmiah yang menggunakan perangkat dan metode matematika untuk memecahkan masalah manajemen dalam rangka membantu manajer dan pimpinan serta pihak manajemen menggunakan teknik matematika, statistic ilmu-ilmu murni, dan perekayasaan (Bernard W. Taylor, Sains Manajemen 2001)&lt;/p&gt;\r\n\r\n&lt;p&gt;Contoh Penyelesaian Soal :&lt;/p&gt;\r\n\r\n&lt;p&gt;Seorang Petani menyiapkan lahan untuk menanam pada musim semi dan membutuhkan pemupukan lahan tersebut, terdapat dua merk pupuk untuk di pilih yaitu super-Gro dan Crop-Quick, setiap pupuk menghasilkan jumlah nitrogen dan fosfat tertentu sebagai berikut :&lt;/p&gt;\r\n\r\n&lt;table align=&quot;center&quot; border=&quot;1&quot; cellpadding=&quot;1&quot; cellspacing=&quot;1&quot; style=&quot;width:500px&quot;&gt;\r\n	&lt;thead&gt;\r\n		&lt;tr&gt;\r\n			&lt;th scope=&quot;col&quot;&gt;Merk Pupuk&lt;/th&gt;\r\n			&lt;th colspan=&quot;2&quot; rowspan=&quot;1&quot; scope=&quot;col&quot;&gt;Kontribusi Kimia&lt;/th&gt;\r\n		&lt;/tr&gt;\r\n	&lt;/thead&gt;\r\n	&lt;tbody&gt;\r\n		&lt;tr&gt;\r\n			&lt;td&gt;&amp;nbsp;&lt;/td&gt;\r\n			&lt;td&gt;&lt;strong&gt;Nitrogen&lt;/strong&gt;&lt;/td&gt;\r\n			&lt;td&gt;&lt;strong&gt;Fosfat&lt;/strong&gt;&lt;/td&gt;\r\n		&lt;/tr&gt;\r\n		&lt;tr&gt;\r\n			&lt;td&gt;Super Gro&lt;/td&gt;\r\n			&lt;td&gt;2 pon / sak&lt;/td&gt;\r\n			&lt;td&gt;4 pon / sak&lt;/td&gt;\r\n		&lt;/tr&gt;\r\n		&lt;tr&gt;\r\n			&lt;td&gt;Crop Quick&lt;/td&gt;\r\n			&lt;td&gt;4 pon / sak&lt;/td&gt;\r\n			&lt;td&gt;3 pon / sak&lt;/td&gt;\r\n		&lt;/tr&gt;\r\n	&lt;/tbody&gt;\r\n&lt;/table&gt;\r\n\r\n&lt;p&gt;Lahan petani memerlukan paling sedikit 16 pon nitrogen dan 24 pon fosfat. Super Gro berharga $6 per sak dan Crop-Quick berharga $3 per sak. Petani Ingin Mengethaui Berapa banyak kantong dari setiap merk uang akan di belum untuk meminimumkan total biaya pemupukan.&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Variabel Keputusan &lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;Penguraian keputusan menjadi sebuah variabel, &lt;span class=&quot;math-tex&quot;&gt;\\(x^1,x^2\\)&lt;/span&gt; variabel tersebut ada perwakilan dari total pembelian 2 merk pupuk tersebut, yang pertama untuk SG dan yang kedua untuk CQ, dan variable tersebut berlaku turunannya.&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(x^1\\)&lt;/span&gt; =&amp;nbsp; Super Gro&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(x^2\\)&lt;/span&gt; =&amp;nbsp; Quick Crop&lt;/p&gt;\r\n\r\n&lt;p&gt;maka dapat di formulasikan, jika harga Super Gro $6 / sak dan Harga Quick Crop $3/sak maka :&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(6.x^1 + 3.x^2\\)&lt;/span&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;Rumus tersebut tinggal diisi data misalkan petani membeli 5 SG dan 5 CQ maka $6.(5) + $3.(5) = $45,itu artinya jika petani membeli 5 CQ dan SG petani akan mengeluarkan uang $45&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Batasan&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;Di dalam soal tersebut ada minimum Fosfat dan Nitrogen itu lah batasannya jadi kita tidak sembarangan memasukan nilai karena ada batasan yang harus diperhatikan, kita asumsikan petani membeli 5 CQ dan SG maka untuk menghitung berapa Nitrogen dan Fosfat maka di gunakanlah formulasi batasan sebagai berikut :&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(2.x^1 + 4.x^2 \\geq 16\\)&lt;/span&gt;&amp;nbsp; = Formulasi untuk menghitung total nitrogen&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(4.x^1 + 3.x^2 \\geq 24\\)&lt;/span&gt; = Fromulasi untuk menghitung total fosfat&lt;/p&gt;\r\n\r\n&lt;p&gt;di dalam formulasi tersebut tercantum bahwa nitrogen yang terkandung tidak boleh kurang dari 16 dan fosfat yang terkandung tidak boleh dari 24.&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Batasan Tanda&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;Ketika kita membeli barang tidak mungkin kita akan membeli sebanyak -1 kan, maka dari itu ada batasan tanda untuk membatasi nilai minimum yang kita beli&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(x^1 \\geq 0\\)&lt;/span&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(x^2 \\geq 0\\)&lt;/span&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;yang artinya x tidak boleh bernilai -1, harus minimal 0&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Penulisan Jawaban : &lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(6.x^1 + 3.x^2\\)&lt;/span&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(2.x^1 + 4.x^2 \\geq 16\\)&lt;/span&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(4.x^1 + 3.x^2 \\geq 24\\)&lt;/span&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(x^1 \\geq 0\\)&lt;/span&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;span class=&quot;math-tex&quot;&gt;\\(x^2 \\geq 0\\)&lt;/span&gt;&lt;/p&gt;\r\n', 1, 17, '21-02-2017'),
(4, 'Pre-Materi 1', '&lt;p&gt;&lt;strong&gt;Pengertian Basis Data &lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;Basis data adalah kumpulan file-file yang mempunyai kaitan antara satu file dengan file lain sehingga membentuk suatu bangunan data untuk menginformasikan suatu perusahaan atau instansi dalam batasan tertentu. Basis Data terdiri dari 2 kata, yaitu Basis dan Data. Basis dapat diartikan sebagai markas atau gudang dimana tempat bersarang/berkumpul. Sedangkan Data adalah represntasi fakta dunia nyata yang mewakili suatu objek seperti manusia (pegawai, siswa, pembeli, pelanggan), barang, hewan, peristiwa, konsep, keadaan, dan sebagainya, yang direkam dalam bentuk angka, huruf, simbol, teks, gambar, bunyi, atau kombinasisnya. Database management system (DBMS) adalah merupakan suatu sistem software yang memungkinkan seorang user dapat mendefinisikan, membuat, dan memelihara serta menyediakan akses terkontrol terhadap data. Database sendiri adalah sekumpulan data yang berhubungan dengan secara logika dan memiliki beberapa arti yang saling berpautan. Sistem Basis Data merupakan suatu sistem menyusun dan mengelola record-record menggunakan computer untuk menyimpan atau merekam serta memelihara data operasional lengkap sebuah organisasi/perusahaan sehingga mampu menyediakan informasi yang optimal yang diperlukan pemakai untuk proses mengambil keputusan. Salah satu cara menyajikan data untuk mempermudah modifikasi adalah dengan cara pemodelan data.&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Kelebihan Dan Kekurangan DBMS&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Contoh DBMS :&lt;/strong&gt;&lt;br /&gt;\r\n1. Microsoft Access.&lt;br /&gt;\r\n2. Microsoft SQL Server.&lt;br /&gt;\r\n3. Oracle.&lt;br /&gt;\r\n4. MySQL.&lt;br /&gt;\r\n&lt;br /&gt;\r\n&lt;strong&gt;Kelebihan DBMS :&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;ol&gt;\r\n	&lt;li&gt;Mengendalikan atau mengurangi duplikasi data.&lt;/li&gt;\r\n	&lt;li&gt;Menjaga konsistensi dan integritas data.&lt;/li&gt;\r\n	&lt;li&gt;Memudahkan pemerolehan informasi yang lebih banyak dari data yang sama disebabkan data dari berbagai bagian dalam organisasi dikumpulkan menjadi satu.&lt;/li&gt;\r\n	&lt;li&gt;Meningkatkan keamanan data dari orang yang tak berwewenang.&lt;/li&gt;\r\n	&lt;li&gt;Memaksakan penerapan standar.&lt;/li&gt;\r\n	&lt;li&gt;Dapat menghemat biaya karena data dapat dipakai oleh banyak departemen.&lt;/li&gt;\r\n	&lt;li&gt;Menanggulangi konflik kebutuhan antarpemakai karena basis data di bawah kontrol administrator basis data.&lt;/li&gt;\r\n	&lt;li&gt;Meningkatkan tingkat respon dan kemudahan akses bagi pemakai akhir.&lt;/li&gt;\r\n	&lt;li&gt;Meningkatkan produktivitas pemrograman.&lt;/li&gt;\r\n	&lt;li&gt;Meningkatkan pemeliharaan melalui independensi data.&lt;/li&gt;\r\n	&lt;li&gt;Meningkatkan konkurensi (pemakai data oleh sejumlah data) tanpa menimbulkan masalah kehilangan informasi atau integritas.&lt;/li&gt;\r\n	&lt;li&gt;Meningkatkan layanan backup dan recovery.&lt;/li&gt;\r\n&lt;/ol&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Kekurangan DBMS:&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;ol&gt;\r\n	&lt;li&gt;Kompleksitas yang tinggi membuat administrator dan pemakai akhir harus benar-benar memahami fungsi-fungsi dalam DBMS agar dapat memperoleh manfaat yang optimal. Kegagalan memahami DBMS dapat mengakibatkan keputusan rancangan salah, yang akan memberikan dampak serius bagi organisasi.&lt;/li&gt;\r\n	&lt;li&gt;Ukuran penyimpan yang dibutuhkan oleh DBMS sangat besar dan memerlukan memori yang besar agar bisa bekerja secara efisien.&lt;/li&gt;\r\n	&lt;li&gt;Rata-rata harga DBMS yang handal sangat mahal.&lt;/li&gt;\r\n	&lt;li&gt;Terkadang DBMS meminta kebutuhan perangkat keras dengan spesifikasi tertentu sehingga diperlukan biaya tambahan.&lt;/li&gt;\r\n	&lt;li&gt;Biaya Konversi sistem lama (yang mencakup biaya pelatihan staf dan biaya untuk jasa konversi) ke sistem baru yang memakai DBMS terkadang sangat mahal melebihi biaya untuk membeli DBMS.&lt;/li&gt;\r\n	&lt;li&gt;Kinerjanya terkadang kalah dengan sistem yang berbasis berkas.&lt;/li&gt;\r\n	&lt;li&gt;Dampak kegagalan menjadi lebih tinggi karena semua pemakai sangat bergantung pada ketersediaan DBMS. Akibatnya, kalau terjadi kegagalan dalam komponen lingkungan DBMS akan membuat operasi dalam organisasi tersendat atau bahkan terhenti.&lt;/li&gt;\r\n&lt;/ol&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Sebelum Penggunaan Basis Data&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;Sebelumnya, sistem yang digunakan untuk mengatasi semua permasalahan bisnis,&lt;br /&gt;\r\nmenggunakan pengelolaan data secara tradisional dengan cara menyimpan record-record pada file-file yang terpisah, yang disebut juga sistem pemrosesan file. Dimana masing-masing file diperuntukkan hanya untuk satu program aplikasi saja.&lt;br /&gt;\r\n&lt;strong&gt;Kelemahannya dari sistem pemrosesan file ini antara lain :&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;ul&gt;\r\n	&lt;li&gt;Timbulnya data rangkap (redundancy data ) dan Ketidakkonsistensian data&lt;/li&gt;\r\n	&lt;li&gt;Kesukaran dalam Mengakses Data&lt;/li&gt;\r\n	&lt;li&gt;Data terisolir (Isolation Data )&lt;/li&gt;\r\n	&lt;li&gt;Masalah Pengamanan ( Security Problem )&lt;/li&gt;\r\n&lt;/ul&gt;\r\n', 1, 19, '22-02-2017'),
(5, 'Pre-Materi 1', '&lt;p&gt;&lt;strong&gt;Macam-macam QUERY&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Query Select&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;pre&gt;\r\nSELECT * FROM  &lt;/pre&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Query Select JOIN&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;pre&gt;\r\nSELECT  FROM  JOIN  ON  = &lt;/pre&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Clausa Query &lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;pre&gt;\r\nWHERE \r\n\r\nLIKE %  %\r\n&lt;/pre&gt;\r\n\r\n&lt;hr /&gt;\r\n&lt;p&gt;&lt;strong&gt;Login Via CMD &lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;pre&gt;\r\nmysql -u USERNAME -p\r\n&lt;/pre&gt;\r\n\r\n&lt;p&gt;&lt;strong&gt;Show All DB&lt;/strong&gt;&lt;/p&gt;\r\n\r\n&lt;pre&gt;\r\nshow name from v$database;&lt;/pre&gt;\r\n', 1, 20, '23-02-2017'),
(7, 'Pre-Materi Pertemuan Kedua', '&lt;p&gt;[BELUM ADA CATATAN]&lt;/p&gt;\r\n\r\n&lt;p&gt;Lihat Lampiran Materi&lt;/p&gt;\r\n', 1, 17, '25-02-2017');

-- --------------------------------------------------------

--
-- Table structure for table `matkul`
--

CREATE TABLE `matkul` (
  `id_matkul` int(11) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `waktu_mulai` varchar(50) NOT NULL,
  `waktu_selesai` varchar(50) NOT NULL,
  `ruang_matkul` varchar(50) NOT NULL,
  `dosen_id` int(11) NOT NULL,
  `users_id` int(11) NOT NULL,
  `kelas_id` int(11) NOT NULL,
  `days_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matkul`
--

INSERT INTO `matkul` (`id_matkul`, `nama_matkul`, `waktu_mulai`, `waktu_selesai`, `ruang_matkul`, `dosen_id`, `users_id`, `kelas_id`, `days_id`) VALUES
(17, 'Manajemen Sains', '7:00', '9:15', '5204', 7, 1, 12, 2),
(18, 'Konsep E-Business', '7:00', '8:30', '4516', 8, 1, 13, 3),
(19, 'Basis Data', '11:30', '13:45', '5206', 9, 1, 14, 4),
(20, 'Lab. Basis Data I', '8:30', '10:00', 'LAB4', 10, 1, 15, 5);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_users` int(11) NOT NULL,
  `nama_users` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` text NOT NULL,
  `sekolah` varchar(50) NOT NULL,
  `log_masuk` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_users`, `nama_users`, `username`, `password`, `sekolah`, `log_masuk`) VALUES
(1, 'Indra', 'igun997', '21232f297a57a5a743894a0e4a801fc3', 'UNIKOM', '26-02-2017'),
(2, 'Evan', 'evan', '98cc7d37dc7b90c14a59ef0c5caa8995', 'Unikom', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id_dosen`),
  ADD KEY `users_id` (`users_id`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`id_kelas`),
  ADD UNIQUE KEY `nama` (`nama_kelas`),
  ADD KEY `users_id` (`users_id`);

--
-- Indexes for table `list_days`
--
ALTER TABLE `list_days`
  ADD PRIMARY KEY (`id_days`),
  ADD UNIQUE KEY `hari` (`hari`);

--
-- Indexes for table `materi`
--
ALTER TABLE `materi`
  ADD PRIMARY KEY (`id_materi`),
  ADD KEY `matkul_id` (`matkul_id`),
  ADD KEY `users_id` (`users_id`);

--
-- Indexes for table `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`id_matkul`),
  ADD KEY `dosen_id` (`dosen_id`),
  ADD KEY `users_id` (`users_id`),
  ADD KEY `kelas_id` (`kelas_id`),
  ADD KEY `days_id` (`days_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_users`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id_dosen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `kelas`
--
ALTER TABLE `kelas`
  MODIFY `id_kelas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `list_days`
--
ALTER TABLE `list_days`
  MODIFY `id_days` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `materi`
--
ALTER TABLE `materi`
  MODIFY `id_materi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `matkul`
--
ALTER TABLE `matkul`
  MODIFY `id_matkul` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id_users` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dosen`
--
ALTER TABLE `dosen`
  ADD CONSTRAINT `dosen_ibfk_1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id_users`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `kelas`
--
ALTER TABLE `kelas`
  ADD CONSTRAINT `kelas_ibfk_1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id_users`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `materi`
--
ALTER TABLE `materi`
  ADD CONSTRAINT `materi_ibfk_1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id_users`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `materi_ibfk_2` FOREIGN KEY (`matkul_id`) REFERENCES `matkul` (`id_matkul`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `matkul`
--
ALTER TABLE `matkul`
  ADD CONSTRAINT `matkul_ibfk_1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id_users`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matkul_ibfk_2` FOREIGN KEY (`dosen_id`) REFERENCES `dosen` (`id_dosen`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matkul_ibfk_3` FOREIGN KEY (`kelas_id`) REFERENCES `kelas` (`id_kelas`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matkul_ibfk_4` FOREIGN KEY (`days_id`) REFERENCES `list_days` (`id_days`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
