/*
 Class: CMSC203 CRN 21455
 Program: Lab 3
 Instructor: Professor Alexander
 Summary of Description: Writing movie info to a file and having it read the input back by creating objects
 Due Date: 09/23/2021
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
B. Leigh Vining
 */

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		String repeat;
		
		do {
			System.out.println("Enter the name of a movie");
			movie.setTitle(input.nextLine());
		
			System.out.println("Enter the rating of the movie");
			movie.setRating(input.nextLine());
		
			System.out.println("Enter the number of tickets sold for this movie");
			movie.setSoldTickets(input.nextInt());
			
			System.out.println(movie.toString());
			
			
			System.out.println("\nDo you want to enter another? (y or n)");
			repeat = input.nextLine();
			repeat = input.nextLine();
			
		} while (repeat.contains("y") || repeat.contains("Y"));
	
		if (repeat != "y" || repeat != "Y")
		{
			System.out.println("Goodbye");
		}
		
	}
}
