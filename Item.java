public class Item {
    private String name;
    private double price;

    public Item(String itemName, double itemPrice){
        name = itemName;
        price = itemPrice;
    }

    public String getItemName(){
        return name;
    }

    public void setItemName(String newName){
        name = newName;
    }

    public double getItemPrice(){
        return price;
    }

    public void setItemPrice(double num){
        price = num;
    }

}
