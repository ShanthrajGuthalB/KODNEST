
public class Film {
	String moviename;
	int releasedyear;
	String hero;
	String heroine;
	String director;
	String producer;
	String musicdirector;
	int songs;
	int budget;
	int profit;
	
	public Film(String moviename, int releasedyear, String hero, String heroine, String director, String producer,
			String musicdirector, int songs, int budget, int profit) {
		super();
		this.moviename = moviename;
		this.releasedyear = releasedyear;
		this.hero = hero;
		this.heroine = heroine;
		this.director = director;
		this.producer = producer;
		this.musicdirector = musicdirector;
		this.songs = songs;
		this.budget = budget;
		this.profit = profit;
	}
	
	void film() {
		System.out.println(moviename+" starring "+hero+" & "+heroine+" directoted by "+director+" and produced by "+producer+" of budget "+budget);
	}
	void hit() {
		System.out.println(" music director composed "+songs+" songs which were super hit & the movie made profit of "+profit+" Cr's");
	}
	

}
