import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Mr Smithers", "AB 12 34 56 C", 60000.00, "HR");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.1);
        assertEquals(66000.00, manager.getSalary(), 0.01);
    }
}
