public class TestOrder{

    public static void main(String[] args){

        // Orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Bob");
        Order order4 = new Order("Sally");
        Order order5 = new Order("John");

        // Items
        Item item1 = new Item("Burger", 5.99);
        Item item2 = new Item("Fries", 2.99);
        Item item3 = new Item("Drink", 1.99);
        Item item4 = new Item("Salad", 3.99);
        Item item5 = new Item("Pizza", 7.99);

        // Test

        // Add items to orders
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item5);
        order2.addItem(item4);
        order3.addItem(item3);
        order3.addItem(item2);
        order4.addItem(item1);
        order4.addItem(item5);
        order5.addItem(item4);
        order5.addItem(item3);

        // Change order status
        order1.setOrderStatus(true);
        order2.setOrderStatus(true);

        // Display order status

        System.out.println("\nOrder 1 Status: " + order1.getOrderStatus());
        System.out.println("Order 2 Status: " + order2.getOrderStatus());
        System.out.println("Order 3 Status: " + order3.getOrderStatus());
        

        // Get total order price
        System.out.println("\nOrder 1 Total: " + order1.getOrderTotal());
        System.out.println("Order 2 Total: " + order2.getOrderTotal());
        System.out.println("Order 3 Total: " + order3.getOrderTotal());

        // Display all orders
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

    }
}