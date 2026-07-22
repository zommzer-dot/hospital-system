/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_hospital_system;
import java.util.ArrayList;

public class Hospital_system {
  
    private String hospitalName;  
    
    private ArrayList<Person>persons;
    
    private ArrayList<Patient>Patient;
    
    private ArrayList<Doctor>Doctors;
    
    private ArrayList<Nurse>nurse;
    
    private ArrayList<Appointment> appointments;

    private ArrayList<MedicalRecord> records;

    private ArrayList<Department> departments;
    
    private  ArrayList<Bill> bills;

    public Hospital_system(String hospitalName) {
        this.hospitalName = hospitalName;
       persons = new ArrayList<>();
        Patient = new ArrayList<>();
        appointments = new ArrayList<>();
         Doctors = new ArrayList<>();
        records = new ArrayList<>();
        nurse= new ArrayList<>();
        departments = new ArrayList<>();
        bills = new ArrayList<>();
    }

    public void addPerson(Person p){
     this.persons.add(p);
    }
    
    public void addPatient(Patient pa){
     this.Patient.add(pa);
    }
    
    public void addDoctor(Doctor doc){
     this.Doctors.add(doc);
    }
    
    public void addNurse(Nurse n){
     this.nurse.add(n);
    }
    
     public void addAppointment(Appointment a){
     this.appointments.add(a);
    }
    
     public void addMedicalRecord( MedicalRecord m){
     this.records.add(m);
    }
    
    public void addDepartment( Department d){
     this.departments.add(d);
    }
    public void addBill(Bill b){

     this.bills.add(b);
    }

public void displayPersons(){

    for(Person p : persons){

       p.displayRole();
    }
}
public void displayPatient(){
    if(Patient.isEmpty()){

    System.out.println("No Patient Found");

    return;
}
    for(Patient pa :Patient){

        pa.displayInfo();
    }
}
public void displayDoctor() {

    DoctorDAO dao = new DoctorDAO();

    dao.getDoctors();
}

public void displayNurse(){
    if(nurse.isEmpty()){

    System.out.println("No Nurses Found");

    return;
}
    for(Nurse n :nurse){
        n.displayRole();
        n.displayInfo();
    }
}

public void displayAppointments(){
if(appointments.isEmpty()){

    System.out.println("No Appointments Found");

    return;
}
    for(Appointment a : appointments){

        a.displayInfo();
    }
}

public void displayRecords(){

    for(MedicalRecord m : records){

        m.displayInfo();
    }
}

public void displayDepartment(){
     for(Department d :departments ){

        d.showDoctors();
        d.shownurse();
    } 
}
public void displayBills(){

    if(bills.isEmpty()){

        System.out.println("No Bills Found");

        return;
    }

    for(Bill b : bills){

        b.displayBill();
    }
}


public Person searchPerson(int id){

    for(Person p : persons){

        if(p.getID() == id){

            return p;
        }
    }

    return null;
}

public Person searchPerson(String name){

    for(Person p : persons){

        if(p.getName().equalsIgnoreCase(name)){

            return p;
        }
    }

    return null;
}

public Patient searchPatient(int id){
    
  for(Patient pa :Patient ){

        if(pa.getID() == id){

            return pa;
        }
    }

    return null;  
}
public Patient searchPatient(String name){
    
  for(Patient pa :Patient ){

        if((pa.getName().equalsIgnoreCase(name))){

            return pa;
        }
    }

    return null;  
}

public Doctor searchDoctor(int id){
    
  for(Doctor doc :Doctors){

        if(doc.getID() == id){

            return doc;
        }
    }
  return null;
}

public Doctor searchDoctor(String name){
    
  for(Doctor doc :Doctors ){

        if((doc.getName().equalsIgnoreCase(name))){

            return doc;
        }
    }

    return null;  
}


public Nurse searchNurse(int id){
    
  for(Nurse n :nurse ){

        if(n.getID() == id){

            return n;
        }
    }

    return null;  
}


public Nurse searchNurse(String name){
    
  for(Nurse n :nurse ){

        if((n.getName().equalsIgnoreCase(name))){

            return n;
        }
    }

    return null;  
}


public Appointment searchappointments(String a){
    for( Appointment ap :appointments ){

        if((ap.getAppointmentId().equalsIgnoreCase(a))){

            return ap;
        }
    }

    return null;  
}


public MedicalRecord searchMedicalRecorddate(String da){
    for( MedicalRecord me :records ){

        if((me.getRecordDate().equalsIgnoreCase(da))){

            return me;
        }
    }

    return null;  
}



public Doctor searchDoctorInDepartments(String name){

    for(Department de : departments){

        Doctor d = de.searchDoctor(name);

        if(d != null){

            return d;
        }
    }

    return null;
}



public Nurse searchNurseInDepartments(String name){

    for(Department de : departments){

        Nurse n = de.searchNurse(name);

        if(n != null){

            return n;
        }
    }

    return null;
}
public Bill searchBill(int id){

    for(Bill b : bills){

        if(b.getBillID() == id){

            return b;
        }
    }

    return null;
}

public boolean deletePerson(int id){

    Person p = searchPerson(id);

    if(p != null){

        persons.remove(p);

        return true;
    }

    return false;
}



public boolean deletePatient(int id){

    Patient pa = searchPatient(id);

    if(pa != null){

        Patient.remove(pa);

        return true;
    }

    return false;
}



public boolean deleteDoctor(int id){

    Doctor doc = searchDoctor(id);

    if(doc != null){

        Doctors.remove(doc);

        return true;
    }

    return false;
}



public boolean deleteNurse(int id){

    Nurse n = searchNurse(id);

    if(n != null){

        nurse.remove(n);

        return true;
    }

    return false;
}

public boolean deleteAppointment(String id){

    Appointment ap = searchappointments(id);

    if(ap != null){

        appointments.remove(ap);

        return true;
    }

    return false;
}

public boolean deleteMedicalRecord(String date){

    MedicalRecord me = searchMedicalRecorddate(date);

    if(me != null){

        records.remove(me);

        return true;
    }

    return false;
}

    public String getHospitalName() {
        return hospitalName;
    }

//GUI


public ArrayList<Doctor> getDoctors(){

    return Doctors;
}

public ArrayList<Patient> getPatient(){

    return Patient;
}

public ArrayList<Nurse> getNurse(){

    return nurse;
}

public ArrayList<Appointment> getAppointments(){

    return appointments;
}

public ArrayList<Bill> getBills(){

    return bills;
}



}