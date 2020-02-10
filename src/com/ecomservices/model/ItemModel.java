package com.ecomservices.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ecomservices.pojo.Item;
import com.ecomservices.util.HibernateUtil;

public class ItemModel {

	public ItemModel() {
		super();
	}

	public boolean createItem(Item item) {
		boolean flag = false;

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Integer itemId = 0;

		try {
			itemId = (Integer) session.save(item);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (itemId != 0)
			flag = true;
		
		return flag;
	}

}
