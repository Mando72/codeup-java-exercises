public class RestaurantDish {

    private int price;
    private int cost;
    private String name;
    private boolean wouldRecommend;
    private int calories;
    private String drink;

    public RestaurantDish(){}

    public RestaurantDish(int price, int cost, String name, boolean wouldRecommend, int calories, String drink) {
        this.price = price;
        this.cost = cost;
        this.name = name;
        this.wouldRecommend = wouldRecommend;
        this.calories = calories;
        this.drink = drink;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void eat() {
        System.out.println("Nom nom nom! Eating " + name + ".");
    }

} // this is end of the class!
