package Lab16;

interface Order {
    boolean addPosition(Item a);
    String[] names();
    int count();
    int count(String itemName);
    Item[] getItems();
    boolean delete(String itemName);
    int deleteAll(String itemName);
    Item[] sorted();
    int cost();
}
