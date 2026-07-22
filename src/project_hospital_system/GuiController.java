/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project_hospital_system;



import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GuiController {

    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField specializationField;

    @FXML
    private TextField clinicField;

    @FXML
    private TextField salaryField;

    @FXML
    private TextField shiftField;

    @FXML
    private TextField qualificationField;

    @FXML
    private TextField bloodTypeField;

    @FXML
    private TextField medicalHistoryField;

    @FXML
    private TextField appointmentDateField;

    @FXML
    private TextField billAmountField;

    @FXML
    private TextArea outputArea;

    Hospital_system hospital =  new Hospital_system("Hospital");

    // ================= Add Doctor =================

    @FXML
    public void addDoctor(){

        try{

            int id = Integer.parseInt(idField.getText());

            String name = nameField.getText();

            int age = Integer.parseInt(ageField.getText());

            String address = addressField.getText();

         String phone = phoneField.getText();

            String specialization =
                    specializationField.getText();

            String clinic = clinicField.getText();

            double salary =
                    Double.parseDouble(salaryField.getText());

            Doctor d = new Doctor(
                    specialization,
                    clinic,
                    salary,
                    id,
                    name,
                    age,
                    address,
                    phone
            );

            hospital.addDoctor(d);

            outputArea.setText("Doctor Added Successfully");

        }
        catch(Exception e){

            outputArea.setText("Invalid Input");
        }
    }

    // ================= Add Patient =================

    @FXML
    public void addPatient(){

        try{

            int id = Integer.parseInt(idField.getText());

            String name = nameField.getText();

            int age = Integer.parseInt(ageField.getText());

            String address = addressField.getText();

           String phone = phoneField.getText();
         
            String bloodType =
                    bloodTypeField.getText();

            String history =
                    medicalHistoryField.getText();
String illness = "Unknown";
            Patient p = new Patient(
        bloodType,
        history,
        id,
        name,
        age,
        illness,
        address,
        phone
);

            hospital.addPatient(p);

            outputArea.setText("Patient Added Successfully");

        }
        catch(Exception e){

            outputArea.setText("Invalid Input");
        }
    }

    // ================= Add Nurse =================

    @FXML
    public void addNurse(){

        try{

            int id = Integer.parseInt(idField.getText());

            String name = nameField.getText();

            int age = Integer.parseInt(ageField.getText());

            String address = addressField.getText();

         String phone = phoneField.getText();

            String shift = shiftField.getText();

            String qualification =
                    qualificationField.getText();

            Nurse n = new Nurse(
                    shift,
                    qualification,
                    id,
                    name,
                    age,
                    address,
                    phone
            );

            hospital.addNurse(n);

            outputArea.setText("Nurse Added Successfully");

        }
        catch(Exception e){

            outputArea.setText("Invalid Input");
        }
    }

    // ================= Display Doctors =================

    @FXML
    public void displayDoctors(){

        outputArea.clear();

        for(Doctor d : hospital.getDoctors()){

            outputArea.appendText(
                    "Doctor Name: "
                    + d.getName()
                    + "\nSpecialization: "
                    + d.getSpecialization()
                    + "\n\n"
            );
        }
    }

    // ================= Display Patients =================

    @FXML
    public void displayPatients(){

        outputArea.clear();

        for(Patient p : hospital.getPatient()){

            outputArea.appendText(
                    "Patient Name: "
                    + p.getName()
                    + "\nBlood Type: "
                    + p.getBloodType()
                    + "\n\n"
            );
        }
    }

    // ================= Display Nurses =================

    @FXML
    public void displayNurses(){

        outputArea.clear();

        for(Nurse n : hospital.getNurse()){

            outputArea.appendText(
                    "Nurse Name: "
                    + n.getName()
                    + "\nShift: "
                    + n.getShiftTime()
                    + "\n\n"
            );
        }
    }

    // ================= Search Doctor =================

    @FXML
    public void searchDoctor(){

        String name = nameField.getText();

        Doctor d = hospital.searchDoctor(name);

        if(d != null){

            outputArea.setText(
                    "Doctor Found\n\n"
                    + d.getName()
                    + "\n"
                    + d.getSpecialization()
            );
        }
        else{

            outputArea.setText("Doctor Not Found");
        }
    }

    // ================= Delete Patient =================

    @FXML
public void deletePatient(){

    try{

        int id = Integer.parseInt(idField.getText());

        boolean deleted = hospital.deletePatient(id);

        if(deleted){

            outputArea.setText("Patient Deleted");
        }
        else{

            outputArea.setText("Patient Not Found");
        }
    }
    catch(Exception e){

        outputArea.setText("Invalid ID");
    }
}
    // ================= Add Appointment =================

    @FXML
    public void addAppointment(){

        try{

            String appointmentDate =
                    appointmentDateField.getText();

            Doctor d =
                    hospital.searchDoctor(nameField.getText());

            Patient p =
                    hospital.searchPatient(nameField.getText());

            if(d == null || p == null){

                outputArea.setText("Doctor or Patient Not Found");

                return;
            }

            Appointment a = new Appointment(
                    "A" + System.currentTimeMillis(),
                    appointmentDate,
                    d,
                    p
            );

            hospital.addAppointment(a);

            outputArea.setText("Appointment Added");

        }
        catch(Exception e){

            outputArea.setText("Error");
        }
    }

    // ================= Display Appointments =================

    @FXML
    public void displayAppointments(){

        outputArea.clear();

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

    // ================= Add Bill =================

    @FXML
    public void addBill(){

        try{

            int id = Integer.parseInt(idField.getText());

            double amount =
                    Double.parseDouble(billAmountField.getText());

            Bill b = new Bill(id, amount);

            hospital.addBill(b);

            outputArea.setText("Bill Added Successfully");

        }
        catch(Exception e){

            outputArea.setText("Invalid Input");
        }
    }

    // ================= Display Bills =================

    @FXML
    public void displayBills(){

        outputArea.clear();

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