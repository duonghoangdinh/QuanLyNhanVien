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
public class Luong_DAO {

    String INSERT_LUONG_SQL = "INSERT INTO LUONG (MANV, LUONGCOBAN, THUONG, KHAUTRU) VALUES(?,?,?)";
    String UPDATE_LUONG_SQL = "UPDATE LUONG SET LUONGCOBAN = ?, THUONG = ?, KHAUTRU = ? WHERE MANV = ?;";
    String DELETE_LUONG_SQL = "DETELE FROM PHONGBAN WHERE MAPB = ?";
    String SEELCT__LUONG_SQL = "SELECT *  FROM LUONG";

    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";

    public int INSERT_LUONG(Luong l) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_LUONG_SQL);

            stm.setString(1, l.MANV);
            stm.setString(2, l.LUONGCOBAN);
            stm.setString(3, l.THUONG);
            stm.setString(4, l.KHAITRU);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_LUONG(Luong l) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_LUONG_SQL);

            stm.setString(1, l.LUONGCOBAN);
            stm.setString(2, l.THUONG);
            stm.setString(3, l.KHAITRU);
            stm.setString(4, l.MANV);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_LUONG(Luong l) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_LUONG_SQL);

            stm.setString(1, l.MANV);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public List<Luong> getAllLUONG() throws SQLException {
        List<Luong> listL = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__LUONG_SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Luong l = new Luong();
                l.setMANV(rs.getString("MANV"));
                l.setLUONGCOBAN(rs.getString("LUONGCOBAN"));
                l.setTHUONG(rs.getString("THUONG"));
                l.setKHAITRU(rs.getString("KHAITRU"));

                listL.add(l);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll San pham");
        }
        return listL;

    }
}
