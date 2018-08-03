package movies;

public class Movie {

    private String name;
    private String category;
    private int rating;

    public Movie (String title, String cat){
        this.name = title;
        this.category = cat;
    }

    public Movie(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName(){

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Movie(String category) {

        this.category = category;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public static Movie[] movieFinder = MoviesArray.findAll();
}