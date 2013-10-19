import java.util.HashMap;
import java.util.Map;

public class PayrollDatabase {
    private static Map<Integer, Employee> itsEmployees = new HashMap<Integer, Employee>();

    public static void addEmployee(int empId, Employee e) {
        itsEmployees.put(empId, e);
    }

    public static Employee getEmployee(int empId) {
        return itsEmployees.get(empId);
    }

    public static void Clear() {
        itsEmployees.clear();
    }

    public static void deleteEmployee(int itsEmpId) {
        itsEmployees.remove(itsEmpId);
    }
}
