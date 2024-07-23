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
public class NhanVien_DAO {

    String INSERT_NHANVIEN_SQL = "INSERT INTO NHANVIEN(MANV, TENNV, NGAYSINH, GIOITINH, EMAIL, DIACHI, MAPB) VALUES(?,?,?,?,?,?,?)";
    String UPDATE_NHANVIEN_SQL = "UPDATE NHANVIEN SET  TENNV = ?, NGAYSINH = ?, GIOITINH = ?, EMAIL = ?, DIACHI = ?, MAPB = ? WHERE MANV = ?";
    String DELETE_NHANVIEN_SQL = "DELETE FFROM NHANVIEN where MANV = ?";
    String SEELCT__NHANVIEN_SQL = "SELECT *  FROM NHANVIEN";

    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";

    public int INSERT_NHANVIEN(NhanVien nv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_NHANVIEN_SQL);

            stm.setString(1, nv.MANV);
            stm.setString(2, nv.TENNV);
            stm.setString(3, nv.NGAYSINH);
            stm.setString(4, nv.GIOITINH);
            stm.setString(5, nv.EMAIL);
            stm.setString(6, nv.DIACHI);
            stm.setString(7, nv.MAPB);
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_NHANVIEN(NhanVien nv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_NHANVIEN_SQL);

            stm.setString(1, nv.TENNV);
            stm.setString(2, nv.NGAYSINH);
            stm.setString(3, nv.GIOITINH);
            stm.setString(4, nv.EMAIL);
            stm.setString(5, nv.DIACHI);
            stm.setString(6, nv.MAPB);
            stm.setString(7, nv.MANV);
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_NHANVIEN(NhanVien nv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_NHANVIEN_SQL);
            
            stm.setString(1, nv.MANV);
            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public List<NhanVien> getAllNhanVien() throws SQLException {
        List<NhanVien> listNV = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__NHANVIEN_SQL);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMANV(rs.getString("MANV"));
                nv.setTENNV(rs.getString("TENNV"));
                nv.setNGAYSINH(rs.getString("NGAYSINH"));
                nv.setGIOITINH(rs.getString("GIOITINH"));
                nv.setEMAIL(rs.getString("EMAIL"));
                nv.setDIACHI(rs.getString("DIACHI"));
                nv.setMAPB(rs.getString("MAPB"));
                
                listNV.add(nv);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll San pham");
        }
        return listNV;
        
    }

}
