/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class SanPham {
    private int MASP;
    private String TenSP;
    private String HinhAnh;
    private int MaLoai;
    private int SoLuong;  
    private int Gia;

    public SanPham() {
    }

    public SanPham(int MASP, String TenSP, String HinhAnh,int MaLoai, int SoLuong, int Gia) {
        this.MASP = MASP;
        this.TenSP = TenSP;
        this.HinhAnh = HinhAnh;
        this.MaLoai = MaLoai;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    
}