import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Monty Burns", "BC 66 66 66 X", 500000.00, "Overlord", 200000.00);

    }

    @Test
    public void hasName() {
        assertEquals("Monty Burns", director.getName());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Overlord", director.getDeptName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("BC 66 66 66 X", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(500000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(200000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.1);
        assertEquals(550000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(5000.00, director.payBonus(), 0.01);
    }
}
