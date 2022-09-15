package Task_2;

public abstract class Fruit {

    private String name;
    private Integer weight;

    public Fruit(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }
}
