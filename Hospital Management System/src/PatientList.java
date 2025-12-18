public class PatientList {
    public PatientNode head; //first patient
    public PatientNode tail;//last patient

    //add patient to the list.
    public void addPatient(int id, String name,int severity,int age){ //constructor
        Patient newPatient = new Patient(id,name,severity,age); //new data
        PatientNode newNode = new PatientNode(newPatient);
        if(head == null){ //Is the list empty
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode; //update the tail
        }
    }
    //remove a patient by their ID
    public void remove(int id){
        if(head == null){ //Is the list empty
            System.out.println("The list is empty");
        }
        else if(head.data.getId() == id){ //if the element to be deleted is head
            head = head.next;
            if(head == null) { //if head is null
                tail = null;
            }
        }
        else{
            PatientNode temp = head; //temporary variable

            while(temp.next != null && temp.next.data.getId() != id){ //If temp is not equal to id and there is another element after temp
               temp = temp.next; //update temp variable
            }
            if(temp.next == null){
                System.out.println("Patient not found");
                return;
            }
            temp.next = temp.next.next;
            if(temp.next == null){  //the last element is temp
            tail = temp; //tail is temp
            }

        }
    }
    //search for a patient by ID and return the object
    public Patient findPatient(int id){
        if(head == null){ //Is the list empty
            System.out.println("The list is empty");
            return null;
        }
        PatientNode temp = head; //temporary variable
        while(temp != null){
            if(temp.data.getId() == id){  //if the element to be found is temp
                return temp.data;
            }
            temp = temp.next; //update temp variable
        }
        //if the id is not in the list
        System.out.println("Patient id " + id + " not found");
        return null;
    }
    //print all patients currently in the list
    public void print(){ //print the list
        PatientNode temp = head; //temporary variable
        if(head == null){ //the listy is empty
            System.out.println("The list is empty");
        }
        else{
            while (temp != null){
                System.out.println(temp.data + " "); //print temp's data
                temp = temp.next; // update temp variable
            }
        }
    }
    public void sortBySeverity(){
        if(head == null) return;

        boolean exchange;
        do{
            exchange = false;
            PatientNode current = head;

            while(current.next != null){
                if(current.data.getSeverity()>  current.next.data.getSeverity()){
                    Patient temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    exchange = true;
                }
                current = current.next;
            }
        } while(exchange);
    }


    }

