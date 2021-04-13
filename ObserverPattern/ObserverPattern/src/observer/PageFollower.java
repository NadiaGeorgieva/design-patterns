package observer;

public class PageFollower implements Observer {

	private String follower;
	private Observable post;
	
	public PageFollower(String name) {
		this.follower=name;
	}
	
	@Override
	public void update() {
		if(this.post==null) {
			  System.out.println(this.getName()+" has no post ");
			return;
		}
    String newPost=this.post.getUpdate();
    System.out.println(this.getName()+" recieved a new post: "+newPost);
	}

	@Override
	public void setPage(Observable post) {
		 this.post=post;
	}
    
	public String getName() {
		return follower;
	}
}
