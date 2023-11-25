package _05_for_loops._2_badgers;

public class Badger_Mushroom_Snenk {
	public static void main(String[] args) {

		for (int line=0;line<2 ; line += 1) {
			for (int badger=0; badger < 12; badger+=1){
				System.out.print ("Badger");
				if (badger < 11) {
					System.out.print (", ");
				}
			
			}
			System.out.println ();
			
			for (int mushroom=0; mushroom < 2; mushroom+=1){
				System.out.print ("Mushroom");
				if (mushroom < 1) {
					System.out.print (", ");
				}
			}	
			System.out.println ();
			System.out.println ();


		}
		System.out.print("A Snek!!!");
	}

}

//Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger, Badger, Badger
//Mushroom, Mushroom

//Badger, Badger, Badger,Badger, Badger, Badger, Badger,Badger, Badger, Badger, Badger, Badger
//Mushroom, Mushroom

//A Snake!!!