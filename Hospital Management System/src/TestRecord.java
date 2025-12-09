public class TestRecord {
    public static void main(String[] args){
        DischargeRecord dr1 = new DischargeRecord(12345,258);
        DischargeRecord dr2 = new DischargeRecord(23456,369);
        DischargeRecord dr3 = new DischargeRecord(34567,147);
        DischargeRecord dr4 = new DischargeRecord(45678,852);
        DischargeRecord dr5 = new DischargeRecord(56789,741);

        DischargeStack stack = new DischargeStack();
        stack.push(dr1);
        stack.push(dr2);
        stack.push(dr3);
        stack.push(dr4);
        stack.push(dr5);
        stack.printStack();
        System.out.println("Deleted: " + stack.pop());
        System.out.println("Deleted: " + stack.pop());
        System.out.println();
        stack.printStack();

        /*Patient id = 56789 ,discharge time = 741
        Patient id = 45678 ,discharge time = 852
        Patient id = 34567 ,discharge time = 147
        Patient id = 23456 ,discharge time = 369
        Patient id = 12345 ,discharge time = 258

        Deleted: Patient id = 56789 ,discharge time = 741
        Deleted: Patient id = 45678 ,discharge time = 852

        Patient id = 34567 ,discharge time = 147
        Patient id = 23456 ,discharge time = 369
        Patient id = 12345 ,discharge time = 258*/

    }
}
