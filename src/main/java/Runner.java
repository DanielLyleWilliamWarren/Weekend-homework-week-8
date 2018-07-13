import db.DBHelper;
import models.League;
import models.Team;

public class Runner {

    public static void main(String[] args) {
        League league = new League("La Liga");
        DBHelper.save(league);

        Team team1 = new Team("Valencia", 0, 1000000.00, league);
        DBHelper.save(team1);
        Team team2 = new Team("Barcelona", 0, 1000000.00, league);
        DBHelper.save(team1);
    }


}
