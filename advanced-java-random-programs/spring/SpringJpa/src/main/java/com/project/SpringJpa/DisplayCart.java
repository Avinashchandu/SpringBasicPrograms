package com.project.SpringJpa;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.ConfigClass;
import com.project.dao.CartDao;
import com.project.dao.CustomerDao;
import com.project.dao.ProductDao;
import com.project.dao.Purchaseddao;
import com.project.entity.Cart;
import com.project.entity.Customer;
import com.project.entity.Product;
import com.project.entity.Purchased;

public class DisplayCart {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
		CartDao cartDao = annotationConfigApplicationContext.getBean(CartDao.class);
		CustomerDao daoImpl = annotationConfigApplicationContext.getBean(CustomerDao.class);
		ProductDao productDao = annotationConfigApplicationContext.getBean(ProductDao.class);
		Purchaseddao purchaseddao =  annotationConfigApplicationContext.getBean(Purchaseddao.class);
		Scanner sc = new Scanner(System.in);
		
		while(true)
	        {
	        	System.out.println("Enter Email");
	        	String email = sc.next();
	        	Customer customer = daoImpl.findCustomerByEmail(email);
	        	if(customer==null)
	        	{
	        		System.out.println("No USER Found");
	        		continue;
	        	}
	        	
	        	while(true)
	        	{
	        		System.out.println("Enter Password");
	            	String password = sc.next();
	        		if(!password.equalsIgnoreCase(customer.getpassword()))
	        		{
	        		  System.out.println("Incorrect Password");
	        		  continue;
	        		}
	        		else
	        		{
	        			System.out.println("Welcome To E-SHOPPING :: "+customer.getName());
	        			break;
	        		}
	        	}
	        	
	   while(true)
	   {
		int money = 0;
		System.out.println("Displaying Cart Details of "+customer.getName()+" ::  ");
		List<Cart> list = cartDao.findAllCart(customer.getId());
		System.out.println("Brand\t\tItem\t\tPrice");
		for(int i  = 0;i<list.size();i++)
		{	
			System.out.println(list.get(i).getId()+""+productDao.findProduct(list.get(i).getProductid()));
			money = list.get(i).getQuantity()*productDao.findProduct(list.get(i).getProductid()).getPrice();
		}
		System.out.println("Total Amount To be Paid :: "+money);
		System.out.println("Continue Payment");
		if(sc.next().equalsIgnoreCase("yes"))
		{
			System.out.println("Pay Money");
			if(sc.nextInt()==money)
			{
				for(int i=0;i<list.size();i++)
				{
					Purchased purchased = new Purchased();
					 
					purchased.setCustomerid(list.get(i).getCustomerid());  
					purchased.setProductid(list.get(i).getProductid());
					purchased.setQuantity(list.get(i).getQuantity());
					purchaseddao.savePurchased(purchased);
					cartDao.deleteCartItem(list.get(i).getId());
				}
						
			}
		}
		System.out.println("Items are Purchased");
		sc.next();
	   }
		
		
	
	}

}
}
