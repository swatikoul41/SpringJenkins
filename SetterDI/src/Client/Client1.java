package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Test;

public class Client1 {

	public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	Test test1=(Test)ap.getBean("t");
    test1.hello("Nikita");
	}

}
