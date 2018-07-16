import db.DBHelper;
import db.DBLeague;
import db.DBTeam;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        League league = new League("La Liga");
        DBHelper.save(league);

        Team team1 = new Team("Valencia", 0, 1000000.00, league);
        DBHelper.save(team1);
        Team team2 = new Team("Barcelona", 0, 1000000.00, league);
        DBHelper.save(team2);

        Player player1 = new Player("Messi", Position.FORWARD, 200000.00, team2);
        DBHelper.save(player1);
        Player player2 = new Player("Iniesta", Position.MIDFIELDER, 150000.00, team2);
        DBHelper.save(player2);
        Player player3 = new Player("Pique", Position.CENTREBACK, 100000.00, team2);
        DBHelper.save(player3);
        Player player4 = new Player("Cillerson", Position.GOALIE, 120000.00, team2);
        DBHelper.save(player4);

        Manager manager = new Manager("Pep Guardiola", 10000.00, 100, team2);
        DBHelper.save(manager);

        List<Team> teams = DBLeague.getTeamsInLeague(league);
        List<Player> players = DBTeam.getPlayersInLeague(team2);
        Manager managerOfTeam = DBTeam.getManager(team2);

        league.playGame(team1, team2);
        DBHelper.update(team1);
        DBHelper.update(team2);

        league.playGame(team1, team2);
        DBHelper.update(team1);
        DBHelper.update(team2);

        league.playGame(team1, team2);
        DBHelper.update(team1);
        DBHelper.update(team2);

        List<Team> teamPoints = DBLeague.orderByPoints();

    }



}
