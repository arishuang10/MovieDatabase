// --== CS400 File Header Information ==--
// Name: <Tzu Chi Huang (Aris)>
// Email: <thuang245@wisc.edu>
// Team: <GD>
// Role: <Data Wrangler 1>
// TA: <Dan Kiel>
// Lecturer: <Gary Dahl>
// Notes to Grader: <Nathan Hoersch has helped to make sure the data is correctly loaded into the application>


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the class used to load the data from movie.txt, year.txt, genre.txt, and rating.txt into
 * the application.
 * 
 * @author Aris Huang (DATA WRANGLER)
 *
 */
public class Loader {

  public static MainBackEnd backEnd = new MainBackEnd();
  private ArrayList<String> titles = new ArrayList<String>();
  private ArrayList<String> genres = new ArrayList<String>();
  private ArrayList<String> years = new ArrayList<String>();
  private ArrayList<String> ratings = new ArrayList<String>();

  /**
   * A constructor to simply create a load object
   * 
   */
  public Loader() {

  }

  /**
   * Load method to load data into hash table.
   * 
   * @return true if the data are successfully loaded
   */
  public boolean LoadData() {
    loadTitles();
    loadGenres();
    loadRatings();
    loadYears();
    loadMovies();

    // Below is for testing purposes
    // for (int i=0; i<60; i++) {
    // System.out.println(backEnd.getMovie(titles.get(i)).getMovieTitle());
    // }
    return true;
  }

  /**
   * Load the movie titles into the application from movie.txt.
   * 
   */
  private void loadTitles() {
    File movieFile = null;
    try {
      movieFile = new File("movie.txt");
      // System.out.println(movieFile.getAbsolutePath());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Couldn't find file...");
    }
    Scanner scan = null;
    try {
      scan = new Scanner(movieFile);
    } catch (Exception e) {
      System.out.println("Couldn't create scanner.");
    }
    while (scan.hasNext()) {
      titles.add(scan.nextLine());
    }
    scan.close();
  }

  /**
   * Load the genre into the application from genre.txt
   * 
   */
  private void loadGenres() {
    File movieFile = null;
    try {
      movieFile = new File("genre.txt");
      // System.out.println(movieFile.getAbsolutePath());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Couldn't find file...");
    }
    Scanner scan = null;
    try {
      scan = new Scanner(movieFile);
    } catch (Exception e) {
      System.out.println("Couldn't create scanner.");
    }
    while (scan.hasNext()) {
      genres.add(scan.nextLine());
    }
    scan.close();
  }

  /**
   * Load the year into the application from year.txt.
   * 
   */
  private void loadYears() {
    File movieFile = null;
    try {
      movieFile = new File("year.txt");
      // System.out.println(movieFile.getAbsolutePath());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Couldn't find file...");
    }
    Scanner scan = null;
    try {
      scan = new Scanner(movieFile);
    } catch (Exception e) {
      System.out.println("Couldn't create scanner.");
    }
    while (scan.hasNext()) {
      years.add(scan.nextLine());
    }
    scan.close();
  }

  /**
   * Load the rating into the application from rating.txt.
   * 
   */
  private void loadRatings() {
    File movieFile = null;
    try {
      movieFile = new File("ratings.txt");
      // System.out.println(movieFile.getAbsolutePath());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Couldn't find file...");
    }
    Scanner scan = null;
    try {
      scan = new Scanner(movieFile);
    } catch (Exception e) {
      System.out.println("Couldn't create scanner.");
    }
    while (scan.hasNext()) {
      ratings.add(scan.nextLine());
    }
    scan.close();
  }

  /**
   * load all the movies with their information into the the hashtable and to ensure that the all
   * movies are correctly loaded into the application
   * 
   */
  private void loadMovies() {
    Object[] yearArray = years.toArray();
    Object[] titleArray = titles.toArray();
    Object[] ratingsArray = ratings.toArray();
    Object[] genreArray = genres.toArray();

    for (int i = 0; i < 60; i++) {
      backEnd.addToTable(titleArray[i].toString(),
          new Movie(titleArray[i], yearArray[i], ratingsArray[i], genreArray[i]));
    }
  }
}
