public class Produits {
    private int id;
    private String name;
    private float price;

    public Produits() {
        
    }
    public Produits (int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //getters & setters
    public int getId() {
        return id;
    }
    public int simpleFunction(){
        int n1=0,n2=1,n3,i,count=10;
System.out.print(n1+" "+n2);//printing 0 and 1    
for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
{
n3=n1+n2;
System.out.print(" "+n3);
n1=n2;
n2=n3;
}
        return 0;
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