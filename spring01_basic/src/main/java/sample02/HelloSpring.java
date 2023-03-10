package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean bean = null;
//		bean = new MessageBeanKorea();
//		display(bean, "½ºÇÁ¸µ");
		bean = new MessageBeanEnglish();
		display(bean, "Spring");

	}
	public static void display(MessageBean bean, String name) {
		 bean.sayHello(name);
	}//end display()

}
