public class Patient {
    private int id; //identifier for each patient
    private String name; //patient's name
    private int severity; //severity level of illness(1-10)
    private int age; //patient's age

    public Patient(int id, String name,int severity,int age){
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSeverity(){
        return severity;
    }
    public int getAge(){
        return age;
    }
    public String toString() { // to make string type
        return "Patient id = " + id + " ,name = " + name + " ,severity = " + severity + " ,age = " + age ;
    }


}
