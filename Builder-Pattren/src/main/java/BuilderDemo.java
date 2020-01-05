public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        float cost = meal.getCost();
        meal.showItems();
        System.out.println("Cost: "+cost);
        //////////////////////
        Meal meal1 = mealBuilder.prepareVegMeal();
        float cost1 = meal1.getCost();
        meal1.showItems();
        System.out.println("Cost: "+cost1);
    }
}


/*
* 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
*          由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
*
* 关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
* */