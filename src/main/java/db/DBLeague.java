package db;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import models.League;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBLeague {

    public static Session session;

    public static List<Team> getTeamsInLeague(League league) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> results = null;
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.add(Restrictions.eq("league", league));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static League playGame(Team team, Team team1){
        session = HibernateUtil.getSessionFactory().openSession();
        League gameResult = null;
        try{
        team.scoreGoals();
        team1.scoreGoals();
        if (team.getGoals() > team1.getGoals()) {
            team.addPoints(3);
        } else if (team.getGoals() < team1.getGoals()) {
            team1.addPoints(3);
        } else {
            team1.addPoints(1);
            team.addPoints(1);
        }
    } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  gameResult;
        }

}
