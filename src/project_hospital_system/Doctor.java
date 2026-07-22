/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

public class Doctor extends Person implements display  {
private String specialization;
 private String clinic;
 private double salary;

        public Doctor(){
    
    }

    public Doctor(String specialization, String clinic, double salary, int ID, String name, int age, String address, String phone) {
        super(ID, name, age, address, phone);
        this.specialization = specialization;
        this.clinic = clinic;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void displayRole(){
      System.out.println("Role : Doctor");    
    }   

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + getName() +" age= "+ getAge()+ " | Spec: " + getSpecialization() + " clinc= "+ getClinic() + " salary= " +getSalary());
       
    }
    
}
