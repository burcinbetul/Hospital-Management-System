public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;

    public TreatmentRequest(int patientId){
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis(); //Timestamp of the request
    }
    public int getPatientId(){
        return patientId;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }
    public String toString() { // to make string type
        return "Patient id = " + patientId + " ,arrival time = " + arrivalTime;
    }

}
