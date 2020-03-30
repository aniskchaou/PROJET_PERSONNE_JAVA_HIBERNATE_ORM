package util;

import org.hibernate.SessionFactory;

import net.sf.ehcache.config.Configuration;

public class HibernateUtil {
  public static SessionFactory session;
  
  static {
	  try {
		session= new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
  }

public static SessionFactory getSessionFactory() {
	return session;
}

public static void setSession(SessionFactory session) {
	HibernateUtil.session = session;
}
  
  
}
