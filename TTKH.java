/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class TTKH {
    private int IDKH;
    private String Ten;
    private int SDT;
    private String DiaChi;
    private String Gmail;
    
    public TTKH(){}
    
    public TTKH(int IDKH, String Ten, int SDT, String DiaChi, String Gmail){
    this.IDKH = IDKH;
    this.Ten = Ten;
    this.SDT = SDT;
    this.DiaChi = DiaChi;
    this.Gmail = Gmail;}

    public int getIDKH() {
        return IDKH;
    }

    public void setIDKH(int IDKH) {
        this.IDKH = IDKH;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }
    
}
