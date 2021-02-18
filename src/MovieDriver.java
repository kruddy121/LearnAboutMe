import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner Keyboard= new Scanner(System.in);
		String movieTitle,movieRating;
		int movieTickets;
		String repeat = "y";
		do {
			Movie Details= new Movie();
			
			//sets movie title
			System.out.println("Enter the name of a movie");
			movieTitle = Keyboard.nextLine();
			Details.setTitle(movieTitle);
			
			//sets movie rating
			System.out.println("Enter the rating of the movie");
			movieRating=Keyboard.nextLine();
			Details.setRating(movieRating);
			
			//sets number of tickets sold
			System.out.println("Enter the number of tickets sold for this movie");
			movieTickets=Keyboard.nextInt();
			Details.setSoldTickets(movieTickets);
			
			//displays all user entered information
			System.out.println(Details.toString());
			
			System.out.println("Do you want to enter another?");
			repeat=Keyboard.next();
			Keyboard.nextLine();
		}while(repeat.equalsIgnoreCase("y"));
		
		System.out.println("goodbye");
		Keyboard.close();
		
		

	}

}
