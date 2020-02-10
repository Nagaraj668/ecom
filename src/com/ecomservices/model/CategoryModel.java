package com.ecomservices.model;

import com.ecomservices.pojo.Category;
import com.ecomservices.util.DML;
import com.ecomservices.util.HibernateUtil;

public class CategoryModel {

	public CategoryModel() {
		super();
	}

	public void createCategory(Category category) {
		HibernateUtil.execute(category, DML.INSERT);
	}
}
