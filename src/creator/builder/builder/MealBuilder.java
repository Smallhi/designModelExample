package creator.builder.builder;

import creator.builder.impl.burger.Burger;
import creator.builder.impl.burger.ChickenBurger;
import creator.builder.impl.burger.VegtableBurger;
import creator.builder.impl.coldDrink.Coka;
import creator.builder.impl.coldDrink.ColdDrink;
import creator.builder.impl.coldDrink.Pepsi;

public class MealBuilder {

    private Meal meal;

// 在使用builder模式时，如果有必选参数可可选参数，可以为builder类添加构造函数保证参数不会一楼
    public MealBuilder() {
        this.meal = new Meal();
    }

    public void addColdDrink(String drinkType){

        ColdDrink drink;
        if(drinkType.equalsIgnoreCase("coke")){
            drink = new Coka();
            meal.addItem(drink);
        }else if(drinkType.equalsIgnoreCase("pepsi")){
            drink = new Pepsi();
            meal.addItem(drink);
        }
    }

    public void addBurger(String burgerType){
        Burger burger;
        if (burgerType.equalsIgnoreCase("vegetable")){
            burger = new VegtableBurger();
            meal.addItem(burger);
        }else if (burgerType.equalsIgnoreCase("chicken")){
            burger = new ChickenBurger();
            meal.addItem(burger);
        }
    }

    public Meal build()throws MealException {
        // build模式适用于快速是吧，如在OKHttp中使用build教研，创建不成功直接跑出异常
        int itemSize = meal.getItems().size();
        if(itemSize < 2 || itemSize > 2 ){
            throw new MealException("订单不完整");
        }
        return  meal;
    }

    public Meal build(String burgerType,String drinkType){
        addBurger(burgerType);
        addColdDrink(drinkType);
        try{
            build();
        }catch (MealException me){
            me.printStackTrace();
        }
        return  null;
    }

}
