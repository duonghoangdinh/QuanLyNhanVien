/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

/**
 *
 * @author ASUS
 */
public class PhongBan {
    public String MAPB;
    public String TENPB;

    public PhongBan() {
    }

    public PhongBan(String MAPB, String TENPB) {
        this.MAPB = MAPB;
        this.TENPB = TENPB;
    }

    public String getMAPB() {
        return MAPB;
    }

    public String getTENPB() {
        return TENPB; 
    }

    public void setMAPB(String MAPB) {
        this.MAPB = MAPB;
    }

    public void setTENPB(String TENPB) {
        this.TENPB = TENPB;
    }
    
}
