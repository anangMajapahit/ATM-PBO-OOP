-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2021 at 02:25 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atm`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_akun`
--

CREATE TABLE `tb_akun` (
  `akunNomor` int(11) NOT NULL,
  `akunNama` varchar(10) NOT NULL,
  `namaPanjang` varchar(50) NOT NULL,
  `tglLahir` varchar(50) NOT NULL,
  `hp` varchar(15) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `pendidikan` varchar(25) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL,
  `saldo` int(25) NOT NULL,
  `PIN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_akun`
--

INSERT INTO `tb_akun` (`akunNomor`, `akunNama`, `namaPanjang`, `tglLahir`, `hp`, `alamat`, `pendidikan`, `pekerjaan`, `saldo`, `PIN`) VALUES
(904062001, 'Anang', 'Anang Misbakhul Khoir', '23-Januari-2002', '081289026785', 'Mojokerto', 'S1 (Sistem Informasi)', 'Mahasiswa', 750000, 1),
(904062002, 'Tika', 'Arifatun Nikmat Rahmatika', '01-Oktober-2002', '081223455432', 'Nusa Tenggara Barat', 'S1 (Sistem Informasi)', 'Mahasiswa', 650000, 2),
(904062003, 'reikun', 'Moh. Faqih Bahreisy', '27-Mei-2002', '098612344567', 'Kencong, Jember', 'S1 (Sistem Informasi)', 'mahasiswa', 700000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `Waktu` int(11) NOT NULL,
  `akunNomor` int(11) NOT NULL,
  `Type` int(11) NOT NULL,
  `Tanggal` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_akun`
--
ALTER TABLE `tb_akun`
  ADD PRIMARY KEY (`akunNomor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
