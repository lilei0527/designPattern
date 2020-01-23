package buildPattern;
/*建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。
这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式*/
public class MealBuild implements Cloneable{
    //套餐A
    private Meal PrepareMealA(){
        Meal meal = new Meal();

        Food fish = new WuChangFish();
        meal.addFood(fish);
        Food chicken = new RoastChicken();
        meal.addFood(chicken);
        return meal;
    }
    //套餐B
    private Meal PrepareMealB(){
        Meal meal = new Meal();
        Food fish = new GrassCarp();
        meal.addFood(fish);
        Food chicken = new LotusLeafChicken();
        meal.addFood(chicken);
        return meal;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        MealBuild mealBuild = new MealBuild();
        Meal mealA = mealBuild.PrepareMealA();
        Meal mealB = mealBuild.PrepareMealB();
        System.out.println("套餐A:");
        mealA.showItem();
        System.out.println("套餐B:");
        mealB.showItem();
    }
}
