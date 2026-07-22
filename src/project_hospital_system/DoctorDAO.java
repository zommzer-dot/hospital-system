/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorDAO {

    public void createTable() {

        String sql =
        "CREATE TABLE IF NOT EXISTS doctors ("
        + "id INTEGER PRIMARY KEY,"
        + "name TEXT,"
        + "age INTEGER,"
        + "address TEXT,"
        + "phone TEXT,"
        + "specialization TEXT,"
        + "clinic TEXT,"
        + "salary REAL"
        + ");";

        try {

            Connection conn =
            DBConnection.connect();

            Statement stmt =
            conn.createStatement();

            stmt.execute(sql);

            System.out.println("Doctors Table Created");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void addDoctor(Doctor doctor) {

        String sql =
        "INSERT INTO doctors "
        + "(id,name,age,address,phone,specialization,clinic,salary) "
        + "VALUES(?,?,?,?,?,?,?,?)";

        try {

            Connection conn =
            DBConnection.connect();

            PreparedStatement pstmt =
            conn.prepareStatement(sql);

            pstmt.setInt(1, doctor.getID());

            pstmt.setString(2, doctor.getName());

            pstmt.setInt(3, doctor.getAge());

            pstmt.setString(4, doctor.getAddress());

            pstmt.setString(5, doctor.getPhone());

            pstmt.setString(6, doctor.getSpecialization());

            pstmt.setString(7, doctor.getClinic());

            pstmt.setDouble(8, doctor.getSalary());

            pstmt.executeUpdate();

            System.out.println("Doctor Added");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void getDoctors() {

        String sql =
        "SELECT * FROM doctors";

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
                        rs.getString("specialization"));
            }

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void deleteDoctor(int id) {

        String sql =
        "DELETE FROM doctors WHERE id = ?";

        try {

            Connection conn =
            DBConnection.connect();

            PreparedStatement pstmt =
            conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            pstmt.executeUpdate();

            System.out.println("Doctor Deleted");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}