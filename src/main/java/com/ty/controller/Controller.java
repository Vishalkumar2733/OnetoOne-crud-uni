package com.ty.controller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.invoice.dto.Invoice;
import com.ty.item.dto.Item;

public class Controller {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projects");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction .begin();
		
		
		
//		Invoice invoice = new Invoice();
//		invoice.setId(1);
//		invoice.setGst("ty-6789");
//		invoice.setBillAddress("patna");
//		invoice.setTax(12.0);
//		
//		Item item = new Item();
//		item.setId(1);
//		item.setName("football");
//		item.setCost(2500);
//		item.setQuantity(1);
//		invoice.setItem(item);
//		
//		entityManager.persist(invoice);
//		entityManager.persist(item);
		entityTransaction.commit();
		
		
		
		

	}

}
