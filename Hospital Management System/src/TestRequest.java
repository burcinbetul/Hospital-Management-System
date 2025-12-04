public class TestRequest {
    public static void main(String[] args){
        TreatmentRequest r1 = new TreatmentRequest(100);
        TreatmentRequest r2 = new TreatmentRequest(101);
        TreatmentRequest r3 = new TreatmentRequest(102);
        TreatmentRequest r4 = new TreatmentRequest(103);
        TreatmentRequest r5 = new TreatmentRequest(104);
        TreatmentRequest r6 = new TreatmentRequest(105);
        TreatmentRequest r7 = new TreatmentRequest(106);
        TreatmentRequest r8 = new TreatmentRequest(107);

        TreatmentQueue queue = new TreatmentQueue();
        queue.enqueue(r1);
        queue.enqueue(r2);
        queue.enqueue(r3);
        queue.enqueue(r4);
        queue.enqueue(r5);
        queue.enqueue(r6);
        queue.enqueue(r7);
        queue.enqueue(r8);
        queue.printQueue();
        System.out.println("DEQUEUE OPERATION:");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println();
        System.out.println("PRINT REMAINING QUEUE:");
        queue.printQueue();
    }
}
       /* Patient id = 100 ,arrival time = 1764867375556
        Patient id = 101 ,arrival time = 1764867375556
        Patient id = 102 ,arrival time = 1764867375556
        Patient id = 103 ,arrival time = 1764867375556
        Patient id = 104 ,arrival time = 1764867375556
        Patient id = 105 ,arrival time = 1764867375556
        Patient id = 106 ,arrival time = 1764867375556
        Patient id = 107 ,arrival time = 1764867375556
DEQUEUE OPERATION:
        Patient id = 100 ,arrival time = 1764867375556is deleted
        Patient id = 101 ,arrival time = 1764867375556is deleted
        Patient id = 102 ,arrival time = 1764867375556is deleted

PRINT REMAINING QUEUE:
        Patient id = 103 ,arrival time = 1764867375556
        Patient id = 104 ,arrival time = 1764867375556
        Patient id = 105 ,arrival time = 1764867375556
        Patient id = 106 ,arrival time = 1764867375556
        Patient id = 107 ,arrival time = 1764867375556*/
