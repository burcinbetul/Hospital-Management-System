public class TreatmentQueue {
    private TreatmentNode front;
    private  TreatmentNode rear;
    private int size;

    public TreatmentQueue(){ //constructor
        front = null;
        rear = null;
        size = 0;
    }
    //add a new treatment request to the queue
    public void enqueue(TreatmentRequest request){
        TreatmentNode newNode = new TreatmentNode(request);
        if(front == null){ //if queue is empty
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++; //size increase by 1
    }
    //remove and return the first treatment request
    public TreatmentRequest dequeue(){
        if(front == null){  //Is the list empty
            System.out.println("The queue is empty");
            return null;
        }
        TreatmentRequest temp = front.data; //temporary variable
        front = front.next;
        if(front == null){ //if there are no more elements left after deletion
            rear = null;
        }
        System.out.println(temp + "is deleted");
        size--; //size decreasing by 1
        return temp;
    }
    //return the number of request int the queue
    public int size(){
        return size;
    }
    //print all request in the queue
    public void printQueue(){
        TreatmentNode temp = front; //temporary variable
        if(temp == null){ //if queue is empty
            System.out.println("Queue is empty");
        }
        while (temp != null){
            System.out.println(temp.data); //print temp's data
            temp = temp.next; //update temp variable
        }
    }

}
