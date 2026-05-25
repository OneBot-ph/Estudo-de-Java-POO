package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;


public class Program {      

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.ENGLISH);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 

//----------- 
		
		Post post1, post2;
		Comment comment1, comment2;
		
		
		
		post1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!",
				12);
	
		comment1 = new Comment("Have a nice trip");
		comment1 = new Comment("Wow that's awesome!");
	
		post1.addComment(comment1);
		
		post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);

		comment2 = new Comment("Good night");
		comment2 = new Comment("May the Force be with you");

		post2.addComment(comment2);
		
		
//-----------

		
		System.out.println(post1);
		
		
		
		
	}

}
