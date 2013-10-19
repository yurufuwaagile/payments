/**
 * Created with IntelliJ IDEA.
 * User: siguremon
 * Date: 2013/10/19
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
public class TimeCard {
    private long itsDate;
    private Double itsHours;

    public TimeCard(long date, double hours) {
        itsDate = date;
        itsHours = hours;
    }

    public Double getHours() {
        return itsHours;
    }

    public Long getDate() {
        return itsDate;
    }
}
