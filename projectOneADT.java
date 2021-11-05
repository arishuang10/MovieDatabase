// --== CS400 File Header Information ==--
// Name: <Tzu Chi Huang (Aris)>
// Email: <thuang245@wisc.edu>
// Team: <GD>
// Role: <Data Wrangler 1>
// TA: <Dan Kiel>
// Lecturer: <Gary Dahl>
// Notes to Grader: <>

/**
 * This is an  interface used to access the movie (get, add, and remove). 
 * 
 * @author Nathan Hoersch 
 *
 */
public interface projectOneADT {

    public boolean addToTable(String movieTitle, Movie movie);
    public Movie getMovie(String movieTitle);
    public boolean removeMovie(String movieTitle);

}
