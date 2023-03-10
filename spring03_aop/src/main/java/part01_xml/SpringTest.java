package part01_xml;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.7</version>
    <scope>runtime</scope>
</dependency>

 */

/*
 * APO(Aspect Oriented Programming : �������� ���α׷���
 * 1.AOP�� ������ �ٶ󺸴� ������ �������� ���α׷����ϴ� ����̴�.
 * 2.AOP�� ������ �ذ��ϱ� ���� �ٽɰ��ɻ���� ��ü�� ����Ǵ� ������ɻ����� �������� 
 *  ���α׷��������ν� ���� ����� ���� �ڵ忡 ���� ������ �� �ֵ��� ���ش�. 
 */

public class SpringTest {

	public static void main(String[] args) {
		String path = "part01_xml/aop.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(path);

		Service svc = null;

		svc = (Service) context.getBean("svc");
//		svc.prn1();
//		svc.prn1(10);
//		svc.prn1(new Random());
//		svc.prn1(100,200);
//		svc.prn2();
//		svc.prn3();
//		
//		try {
//		svc.prn4();
//		}catch(Exception e) {
//			
//		}
	
		svc.prn5();
		
		
	}// end main()

}// end class





