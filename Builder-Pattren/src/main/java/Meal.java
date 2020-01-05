import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItems(Item item){
        items.add(item);
    }

    public float getCost(){
        float res =0.0f;
        for(Item item: items){
            res += item.price();
        }
        return res;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
