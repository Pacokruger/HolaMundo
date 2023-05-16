/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Movie;
import Utilidades.Comparators;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class MovieService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Movie> moviesList = new ArrayList();

    public MovieService() {
    }
     
    public MovieService(ArrayList<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }
 
    public void createMovie(){   
        String answer;
        
        do {
            Movie m = new Movie();
            System.out.print("Enter the movie's title: ");
            m.setTitle(sc.next());
            System.out.print("Enter the movie's director: ");
            m.setDirector(sc.next());
            System.out.print("Enter the movie's duration: ");
            m.setDuration(sc.nextInt());
            
            moviesList.add(m);
            
            System.out.println("Do you want to add another movie? Y/N");
            answer = sc.next();
            
        } while (answer.equalsIgnoreCase("Y"));  
    }
    
    public void showAllMovies(ArrayList<Movie> moviesList){  
        for (Movie aux : moviesList) {
            System.out.println(aux);
        }  
    }
    
    public void showLongestMovies(ArrayList<Movie> moviesList){   
        System.out.println("");
        System.out.println("+1 hour movies");
        for (Movie movie : moviesList) {
            if (movie.getDuration() > 1) {
                System.out.println(movie);
            }
        }
    }
    
    public void orderByDuration(ArrayList<Movie> moviesList){
         
        Comparators.sortByDuration(moviesList);
        System.out.println("Ordered by major duration");
        for (Movie aux : moviesList) {
            System.out.println(aux.getTitle() + " (" + aux.getDirector() + ") - Duration: " + aux.getDuration() + " hours");
        }
        
    }
    
    public void orderByLessDuration(ArrayList<Movie> moviesList){
         
        Comparators.sortByLessDuration(moviesList);
        System.out.println("Ordered by less duration");
        for (Movie aux : moviesList) {
            System.out.println(aux.getTitle() + " (" + aux.getDirector() + ") - Duration: " + aux.getDuration() + " hours");
        }
        
    }
    
    public void orderByTitle(ArrayList<Movie> moviesList){
        
        Comparators.sortByTitle(moviesList);
        
        System.out.println("Ordered by title");
        for (Movie movie : moviesList) {
            System.out.println(movie.getTitle());
        }    
    }
    
     public void orderByDirector(ArrayList<Movie> moviesList){
        
        Comparators.sortByDirector(moviesList);
        
        System.out.println("Ordered by Director");
        for (Movie movie : moviesList) {
            System.out.println(movie.getDirector());
        }    
    }
    
 
}
