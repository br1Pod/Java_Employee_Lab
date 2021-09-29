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
    public void hasName() {
        assertEquals("Mr Smithers", manager.getName());
    }

    @Test
    public void hasDeptName() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("AB 12 34 56 C", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.1);
        assertEquals(66000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(600.00, manager.payBonus(), 0.01);
    }
}
