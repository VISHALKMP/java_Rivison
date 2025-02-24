import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
  private String n;
  private double r;
  private int y;

public Movie(String n, double r, int y){
  this.n = n;
this.r= r;
this.y =y;

public int compareTo(Movie m){
return this.y - m.y;
    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }
}
public class Check {
ArrayList<Movie> L = new ArrayList<>();
  l.add(new Movie("Star Wars", 8.7, 1977));
        l.add(new Movie("Empire Strikes Back", 8.8, 1980));
        l.add(new Movie("Return of the Jedi", 8.4, 1983));

Collections.sort(L);

System.out.println("Movies after sprting by year");
for(Movie m: L ){
System.out.println(m.getName() + " " + m.getRating()+ " " + m.getYear());
}
}
}
