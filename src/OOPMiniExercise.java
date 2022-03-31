import java.util.Locale;

class Dish{
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish(String nameOfDish, int costInCents, boolean wouldRecommend){
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;

    }

    public void printSummary(){
        System.out.printf("Cost in cents: "+ costInCents +"\n"
        + "Name of dish: "+ nameOfDish + "\n" + "Recommended: " + wouldRecommend);
    }
//    private void updateDish(int costInCents,String nameOfDish,boolean wouldRecommend){
//        this.costInCents = costInCents;
//        this.nameOfDish = nameOfDish;
//        this.wouldRecommend = wouldRecommend;
//
////        return this.printSummary();
//    }

    public int getCost(){
        return costInCents;
    }
    public void setCost(int cost){
        this.costInCents = cost;
    }

    public String getNameOfDish(){
        return nameOfDish;
    }
    public void setNameOfDish(String dishName){
        this.nameOfDish = dishName;
    }
    public boolean getRecommendation(){
        return wouldRecommend;
    }
    public void setRecommendation(boolean input){
        this.wouldRecommend = input;
    }

//    public Post(String title, String author, String content, String creationDate) {
//        this();
//        this.author = author;
//        this.content = content;
//        this.title = title;
//        this.creationDate = creationDate;
//    }

}

class DishTools{
    public static final int AVG_COST_OF_DISH_IN_CENTS = 13000;


    public static void shoutDishName(Dish input) {
        System.out.println(input.getNameOfDish().toUpperCase(Locale.ROOT));
    }

        public static void analyzeDishCost(Dish input){
            if (input.getCost() > AVG_COST_OF_DISH_IN_CENTS){
                System.out.println("The dish is more expensive than average");
            }else if (input.getCost() < AVG_COST_OF_DISH_IN_CENTS){
                System.out.println("The dish is less expensive than average");
            }
        }

        public static void flipRecommendation(Dish input){
            System.out.println(!input.getRecommendation());
        }

    }

public class OOPMiniExercise {
    public static void main(String[] args) {
        Dish firstDish = new Dish("Fish and Chips",1000,true);

//        DishTools.flipRecommendation(firstDish);
//        DishTools.analyzeDishCost(firstDish);
//        DishTools.analyzeDishCost(firstDish);
//        firstDish.printSummary();
//        DishTools.shoutDishName(firstDish);
//        System.out.println("Cost: " + firstDish.getCost());
//        System.out.println("Name: " + firstDish.getNameOfDish());
//        System.out.println("Recommended: " + firstDish.getRecommendation());
//        firstDish.setNameOfDish("Fish and chips");
//        firstDish.setCost(900);
//        firstDish.setRecommendation(true);
//        firstDish.printSummary();
    }
}
