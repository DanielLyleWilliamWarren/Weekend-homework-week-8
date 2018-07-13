import models.League;
import models.Manager;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Team rangers;
    League spl;

    @Before
    public void setup(){
        spl = new League("Scottish Premiership");
        rangers = new Team("New Co", 0, -500000, spl);
        manager = new Manager("Neil Lennon", 50000.00, 50, rangers);
    }

    @Test
    public void hasName(){
        assertEquals("Neil Lennon", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, manager.getSalary(),1);
    }

    @Test
    public void hasPopularityRating(){
        assertEquals(50, manager.getPopularity());
    }

    @Test
    public void hasTeam(){
        assertEquals(rangers, manager.getTeam());
    }
}
