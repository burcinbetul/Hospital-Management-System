public class PatientList {
    public Node head; //first patient
    public Node tail; //last patient

    public void addPatient(int id, String name,int severity,int age){ //add patient to the list.
        Patient newPatient = new Patient(id,name,severity,age); //new data
        Node newNode = new Node(newPatient);
        if(head == null){ //Is the list empty
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode; //update the tail
        }
    }
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
            Node temp = head; //temporary variable

            while(temp.next != null && temp.next.data.getId() != id){ //If temp is not equal to id and there is another element after temp
               temp = temp.next; //update temp variable
            }
            temp.next = temp.next.next;
            if(temp.next == null){  //the last element is temp
            tail = temp; //tail is temp
            }

        }
    }
    public Patient findPatient(int id){
        if(head == null){ //Is the list empty
            System.out.println("The list is empty");
            return null;
        }
        Node temp = head; //temporary variable
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

    public void print(){ //print the list
        Node temp = head; //temporary variable
        if(head == null){ //the listy is empty
            throw new IllegalStateException("The list is empty");
        }
        else{
            while (temp != null){
                System.out.println(temp.data); //print temp's data
                temp = temp.next; // update temp variable
            }
        }
    }


    }

