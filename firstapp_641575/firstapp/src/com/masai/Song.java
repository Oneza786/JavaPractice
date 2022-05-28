package com.masai;

public class Song {
	
	String title;
	String artist;
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist=artist;
		
		
	}
	
	
	void play() {
		
		System.out.println(artist +" is singing "+ title);
	}

	public static void main(String[] args) {
		
		Song s1 = new Song("lata","wande matram");
		
		s1.play();
		
		
				
	}
	
	
	
}
