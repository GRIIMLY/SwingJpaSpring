package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanUtil {
	
	
	public static Object getBeanByName(String name) {
		try {
			ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
			return context.getBean(name);
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
