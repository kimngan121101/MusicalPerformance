/*
 * author - Ngan Hoang 
 * course - CSC110AB
 * date - 11/26/2019
 * program - Rating score
 * program purpose - to set and get the information of description of what being described, the max rate, and the rating score. 
 */
package Final_Exam;

public class RatingScore { // Start Coding
	
	//Declare some private instances
	private String description;
	private double maxRate;
	private double rating;
	
	/******** Default Constructor ******/
	
	public RatingScore() {
		setDescription ("No description yet.");
		setMax(0);
		setRating(0);
	}
	/**
	 * @param description
	 * @param rating
	 * @param maxRate
	 */
	public RatingScore (String description , double rating, double maxRate) {
		this.description = description;
		this.rating = rating;
		this.maxRate = maxRate;
	}
	/**
	 * @param description
	 */
	public void setDescription (String description) {
		this.description = description;
	}
	/**
	 * @return description
	 */
	public String getDescription () {
		return description;
	}
	/**
	 * @param maxRate
	 */
	public void setMax (double maxRate) {
		this.maxRate = maxRate;
	}
	/**
	 * 
	 * @return maxRate
	 */
	public double getMax () {
		return maxRate;
	}
	/**
	 * @param rating
	 */
	public void setRating(double rating ) {
		this.rating = rating;
	}
	/**
	 * @return rating
	 */
	public double getRating() {
		return rating;
	}
}// End class
	
	
	
