// --== CS400 File Header Information ==--
// Name: <Tzu Chi Huang (Aris)>
// Email: <thuang245@wisc.edu>
// Team: <GD>
// Role: <Data Wrangler 1>
// TA: <Dan Kiel>
// Lecturer: <Gary Dahl>
// Notes to Grader: <>


/**
 * This is a class used to access all the field of the Movie class to help create new Movie node and
 * containing accessor/mutator methods for each fields.
 * 
 * @author Aris Huang and Nathan Hoersch
 *
 */
public class Movie {
  private Object movieTitle;
  private Object year;
  private Object rating;
  private Object genre;

  /**
   * The constructor used to create a new Movie object.
   * 
   * @param movieTitle an object of movie title
   * @param year       an object of year
   * @param rating     an object of rating
   * @param genre      an object of genre
   */
  public Movie(Object movieTitle, Object year, Object rating, Object genre) {
    this.movieTitle = movieTitle;
    this.year = year;
    this.rating = rating;
    this.genre = genre;
  }

  /**
   * Accessor of movie title
   * 
   * @return movieTitle
   */
  public Object getMovieTitle() {
    return movieTitle;
  }

  /**
   * The setter method to set a movie title
   * 
   * @param movieTitle
   */
  public void setMovieTitle(Object movieTitle) {
    this.movieTitle = movieTitle;
  }

  /**
   * An accessor method to get the year of the movie
   * 
   * @return year
   */
  public Object getYear() {
    return year;
  }

  /**
   * The setter method used to set year
   * 
   * @param year
   */
  public void setYear(Object year) {
    this.year = year;
  }

  /**
   * The accessor method for getting the rating
   * 
   * @return rating
   */
  public Object getRating() {
    return rating;
  }

  /**
   * The setter method for setting the rating
   * 
   * @param rating
   */
  public void setRating(Object rating) {
    this.rating = rating;
  }

  /**
   * The getter method for the genre
   * 
   * @return genre
   */
  public Object getGenre() {
    return genre;
  }

  /**
   * The setter method for genre
   * 
   * @param genre
   */
  public void setGenre(Object genre) {
    this.genre = genre;
  }
}
