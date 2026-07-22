/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;


public abstract class Person {
    private int ID;
    private String name;
    private int age;
    private String address;
    private String phone;

    public Person(){
        
    }

    public Person(int ID, String name, int age,String address, String phone) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address=address;
         this.phone = phone;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

   public void setAge(int age) {

    if(age >= 0 && age <= 130) {
        this.age = age;
    }
    else {
        System.out.println("Invalid Age");
    }

}
   
   public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
  
     public abstract void displayRole();
         
     
}
