package com.ecomservices.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ecomservices.model.ItemModel;
import com.ecomservices.pojo.Item;

@Path("item_master/")
public class ItemController {

	@POST
	@Path("create_item")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createItem(Item item) {
		ItemModel itemModel = new ItemModel();
		boolean flag = itemModel.createItem(item);
		
		if (flag) {
			return Response.ok().build();
		} else {
			return Response.serverError().build();
		}
	}
}
