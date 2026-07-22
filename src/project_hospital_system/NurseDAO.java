/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NurseDAO {

    public void createTable() {

        String sql =
        "CREATE TABLE IF NOT EXISTS nurses ("
        + "id INTEGER PRIMARY KEY,"
        + "name TEXT,"
        + "age INTEGER,"
        + "address TEXT,"
        + "phone TEXT,"
        + "shift TEXT"
        + ");";

        try {

            Connection conn =
            DBConnection.connect();

            Statement stmt =
            conn.createStatement();

            stmt.execute(sql);

            System.out.println("Nurses Table Created");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void addNurse(Nurse nurse) {

    String sql =
    "INSERT INTO nurses "
    + "(id,name,age,address,phone,shift) "
    + "VALUES(?,?,?,?,?,?)";

    try {

        Connection conn =
        DBConnection.connect();

        PreparedStatement pstmt =
        conn.prepareStatement(sql);

        pstmt.setInt(1, nurse.getID());

        pstmt.setString(2, nurse.getName());

        pstmt.setInt(3, nurse.getAge());

        pstmt.setString(4, nurse.getAddress());

        pstmt.setString(5, nurse.getPhone());

        pstmt.setString(6, nurse.getShiftTime());

        pstmt.executeUpdate();

        System.out.println("Nurse Added");

    } catch(Exception e) {

        System.out.println(e.getMessage());
    }
}

    public void getNurses() {

        String sql =
        "SELECT * FROM nurses";

        try {

            Connection conn =
            DBConnection.connect();

            Statement stmt =
            conn.createStatement();

            ResultSet rs =
            stmt.executeQuery(sql);

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("shift"));
            }

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void deleteNurse(int id) {

        String sql =
        "DELETE FROM nurses WHERE id = ?";

        try {

            Connection conn =
            DBConnection.connect();

            PreparedStatement pstmt =
            conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            pstmt.executeUpdate();

            System.out.println("Nurse Deleted");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}