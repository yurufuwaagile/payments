/**
 * Created with IntelliJ IDEA.
 * User: siguremon
 * Date: 2013/10/19
 * Time: 11:29
 * To change this template use File | Settings | File Templates.
 */
public class AddCommissionedEmployee extends AddEmployeeTransaction {
    public AddCommissionedEmployee(int empId, String name, String address, double salary, double commissionRate) {
        super(empId, name, address);
    }

    @Override
    PaymentClassification getClassification() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    PaymentSchedule getSchedule() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
