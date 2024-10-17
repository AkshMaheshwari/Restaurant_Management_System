import java.util.ArrayList;

public class Order {
    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<Integer> prices = new ArrayList<>();

    public void addAppetizer(String item, int price) {
        items.add(item);
        prices.add(price);
    }

    public void addMainCourse(String item, int price) {
        items.add(item);
        prices.add(price);
    }

    public void addDessert(String item, int price) {
        items.add(item);
        prices.add(price);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public ArrayList<Integer> getPrices() {
        return prices;
    }
}
