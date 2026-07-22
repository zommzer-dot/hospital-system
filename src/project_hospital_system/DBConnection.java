/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:sqlite:hospital.db";

    public static Connection connect() {

        try {

            Connection conn = DriverManager.getConnection(URL);

            return conn;

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return null;
    }
}