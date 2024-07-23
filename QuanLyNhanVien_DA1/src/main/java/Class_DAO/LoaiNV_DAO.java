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
public class LoaiNV_DAO {
    String INSERT_LOAINV_SQL = "INSERT INTO LOAINV (MANV, TENLOAINV) VALUES(?,?)";
    String UPDATE_LOAINV_SQL = "UPDATE LOAINV SET TENLOAINV = ? WHERE MANV = ?";
    String DELETE_LOAINV_SQL = "DELETE LOAINV  where MANV = ?";
    String SEELCT__LOAINV_SQL = "SELECT *  FROM LOAINV";
    
    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";
    
    public int INSERT_LOAINV(LoaiNV lnv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_LOAINV_SQL);

            stm.setString(1, lnv.MANV);
            stm.setString(2, lnv.TENLOAINNV);
            
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_LOAINV(LoaiNV lnv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_LOAINV_SQL);

            stm.setString(1, lnv.TENLOAINNV);
            stm.setString(2, lnv.MANV);
            
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_LOAINV(LoaiNV lnv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_LOAINV_SQL);
            
            stm.setString(1, lnv.MANV);
            
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public List<LoaiNV> getAllLoaiNV() throws SQLException {
        List<LoaiNV> listLNV = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__LOAINV_SQL);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                LoaiNV lnv = new LoaiNV();
                lnv.setMANV(rs.getString("MANV"));
                lnv.setTENLOAINNV(rs.getString("TENLOAINV"));
                
                listLNV.add(lnv);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll San pham");
        }
        return listLNV;
        
    }
}
