package part01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * IoC(Inversion of Control ������ ����)
 * ��ü�����̳� �޼ҵ� ȣ���� �����ڰ� �����ϴ� ���� �ƴ϶�, ������ �����ӿ�ũ���� ������� �ѱ�� ����̴�.
 * ��κ��� �����ӿ�ũ���� IoC�� �����ϰ� �ִ�.
 * 
 *
 * DI(Dependency Injection ������ ����)
 * 1. ��ü�� ���� �������� �ʰ� �ܺο��� ������ ��ü�� ���ӹ޾� �̿��ϴ� ����̴�.
 * 2. DI�� �����̳ʸ� ���� ���� ���ϰ� ���յǾ� �ִ� �� Ŭ������ �и��ϰ� �� ��ü���� ���踦
 *  ������ �����ν� ���յ��� ���߰� ������ �к��� �ϱ� ���ؼ��̴�.
 */

public class SpringTest {

	public static void main(String[] args) {

		// ApplicationContext: Bean�� ������ ����Ŭ�� �������ִ� �����̳��̴�.
		String path = "part01/di.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path); // part01/di.xml bean���� ����

		MessageBean bean = (MessageBean) context.getBean("mb");
//		display(bean, "������");
		display(bean, "Spring");

	}// end main()

	public static void display(MessageBean bean, String name) {
		bean.sayHello(name);
	}

}// end class