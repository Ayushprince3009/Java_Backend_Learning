package com.kodewala.multipleinterfaace.pq1;

public class Driver1 {
	public static void main(String[] args) {
		SmartPhone nokia = new SmartPhone();
		nokia.takePhoto();
		nokia.playMusic();
	}
}

interface Camera{
	void takePhoto();
}

interface MusicPlayer{
	void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
	@Override
	public void takePhoto() {
		System.out.println("Good photo capture");
	}
	
	@Override
	public void playMusic() {
		System.out.println("Music Played");
	}
}

