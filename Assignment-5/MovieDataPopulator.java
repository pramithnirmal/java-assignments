package ASS5;
import java.util.*;
import java.io.*;
public class MovieDataPopulator {
	
	public static List<Movie> readMovieData(String filePath){
		List<Movie> movieList = new ArrayList<Movie>();
		try {
		   Scanner s = new Scanner(new File(filePath));
		   while(s.hasNextLine()) {
			    String[] tokens = s.nextLine().split(",");
			    Movie m = new Movie();
			    m.setId(Integer.parseInt(tokens[0]));
			    m.setName(tokens[1]);
			    m.setType(tokens[2]);
			    m.setReleaseDate(tokens[3]);
			    movieList.add(m);
			    
		   }
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return movieList;
	}

	public static void main(String[] args) {
        List<Movie>  movieList =readMovieData("./Movies.txt");
        
        for(Movie m : movieList) {
        	System.out.println(m.toString());
        }
          
		
	}

}

class Movie{
	private int id;
	private String name;
	private String type;
	private String releaseDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String toString() {
		return getId()+"\t"+getName()+"\t"+getType()+"\t"+getReleaseDate();
	}
}
