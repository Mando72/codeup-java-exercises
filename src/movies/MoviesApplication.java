package movies;
import util.Input;

public class MoviesApplication {



     public static void main(String[] args){
         System.out.println("What would you like to do?");
         System.out.println("0 = exit\n" + "1 = View all movies\n" +
                 "2 = View in the animated category\n" + "3 = View movies in the drama category\n"
                + "4 = View movies in the Horror category\n" + "5 = view movies in the scifi category\n"
            + "6 = add a movie\n" + "");

         Input input = new Input();
         Movie[] movies = MoviesArray.findAll();


         switch (input.getInt(0, 6)){
             case 0:
                 System.out.println("Bye");
                 System.exit(0);

                 break;

             case 1:
                  for(Movie movie: movies){
                      printMovie(movie);
                  }
                  break;

             case 2:
                 for(Movie movie: movies){
                     if(movie.getCategory().equals("animated")){
                         printMovie(movie);
                      }
                 }
         }


     }

     public static void printMovie(Movie movie){
         System.out.println("Title: "+ movie.getName() + "Category: "+ movie.getCategory());
     }

}



























