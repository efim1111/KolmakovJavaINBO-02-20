package Lab16;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> map = new HashMap<>();

    public void addOrder(String address, Order order) throws Exception {
        if (map.containsKey(address)) {
            throw new OrderAlreadyAddedException("СТОЛИК ЗАНЯТ!");
        }
        map.put(address, order);
    }

    public Order getOrder(String address) {
        return map.get(address);
    }

    public void deleteOrder(String address) {
        map.remove(address);
    }

    public void addToOrder(String address, Item a) {
        map.get(address).addPosition(a);
    }

    public Order[] getOrdersArray() {
        return map.values().toArray(new Order[0]);
    }

    public int getCostt() {
        int cost = 0;
        for (Order order : map.values()) {
            cost += order.cost();
        }
        return cost;
    }

    public int count(String itemName) {
        int count = 0;
        for (Order order : map.values()) {
            count += order.count(itemName);
        }
        return count;
    }
}