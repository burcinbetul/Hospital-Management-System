public class RecordNode {
    DischargeRecord record;
    RecordNode next;

    public RecordNode(DischargeRecord record){
        this.record = record;
        next = null;
    }
}
