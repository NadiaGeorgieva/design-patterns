package observer;

public class ObserverMain {

	public static void main(String[] args) {
		 
        Observer obs1=new PageFollower("Follower01");
        Observer obs2=new PageFollower("Follower02");
        Observer obs3=new PageFollower("Follower03");
        
        FacebookPage page=new FacebookPage();
        
        page.follow(obs1);
        page.follow(obs2);
        page.follow(obs3);
        
        page.setNewPost("LearnProgramming:Know how to collect or label data for your machine learning tasks with minimal effort.");
        page.setNewPost("LearnPrograming:See different perspectives for new pattern designs.");

	}

}
