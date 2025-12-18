//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestPatient {
    public static void main(String[] args) {
        PatientList list = new PatientList();

        list.addPatient(12345, "betül", 2, 23); //add the patient
        list.addPatient(45678, "bugrahan", 5, 14);  //add the patient
        list.addPatient(18965, "zeynep", 6, 63);  //add the patient
        list.addPatient(25896, "tugba", 7, 23); //add the patient
        list.addPatient(14785, "burak", 3, 5);  //add the patient
        list.print();
        System.out.println("Removing a patient..."); //remove the patient
        list.remove(12345);
        list.print();
        System.out.println("Searching a patient..." + list.findPatient(14785)); //search the patient
        System.out.println();
        list.print(); //print the final list
    }

       /* Patient id = 12345 ,name = betül ,severity = 2 ,age = 23
        Patient id = 45678 ,name = bugrahan ,severity = 5 ,age = 14
        Patient id = 18965 ,name = zeynep ,severity = 6 ,age = 63
        Patient id = 25896 ,name = tugba ,severity = 7 ,age = 23
        Patient id = 14785 ,name = burak ,severity = 3 ,age = 5
        Removing a patient...
        Patient id = 45678 ,name = bugrahan ,severity = 5 ,age = 14
        Patient id = 18965 ,name = zeynep ,severity = 6 ,age = 63
        Patient id = 25896 ,name = tugba ,severity = 7 ,age = 23
        Patient id = 14785 ,name = burak ,severity = 3 ,age = 5
        Searching a patient...Patient id = 14785 ,name = burak ,severity = 3 ,age = 5

        Patient id = 45678 ,name = bugrahan ,severity = 5 ,age = 14
        Patient id = 18965 ,name = zeynep ,severity = 6 ,age = 63
        Patient id = 25896 ,name = tugba ,severity = 7 ,age = 23
        Patient id = 14785 ,name = burak ,severity = 3 ,age = 5*/




}