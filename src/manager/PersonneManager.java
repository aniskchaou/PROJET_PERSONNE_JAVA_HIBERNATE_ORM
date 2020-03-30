package manager;

import org.hibernate.classic.Session;

import entity.Personne;
import util.HibernateUtil;

public class PersonneManager {

	public void addP(String nom, String prenom, int tel)
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Personne p=new Personne();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setTel(tel);
		session.save(p);
		session.getTransaction().commit();
	}
	
	public void suppression(int id)
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Personne p=(Personne) session.load(Personne.class,id);
		session.delete(p);
		session.getTransaction().commit();
	}
}
