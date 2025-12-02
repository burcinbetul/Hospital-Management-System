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
            Node temp = head;

            while(temp.next != null && temp.next.data.getId() != id){
               temp = temp.next;
            }
            if(temp.next == null){
                System.out.println("This id not found");
                return;
            }

            if(temp.next == null){
                tail = temp;
            }

        }
    }
    public Patient findPatient(int id){
        if(head == null){ //Is the list empty
            System.out.println("The list is empty");
            return null;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data.getId() == id){
                return temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Patient id " + id + " not found");
        return null;
    }

    public void print(){
        Node temp = head;
        if(head == null){
            throw new IllegalStateException("The list is empty");
        }
        else{
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }


    }

