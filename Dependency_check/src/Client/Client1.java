package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;


public class Client1 {

	public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	Car car=(Car)ap.getBean("c");
    car.carDetails();
	}

}
