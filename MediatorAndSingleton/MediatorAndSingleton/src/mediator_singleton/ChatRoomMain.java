package mediator_singleton;

public class ChatRoomMain {

	public static void main(String[] args) {
		FacebookUser user1 = new FacebookUser("Nadia");
		FacebookUser user2 = new FacebookUser("Gery");
		FacebookUser user3 = new FacebookUser("Boriana");
		
		ChatRoom group_chat = new ChatRoom("Facebook group_chat");
		
		user1.joinChat(group_chat);
		user2.joinChat(group_chat);
		user3.joinChat(group_chat);
        
		user1.send("add_bot");
		user1.send("hi");
		user3.send("how are you guys?");	
		user2.send("my cat eat my homework.");
		user3.leaveChat(group_chat);
	}
}
