package sample01;

/*
 * ���յ�
 * 1. Ŭ���� ���� ��ȣ ���Ἲ ������ �ǹ��Ѵ�.
 * 2. ���� ���յ��� �������� �ϳ��� ��ü ������ �ٸ� ��ü�� ������ ���ļ��� �ȵȴ�.
 * 3. ���յ��� ���߱� ���ؼ� �������̽��� ����Ѵ�.
 */

public class HelloSpring {

	public static void main(String[] args) {
//		MessageBeanKorea bean = new MessageBeanKorea();
//		display(bean, "������");
		
		MessageBeanEnglish bean = new MessageBeanEnglish();
		display(bean, "Spring");
		
		
	}// end main()

	public static void display(MessageBeanEnglish bean, String name) {
		bean.sayHello(name);
	}// end display()

}// end class
