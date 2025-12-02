# Sistem CRUD Data Karyawan

Aplikasi ini merupakan program desktop sederhana untuk mengelola data karyawan menggunakan **Java**, **Hibernate**, dan **JasperReports** dengan lingkungan pengembangan **NetBeans 8.2**. Program dibuat sebagai tugas ujian praktikum Rekayasa Perangkat Lunak 2.

## Ringkasan Fitur

- Input, melihat, mengubah, dan menghapus data karyawan
- Integrasi dengan database menggunakan Hibernate ORM
- Cetak laporan data karyawan menggunakan JasperReports
- Ekspor laporan ke format PDF

## Teknologi yang Digunakan

- NetBeans IDE 8.2
- Java JDK 8
- Hibernate ORM 5.x
- JasperReports 6.x
- MySQL (via XAMPP)

## Struktur Database

Aplikasi memakai sebuah tabel bernama `karyawan` pada database MySQL dengan struktur kolom sebagai berikut:

| Kolom    | Tipe         | Keterangan                  |
|---------|--------------|-----------------------------|
| id      | INT          | Primary Key, Auto Increment |
| nip     | VARCHAR(20)  | Nomor induk pegawai         |
| nama    | VARCHAR(100) | Nama karyawan               |
| jabatan | VARCHAR(50)  | Posisi / jabatan            |
| gaji    | DOUBLE       | Gaji karyawan               |

### Query Pembuatan Tabel

```sql
CREATE DATABASE db_karyawan;

USE db_karyawan;

CREATE TABLE karyawan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nip VARCHAR(20) NOT NULL,
    nama VARCHAR(100) NOT NULL,
    jabatan VARCHAR(50) NOT NULL,
    gaji DOUBLE NOT NULL
);
```

## Author

Sandy (51422508)