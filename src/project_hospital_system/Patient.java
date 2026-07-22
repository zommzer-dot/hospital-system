/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

public class Patient extends Person implements display {
private String illness;
private String bloodType;
private String medicalHistory;

    public Patient(String bloodType, String medicalHistory,int ID, String name, int age , String illness,String address, String phone ) {
        super(ID, name, age,address, phone);
        this.illness = illness;
        this.bloodType = bloodType;
        this.medicalHistory = medicalHistory;

    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    
    
    
    
 @Override
    public void displayRole(){
     System.out.println("Role : patient");     
    }   
    @Override
    public void displayInfo() {
       System.out.println("patient " + getName() +"age "+getAge()+ "ilness " +getIllness() +"bloodType= "+ getBloodType()+ "medicalHistory"+getMedicalHistory() );
    }
   
  
    
    
}
