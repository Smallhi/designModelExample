package creator.builder;

import creator.builder.builder.Meal;
import creator.builder.builder.MealException;
import creator.builder.builder.MealBuilder;

public class Main {

    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();
        // builder 模式的特点是要创建的对象很复杂，但可以一步一步的创建
        builder.addColdDrink("coke");
        builder.addBurger("vegetable");

        Meal meal;

        try{
             meal = builder.build();
             meal.showItems();
        }catch (MealException me) {
            me.printStackTrace();
        }


    }
}
