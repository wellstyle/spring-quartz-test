package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzMain {
	public static void main(String[] args) {		
		// 설정 xml를 읽어 들인다.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("QuartzMain Start!");  
	}
}
