
public class Employee {
    public String getName() {
        return "";
    }

    public PaymentClassification getClassification() {
        return new PaymentClassification();
    }

    public PaymentSchedule getSchedule() {
        return new PaymentSchedule();
    }

    public PaymentMethod getMethod() {
        return new PaymentMethod();
    }
}
