package model;

import javax.persistence.*;

@Entity
@Table(name = "karyawan")
public class Karyawan implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nip")
    private String nip;

    @Column(name = "nama")
    private String nama;

    @Column(name = "jabatan")
    private String jabatan;

    @Column(name = "gaji")
    private Double gaji;

    public Karyawan() {}

    public Karyawan(String nip, String nama, String jabatan, Double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }

    public Double getGaji() { return gaji; }
    public void setGaji(Double gaji) { this.gaji = gaji; }

    @Override
    public String toString() {
        return "karyawan{" +
                "id=" + id +
                ", nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", jabatan='" + jabatan + '\'' +
                ", gaji=" + gaji +
                '}';
    }
}
