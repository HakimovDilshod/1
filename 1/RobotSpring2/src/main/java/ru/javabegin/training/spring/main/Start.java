package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.Pools.T1000Pool;
import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
//		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000Sony");
//		
//		System.out.println(t1000);
//		
//		t1000 = (ModelT1000) context.getBean("t1000Sony");
//		
//		System.out.println(t1000);
//		//t1000.action();
		
		T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
		
		t1000Pool.action();
		
	}
}
