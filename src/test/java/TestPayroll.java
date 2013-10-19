import com.sun.istack.internal.NotNull;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestPayroll {
    @Test
    public void testAddSalariedEmployee() {
        int empId = 1;
        AddSalariedEmployee t = new AddSalariedEmployee(empId, "Bob", "Home", 1000.00);
        t.execute();

        Employee e = PayrollDatabase.GetEmployee(empId);

        assertThat(e, is(notNullValue()));
        assertThat(e.getName(), is("Bob"));

        PaymentClassification pc = e.getClassification();

        SalariedClassification sc = (SalariedClassification) pc;

        assertThat(sc, is(notNullValue()));
        assertThat(sc.getSalary(), is(1000.00));

        PaymentSchedule ps = e.getSchedule();
        MonthlySchedule ms = (MonthlySchedule) ps;
        assertThat(ms, is(notNullValue()));

        PaymentMethod pm = e.getMethod();
        HoldMethod hm = (HoldMethod) pm;
        assertThat(hm, is(notNullValue()));
    }

}