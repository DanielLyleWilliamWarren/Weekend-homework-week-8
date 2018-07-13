//package db;
//
//import models.Manager;
//import models.Team;
//import org.hibernate.Criteria;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.criterion.Restrictions;
//
//public class DBManager {
//
//    public static Session session;
//
//    public static Team getTeam(Manager manager){
//        session = HibernateUtil.getSessionFactory().openSession();
//        Team team = null;
//
//        try {
//            Criteria cr = session.createCriteria(Team.class);
//            cr.add(Restrictions.eq("manager", manager));
//            team = (Team) cr.uniqueResult();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return team;
//    }
//}
