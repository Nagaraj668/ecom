package com.ecomservices.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sessionFactory;
	}

	public static void execute(Object object, DML dml) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		try {

			if (dml == DML.INSERT) {
				session.save(object);
			} else if (dml == DML.INSERT_OR_UPDATE) {
				session.saveOrUpdate(object);
			} else if (dml == DML.UPDATE) {
				session.update(object);
			} else if (dml == DML.DELETE) {
				session.delete(object);
			}

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object get(Class classInstance, int instanceId) {
		Object object = null;
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		try {
			object = session.get(classInstance, instanceId);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
}
