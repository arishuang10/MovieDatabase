// --== CS400 File Header Information ==--
// Name: <Tzu Chi Huang (Aris)>
// Email: <thuang245@wisc.edu>
// Team: <GD>
// Role: <Data Wrangler 1>
// TA: <Dan Kiel>
// Lecturer: <Gary Dahl>
// Notes to Grader: <>

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains the commands used to navigate the application.
 * 
 * @author Lucy Kuo
 *
 */
public class Commands {

  public static MainBackEnd backEnd = Loader.backEnd;
  private static Scanner scan = new Scanner(System.in);

  /**
   * Add movie
   */
  public static Movie addMovie(String title) {
    // check table size

    System.out.println("Enter year as integer: ");
    int year = 0;
    int rating = 0;
    boolean invalid = true;
    boolean falseYear = true;

    // year input
    while (invalid) {
      try {
        year = scan.nextInt();

        while (falseYear) {
          try {
            if ((year < 2000) || (year >= 2021)) {
              throw new NumberFormatException();
            }
            falseYear = false;
          } finally {
            //
          }
        }

        invalid = false;
      } catch (InputMismatchException e) {
        System.out.println("Error: please enter year as an integer");
        invalid = true;
        scan.next();
      } catch (NumberFormatException a) {
        System.out.println("Error: please enter integer as valid year in 21st century");
      }
    }

    // rating input
    System.out.println("Enter rating % as integer: ");
    invalid = true;
    while (invalid) {
      try {
        rating = scan.nextInt();
        invalid = false;
      } catch (InputMismatchException e) {
        System.out.println("Error: please enter rating % as an integer");
        invalid = true;
        scan.next();
      }
    }

    System.out.println("Enter genre: ");
    String genre = scan.next();

    Movie movie = new Movie(title, year, rating, genre);

    if (!backEnd.addToTable(title, movie)) {

      return null;
    }

    System.out.println("Movie added!");
    System.out.println(backEnd.getMovie((String) movie.getMovieTitle()).getMovieTitle());

    return movie;
  }

  /**
   * Look up / Display movie
   */
  public static void display(String title) {
    try {
      System.out.println("Title: " + backEnd.getMovie(title).getMovieTitle() + ", Year: "
          + backEnd.getMovie(title).getYear() + ", Rating: " + backEnd.getMovie(title).getRating()
          + ", Genre: " + backEnd.getMovie(title).getGenre());
    } catch (NullPointerException e) {
      System.out.println("Please enter a valid movie title");
    }
  }

  /**
   * Help message with user commands.
   */
  public static void help() {
    System.out.println("********************\n<a Title> to add Movie, <l Title> to display movie "
        + "info, <d Title> to delete movie, <h> to redisplay commands, and <q> to quit"
        + "\n********************");
  }

  //

  public static void main(String[] args) {
    // Welcome Message
    System.out.println("********************\nWelcome to the TeamGD Movie "
        + "Database Program for prominent movies of the 21st century! \nThis program contains movie"
        + " objects containing fields for year, rating, and genre.");
    help();
    Scanner scan = new Scanner(System.in);
    String command;
    String title;
    command = scan.next();
    boolean go = true;
    while (go) {
      switch (command) {
        case "l":
          title = scan.nextLine().trim();
          display(title);
          break;

        case "q":
          System.exit(0);
          break;

        case "d":
          title = scan.nextLine().trim();
          System.out.println(title);
          boolean success = backEnd.removeMovie(title);
          if (success)
            System.out.println("successfully deleted");
          break;

        case "h":
          help();
          break;

        case "a":
          title = scan.nextLine().trim();
          System.out.println(title);
          addMovie(title);
          break;

        default:
          System.out.println("invalid command");
          break;

      }
      command = scan.next();
    }
    scan.close();
    System.out.println("Thank you for using the Movie Database program!");
  }
}
