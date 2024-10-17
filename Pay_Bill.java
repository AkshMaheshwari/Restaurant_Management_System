public class Pay_Bill {

    public static void showBill(Order order) {
        System.out.println("\n  KJ Somaiya Vidyanagar Vidyavihar(E) ");
        System.out.println("          Mumbai -400077 ");
        
        System.out.println("\nDishes                          Price:");
        float subtotal = 0;

        for (int i = 0; i < order.getItems().size(); i++) {
            String item = order.getItems().get(i);
            int price = order.getPrices().get(i);
            System.out.println(item + "                     Rs." + price);
            subtotal += price;
        }
        
        System.out.println("\nSubtotal: Rs." + subtotal);
        float gst = (subtotal * 18) / 100;
        float grandTotal = subtotal + gst;
        System.out.println("GST (18%): Rs." + gst);
        System.out.println("Grand Total: Rs." + grandTotal);

        System.out.println("\nIt was a pleasure serving you! Please dine with us again.");
    }
}
