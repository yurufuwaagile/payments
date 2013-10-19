import java.util.HashMap;
import java.util.Map;

public class PayrollDatabase {
    private static Map<Integer, Employee> itsEmployees = new HashMap<Integer, Employee>();

    public static void addEmployee(int empId, Employee e) {
        itsEmployees.put(empId, e);
    }

    public static Employee GetEmployee(int empId) {
        return new Employee();
    }

    public static void Clear() {
        itsEmployees.clear();
    }
}
