import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArr = new GroceryItem[3];
        groceryArr[0] = new GroceryItem("milk");
        groceryArr[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArr[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArr));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("yogurt"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));

        groceryList.add(0, new GroceryItem("apples", "PRODUCE", 6));
        System.out.println(groceryList);
    }
}
