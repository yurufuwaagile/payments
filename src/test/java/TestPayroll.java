import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestPayroll {
    @Test
    public void testAddSalariedEmployee() {
        int empId = 1;
        AddSalariedEmployee t = new AddSalariedEmployee(empId, "Bob", "Home", 1000.00);
        t.execute();

        Employee e = PayrollDatabase.getEmployee(empId);

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

    @Test
    public void testDeleteEmployee() {
        int empId = 3;
        AddCommissionedEmployee t = new AddCommissionedEmployee(empId, "Lance", "Home", 2500, 3.2);
        t.execute();
        Employee e = PayrollDatabase.getEmployee(empId);
        assertThat(e, is(notNullValue()));

        DeleteEmployeeTransaction dt = new DeleteEmployeeTransaction(empId);
        dt.execute();

        e = PayrollDatabase.getEmployee(empId);
        assertThat(e, is(nullValue()));

    }

    @Test
    public void testTimeCardTransaction() {
        int empId = 2;

        AddHourlyEmployee t = new AddHourlyEmployee(empId, "Bill", "Home", 15.25);
        t.execute();
        TimeCardTransaction tct = new TimeCardTransaction(20011031, 8.0, empId);
        tct.execute();

        Employee e = PayrollDatabase.getEmployee(empId);
        assertThat(e, is(notNullValue()));
        PaymentClassification pc = e.getClassification();
        HourlyClassification hc = (HourlyClassification) pc;
        TimeCard tc = hc.getTimeCard(20011031);
        assertThat(tc, is(notNullValue()));
        assertThat(tc.getHours(), is(8.0));

    }

}
