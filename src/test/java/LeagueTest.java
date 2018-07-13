import models.League;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeagueTest {

    League league;

    @Before
    public void setup() {
        league = new League("La Liga");
    }

    @Test
    public void hasName() {
        assertEquals("La Liga", league.getName());
    }
}
