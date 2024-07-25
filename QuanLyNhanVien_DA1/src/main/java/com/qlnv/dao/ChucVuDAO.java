package Class_DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class ChucVuDAO {

    String INSERT_CHUCVU_SQL = "INSERT INTO CHUCVU (MANV, TENCV) VALUES(?,?)";
    String UPDATE_CHUCVU_SQL = "UPDATE CHUCVU SET TENCV = ? WHERE MANV = ?";
    String DELETE_CHUCVU_SQL = "DELETE CHUCVU   where MANV = ?";
    String SEELCT__CHUCVU_SQL = "SELECT *  FROM CHUCVU";

    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";

    public int INSERT_CHUCVU(ChucVu cv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_CHUCVU_SQL);

            stm.setString(1, cv.MANV);
            stm.setString(2, cv.TENCV);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_CHUCVU(ChucVu cv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_CHUCVU_SQL);

            stm.setString(1, cv.TENCV);
            stm.setString(2, cv.MANV);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_CHUCVU(ChucVu cv) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_CHUCVU_SQL);

            stm.setString(1, cv.MANV);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public List<ChucVu> getAllCHUCVU() throws SQLException {
        List<ChucVu> listLCV = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__CHUCVU_SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setMANV(rs.getString("MANV"));
                cv.setTENCV(rs.getString("TENCV"));

                listLCV.add(cv);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll San pham");
        }
        return listLCV;

    }
}
