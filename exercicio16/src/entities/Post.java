package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
//----------- Composição
	
	private List<Comment> comments =  new ArrayList<>();
	
//----------- Construtor
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;	
		this.content = content;
		this.likes = likes;
	}
	
//----------- getters and Setters

	public Date getMoment() {
		return moment;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public List<Comment> getComments(){
		return comments;
	}
	
	
//----------- 	
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "/n");
		sb.append(likes + " Likes -");
		sb.append(sdf.format(moment + "\n"));
		sb.append(content + "\n");
		sb.append("Comments: \n");
		
		for(Comment c: comments) {
			sb.append(comments.getText() + "\n");
		}
		
		return sb.toString();
		
		
	}
	
	
	
}
