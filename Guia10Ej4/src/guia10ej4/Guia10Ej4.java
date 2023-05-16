/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej4;

import Service.MovieService;

/**
 *
 * @author Paola
 */
public class Guia10Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MovieService mvs = new MovieService();
        
        mvs.createMovie();
        mvs.showAllMovies(mvs.getMoviesList());
        mvs.orderByDuration(mvs.getMoviesList());
        mvs.orderByLessDuration(mvs.getMoviesList());
        mvs.orderByTitle(mvs.getMoviesList());
        mvs.orderByDirector(mvs.getMoviesList());
}
}
