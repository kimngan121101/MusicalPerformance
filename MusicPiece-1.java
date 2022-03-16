/*
 * Author - Ngan Hoang
 * Course - CSC110AB
 * Date - 12/11/2019
 * Program - Music Piece
 * Program Purpose - to set and get information of music's name, genre, and length in minutes.
 */
package Final_Exam;

public class MusicPiece { // Start Coding 
	
	// Declare some private instances
private String musicName;
private String genre;
private double length;

/**
 * Default Constructor
 */
public MusicPiece() {
	setMusicName("No name yet.");
	setGenre("No genre yet.");
	setLength(0);
}
/**
 * @param musicName
 * @param genre
 * @param length
 */
public MusicPiece(String musicName, String genre, double length) {
	this.musicName = musicName;
	this.genre = genre;
	this.length = length;
}
/**
 * @return the musicName
 */
public String getMusicName() {
	return musicName;
}
/**
 * @param musicName the musicName to set
 */
public void setMusicName(String musicName) {
	this.musicName = musicName;
}
/**
 * @return the genre
 */
public String getGenre() {
	return genre;
}
/**
 * @param genre the genre to set
 */
public void setGenre(String genre) {
	this.genre = genre;
}
/**
 * @return the length
 */
public double getLength() {
	return length;
}
/**
 * @param length the length to set
 */
public void setLength(double length) {
	this.length = length;
}
}// End class
