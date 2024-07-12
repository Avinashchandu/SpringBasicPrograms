//package com.project.SpringJpa;
//
//import java.util.List;
//import java.util.Scanner;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.project.config.ConfigClass;
//import com.project.dao.DaoImpl;
//import com.project.entity.Cart;
//import com.project.entity.Customer;
//import com.project.entity.Products;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//	
//    public static void main( String[] args )
//    {
//    	Scanner sc = new Scanner(System.in);
//    	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
//        DaoImpl daoImpl = applicationContext.getBean(DaoImpl.class);
//       
//        while(true)
//        {
//        	List<Products> list = daoImpl.findAllProducts();
//        	System.out.println("Enter Email");
//        	String email = sc.next();
//        	Customer customer = daoImpl.findCustomerByEmail(email);
//        	if(customer==null)
//        	{
//        		System.out.println("No USER Found");
//        		continue;
//        	}
//        	
//        	while(true)
//        	{
//        		System.out.println("Enter Password");
//            	String password = sc.next();
//        		if(!password.equalsIgnoreCase(customer.getpassword()))
//        		{
//        		  System.out.println("Incorrect Password");
//        		  continue;
//        		}
//        		else
//        		{
//        			System.out.println("Welcome To E-SHOPPING :: "+customer.getName());
//        			break;
//        		}
//        	}
//        	while(true)
//        	{
//        		System.out.println();
//            	System.out.println("1 -> to view The Products");
//            	System.out.println("2 -> to view the cart");
//            	System.out.println("3-> to logout");
//            	int choice = sc.nextInt();
//        		System.out.println("\n\t\tAvailable products are ::\n\nSNO. Brand      Name        price");
//        		
//            	for (Products products : list) {
//            		System.out.println(products.getId()+"     "+ products.getBrand()+"      "+products.getName()+"     "+products.getPrice());
//    			}
//            	System.out.println("Select items to add to cart");
//            	int id = sc.nextInt();
//            	System.out.println("add Quantity");
//            	int quant = sc.nextInt();
//            	Cart cart = new Cart();
//            	cart.setCustomerid(customer.getId());
//            	cart.setProductid(id-1);
//            	cart.setQuantity(quant);
//            	daoImpl.saveCart(cart);
//            	List<Cart> cart2 = daoImpl.findAllCart();
//            	
//            	
//            	if(choice==1)
//            	{
//            		continue;
//            	}
//            	else if(choice==2)
//            	{
//            		int money =0;
//            		System.out.println("Items in the Cart \n");
//            		for(int i =0;i<cart2.size();i++)
//            		{
//            			
//            			for(int j = 0;j<list.size();j++)
//            			{
//            				
//            				if(cart2.get(i).getProductid()==list.get(j).getId())
//            				{
//            					
//            					System.out.println("Name :"+list.get(j).getName()+" quantity : "+cart2.get(i).getQuantity());
//            					money += list.get(j).getPrice()*cart2.get(i).getQuantity();
//            				}
//            				
//            			}
//            		}
//            		System.out.println("total Price "+money);
//        			System.out.println("Enter Any key to exit");
//        			sc.next();
//            	}
//        	}
//        	
//        }
//    }
//}
