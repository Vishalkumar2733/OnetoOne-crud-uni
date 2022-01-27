package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.invoice.dto.Invoice;
import com.ty.item.dto.Item;

public class Dao {
	private EntityManagerFactory entityManagerFactory =null;
	 private EntityManager entityManager = null;
	 private EntityTransaction entityTransaction ;
	
	public EntityManager getEntityManager()
	{
	 entityManagerFactory=Persistence.createEntityManagerFactory("projects");
	 return entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void save(Item item,Invoice invoice)
	{
		entityManager =getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(item);
		entityManager.persist(invoice);
		entityTransaction.commit();
		
	}
	
	public void delete(int id)
	{
		entityManager=getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Invoice invoice =entityManager.find(Invoice.class, 1);
		if(invoice!=null)
		{
			Item item = invoice.getItem();
			entityManager.remove(invoice);
			if(item!=null)
			{
				entityManager.remove(item);
			}
			entityTransaction.commit();
		}
		
	}
	public void update(Item item)
	{
		entityManager=getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(item);
		entityTransaction.commit();
		
		
	}
	
	public void getInvoice(int id)
	{
		entityManager=getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Invoice invoice =entityManager.find(Invoice.class, id);
		if(invoice!=null)
		{
			System.out.println("Id is"+invoice.getId());
			System.out.println("gst is" +invoice.getGst());
			System.out.println("bill addess"+invoice.getBillAddress());
			System.out.println("tax is"+invoice.getTax());
			Item item =invoice.getItem();
			System.out.println("id is"+item.getId());
			System.out.println("name is"+item.getName());
			System.out.println("cost is"+item.getCost());
			System.out.println("quantity is"+item.getQuantity());
			
			entityTransaction.commit();
		}
		
	}

}
