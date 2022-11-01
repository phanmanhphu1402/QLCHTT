/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class ChiTietDH {
    private int MaHDDH;
    private int MaSP;
    private int SoLuong;
    private int DonGia;
    
    public ChiTietDH(){}
    
    public ChiTietDH(int MaHDDH, int MaSP, int SoLuong, int DonGia){
    this.MaHDDH = MaHDDH;
    this.MaSP = MaSP;
    this.SoLuong = SoLuong;
    }

    public int getMaHDDH() {
        return MaHDDH;
    }

    public void setMaHDDH(int MaHDDH) {
        this.MaHDDH = MaHDDH;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
    
}
