/**
 * Created with IntelliJ IDEA.
 * User: siguremon
 * Date: 2013/10/19
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
public class AddHourlyEmployee extends AddEmployeeTransaction {
    private double itsSalary;

    public AddHourlyEmployee(int empId, String name, String address, double salary) {
        super(empId, name, address);
        itsSalary = salary;
    }

    @Override
    PaymentClassification getClassification() {
        return new HourlyClassification(itsSalary);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    PaymentSchedule getSchedule() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
