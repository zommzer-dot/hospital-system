/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientDAO {

    public void createTable() {

        String sql =
        "CREATE TABLE IF NOT EXISTS patients ("
        + "id INTEGER PRIMARY KEY,"
        + "name TEXT,"
        + "age INTEGER,"
        + "address TEXT,"
        + "phone TEXT,"
        + "bloodType TEXT,"
        + "medicalHistory TEXT"
        + ");";

        try {

            Connection conn =
            DBConnection.connect();

            Statement stmt =
            conn.createStatement();

            stmt.execute(sql);

            System.out.println("Patients Table Created");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void addPatient(Patient patient) {

        String sql =
        "INSERT INTO patients "
        + "(id,name,age,address,phone,bloodType,medicalHistory) "
        + "VALUES(?,?,?,?,?,?,?)";

        try {

            Connection conn =
            DBConnection.connect();

            PreparedStatement pstmt =
            conn.prepareStatement(sql);

            pstmt.setInt(1, patient.getID());

            pstmt.setString(2, patient.getName());

            pstmt.setInt(3, patient.getAge());

            pstmt.setString(4, patient.getAddress());

            pstmt.setString(5, patient.getPhone());

            pstmt.setString(6, patient.getBloodType());

            pstmt.setString(7, patient.getMedicalHistory());

            pstmt.executeUpdate();

            System.out.println("Patient Added");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void getPatients() {

        String sql =
        "SELECT * FROM patients";

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
                        rs.getString("bloodType"));
            }

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void deletePatient(int id) {

        String sql =
        "DELETE FROM patients WHERE id = ?";

        try {

            Connection conn =
            DBConnection.connect();

            PreparedStatement pstmt =
            conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            pstmt.executeUpdate();

            System.out.println("Patient Deleted");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}