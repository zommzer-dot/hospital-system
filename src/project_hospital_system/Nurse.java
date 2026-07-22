/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;

public class Nurse extends Person implements display {
  private String shiftTime;
  private String qualification;
  

    public Nurse(String shiftTime, String qualification, int ID, String name, int age, String address, String phone) {
        super(ID, name, age, address, phone);
        this.shiftTime = shiftTime;
        this.qualification = qualification;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
   
    
  
    
    
    
    @Override  
  public void displayRole(){
  System.out.println("Role : Nurse");        
  }   
   
  @Override  
  public  void displayInfo(){
  System.out.println("\nShift Time = " + getShiftTime() +"\nQualification = " + getQualification()+"\n");       
  }   
    
 
    
    
    
    
    
    
    
}
