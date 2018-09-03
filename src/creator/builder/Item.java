package creator.builder;

public interface Item {
    /*
     Item 接口，用于表达麦当劳套餐中一个产品
     */
    public String name();
    public float price();
    public Packing packing();
}
