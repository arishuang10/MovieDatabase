// --== CS400 File Header Information ==--
// Name: <Tzu Chi Huang (Aris)>
// Email: <thuang245@wisc.edu>
// Team: <GD>
// Role: <Data Wrangler 1>
// TA: <Dan Kiel>
// Lecturer: <Gary Dahl>
// Notes to Grader: <>

import java.io.File;
import java.util.Scanner;

/**
 * This class is used to start the entire movie database application. 
 * 
 * @author Nathan Hoersch  
 *
 */
public class Start {

    // call methods needed to load data and start front end interface.
    public static void main(String[] args) {

        Loader load = new Loader();
        load.LoadData();
        Commands.main(null);
    }

}
