public class Produits {
    private int id;
    private String name;
    private float price,

    public Produits (int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //getters & setters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}