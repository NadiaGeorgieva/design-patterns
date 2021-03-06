package mediator_singleton;

public class FacebookUser extends User {

	public FacebookUser(String username) {
		super(username);
	}

	@Override
	public void send(String send_msg) {
		if(mediator != null)
		{
			System.out.println(username + ": " + send_msg);
			mediator.sendMessage(this, send_msg);
		}
		
		else
		{
			System.out.println(username + " hasn't joined in chat room.");
		}
	}

	@Override
	public void receive(String recieve_msg) {
		if(mediator != null)
		{
			System.out.println(username + " has recieved the message: " + recieve_msg);
		}
	}

	@Override
	public void joinChat(MessageMediator join_chat) {
		join_chat.add(this);
		this.mediator = join_chat;
		System.out.println(username + " has joined the chat room: " + mediator.getChatName());
	}

	@Override
	public void leaveChat(MessageMediator leave_chat) {
		mediator.remove(this);
		this.mediator = leave_chat;
		System.out.println(username + " has left the chat room: " + mediator.getChatName());
	}

	@Override
	public String getUsername() {
		return username;
	}
}
