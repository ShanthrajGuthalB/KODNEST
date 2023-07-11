import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter movie name :");
		String moviename = scan.nextLine();
		System.out.println("Enter movie releasedyear :");
		int releasedyear = scan.nextInt();
		System.out.println("Enter movie hero name :");
		scan.nextLine();
		String hero = scan.nextLine();
		System.out.println("Enter movie heroine name :");
		String heroine = scan.nextLine();
		System.out.println("Enter movie director name :");
		String director = scan.nextLine();
		System.out.println("Enter movie producer name :");
		String producer = scan.nextLine();
		System.out.println("Enter movie music director name :");
		String musicdirector = scan.nextLine();
		System.out.println("Enter number of songs in the movie :");
		int songs = scan.nextInt();
		System.out.println("Enter budger of the movie (in Cr's):");
		int budget = scan.nextInt();
		System.out.println("Enter the profit this movie made (in Cr's):");
		int profit = scan.nextInt();
		
		Film f = new Film(moviename, releasedyear, hero, heroine, director, producer,
				musicdirector, songs, budget, profit);
			System.out.println(f.moviename+" released in "+ f.releasedyear+" starring "+  f.hero+" & "+  f.heroine+" and directed by "+  f.director+" and produced by "+  f.producer+" "+ 
				f.musicdirector+" is the music director composed "+  f.songs+" songs, and the budget of the movie is "+  f.budget+"Cr's"+" and made profit of "+  f.profit+" Cr's");
		
			
			f.film();
			f.hit();
		scan.close();
	}

}
