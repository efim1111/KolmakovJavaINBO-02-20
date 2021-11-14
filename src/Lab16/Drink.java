package Lab16;

public final class Drink implements Item{
    private int cost;
    private String name;
    private Dish description;

    public Drink(int cost, String name, Dish description) {
        try {
            this.cost = cost;
            this.name = name;
            this.description = description;
        }
        catch (IllegalArgumentException ex){
            if (cost == 0 || name == null || description == null)
                System.out.println(ex);
        }
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Dish getDescription() {
        return description;
    }

    @Override
    public void setDescription(Dish description) {
        this.description = description;
    }
}
