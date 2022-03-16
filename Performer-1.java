/*
 * Author - Ngan Hoang
 * Course - CSC110AB
 * Date - 12/11/2019
 * Program - Performer
 * Program Purpose - To set and get information of performer's name, years of experience, talent, and also open Music Piece file.
 */
package Final_Exam;

public class Performer {// Start Coding
	
	//Declare some private instances
	private String performerName;
	private int yearsOfExlperience;
	private String talent;
	MusicPiece PerformedMusic = new MusicPiece();
/**
	 * @param performerName
	 * @param yearsOfExlperience
	 * @param talent
	 * @param performedMusic
	 */
	public Performer(String performerName, int yearsOfExlperience, String talent) {
		this.performerName = performerName;
		this.yearsOfExlperience = yearsOfExlperience;
		this.talent = talent;
	}
	/**
	 * Default Constructor
	 */
	public Performer() {
		setPerformerName("No name yet.");
		setYearsOfExlperience(0);
		setTalent("No talent field yet.");
		PerformedMusic = null;	
	}
	/**
	 * @return the performerName
	 */
	public String getPerformerName() {
		return performerName;
	}
	/**
	 * @param performerName the performerName to set
	 */
	public void setPerformerName(String performerName) {
		this.performerName = performerName;
	}
	/**
	 * @return the yearsOfExlperience
	 */
	public int getYearsOfExlperience() {
		return yearsOfExlperience;
	}
	/**
	 * @param yearsOfExlperience the yearsOfExlperience to set
	 */
	public void setYearsOfExlperience(int yearsOfExlperience) {
		this.yearsOfExlperience = yearsOfExlperience;
	}
	/**
	 * @return the talent
	 */
	public String getTalent() {
		return talent;
	}
	/**
	 * @param talent the talent to set
	 */
	public void setTalent(String talent) {
		this.talent = talent;
	}
}// End class 
