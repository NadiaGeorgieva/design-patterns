package mediator_singleton;

public interface MessageMediator {
	void add(User user);
	void remove(User user);
	void sendMessage(User user , String msg);
	String getChatName();
}
