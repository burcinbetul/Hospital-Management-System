//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PatientList list = new PatientList();

        list.addPatient(12345,"betül",2,23); //add the patient
        list.addPatient(45678,"bugrahan",5,14);  //add the patient
        list.addPatient(18965,"zeynep",6,63);  //add the patient
        list.addPatient(25896,"tugba",7,23); //add the patient
        list.addPatient(14785,"burak",3,5);  //add the patient
        list.print();
        System.out.println("Removing a patient..."); //remove the patient
        list.remove(12345);
        list.print();
        System.out.println("Searching a patient..." + list.findPatient(14785)); //search the patient
        System.out.println();
        list.print(); //print the final list



    }
}