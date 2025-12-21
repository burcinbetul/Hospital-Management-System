public class HospitalMain {

    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();


        system.addPatient(12345, "Betul", 2, 23); //add patients to the system
        system.addPatient(45678, "Bugrahan", 5, 14);
        system.addPatient(18965, "Zeynep", 6, 63);
        system.addPatient(25896, "Tugba", 7, 23);
        system.addPatient(14785, "Burak", 3, 5);

        System.out.println();


        system.addTreatmentRequest(12345, false);  //add treatment requests (priority and normal)
        system.addTreatmentRequest(45678, true);   //priority
        system.addTreatmentRequest(18965, false);
        system.addTreatmentRequest(25896, true);   //priority
        system.addTreatmentRequest(14785, false);

        System.out.println();


        system.processTreatment(); //process treatment requests (priority first)
        system.processTreatment();
        system.processTreatment();

        System.out.println();


        system.printSystem(); //print final system state


    }
}
      /*  Patient id = 45678 ,arrival time = 1766337257861is deleted
        Patient id = 25896 ,arrival time = 1766337257861is deleted
The queue is empty
        Patient id = 12345 ,arrival time = 1766337257859is deleted

PATİENT LIST
        Patient id = 12345 ,name = Betul ,severity = 2 ,age = 23
        Patient id = 45678 ,name = Bugrahan ,severity = 5 ,age = 14
        Patient id = 18965 ,name = Zeynep ,severity = 6 ,age = 63
        Patient id = 25896 ,name = Tugba ,severity = 7 ,age = 23
        Patient id = 14785 ,name = Burak ,severity = 3 ,age = 5
PRIORITY QUEUE
Queue is empty
NORMAL QUEUE
        Patient id = 18965 ,arrival time = 1766337257861
        Patient id = 14785 ,arrival time = 1766337257861
DISCHARGE STACK
        Patient id = 12345 ,discharge time = 1766337257865
        Patient id = 25896 ,discharge time = 1766337257865
        Patient id = 45678 ,discharge time = 1766337257865*/