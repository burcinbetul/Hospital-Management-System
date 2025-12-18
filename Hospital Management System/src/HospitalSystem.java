import java.util.HashMap;

public class HospitalSystem {

    private PatientList patientList;
    private TreatmentQueue normalQueue;
    private TreatmentQueue priorityQueue;
    private DischargeStack dischargeStack;


    private HashMap<Integer, Patient> patientHashMap; // used for faster access by patient id

    public HospitalSystem(){
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();

        patientHashMap = new HashMap<>();
    }


    public void addPatient(int id, String name, int severity, int age){ // adds patient both to list and hashmap

        Patient p = new Patient(id, name, severity, age);


        patientList.addPatient(id, name, severity, age);  // first add to linked list


        patientHashMap.put(id, p);// then keep it in hashmap for fast lookup
    }



    public void addTreatmentRequest(int patientId, boolean priority){// priority patients are added to a separate queue

        TreatmentRequest request =
                new TreatmentRequest(patientId);

        if(priority == true){
            priorityQueue.enqueue(request);
        }
        else{
            normalQueue.enqueue(request);
        }
    }


    public void processTreatment(){// processes only one treatment request at a time

        TreatmentRequest currentRequest = null;


        currentRequest = priorityQueue.dequeue(); // priority queue is checked first


        if(currentRequest == null){// if there is no priority request, take from normal queue
            currentRequest = normalQueue.dequeue();
        }

        if(currentRequest != null){

            int dischargedPatientId =
                    currentRequest.getPatientId();

            long time =
                    System.currentTimeMillis();

            DischargeRecord record =
                    new DischargeRecord(dischargedPatientId, time);

            dischargeStack.push(record);
        }
    }

    public void printSystem(){

        System.out.println("PATİENT LIST");
        patientList.print();

        System.out.println("PRIORITY QUEUE");
        priorityQueue.printQueue();

        System.out.println("NORMAL QUEUE");
        normalQueue.printQueue();

        System.out.println("DISCHARGE STACK");
        dischargeStack.printStack();
    }
}