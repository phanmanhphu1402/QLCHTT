/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCHTT;

/**
 *
 * @author Phan Manh Phu
 */
public class PhanLoaiSP {
    private int MaPhanLoai;
    private String TenPhanLoai;
    
    public PhanLoaiSP(){
    }
    
    public PhanLoaiSP(int MaPhanLoai, String TenPhanLoai){
        this.MaPhanLoai = MaPhanLoai;
        this.TenPhanLoai = TenPhanLoai;
    }

    public int getMaPhanLoai() {
        return MaPhanLoai;
    }

    public void setMaPhanLoai(int MaPhanLoai) {
        this.MaPhanLoai = MaPhanLoai;
    }

    public String getTenPhanLoai() {
        return TenPhanLoai;
    }

    public void setTenPhanLoai(String TenPhanLoai) {
        this.TenPhanLoai = TenPhanLoai;
    }
    
}
