import org.junit.Before;
import staff.techStaff.DatabaseAdmin;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Lenny Leonard", "AD 34 56 78 D", 30000.00);
    }
}
