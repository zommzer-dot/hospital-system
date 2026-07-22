/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;
//no Multiple inheritance because java dont have Multiple inheritance

public class MedicalRecord implements display {

    private int recordId;

    private String diagnosis;

    private String treatment;

    private String recordDate;

    private Patient patient;

    private Doctor doctor;
    
    private String notes;
    
    

    public MedicalRecord() {

    }

    public MedicalRecord(int recordId,String diagnosis, String treatment,String recordDate, Patient patient, Doctor doctor,String notes) {
        
                  this.recordId = recordId;
                  this.diagnosis = diagnosis;
                  this.treatment = treatment;
                  this.recordDate = recordDate;
                  this.patient = patient;
                  this.doctor = doctor;
                  this.notes = notes;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
@Override
public void displayInfo() {

    
    System.out.println("Medical Record " +

           "\nRecord ID : " + recordId +

           "\nDiagnosis : " + diagnosis +

           "\nTreatment : " + treatment +

           "\nNotes : " + notes +

           "\nRecord Date : " + recordDate +

           "\n\nPatient Info :" +
           "\nPatient Name : " + patient.getName() +

           "\n\nDoctor Info :" +
           "\nDoctor Name : " + doctor.getName() +

           "\n");   
}


  }
