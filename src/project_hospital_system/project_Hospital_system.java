/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_hospital_system;

import java.util.Scanner;


public class project_Hospital_system {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hospital_system hospital = new Hospital_system("Alexandria Hospital");
    DoctorDAO doctorDAO = new DoctorDAO();

    PatientDAO patientDAO = new PatientDAO();

    NurseDAO nurseDAO = new NurseDAO();

    AppointmentDAO appointmentDAO = new AppointmentDAO();

    doctorDAO.createTable();

    patientDAO.createTable();

    nurseDAO.createTable();

    appointmentDAO.createTable();

        int choice;

        do {

            System.out.println("\n**** Hospital Management System ****");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Add Nurse");
            System.out.println("4. Display Doctors");
            System.out.println("5. Display Patients");
            System.out.println("6. Display Nurses");
            System.out.println("7. Search Doctor");
            System.out.println("8. Search Patient");
            System.out.println("9. Delete Patient");
            System.out.println("10.Display Appointments");
            System.out.println("11.Add Appointments");
            System.out.println("12. Add Bill ");
            System.out.println("13.Display Bills ");
            System.out.println("14.Exit ");
              
            System.out.print("Enter Choice: ");

  try{
         
    choice = input.nextInt();
      input.nextLine();     
switch (choice) {

   case 1:

       try {

            System.out.println("\n--- Add Doctor ---");

           System.out.print("Enter ID: ");
          int doctorId = input.nextInt();
            input.nextLine();
         while(hospital.searchDoctor(doctorId) != null){

           System.out.println("ID Already Exists");

           System.out.print("Enter ID Again: ");

           doctorId = input.nextInt();
           input.nextLine();
                      }
          System.out.print("Enter Name: ");
         String doctorName = input.nextLine();
         
   while(doctorName.matches(".*\\d.*")|| doctorName.trim().isEmpty()){

      System.out.println("Name Cannot Contain Numbers");
      System.out.println("Enter Name Again");
        doctorName = input.nextLine();
   }
         System.out.print("Enter Age: ");
         int doctorAge = input.nextInt();
          input.nextLine();
          while(doctorAge < 0 || doctorAge > 130){

    System.out.println("Invalid Age");

    System.out.print("Enter Age Again: ");
    doctorAge = input.nextInt();
    input.nextLine();
}

          System.out.print("Enter Address: ");
          String doctorAddress = input.nextLine();
          while(doctorAddress.trim().isEmpty()){

    System.out.println("Address Cannot Be Empty");

    System.out.print("Enter Address Again: ");

    doctorAddress = input.nextLine();
}

          System.out.print("Enter Phone: ");
         String doctorPhone = input.nextLine();
           while(!doctorPhone.matches("\\d+") || doctorPhone.trim().isEmpty()){

    System.out.println("Invalid Phone");

    System.out.print("Enter Phone Again: ");

    doctorPhone = input.nextLine();
}
          System.out.print("Enter Specialization: ");
          String specialization = input.nextLine();

          System.out.print("Enter Clinic: ");
          String clinic = input.nextLine();

          System.out.print("Enter Salary: ");
          double salary = input.nextDouble();
                  input.nextLine();
                  while(salary < 0){

                 System.out.println("Invalid Salary");

                 System.out.print("Enter Salary Again: ");

                   salary = input.nextDouble();
                     input.nextLine();
                            }
        Doctor d = new Doctor(specialization,clinic, salary,doctorId, doctorName, doctorAge, doctorAddress,doctorPhone);
                 
                  hospital.addDoctor(d);
                  doctorDAO.addDoctor(d);
                  System.out.println("Doctor Added Successfully");

               } catch (Exception e) {

                     System.out.println("Invalid Input");

                       input.nextLine();
                    }

                     break;
         
    case 2:

             try {

                 System.out.println("\n--- Add Patient ---");

                 System.out.print("Enter ID: ");
                 int patientId = input.nextInt();
                 input.nextLine();
                  while(hospital.searchPatient(patientId) != null){

                  System.out.println("ID Already Exists");

                  System.out.print("Enter ID Again: ");

                  patientId = input.nextInt();
                   input.nextLine();
                           }
                 System.out.print("Enter Name: ");
                 String patientName = input.nextLine();
               while(patientName.matches(".*\\d.*") || patientName.trim().isEmpty()){

             System.out.println("Name Cannot Contain Numbers");

              System.out.print("Enter Name Again: ");

               patientName = input.nextLine();
                             }
                 System.out.print("Enter Age: ");
                 int patientAge = input.nextInt();
                 input.nextLine();
                 while(patientAge < 0 || patientAge > 130){

                  System.out.println("Invalid Age");

                System.out.print("Enter Age Again: ");

                     patientAge = input.nextInt();
                          input.nextLine();
                                  }

                 System.out.print("Enter Address: ");
                 String patientAddress = input.nextLine();
               while(patientAddress.trim().isEmpty()){

                  System.out.println("Address Cannot Be Empty");

                  System.out.print("Enter Address Again: ");

                  patientAddress = input.nextLine();
                               }
                 System.out.print("Enter Phone: ");
                 String patientPhone = input.nextLine();
                   while(!patientPhone.matches("\\d+") || patientPhone.trim().isEmpty()){

                    System.out.println("Invalid Phone");

                    System.out.print("Enter Phone Again: ");

                     patientPhone = input.nextLine();
                               }
                 System.out.print("Enter Blood Group: ");
                 String bloodGroup = input.nextLine();
while(!(bloodGroup.equalsIgnoreCase("A+")
        || bloodGroup.equalsIgnoreCase("A-")
        || bloodGroup.equalsIgnoreCase("B+")
        || bloodGroup.equalsIgnoreCase("B-")
        || bloodGroup.equalsIgnoreCase("O+")
        || bloodGroup.equalsIgnoreCase("O-")
        || bloodGroup.equalsIgnoreCase("AB+")
        || bloodGroup.equalsIgnoreCase("AB-"))){

    System.out.println("Invalid Blood Group");

    System.out.print("Enter Blood Group Again: ");

    bloodGroup = input.nextLine();
}
                 System.out.print("Enter Disease: ");
                 String disease = input.nextLine();

                 System.out.print("Enter Medical History: ");
                 String history = input.nextLine();

     Patient p = new Patient(disease,  bloodGroup,  patientId, patientName, patientAge, patientAddress, history, patientPhone);

            hospital.addPatient(p);
            patientDAO.addPatient(p);
            System.out.println("Patient Added Successfully");

        } catch (Exception e) {

            System.out.println("Invalid Input");

            input.nextLine();
        }

        break;

case 3:

            try {

                System.out.println("\n--- Add Nurse ---");

                System.out.print("Enter ID: ");
                int nurseId = input.nextInt();
                input.nextLine();
                 while(hospital.searchNurse(nurseId) != null){

                   System.out.println("ID Already Exists");

                   System.out.print("Enter ID Again: ");

                    nurseId = input.nextInt();
                        input.nextLine();
                                 }
                System.out.print("Enter Name: ");
                String nurseName = input.nextLine();
            while(nurseName.matches(".*\\d.*") || nurseName.trim().isEmpty()){

                System.out.println("Name Cannot Contain Numbers");

                System.out.print("Enter Name Again: ");

                nurseName = input.nextLine();
            }
                System.out.print("Enter Age: ");
                int nurseAge = input.nextInt();
                input.nextLine();
                while(nurseAge < 0 || nurseAge > 130){

                  System.out.println("Invalid Age");

                  System.out.print("Enter Age Again: ");

                   nurseAge = input.nextInt();
                      input.nextLine();
                               }
                System.out.print("Enter Address: ");
                String nurseAddress = input.nextLine();
                  while(nurseAddress.trim().isEmpty()){

                     System.out.println("Address Cannot Be Empty");

                     System.out.print("Enter Address Again: ");

                     nurseAddress = input.nextLine();
                                   }
                System.out.print("Enter Phone: ");
                String nursePhone = input.nextLine();
                 while(!nursePhone.matches("\\d+") || nursePhone.trim().isEmpty()){

                 System.out.println("Invalid Phone");

                 System.out.print("Enter Phone Again: ");

                 nursePhone = input.nextLine();
                          }   
                System.out.print("Enter Shift: ");
                String shift = input.nextLine();
                  
                System.out.print("Enter Qualification: ");
                String qualification = input.nextLine();

                Nurse n = new Nurse(shift,qualification,nurseId,nurseName,nurseAge,nurseAddress,nursePhone);

                hospital.addNurse(n);
                nurseDAO.addNurse(n);
                System.out.println("Nurse Added Successfully");

            } catch (Exception e) {

                System.out.println("Invalid Input");

                input.nextLine();
            }

          break;

            case 4:

                System.out.println("\n--- Doctors List ---");

                hospital.displayDoctor();

                break;

            case 5:

                System.out.println("\n--- Patients List ---");

                hospital.displayPatient();

                break;

            case 6:

                System.out.println("\n--- Nurses List ---");

                hospital.displayNurse();

                break;
            case 7:

                System.out.print("Enter Doctor Name: ");

                String searchDoctor = input.nextLine();
                
                  while(searchDoctor.trim().isEmpty()){

                       System.out.println("Name Cannot Be Empty");

                       System.out.print("Enter Name Again: ");

                         searchDoctor = input.nextLine();
                                      }
              Doctor d=  hospital.searchDoctor(searchDoctor);
              
              if(d != null){
                d.displayInfo();
                    }
              else{
              System.out.println("Doctor Not Found");
               }
                  
                break;

             case 8:

                System.out.print("Enter Patient Name: ");

                String searchPatient = input.nextLine();
                 while(searchPatient.trim().isEmpty()){

                   System.out.println("Name Cannot Be Empty");

                   System.out.print("Enter Name Again: ");

                   searchPatient = input.nextLine();
                                }
              Patient pa=hospital.searchPatient(searchPatient);
              if(pa != null){
                pa.displayInfo();
                    }
              else{
              System.out.println("Patient Not Found");
               }
                break;

               case 9:

                        try {

                            System.out.print("Enter Patient ID: ");

                            int deleteId = input.nextInt();
                             input.nextLine();
                          boolean deleted = hospital.deletePatient(deleteId);
                          
                              if(deleted){

                            System.out.println("Patient Deleted");
                                    }
                                  else{

                                    System.out.println("Patient Not Found");
                                           }

                           

                        } catch (Exception e) {

                            System.out.println("Invalid ID");

                            input.nextLine();
                        }        
                     break;
               case 10 :   
                     
                 
              System.out.println("\n--- Appointments List ---");

              hospital.displayAppointments();

              break;    
                     
                     
               case 11:         
                     try{

        System.out.println("\n--- Add Appointment ---");

        System.out.print("Enter Appointment ID: ");

        String appointmentId = input.nextLine();

        while(appointmentId.trim().isEmpty()){

            System.out.println("Appointment ID Cannot Be Empty");

            System.out.print("Enter Appointment ID Again: ");

            appointmentId = input.nextLine();
        }

        while(hospital.searchappointments(appointmentId) != null){

            System.out.println("Appointment ID Already Exists");

            System.out.print("Enter Appointment ID Again: ");

            appointmentId = input.nextLine();
        }

        System.out.print("Enter Appointment Date: ");

        String appointmentDate = input.nextLine();

        while(appointmentDate.trim().isEmpty()){

            System.out.println("Date Cannot Be Empty");

            System.out.print("Enter Date Again: ");

            appointmentDate = input.nextLine();
        }

        System.out.print("Enter Doctor Name: ");

        String doctorNameAppointment = input.nextLine();
        while(doctorNameAppointment.trim().isEmpty()){

    System.out.println("Doctor Name Cannot Be Empty");

    System.out.print("Enter Doctor Name Again: ");

    doctorNameAppointment = input.nextLine();
}
        Doctor doctorAppointment = hospital.searchDoctor(doctorNameAppointment);

        if(doctorAppointment == null){

            System.out.println("Doctor Not Found");

            break;
        }

        System.out.print("Enter Patient Name: ");

        String patientNameAppointment = input.nextLine();
while(patientNameAppointment.trim().isEmpty()){

    System.out.println("Patient Name Cannot Be Empty");

    System.out.print("Enter Patient Name Again: ");

    patientNameAppointment = input.nextLine();
}
        Patient patientAppointment = hospital.searchPatient(patientNameAppointment);

        if(patientAppointment == null){

            System.out.println("Patient Not Found");

            break;
        }

        Appointment ap = new Appointment(appointmentId,appointmentDate,doctorAppointment,patientAppointment);

        hospital.addAppointment(ap);
        appointmentDAO.addAppointment(ap);
        System.out.println("Appointment Added Successfully");

    }
    catch(Exception e){

        System.out.println("Invalid Input");

        input.nextLine();
    }

    break;
    
    
         case 12:

    try{

        System.out.println("\n--- Add Bill ---");

        System.out.print("Enter Bill ID: ");

        int billId = input.nextInt();
        input.nextLine();

        while(hospital.searchBill(billId) != null){

            System.out.println("Bill ID Already Exists");

            System.out.print("Enter Bill ID Again: ");

            billId = input.nextInt();
            input.nextLine();
        }

        System.out.print("Enter Amount: ");

        double amount = input.nextDouble();
        input.nextLine();

        while(amount < 0){

            System.out.println("Invalid Amount");

            System.out.print("Enter Amount Again: ");

            amount = input.nextDouble();
            input.nextLine();
        }

        Bill b = new Bill(billId, amount);

        hospital.addBill(b);

        System.out.println("Bill Added Successfully");

    }
    catch(Exception e){

        System.out.println("Invalid Input");

        input.nextLine();
    }

    break;
    
    case 13:

    System.out.println("\n--- Bills List ---");

    hospital.displayBills();

    break;
    
    
    
    
                     
                     
                case 14:

                    System.out.println("System Closed");

                     break;

                   default:

                     System.out.println("Invalid Choice");
                }

            } catch (Exception e) {

                System.out.println("Invalid Input Please Enter Numbers Only");

                input.nextLine();

                choice = 0;
            }

        } while (choice != 14);
         
           
   input.close();
        
    } 
}
    


