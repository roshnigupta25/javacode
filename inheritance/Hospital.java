package inheritance;

//Base class Doctor
class Doctor {
 // Method to simulate a surgery
 public void surgery() {
     System.out.println("Doctor is Performing surgery");
 }
}

//Surgeon class extending Doctor
class Surgeon extends Doctor {
 // Surgeon inherits the surgery() method from Doctor
 // No need to override unless specific behavior is required
}

//Nurse class extending Doctor
class Nurse extends Doctor {
 // Method to simulate treatment
 public void treatment() {
     System.out.println("Nurse is Providing treatment");
 }
}

//Main class to test the hierarchy
public class Hospital {
 public static void main(String[] args) {
     // Create instances of Surgeon and Nurse
     Surgeon surgeon = new Surgeon();
     Nurse nurse = new Nurse();
     
     // Call inherited method surgery() on Surgeon
     surgeon.surgery();
     
     // Call inherited method surgery() on Nurse
     nurse.surgery();
     
     // Call treatment() method on Nurse
     nurse.treatment();
 }
}
