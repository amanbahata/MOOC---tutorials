public class Product {

    private String name;
    private Double price;
    private Integer amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        name = nameAtStart;
        price = priceAtStart;
        amount = amountAtStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void printProduct(){
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}
