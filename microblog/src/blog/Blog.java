package blog;

import java.util.ArrayList;
import java.util.Calendar;

import base.Post;
import base.User;

public class Blog {
	private User user;
	private ArrayList<Post> allPosts = new ArrayList<Post>();

	public Blog(User user) {
		super();
		this.user = user;
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void post(Post p) {
		
			allPosts.add(p);
			System.out.println("A new Post:");
			System.out.println(p.toString());
		
	}
		

	public void list() {
		if(allPosts.size() == 0){
			System.out.println("There is no post!");
		}else{
			System.out.println("Current Post: ");
			for(int i = 0; i < allPosts.size(); i++){
				
				System.out.println("Post[" + (i+1) + "]");
				System.out.println(allPosts.get(i).toString());
			}
		}
	}
	public void delete(int i){
		if((i > allPosts.size())||( i <= 0)){
			System.out.println("Illegal deletion");
		}else{
			allPosts.remove(i-1);
		}
	}

	public ArrayList<Post> getAllPosts() {
		return allPosts;
	}

	public void setAllPosts(ArrayList<Post> allPosts) {
		this.allPosts = allPosts;
	}

	@Override
	public String toString() {
		return "Blog [allPosts=" + allPosts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	public void search(int month, String someone){
		Calendar cal = Calendar.getInstance();
		for(Post p : allPosts){
			cal.setTime(p.getdate());
			int postMonth = cal.get(Calendar.MONTH);
			if((postMonth+1) == month){
				if(p.getcontent().contains(someone)){
					System.out.println(p.toString());
				}
			}
		}
	}
	
}
