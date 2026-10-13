public class intermediate {
    
    public static void main(String[] args) {
        
        int quantity = 3;
        double unitprice = 99.67;
        String storename = "Pioneer Center";
        
        //total should not be an int because the can price have decimal values.
        double total = quantity * unitprice;
        
        double cash = 500.00;
        double change = cash - total;
        
        System.out.println("====================================");
        
        System.out.println(storename);
        System.out.println("SHOPPING RECEIPT");
        
        System.out.println("====================================");
        
        System.out.println("Item: Cowhead Fresh UHT Milk");
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitprice);
        
        System.out.println("------------------------------------");
        
        System.out.printf("TOTAL: %.2f%n", total);
        System.out.println("Cash: " + cash);
        System.out.printf("Change: %.2f%n", change);
        
        System.out.println("====================================");
        System.out.println("THANK YOU FOR SHOPPING!");
        System.out.println("====================================");
        
    }
    
}
