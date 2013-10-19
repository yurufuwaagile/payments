/**
 * Created with IntelliJ IDEA.
 * User: siguremon
 * Date: 2013/10/19
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
public class TimeCardTransaction implements Transaction {
    private long itsDate;
    private double itsHours;
    private int itsEmpId;

    public TimeCardTransaction(int date, double hours, int empId) {
        itsDate = date;
        itsHours = hours;
        itsEmpId = empId;
    }

    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(itsEmpId);
        if (e != null) {
            PaymentClassification pc = e.getClassification();
            if (pc instanceof HourlyClassification) {
                HourlyClassification hc = (HourlyClassification) pc;
                hc.addTimeCard(new TimeCard(itsDate, itsHours));
            } else {
                throw new RuntimeException("Tried to add timecard to non-hourly employee");
            }
        } else {
            throw new RuntimeException("No such employee");
        }
    }
}
