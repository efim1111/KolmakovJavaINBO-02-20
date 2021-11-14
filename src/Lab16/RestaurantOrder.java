package Lab16;

public class RestaurantOrder implements Order {
    private Item[] items;

    public RestaurantOrder(Item[] items) {
        this.items = items;
    }

    @Override
    public int count() {
        return items.length;
    }

    @Override
    public int count(String itemName) {
        int count = 0;
        for (Item item: items) {
            if (item.getName().equals(itemName)) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public int cost() {
        int cost = 0;
        for (Item item : items) {
            cost += item.getCost();
        }
        return cost;
    }

    @Override
    public boolean addPosition(Item a) {
        return false;
    }

    @Override
    public String[] names() {
        return new String[0];
    }

    @Override
    public boolean delete(String itemName) {
        return false;
    }

    @Override
    public int deleteAll(String itemName) {
        return 0;
    }

    @Override
    public Item[] sorted() {
        return new Item[0];
    }
}
