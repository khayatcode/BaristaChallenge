import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        name = "Guest";
        ready = false;
        items = new ArrayList<Item>();
    }

    public Order(String nameParam){
        name = nameParam;
        ready = false;
        items = new ArrayList<Item>();
    }

    // Getter & Setter

    public String getName(){
        return name;
    }

    public void setOrderName(String newName){
        name = newName;
    }

    public boolean getOrderStatus(){
        return ready;
    }

    public void setOrderStatus(boolean newStatus){
        ready = newStatus;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> newItems){
        items = newItems;
    }


    // Methods

    public void addItem(Item item){
        items.add(item);
        System.out.println("Item added: " + item.getItemName());
    }

    public String getStatusMessage(){
        if(ready){
            return "\nYour order is ready!";
        }
        else{
            return "\nThank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.00;

        for(int i = 0; i < items.size(); i++){
            Item itemObject = items.get(i);
            double itemPrice = itemObject.getItemPrice();
            total += itemPrice;
        }

        return total;
    }

    // Or do it this way:
    // public double getOrderTotal(){
    //     double total = 0;
    //     for(Item item : items){
    //         total += item.getItemPrice();
    //     }
    //     return total;
    // }

    public void display(){
        System.out.println("\n----- Customer Order Details -----");

        System.out.println("\nCustomer Name: " + name);

        for(int i = 0; i < items.size(); i++ ){
            Item itemObject = items.get(i);
            String itemName = itemObject.getItemName();
            double itemPrice = itemObject.getItemPrice();
            System.out.printf("%s: $%.2f\n", itemName, itemPrice);
        }
    }

    // Or do it this way:
    // public void display(){
    //     System.out.println("Customer Name: "+this.name);
    //     for(Item item : items){
    //         System.out.println(item.getItemName()+" - $"+item.getItemPrice());
    //     }
    //     System.out.println("Total: $"+getOrderTotal());
    // }
}
