import models.League;
import models.Player;
import models.Team;
import org.junit.Before;

public class PlayerTest {

    Player player;
    Team team;
    League league;


    @Before
    public void setup(){
        league = new League("Seria A");
        team = new Team("Roma", 0, -500000, league);
        player = new Player("Totti","Forward", 100000.00, team);
    }

}


