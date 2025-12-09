public class DischargeStack {
    private RecordNode top;
    int size;

    public DischargeStack(){
        top = null;
        size = 0;
    }
    public void push(DischargeRecord record){
        RecordNode newNode = new RecordNode(record);
        if(isEmpty()){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        size++;
    }
    public DischargeRecord pop(){
        if(isEmpty()){
            System.out.println("there is no record");
        }
        RecordNode delete = top;
        top = top.next;
        size--;
        return delete.record;
    }
    public DischargeRecord peek(){
        return top.record;
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("there is no record");
        }
        RecordNode temp = top;
        while (temp != null){
            System.out.println(temp.record );
            temp = temp.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return top == null;
    }
}
