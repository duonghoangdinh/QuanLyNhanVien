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
public class NguoiDung_DAO {
    String INSERT_NGUOIDUNG_SQL = "INSERT INTO NGUOIDUNG (MANV, VAITRO) VALUES(?,?)";
    String UPDATE_NGUOIDUNG_SQL = "UPDATE NGUOIDUNG SET VAITRO = ? WHERE MANV = ?";
    String DELETE_NGUOIDUNG_SQL = "DELETE NGUOIDUNG   where MANV  = ?";
    String SEELCT__NGUOIDUNG_SQL = "SELECT *  FROM NGUOIDUNG";
    
    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";
    
    public int INSERT_NGUOIDUNG(NguoiDung nd) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_NGUOIDUNG_SQL);

            stm.setString(1, nd.MANV);
            stm.setString(2, nd.VAIRO);
            
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_NGUOIDUNG(NguoiDung nd) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_NGUOIDUNG_SQL);

            
            stm.setString(1, nd.VAIRO);
            stm.setString(2, nd.MANV);
            
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_NGUOIDUNG(NguoiDung nd) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_NGUOIDUNG_SQL);
            
            stm.setString(1, nd.MANV);
            
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public List<NguoiDung> getAllNGUOIDUNG() throws SQLException {
        List<NguoiDung> listND = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__NGUOIDUNG_SQL);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setMANV(rs.getString("MANV"));
                nd.setVAIRO(rs.getString("VAITRO"));
                
                listND.add(nd);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll nguoi dung");
        }
        return listND;
        
    }
}
