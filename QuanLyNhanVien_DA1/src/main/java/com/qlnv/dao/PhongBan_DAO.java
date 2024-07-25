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
import javax.sound.midi.Sequence;

/**
 *
 * @author ASUS
 */
public class PhongBan_DAO {

    String INSERT_PHONGBAN_SQL = "INSERT INTO PHONGBAN (MAPB, TENPB) VALUES(?,?)";
    String UPDATE_PHONGBAN_SQL = "UPDATE PHONGBAN SET TENPB = ? WHERE MAPB = ?";
    String DELETE_PHONGBAN_SQL = "DETELE FROM PHONGBAN WHERE MAPB = ?";
    String SEELCT__PHONGBAN_SQL = "SELECT *  FROM PHONGBAN";

    String username = "sa";
    String password = "123";
    String nameSQL = "DA1_QLNV";
    String url = "jdbc:sqlserver://localhost:1433;database=" + nameSQL + ";encrypt=false";

    public int INSERT_PHONGBAN(PhongBan pb) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(INSERT_PHONGBAN_SQL);

            stm.setString(1, pb.MAPB);
            stm.setString(2, pb.TENPB);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int UPDATE_PHONGBAN(PhongBan pb) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(UPDATE_PHONGBAN_SQL);
            
            stm.setString(1, pb.TENPB);
            stm.setString(2, pb.MAPB);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int DETELE_PHONGBAN(PhongBan pb) throws SQLException {
        int rs = 0;
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(DELETE_PHONGBAN_SQL);

            stm.setString(1, pb.MAPB);

            rs = stm.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public List<PhongBan> getAllPHONGBAN() throws SQLException {
        List<PhongBan> listPB = new ArrayList<>();
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = connect.prepareStatement(SEELCT__PHONGBAN_SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                PhongBan pb = new PhongBan();
                pb.setMAPB(rs.getString("MAPB"));
                pb.setTENPB(rs.getString("TENPB"));

                listPB.add(pb);
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("getAll San pham");
        }
        return listPB;

    }
}
