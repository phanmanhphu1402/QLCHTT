/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class CTHoaDon {
    private int MaHD;
    private int MaSP;
    private String TenSP;
    private int SoLuong;
    private int GiaBanDau;
    private int GiaGiam;

    public CTHoaDon() {
    }

    public CTHoaDon(int MaHD, int MaSP,String TenSP, int SoLuong, int GiaBanDau, int GiaGiam) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.GiaBanDau = GiaBanDau;
        this.GiaGiam = GiaGiam;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGiaBanDau() {
        return GiaBanDau;
    }

    public void setGiaBanDau(int GiaBanDau) {
        this.GiaBanDau = GiaBanDau;
    }

    public int getGiaGiam() {
        return GiaGiam;
    }

    public void setGiaGiam(int GiaGiam) {
        this.GiaGiam = GiaGiam;
    }
    
}
