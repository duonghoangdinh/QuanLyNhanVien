/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class NhanVien {

    public String MANV;
    public String TENNV;
    public String NGAYSINH;
    public String GIOITINH;
    public String EMAIL;
    public String DIACHI;
    public String MAPB;

    public NhanVien() {
    }

    public NhanVien(String MANV, String TENNV, String NGAYSINH, String GIOITINH, String EMAIL, String DIACHI, String MAPB) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.NGAYSINH = NGAYSINH;
        this.GIOITINH = GIOITINH;
        this.EMAIL = EMAIL;
        this.DIACHI = DIACHI;
        this.MAPB = MAPB;
    }

    public String getMANV() {
        return MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public String getMAPB() {
        return MAPB;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public void setMAPB(String MAPB) {
        this.MAPB = MAPB;
    }
}
