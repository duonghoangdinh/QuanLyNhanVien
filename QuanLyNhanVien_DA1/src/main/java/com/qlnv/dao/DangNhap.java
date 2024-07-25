/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class DangNhap {

    public String MANV;
    public String MATKHAU;

    public DangNhap() {
    }

    public DangNhap(String MANV, String MATKHAU) {
        this.MANV = MANV;
        this.MATKHAU = MATKHAU;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public String getMANV() {
        return MANV;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }
    
    
}
