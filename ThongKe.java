/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class ThongKe {
    private int MaThongKe;
    private int Thang;
    private int TongThuThang;
    private int TongChiThang;
    
public ThongKe(){}

public ThongKe(int MaThongKe, int Thang, int TongThuThang, int TongChiThang){
    this.MaThongKe = MaThongKe;
    this.Thang = Thang;
    this.TongThuThang = TongThuThang;
    this.TongChiThang = TongChiThang;
    }

    public int getMaThongKe() {
        return MaThongKe;
    }

    public void setMaThongKe(int MaThongKe) {
        this.MaThongKe = MaThongKe;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public int getTongThuThang() {
        return TongThuThang;
    }

    public void setTongThuThang(int TongThuThang) {
        this.TongThuThang = TongThuThang;
    }

    public int getTongChiThang() {
        return TongChiThang;
    }

    public void setTongChiThang(int TongChiThang) {
        this.TongChiThang = TongChiThang;
    }

}
