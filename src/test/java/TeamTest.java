import models.League;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    Team team;
    League laLiga;

    @Before
    public void setup(){
        laLiga = new League("La Liga");
        team = new Team("Valencia", 0, 1000000.00, laLiga);
    }

    @Test
    public void hasName() {
        assertEquals("Valencia", team.getName());
    }

    @Test
    public void hasPoints(){
        assertEquals(0, team.getPoints());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000.00, team.getBudget(),1);
    }

    @Test
    public void hasLeague(){
        assertEquals(laLiga, team.getLeague());
    }

    @Test
    public void canAddPoints(){
        team.addPoints(3);
        assertEquals(3, team.getPoints());
    }



}
