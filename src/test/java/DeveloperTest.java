import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    Developer developer;
    
    @Before
    public void before(){
        developer = new Developer("Homer Simpson", "AB 23 45 67 C", 40000.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.1);
        assertEquals(44000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, developer.payBonus(), 0.01);
    }
    
}
