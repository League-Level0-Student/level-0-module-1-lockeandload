package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int score=(0);
//
		//jokes
		//"What do you call a factory that makes okay products?" "A satisfactory."
		//"What did the janitor say when he jumped out of the closet?" "Supplies!"
		//"Have you heard about the chocolate record player? It sounds pretty sweet."
		//"What did the ocean say to the beach?" "Nothing, it just waved."
		//"Why do seagulls fly over the ocean?" "Because if they flew over the bay, we'd call them bagels."
		//"I only know 25 letters of the alphabet. I don't know y."
		//"How does the moon cut his hair?" "Eclipse it."
		//"What did one wall say to the other?" "I'll meet you at the corner."
		//"What did the zero say to the eight?" "That belt looks good on you."
		//"Where do fruits go on vacation?" "Pear-is!"
		//"I asked my dog what's two minus two. He said nothing."
		//"What did Baby Corn say to Mama Corn?" "Where's Pop Corn?"
		//"What's the best thing about Switzerland?" "I don't know, but the flag is a big plus."
		//"What does a sprinter eat before a race?" "Nothing, they fast!"
		//"Where do you learn to make a banana split?" "Sundae school."
		//"What has more letters than the alphabet?" "The post office!"
		//"Dad, did you get a haircut?" "No, I got them all cut!"
		//"What do you call a poor Santa Claus?" "St. Nickel-less."		
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String gg1 = JOptionPane.showInputDialog("What do you call a factory that makes okay products?");
		if (gg1.equals ("A satisfactory")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
		JOptionPane.showMessageDialog(null, "worng");
		}
		System.out.println (score);
		//
		String gg2 = JOptionPane.showInputDialog("What did the janitor say when he jumped out of the closet?")
				;if (gg2.equals ("Supplies")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
				else {
					JOptionPane.showMessageDialog(null, "worng");
					}
				System.out.println (score);
		//
		String gg3 = JOptionPane.showInputDialog("What did the ocean say to the beach?");
		if (gg3.equals ("Nothing, it just waved")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg4 = JOptionPane.showInputDialog("Why do seagulls fly over the ocean?");
		if (gg4.equals ("Because if they flew over the bay, we'd call them bagels")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg5 = JOptionPane.showInputDialog("I only know 25 letters of the alphabet.");
		if (gg5.equals ("I don't know y")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg6 = JOptionPane.showInputDialog("How does the moon cut his hair?");
		if (gg6.equals ("Eclipse it")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg7 = JOptionPane.showInputDialog("What did one wall say to the other?");
		if (gg7.equals ("I'll meet you at the corner")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg8 = JOptionPane.showInputDialog("What did the zero say to the eight?");
		if (gg8.equals ("That belt looks good on you")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg9 = JOptionPane.showInputDialog("Where do fruits go on vacation?");
		if (gg9.equals ("Pear-is")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg10 = JOptionPane.showInputDialog("I asked my dog what's two minus two.");
		if (gg10.equals ("He said nothing")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg11 = JOptionPane.showInputDialog("What did Baby Corn say to Mama Corn?");
		if (gg11.equals ("Where's Pop Corn")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg12 = JOptionPane.showInputDialog("What's the best thing about Switzerland?");
		if (gg12.equals ("I don't know, but the flag is a big plus")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg13 = JOptionPane.showInputDialog("What does a sprinter eat before a race?");
		if (gg13.equals ("Nothing, they fast")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg14 = JOptionPane.showInputDialog("Where do you learn to make a banana split?")
				;if (gg14.equals ("Sundae school")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
				else {
					JOptionPane.showMessageDialog(null, "worng");
					}
				System.out.println (score);	
		////
		String gg15 = JOptionPane.showInputDialog("What has more letters than the alphabet?");
		if (gg15.equals ("The post office")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		//
		String gg16 = JOptionPane.showInputDialog("Dad, did you get a haircut?");
		if (gg16.equals ("No, I got them all cut")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(10000);
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		System.out.println (score);
		JOptionPane.showMessageDialog(null, "arlright, thsi one is worth 500");
		//
		String gg17 = JOptionPane.showInputDialog("What do you call a poor Santa Claus?");
		if (gg17.equals ("St. Nickel-less")) {		
			JOptionPane.showMessageDialog(null, "correct");
			score+=(500);
			System.out.println (score);	
		}
		else {
			JOptionPane.showMessageDialog(null, "worng");
			}
		
		JOptionPane.showMessageDialog(null, "btw every queston was accully worth 10k ecept for the last one LOL");
		//
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}

}
