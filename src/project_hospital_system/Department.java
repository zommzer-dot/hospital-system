/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Doctor> doctors;  
    private ArrayList<Nurse> nurse;
    public Department(String name) {
        this.deptName = name;
        this.doctors = new ArrayList<>();
        this.nurse = new ArrayList<>(); 
    }

    public void add(Doctor doc) {
        doctors.add(doc);
    }
    public void add(Nurse nur) {
        nurse.add(nur);
    }

    public void showDoctors() {
        System.out.println("Doctors in " + deptName + ":");
        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }
    
    public void shownurse() {
        System.out.println("Nurse in " + deptName + ":");
        for (Nurse n :nurse ) {
            System.out.println(n);
        }
    }
    


public Doctor searchDoctor(String name){

    for(Doctor d : doctors){

        if(d.getName().equalsIgnoreCase(name)){

            return d;
        }
    }

    return null;
}


public Nurse searchNurse(String name){

    for(Nurse n : nurse){

        if(n.getName().equalsIgnoreCase(name)){

            return n;
        }
    }

    return null;
}







}