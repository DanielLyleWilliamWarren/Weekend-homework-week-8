package db;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import models.League;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
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

    public static List<Team> orderByPoints(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> teamPoints = null;
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.addOrder(Order.desc("points"));
            teamPoints = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return teamPoints;
    }
}
