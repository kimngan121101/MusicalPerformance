/*
 * Author - Ngan Hoang
 * Course - CSC110AB
 * Date - 12/11/2019
 * Program - Musical Performance Driver 
 * Program Purpose - to test the musical performance program and get the total score of performer
 */
package Final_Exam;
import java.util.Scanner;
public class MusicalPerformanceDriver { // Start class
	
	// Create a method of calculating the total of each judge's rating
	/**
	 * @param MusicRatings_in
	 * @return the total score of each judge in double
	 */
	public static double get_calc_MusicRatingTotal(RatingScore[] MusicRatings_in) {
		return MusicRatings_in[0].getRating() + MusicRatings_in[1].getRating() + MusicRatings_in[2].getRating();
	}
	public static void main(String[] args) { // Start Main	
		Scanner scnr = new Scanner(System.in);
		
		// Declare arrays
		String [] judge_names = new String[2];
		double [] judge_totals = new double[2];
		RatingScore [] musicRatings = new RatingScore[3];
		
		// Use for loop to create a copy of music rating
		for (int i = 0; i < 3; i++)
			musicRatings[i] = new RatingScore();
		
		// Set max rating and Description of what is being rated
		musicRatings[0].setDescription("Music Technique");
		musicRatings[1].setDescription("Emotional Communication");
		musicRatings[2].setDescription("Stage Performance");
		musicRatings[0].setMax(10);
		musicRatings[1].setMax(8);
		musicRatings[2].setMax(5);
		
		// Inputting by following ("Performer's name", integer, "Talent")
		Performer newPerformer = new Performer("Dylan", 8, "Rapper");
		
		// Ask for user's inputs
		System.out.println("Please enter the music name");
		newPerformer.PerformedMusic.setMusicName(scnr.nextLine());
		System.out.println("Please enter the music genre");
		newPerformer.PerformedMusic.setGenre(scnr.nextLine());
		System.out.println("Please enter the music length in minutes");
		newPerformer.PerformedMusic.setLength(scnr.nextDouble());
		scnr.nextLine(); // Prevent an error
		
		// Use for loop to ask for judge's name, rating scores, and calculate the total of each judge
		for (int i = 0; i < 2; i++) {
			System.out.println("Judge "+ (i+1) + ", please enter your name:");
			judge_names[i] = scnr.nextLine();
			System.out.println();
			System.out.println(judge_names[i] + ", Please enter your scores for " + newPerformer.getPerformerName());
			for (int i1 = 0; i1 < 3; i1++) {
				System.out.println(musicRatings[i1].getDescription()+ " with a max rating of "+ musicRatings[i1].getMax());
				musicRatings[i1].setRating(scnr.nextDouble());
		}
			scnr.nextLine(); // Prevent an error
			judge_totals [i] = get_calc_MusicRatingTotal(musicRatings);
		}
		
		// Display output 
		System.out.println("\n\n|--------------------------------------------------------------|\n");
		System.out.println("Performer Name: " + newPerformer.getPerformerName());
		System.out.println("Years of Performer Experience: "+ newPerformer.getYearsOfExlperience());
		System.out.println("Performer Talent: "+ newPerformer.getTalent());
		System.out.println("Music: "+ newPerformer.PerformedMusic.getMusicName());
		System.out.println("Genre: "+ newPerformer.PerformedMusic.getGenre());
		System.out.println("Length in minutes: "+ newPerformer.PerformedMusic.getLength());
		System.out.printf("Score by Judge, " + judge_names[0] +" : %.2f\n", judge_totals[0]);
		System.out.printf("Score by Judge, " + judge_names[1] +" : %.2f\n", judge_totals[1]);
		System.out.printf("Performer total: %.2f out of 46.00\n",(judge_totals[0] + judge_totals[1]));
		System.out.println("\n|--------------------------------------------------------------|\n");
		
		System.out.println("Program Complete");
		
		scnr.close(); // Prevent source leaks
		}// End main

}// End class
