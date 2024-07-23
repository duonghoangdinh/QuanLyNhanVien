/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class LoaiNV {
    public String MANV;
    public String TENLOAINNV;

    public LoaiNV() {
    }

    public LoaiNV(String MANV, String TENLOAINNV) {
        this.MANV = MANV;
        this.TENLOAINNV = TENLOAINNV;
    }

    public String getMANV() {
        return MANV;
    }

    public String getTENLOAINNV() {
        return TENLOAINNV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setTENLOAINNV(String TENLOAINNV) {
        this.TENLOAINNV = TENLOAINNV;
    }
    
    
}
