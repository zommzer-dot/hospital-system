/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;


public class Bill {


    protected int billID;

    protected double amount;

    public Bill(int billID, double amount) {

        this.billID = billID;

        this.amount = amount;
    }

    public int getBillID() {

        return billID;
    }

    public void setBillID(int billID) {

        this.billID = billID;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public void displayBill(){

        System.out.println("Bill ID: " + billID);

        System.out.println("Total Amount: $" + amount);

        System.out.println();
    }
}
    
    
