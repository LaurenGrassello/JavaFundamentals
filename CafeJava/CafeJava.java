public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = " Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2;
        double latte = 4;
        double cappuccino = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
    	// ** Your customer interaction print statements will go here ** //

        if(isReadyOrder4 == false){
            System.out.println(generalGreeting + customer4 + pendingMessage);
        } else {
            System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage + cappuccino);
        }

        if(isReadyOrder3 == true){
            System.out.println(generalGreeting + customer2 + displayTotalMessage + latte*2);
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }

        if(customer3 == "Jimmy"){
            System.out.println(generalGreeting + customer3 + displayTotalMessage + (latte -dripCoffee));
        } 

        System.out.println(generalGreeting + customer3 + pendingMessage);


    }
}
