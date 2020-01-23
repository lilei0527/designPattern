package buildPattern;

import java.util.ArrayList;
import java.util.List;

//一个套餐
class Meal {
    private List<Food> foodList = new ArrayList<>();


    void addFood(Food food){
        foodList.add(food);
    }

    void showItem(){
        for(Food food:foodList){
            System.out.print("name:"+food.getName()+",");
            System.out.println("price:"+food.getPrice());
        }
    }

}
