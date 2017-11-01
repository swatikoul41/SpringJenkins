package Client;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;


public class Client1 {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("resources/spring.xml");
	BeanFactory factory= new XmlBeanFactory(r);
	Object o=factory.getBean("t");
	Object o1=factory.getBean("t");
	System.out.println(o.equals(o1));
    Test test=(Test)o;
    test.hello(); 
	
	/*ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	Test test1=(Test)ap.getBean("t");
    test1.hello();*/
	}

}
