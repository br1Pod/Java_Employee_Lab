import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Lenny Leonard", "AD 34 56 78 D", 30000.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1.1);
        assertEquals(33000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, databaseAdmin.payBonus(), 0.01);
    }
}
