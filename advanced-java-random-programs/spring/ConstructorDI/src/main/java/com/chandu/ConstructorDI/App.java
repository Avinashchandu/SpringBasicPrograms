package com.chandu.ConstructorDI;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandu.model.Addresss;

/*
 *  *
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/chandu/file/StudentConfig.xml");
        Addresss addresss = applicationContext.getBean("address2",Addresss.class);
        System.out.println(addresss);
    }
}
