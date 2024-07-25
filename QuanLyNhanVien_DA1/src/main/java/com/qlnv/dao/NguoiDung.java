/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class NguoiDung {

    public String MANV ;
    public String VAIRO;

    public NguoiDung(String MANV, String VAIRO) {
        this.MANV = MANV;
        this.VAIRO = VAIRO;
    }

    public NguoiDung() {
    }

    public String getMANV() {
        return MANV;
    }

    public String getVAIRO() {
        return VAIRO;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setVAIRO(String VAIRO) {
        this.VAIRO = VAIRO;
    }
    
    
}
