/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class Luong {

    public String MANV;
    public String LUONGCOBAN;
    public String THUONG;
    public String KHAITRU;

    public Luong(String MANV, String LUONGCOBAN, String THUONG, String KHAITRU) {
        this.MANV = MANV;
        this.LUONGCOBAN = LUONGCOBAN;
        this.THUONG = THUONG;
        this.KHAITRU = KHAITRU;
    }

    public Luong() {
    }

    public String getMANV() {
        return MANV;
    }

    public String getLUONGCOBAN() {
        return LUONGCOBAN;
    }

    public String getTHUONG() {
        return THUONG;
    }

    public String getKHAITRU() {
        return KHAITRU;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setLUONGCOBAN(String LUONGCOBAN) {
        this.LUONGCOBAN = LUONGCOBAN;
    }

    public void setTHUONG(String THUONG) {
        this.THUONG = THUONG;
    }

    public void setKHAITRU(String KHAITRU) {
        this.KHAITRU = KHAITRU;
    }
}
