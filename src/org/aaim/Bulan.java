package org.aaim;

public class Bulan {
  private String nama;
  private Integer jumlahHari;

  public Bulan(String nama, Integer jumlahHari) {
    this.nama = nama;
    this.jumlahHari = jumlahHari;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public Integer getJumlahHari() {
    return jumlahHari;
  }

  public void setJumlahHari(Integer jumlahHari) {
    this.jumlahHari = jumlahHari;
  }
}
