/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class TaiKhoan {
    private int IDKH;
    private String TaiKhoan;
    private String MatKhau;
    
    public TaiKhoan(){}
    
    public TaiKhoan(int IDKH, String TaiKhoan, String MatKhau){
    this.IDKH = IDKH;
    this.TaiKhoan = TaiKhoan;
    this.MatKhau = MatKhau;}

    public int getIDKH() {
        return IDKH;
    }

    public void setIDKH(int IDKH) {
        this.IDKH = IDKH;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
}
