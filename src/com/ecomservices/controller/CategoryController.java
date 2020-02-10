package com.ecomservices.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ecomservices.model.CategoryModel;
import com.ecomservices.pojo.Category;

@Path("category/")
public class CategoryController {

	@POST
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createCategory(Category category) {
		CategoryModel categoryModel = new CategoryModel();
		categoryModel.createCategory(category);
		return Response.ok().build();
	}
}
