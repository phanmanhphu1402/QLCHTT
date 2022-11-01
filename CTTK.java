/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class CTTK {
    private int MaThongKe;
    private int MaSP;
    private String TenSP;
    private int SLBan;
    private int SLDat;
    private int TongThuSP;
    private int TongChiSP;
    
    public CTTK(){}
    public CTTK(int MaThongKe, int MaSP, String TenSP, int SLBan, int SLDat, int TongThuSP, int TongChiSP){
        this.MaThongKe = MaThongKe;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SLBan = SLBan;
        this.SLDat = SLDat;
        this.TongChiSP = TongThuSP;
        this.TongThuSP = TongChiSP;
    }

    public int getMaThongKe() {
        return MaThongKe;
    }

    public void setMaThongKe(int MaThongKe) {
        this.MaThongKe = MaThongKe;
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

    public int getSLBan() {
        return SLBan;
    }

    public void setSLBan(int SLBan) {
        this.SLBan = SLBan;
    }

    public int getSLDat() {
        return SLDat;
    }

    public void setSLDat(int SLDat) {
        this.SLDat = SLDat;
    }

    public int getTongThuSP() {
        return TongThuSP;
    }

    public void setTongThuSP(int TongThuSP) {
        this.TongThuSP = TongThuSP;
    }

    public int getTongChiSP() {
        return TongChiSP;
    }

    public void setTongChiSP(int TongChiSP) {
        this.TongChiSP = TongChiSP;
    }
    
}
