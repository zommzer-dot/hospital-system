/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

//no Multiple inheritance because java dont have Multiple inheritance


public class Appointment implements display {
    
   private String appointmentId;
   private String appointmentDate;
   private Doctor doctor;
   private Patient patient;
   
    public Appointment(){
        
    }

    public Appointment(String appointmentId, String appointmentDate, Doctor doctor, Patient patient) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    

    @Override
public void displayInfo(){

    System.out.println("Appointment ID: " + getAppointmentId());

    System.out.println("Appointment Date: " + getAppointmentDate());

    System.out.println("\n--- Doctor Info ---");

    System.out.println("Doctor Name: " + doctor.getName());

    System.out.println("Doctor Specialization: " + doctor.getSpecialization());

    System.out.println("Clinic: " + doctor.getClinic());

    System.out.println("\n--- Patient Info ---");

    System.out.println("Patient Name: " + patient.getName());

    System.out.println("Blood Type: " + patient.getBloodType());

    System.out.println("Medical History: " + patient.getMedicalHistory());

    System.out.println();
}
    
    
    
}
