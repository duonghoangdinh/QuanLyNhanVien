/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class ChucVu {
    public String MANV;
    public String TENCV;

    public ChucVu(String MANV, String TENCV) {
        this.MANV = MANV;
        this.TENCV = TENCV;
    }

    public ChucVu() {
    }

    public String getMANV() {
        return MANV;
    }

    public String getTENCV() {
        return TENCV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setTENCV(String TENCV) {
        this.TENCV = TENCV;
    }
            
}
