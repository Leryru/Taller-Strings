package View;

import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	String[] words;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		words = loadStrings("words.txt");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public void draw() {
		background(255);
	}

	public void mousePressed() {

	}

}
