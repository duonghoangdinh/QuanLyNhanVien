/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class KhenThuong_KiLuat_DAO {

    String INSERT_KHENTHUONG_KYLUAT_SQL = "INSERT INTO KHENTHUONG_KYLUAT (MANV, NGAY, LOAI, SOTIEN, MOTA) VALUES(?,?,?,?,?)";
    String UPDATE_KHENTHUONG_KYLUAT_SQL = "UPDATE KHENTHUONG_KYLUAT SET LOAI = ?, SOTIEN = ?, MOTA = ? WHERE MANV = ? AND NGAY = ?";
//    KHI CAP NHAT DU LIEU CHO KHEN THUONG KI LUAT CAN PHAI COS THEEM DIEU KIEN LA NGAY THANG NAM 
    String DELETE_KHENTHUONG_KYLUAT_SQL = "DELETE FROM KHENTHUONG_KYLUAT WHERE MANV = ? AND NGAY = ?";
    String SEELCT__KHENTHUONG_KYLUAT_SQL = "SELECT *  FROM KHENTHUONG_KYLUAT";

    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";

    public int INSERT_KHENTHUONG_KYLUAT(KhenThuong_KiLuat ktkl) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_KHENTHUONG_KYLUAT_SQL);

            stm.setString(1, ktkl.MANV);
            stm.setString(2, ktkl.NGAY);
            stm.setString(3, ktkl.LOAI);
            stm.setString(4, ktkl.SOTIEN);
            stm.setString(5, ktkl.MOTA);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_KHENTHUONG_KYLUAT(KhenThuong_KiLuat ktkl) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_KHENTHUONG_KYLUAT_SQL);

            stm.setString(1, ktkl.LOAI);
            stm.setString(2, ktkl.SOTIEN);
            stm.setString(3, ktkl.MOTA);
//            dieu kien de cao nhat thong tin la ma nhanvien va ngay
            stm.setString(4, ktkl.MANV);
            stm.setString(5, ktkl.NGAY);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_KHENTHUONG_KYLUAT(KhenThuong_KiLuat ktkl) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_KHENTHUONG_KYLUAT_SQL);

            stm.setString(1, ktkl.MANV);
            stm.setString(2, ktkl.NGAY);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public List<KhenThuong_KiLuat> getAllKHENTHUONG_KYLUAT() throws SQLException {
        List<KhenThuong_KiLuat> listKTKL = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__KHENTHUONG_KYLUAT_SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                KhenThuong_KiLuat ktkl = new KhenThuong_KiLuat();
                
                ktkl.setMANV(rs.getString("MANV"));
                ktkl.setNGAY(rs.getString("NGAY"));
                ktkl.setLOAI(rs.getString("LOAI"));
                ktkl.setSOTIEN(rs.getString("SOTIEN"));
                ktkl.setMOTA(rs.getString("MOTA"));

                listKTKL.add(ktkl);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll San pham");
        }
        return listKTKL;

    }

}
