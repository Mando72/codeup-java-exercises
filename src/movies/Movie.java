package movies;

public class Movie {

    private String name;
    private String category;

    public Movie (String title, String cat){
        this.name = title;
        this.category = cat;
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
}