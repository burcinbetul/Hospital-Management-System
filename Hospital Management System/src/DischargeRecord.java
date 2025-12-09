public class DischargeRecord {
    private int patientId;
    private long dischargeTime;

    public DischargeRecord(int patientId,long dischargeTime){
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;
    }

    public int getPatientId() {
        return patientId;
    }

    public long getDischargeTime() {
        return dischargeTime;
    }
    public String toString() { // to make string type
        return "Patient id = " + patientId + " ,discharge time = " + dischargeTime;
    }
}
