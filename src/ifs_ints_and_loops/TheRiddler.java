package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Riddle=JOptionPane.showInputDialog("I have a neck, but no head, and I wear a cap. What am I?");
if(Riddle.equals("A bottle!")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer is a bottle");
}
String Riddle1=JOptionPane.showInputDialog("Why is an island like the letter T?");
if(Riddle1.equals("They're both in the middle of water!")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer is that they're both in the middle of the water");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, " The Score Is " + score);
		
	}
}

