package mediator_singleton;

public abstract class User {
	protected String username;
    protected MessageMediator mediator;

	public User(String username) {
		this.username = username;
	}
	
	public abstract void send(String send_msg);
	public abstract void receive(String recieve_msg);
	public abstract void joinChat(MessageMediator join_chat);
	public abstract void leaveChat(MessageMediator leave_chat);
	public abstract String getUsername();
}
