/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project_hospital_system;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeController {

    @FXML
    private Button patientBtn;

    @FXML
    private Button adminBtn;

    // ================= Open Patient Page =================

    @FXML
    public void openPatientPage() throws IOException {

        Parent root =
                FXMLLoader.load(getClass().getResource("patient.fxml"));

        Stage stage = (Stage) patientBtn.getScene().getWindow();

        Scene scene = new Scene(root, 1200, 700);

        scene.getStylesheets().add(
                getClass().getResource("style.css").toExternalForm()
        );

        stage.setScene(scene);
    }

    // ================= Open Admin Page =================

    @FXML
    public void openAdminPage() throws IOException {

        Parent root =
                FXMLLoader.load(getClass().getResource("Gui.fxml"));

        Stage stage = (Stage) adminBtn.getScene().getWindow();

        Scene scene = new Scene(root, 1200, 700);

        scene.getStylesheets().add(
                getClass().getResource("style.css").toExternalForm()
        );

        stage.setScene(scene);
    }
}