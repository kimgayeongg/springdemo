package part01;

public class MessageBeanKorea implements MessageBean{
  public MessageBeanKorea() {
	 System.out.println("MessageBeanKorea");
}

@Override
public void sayHello(String name) {
	System.out.printf("¾È³ç, %s !!!\n", name);
	
}
}
