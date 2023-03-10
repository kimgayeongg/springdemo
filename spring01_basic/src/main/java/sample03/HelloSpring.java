package sample03;

/*
 * factory을 이용하면 결합도는 인처페이스보다는 낮지만
 * factory가 정확이 구현되어 있지 않으면 참조하는 객체에 영향이 간
 * 
 * 
 */


public class HelloSpring {
	

	public static void main(String[] args) {
		MessageBean bean = null;
//		bean = MessageFactory.getInstance("ko");
//		display(bean, "스프링");
//		
		bean = MessageFactory.getInstance("en");
		display(bean, "Spring");

	}

	public static void display(MessageBean bean, String name) {
		 bean.sayHello(name);
	}//end display()
}
