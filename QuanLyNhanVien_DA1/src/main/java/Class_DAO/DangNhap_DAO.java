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
public class DangNhap_DAO {

    String INSERT_DANGNHAP_SQL = "INSERT INTO DANGNHAP (MANV, MATKHAU) VALUES(?,?)";
    String UPDATE_DANGNHAP_SQL = "UPDATE DANGNHAP SET MATKHAU = ? WHERE MANV = ?";
    String DELETE_DANGNHAP_SQL = "DELETE LOAINV  DANGNHAP  MANV = ?";
    String SEELCT__DANGNHAP_SQL = "SELECT *  FROM DANGNHAP";

    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";

    public int INSERT_DANGNHAP(DangNhap dn) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_DANGNHAP_SQL);

            stm.setString(1, dn.MANV);
            stm.setString(2, dn.MATKHAU);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_DANGNHAP(DangNhap dn) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_DANGNHAP_SQL);

            stm.setString(1, dn.MATKHAU);
            stm.setString(2, dn.MANV);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_DANGNHAP(DangNhap dn) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_DANGNHAP_SQL);

            stm.setString(1, dn.MANV);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public List<DangNhap> getAllDANGNHAP() throws SQLException {
        List<DangNhap> listLDN = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__DANGNHAP_SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                DangNhap dn = new DangNhap();
                dn.setMANV(rs.getString("MANV"));
                dn.setMATKHAU(rs.getString("MATKHAU "));

                listLDN.add(dn);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll San pham");
        }
        return listLDN;

    }
}
