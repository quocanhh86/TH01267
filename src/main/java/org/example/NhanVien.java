package org.example;

public class NhanVien {
    private String maNhanVien;
    private String ten;
    private Integer tuoi;
    private Float luong;
    private Integer soNamLamViec;
    private String phongBan;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String ten, Integer tuoi, Float luong, Integer soNamLamViec, String phongBan) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
        this.phongBan = phongBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public Integer getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(Integer soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
}
