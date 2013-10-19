/**
 * Created with IntelliJ IDEA.
 * User: siguremon
 * Date: 2013/10/19
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
public class DeleteEmployeeTransaction implements Transaction {
    private int itsEmpId;

    public DeleteEmployeeTransaction(int empId) {
        itsEmpId = empId;
    }

    @Override
    public void execute() {
        PayrollDatabase.deleteEmployee(itsEmpId);
    }
}
