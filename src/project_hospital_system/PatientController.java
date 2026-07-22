/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project_hospital_system;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PatientController {

    @FXML
    private TextArea outputArea;

    Hospital_system hospital =
            new Hospital_system("Alexandria Hospital");

    // ================= View Appointments =================

    @FXML
    public void viewAppointments() {

        outputArea.clear();

        if(hospital.getAppointments().isEmpty()){

            outputArea.setText("No Appointments Found");

            return;
        }

        for(Appointment a : hospital.getAppointments()){

            outputArea.appendText(
                    "Appointment Date: "
                    + a.getAppointmentDate()
                    + "\nDoctor: "
                    + a.getDoctor().getName()
                    + "\nPatient: "
                    + a.getPatient().getName()
                    + "\n\n"
            );
        }
    }

    // ================= Search Doctor =================

    @FXML
    public void searchDoctor() {

        outputArea.setText(
                "Search Doctor Feature Ready"
        );
    }

    // ================= View Bills =================

    @FXML
    public void viewBills() {

        outputArea.clear();

        if(hospital.getBills().isEmpty()){

            outputArea.setText("No Bills Found");

            return;
        }

        for(Bill b : hospital.getBills()){

            outputArea.appendText(
                    "Bill ID: "
                    + b.getBillID()
                    + "\nAmount: "
                    + b.getAmount()
                    + "\n\n"
            );
        }
    }
}