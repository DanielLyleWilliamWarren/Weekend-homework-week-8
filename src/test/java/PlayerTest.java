import models.League;
import models.Player;
import models.Position;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Team team;
    League league;


    @Before
    public void setup(){
        league = new League("Seria A");
        team = new Team("Roma", 0, -500000, league);
        player = new Player("Totti",Position.FORWARD, 100000.00, team);
    }

    @Test
    public void hasName(){
        assertEquals("Totti", player.getName());
    }

    @Test
    public void hasPosition(){
        assertEquals(Position.FORWARD, player.getPosition());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, player.getSalary(), 1);
    }

    @Test
    public void hasTeam(){
        assertEquals(team, player.getTeam());
    }

}


