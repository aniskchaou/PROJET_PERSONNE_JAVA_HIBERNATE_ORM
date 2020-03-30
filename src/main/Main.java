package main;

import entity.Personne;
import manager.PersonneManager;
import util.HibernateUtil;

public class Main {
public static void main(String[] args) {
	PersonneManager pm=new PersonneManager();
	pm.addP("hello", "ttt", 22);
	pm.addP("efze", "zeee", 223);
	pm.addP("er", "ezer", 223);
	HibernateUtil.getSessionFactory().close();
}
}
