package part01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatWebSocketHandler extends TextWebSocketHandler {

	public static List<WebSocketSession> list = new ArrayList<WebSocketSession>();

	public ChatWebSocketHandler() {

	}

	// Ŭ���̾�Ʈ�� ���� �Ǿ��� �� ȣ��Ǵ� �޼ҵ�
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println(session.getId() + "���� ��");
		// ����Ʈ�� �߰�
		list.add(session);
	}

	// Ŭ���̾�Ʈ�� �޼����� ������ �� ȣ��Ǵ� �޼ҵ�
	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {

		// ���۵� �޼����� ������
		String msg = (String) message.getPayload();
		System.out.println("msg=> " + msg);

		// ��� Ŭ���̾�Ʈ���� �޼��� ����
		for (WebSocketSession socket : list) {
			// �޼��� ����
			WebSocketMessage<String> sendMsg = new TextMessage(msg);
			// �� ���ǿ��� �޼����� ����
			socket.sendMessage(sendMsg);
		}

	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
	System.out.println("���� ���� Ŭ���̾�Ʈ ���� : " + list.size());
	
	//����Ʈ���� ����
System.out.println(session.getId() + "���� �����");
list.remove(session);
System.out.println("���� ���� Ŭ���̾�Ʈ ���� : " + list.size());
	}
	
}
	

