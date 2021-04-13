package observer;

import java.util.ArrayList;
import java.util.List;

public class FacebookPage implements Observable {

	private List<Observer>observers;
	private String post;
	
	public FacebookPage() {
		this.observers=new ArrayList<>();
	}
	
	@Override
	public void follow(Observer observer) {
		this.observers.add(observer);
		observer.setPage(this);
	}

	@Override
	public void unfollow(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer:this.observers)
		       observer.update();
	}

	@Override
	public String getUpdate() {
		return this.post;
	}
	public void setNewPost(String post) {
		this.post = post;
		this.notifyObservers();
	}

}
