public class RestaurantTest {
    public static void main(String[]args){
     RestaurantDish dish = new RestaurantDish();

        dish.setName("Nachos");
        dish.setCost(550);
        dish.setWouldRecommend(true);

        System.out.println(dish.getName());
        System.out.println(dish.getCost());
        System.out.println(dish.isWouldRecommend());

        dish.eat();

        dish.setName("tacos");
        dish.setCost(600);
        dish.setWouldRecommend(false);

        System.out.println(dish.getName());
        System.out.println(dish.getCost());
        System.out.println(dish.isWouldRecommend());


        dish.eat();

    }

}
