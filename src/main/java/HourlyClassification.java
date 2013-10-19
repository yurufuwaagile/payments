import java.util.HashMap;
import java.util.Map;

public class HourlyClassification extends PaymentClassification {
    private Map<Long, TimeCard> itsTimeCards = new HashMap<Long, TimeCard>();
    private double itsSalary;

    public HourlyClassification(double salary) {
        itsSalary = salary;
    }

    public TimeCard getTimeCard(long date) {
        return itsTimeCards.get(date);
    }

    public void addTimeCard(TimeCard timeCard) {
        itsTimeCards.put(timeCard.getDate(), timeCard);
    }
}
