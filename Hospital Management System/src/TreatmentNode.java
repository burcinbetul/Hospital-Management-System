public class TreatmentNode {
    public TreatmentRequest data;
    public TreatmentNode next;

    public TreatmentNode(TreatmentRequest data){ //constructor
        this.data = data;
        this.next = null;
    }
}
