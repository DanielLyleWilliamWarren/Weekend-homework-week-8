import models.Game;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Team team1;
    Team team2;
    ArrayList<Team> teamsPlayingGame;

    @Before
    public void setup(){
        teamsPlayingGame = new ArrayList<Team>();
        teamsPlayingGame.add(team1);
        teamsPlayingGame.add(team2);
        game = new Game(teamsPlayingGame);
    }

    @Test
    public void hasTeams(){
        assertEquals(teamsPlayingGame, game.getTeams());
    }

    @Test
    public void hasTwoTeams(){
        assertEquals(2, game.teamCount());
    }

}
