package sample03;

/*
 * factory�� �̿��ϸ� ���յ��� ��ó���̽����ٴ� ������
 * factory�� ��Ȯ�� �����Ǿ� ���� ������ �����ϴ� ��ü�� ������ ��
 * 
 * 
 */


public class HelloSpring {
	

	public static void main(String[] args) {
		MessageBean bean = null;
//		bean = MessageFactory.getInstance("ko");
//		display(bean, "������");
//		
		bean = MessageFactory.getInstance("en");
		display(bean, "Spring");

	}

	public static void display(MessageBean bean, String name) {
		 bean.sayHello(name);
	}//end display()
}
