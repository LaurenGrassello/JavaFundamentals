import java.util.*;


class CafeUtil {


    public String getStreakGoal(int numWeeks){
        int drinkOrder = 0;
        for(int i = 0; i <= numWeeks; i++){
            drinkOrder += i;
        }
        String total = String.valueOf(drinkOrder);
        return total;
    }


    public String getOrderTotal(double[] prices){
        double drinkOrder = 0;
        for(int i = 0; i < prices.length; i++){
            drinkOrder += prices[i];
        }
        String total = String.valueOf("$"+drinkOrder);
        return total;
    }


    public String displayMenu(ArrayList<String> menuItems) {
        for(String item : menuItems) {
            System.out.println(menuItems.indexOf(item) + " " + item);
        }
        return "";
    }
    

    public String addCustomer(ArrayList<String> customers) {
        System.out.println(customers);
        return "";
    }

    }





















