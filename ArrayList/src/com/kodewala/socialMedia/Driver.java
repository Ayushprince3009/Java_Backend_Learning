package com.kodewala.socialMedia;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<String> posts = new ArrayList<>();

		posts.add("Post-A");
		posts.add("Post-B");
		posts.add("Post-C");
		posts.add("Post-B");
		posts.add("Post-D");
		posts.add("Post-B");
		
		posts.add(0, "Urgent-POST");
		posts.add(4, "post-X");
		posts.set(posts.indexOf("Post-C"),"Post-C-Reviewed");
		posts.indexOf("Post-B");
		posts.lastIndexOf("Post-B");
		posts.remove(posts.indexOf("Post-B"));
		
		System.out.println(posts);
		

	}
}
