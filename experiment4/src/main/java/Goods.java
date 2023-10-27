public class Goods {
    private final String id;
    private String name;
    private static int number;

    public Goods(String name) {
        this.name = name;
        this.id = "id" + ++number;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "货物名称:" + name + ", 货物编号:" + id + ", 货物库存:" + number;
    }
}
