/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class KhenThuong_KiLuat {

    public String MANV;
    public String NGAY;
    public String LOAI;
    public String SOTIEN;
    public String MOTA;

    public KhenThuong_KiLuat(String MANV, String NGAY, String LOAI, String SOTIEN, String MOTA) {
        this.MANV = MANV;
        this.NGAY = NGAY;
        this.LOAI = LOAI;
        this.SOTIEN = SOTIEN;
        this.MOTA = MOTA;
    }

    public KhenThuong_KiLuat() {
    }

    public String getMANV() {
        return MANV;
    }

    public String getNGAY() {
        return NGAY;
    }

    public String getLOAI() {
        return LOAI;
    }

    public String getSOTIEN() {
        return SOTIEN;
    }

    public String getMOTA() {
        return MOTA;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setNGAY(String NGAY) {
        this.NGAY = NGAY;
    }

    public void setLOAI(String LOAI) {
        this.LOAI = LOAI;
    }

    public void setSOTIEN(String SOTIEN) {
        this.SOTIEN = SOTIEN;
    }

    public void setMOTA(String MOTA) {
        this.MOTA = MOTA;
    }
    
    
                                            
}
