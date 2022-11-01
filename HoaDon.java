/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

import java.util.Date;

/**
 *
 * @author Phan Manh Phu
 */
public class HoaDon {
    private int MaHD;
    private int MaNV;
    private String DiaChiNhan;
    private int SDTNguoiNhan;
    private Date NgayLap;
    private int TongGiaTri;

    public HoaDon() {
    }

    public HoaDon(int MaHD, int MaNV, String DiaChiNhan, int SDTNguoiNhan, String date, int TongGiaTri) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.DiaChiNhan = DiaChiNhan;
        this.SDTNguoiNhan = SDTNguoiNhan;
        this.NgayLap = NgayLap;
        this.TongGiaTri = TongGiaTri;       
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getDiaChiNhan() {
        return DiaChiNhan;
    }

    public void setDiaChiNhan(String DiaChiNhan) {
        this.DiaChiNhan = DiaChiNhan;
    }

    public int getSDTNguoiNhan() {
        return SDTNguoiNhan;
    }

    public void setSDTNguoiNhan(int SDTNguoiNhan) {
        this.SDTNguoiNhan = SDTNguoiNhan;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public int getTongGiaTri() {
        return TongGiaTri;
    }

    public void setTongGiaTri(int TongGiaTri) {
        this.TongGiaTri = TongGiaTri;
    }
    
}