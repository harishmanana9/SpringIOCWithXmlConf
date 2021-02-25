package com.spring.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.bean.User;

public class SpringUserApp {
	public static void main(String[] args) {
		FileSystemResource resource = 
				new FileSystemResource("D:\\Programs\\JavaPrograms\\Class\\JanJava\\SpringIOCWithXmlConf\\src\\main\\resources\\SpringConfig.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		//IOC
//		User userObj = (User) beanFactory.getBean("user1");
		
		User userObj = (User) appContext.getBean("user1");
		System.out.println("User " + userObj);
		
		User user2 = (User) appContext.getBean("user2");
		System.out.println("User2 - " + user2);
		
		User userObj2 = (User) appContext.getBean("user1");
		userObj.setUserName("Maria");
		
		System.out.println("userObj - " + userObj);
		System.out.println("userObj2 - " + userObj2);
	}
}
