/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;



    

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. Console System");

        System.out.println("2. GUI System");

        System.out.print("Choose: ");

        int choice = input.nextInt();

        if(choice == 1){

            project_Hospital_system.main(args);
        }
        else if(choice == 2){

            GuiMain.main(args);
        }
        else{

            System.out.println("Invalid Choice");
        }
    }
}

