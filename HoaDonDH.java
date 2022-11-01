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
public class HoaDonDH {
    private int MaHDDH;
    private int IDKH;
    private Date NgayLap;
    private int TongGiaTri;
    
    public HoaDonDH(){
    }
    
    public HoaDonDH(int MaHDDH, int IDKH, String Date, int TongGiaTri){
    this.MaHDDH = MaHDDH;
    this.IDKH = IDKH;
    this.NgayLap = NgayLap;
    this.TongGiaTri = TongGiaTri;
    }

    public int getMaHDDH() {
        return MaHDDH;
    }

    public void setMaHDDH(int MaHDDH) {
        this.MaHDDH = MaHDDH;
    }

    public int getIDKH() {
        return IDKH;
    }

    public void setIDKH(int IDKH) {
        this.IDKH = IDKH;
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
