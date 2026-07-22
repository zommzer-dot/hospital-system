/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AppointmentDAO {

    public void createTable() {

        String sql =
        "CREATE TABLE IF NOT EXISTS appointments ("
        + "appointmentId TEXT PRIMARY KEY,"
        + "appointmentDate TEXT,"
        + "doctorId INTEGER,"
        + "patientId INTEGER,"
        + "FOREIGN KEY(doctorId) REFERENCES doctors(id),"
        + "FOREIGN KEY(patientId) REFERENCES patients(id)"
        + ");";

        try {

            Connection conn =
            DBConnection.connect();

            Statement stmt =
            conn.createStatement();

            stmt.execute(sql);

            System.out.println("Appointments Table Created");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void addAppointment(Appointment appointment) {

        String sql =
        "INSERT INTO appointments "
        + "(appointmentId,appointmentDate,doctorId,patientId) "
        + "VALUES(?,?,?,?)";

        try {

            Connection conn =
            DBConnection.connect();

            PreparedStatement pstmt =
            conn.prepareStatement(sql);

            pstmt.setString(1,
                    appointment.getAppointmentId());

            pstmt.setString(2,
                    appointment.getAppointmentDate());

            pstmt.setInt(3,
                    appointment.getDoctor().getID());

            pstmt.setInt(4,
                    appointment.getPatient().getID());

            pstmt.executeUpdate();

            System.out.println("Appointment Added");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void getAppointments() {

        String sql =
        "SELECT * FROM appointments";

        try {

            Connection conn =
            DBConnection.connect();

            Statement stmt =
            conn.createStatement();

            ResultSet rs =
            stmt.executeQuery(sql);

            while(rs.next()) {

                System.out.println(
                        rs.getString("appointmentId") + " " +
                        rs.getString("appointmentDate"));
            }

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void deleteAppointment(String appointmentId) {

        String sql =
        "DELETE FROM appointments WHERE appointmentId = ?";

        try {

            Connection conn =
            DBConnection.connect();

            PreparedStatement pstmt =
            conn.prepareStatement(sql);

            pstmt.setString(1, appointmentId);

            pstmt.executeUpdate();

            System.out.println("Appointment Deleted");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}