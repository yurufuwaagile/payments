/**
 * Created with IntelliJ IDEA.
 * User: siguremon
 * Date: 2013/10/19
 * Time: 10:42
 * To change this template use File | Settings | File Templates.
 */
public class SalariedClassification extends PaymentClassification {
    private double itsSalary;

    public SalariedClassification(double salary) {
        itsSalary = salary;
    }

    public Double getSalary() {
        return itsSalary;
    }
}
