import models.League;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeagueTest {

    League league;
    Team hibs;
    Team hearts;

    @Before
    public void setup() {
        league = new League("La Liga");
        hibs = new Team("Hibernian Rangers", 0, 100000.00, league);
        hearts = new Team("Hearts of Midlothian", 0, 1000000.00, league);
    }

    @Test
    public void hasName() {
        assertEquals("La Liga", league.getName());
    }

    @Test
    public void canPlayGame(){
        league.playGame(hibs, hearts);
        assertEquals(3, hibs.getPoints());
        assertEquals(0, hearts.getPoints());
    }
}


