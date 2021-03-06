package mediator_singleton;

import java.util.ArrayList;

public class ChatRoom implements MessageMediator {

	private String chatName;
	private ArrayList<User> users;
	ChatBot bot;
	
	public ChatRoom(String name) {
		this.chatName = name;
		users = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void remove(User user) {
		users.remove(user);
	}

	@SuppressWarnings("static-access")
	@Override
	public void sendMessage(User user, String msg) {
		for(int i = 0 ; i< users.size() ; i++)
		{
			if(users.get(i) != user)
			{
				users.get(i).receive(msg);	
			} 
		}
		
		if(msg.contains("add_bot")) {
		        bot=bot.getInstance();
				return;
		}
		
		if(bot!=null) {
		        bot.Spy(user, msg,this);
		}
	}

	@Override
	public String getChatName() {
		return chatName;
	}
}
