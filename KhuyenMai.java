/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
import java.util.Date;

public class KhuyenMai {

    private int MaKM;
    private int MaSP;
    private Date NgayBD;
    private Date NgayKT;
    private int TyGia;

    public KhuyenMai() {
    }

    public KhuyenMai(int MaKM, int MaSP, Date NgayBD, Date NgayKT, int TyGia) {
        this.MaKM = MaKM;
        this.MaSP = MaSP;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.TyGia = TyGia;
    }

    public int getMaKM() {
        return MaKM;
    }

    public void setMaKM(int MaKM) {
        this.MaKM = MaKM;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }

    public int getTyGia() {
        return TyGia;
    }

    public void setTyGia(int TyGia) {
        this.TyGia = TyGia;
    }
    
}