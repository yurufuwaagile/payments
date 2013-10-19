
public class Employee {
    private int itsEmpId;
    private String itsName;
    private String itsAddress;

    private PaymentMethod itsMethod;
    private PaymentSchedule itsSchedule;
    private PaymentClassification itsClassification;

    public Employee(int empId, String name, String address) {
        itsEmpId = empId;
        itsName = name;
        itsAddress = address;
    }

    public String getName() {
        return itsName;
    }

    public PaymentClassification getClassification() {
        return itsClassification;
    }

    public PaymentSchedule getSchedule() {
        return itsSchedule;
    }

    public PaymentMethod getMethod() {
        return itsMethod;
    }

    public void setClassification(PaymentClassification classification) {
        itsClassification = classification;
    }

    public void setSchedule(PaymentSchedule schedule) {
        itsSchedule = schedule;
    }

    public void setMethod(PaymentMethod method) {
        itsMethod = method;
    }
}
