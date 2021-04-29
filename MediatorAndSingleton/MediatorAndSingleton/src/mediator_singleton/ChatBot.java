package mediator_singleton;

public class ChatBot {
	private static ChatBot instance=null;	

	public static ChatBot getInstance() {
		if(instance==null) {
			instance= new ChatBot();
		}
		return instance;
	}
	
	public void Spy(User user,String msg,ChatRoom chat) {
		if( msg.contains("cat")  ){
				System.out.println("Bot announcement: The word: cat is banned!!");
				chat.remove(user);
				System.out.println("Bot: "+user.getUsername()+" has been removed!");
			}
		}
	}