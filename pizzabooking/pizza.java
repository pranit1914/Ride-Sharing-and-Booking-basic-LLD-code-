import java.util.Scanner;

public class Pizza {
    private int price;
    private Boolean veg; 
    private int extraChessePrice=100;
    private int extraToppingsPrice=150;
    private int backpackPrice=20;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedforTakeAway=false;

    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void addextraCheese(){
        isExtraCheeseAdded=true;
        System.out.println("Extra Cheese added");
        this.price += extraChessePrice;
    }

    public void addextraToppings(){
        isExtraToppingsAdded=true;
        System.out.println("Extra Toppings added");
        this.price += extraToppingsPrice;
    }

    public void takeway(){
        isOptedforTakeAway=true;
        System.out.println("Take away opted");
        this.price += backpackPrice;
    }

    public void getBill(){
        String bill="";
        System.out.println("\nPizza Base Price: "+ this.price);

        if(isExtraCheeseAdded){
            bill+= "Extra cheese added: "+extraChessePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill+= "Extra toppings added: "+extraToppingsPrice+ "\n";
        }
        if(isOptedforTakeAway){
            bill+= "Take away : "+backpackPrice+ "\n";
        }

        bill+="Total Bill to pay : "+this.price+"\n";
        System.out.println(bill);
        System.out.println("------ Thank You for ordering pizza ------");
    }

    // ✅ Personal Info
    public static class Personalinfo {
        private String name;
        private String address;
        private long number;

        public void getDetails(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            name = sc.nextLine();

            System.out.print("Enter your address: ");
            address = sc.nextLine();

            System.out.print("Enter your number: ");
            number = sc.nextLong();
        }

        public void display(){
            System.out.println("\nCustomer Details:");
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Number: " + number);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // 🔹 Veg or Non-Veg
        System.out.print("Do you want Veg Pizza Enter true if you want veg or enter false for non-veg ? (true/false): ");
        boolean isVeg = sc.nextBoolean();

        Pizza pizza = new Pizza(isVeg);

        // 🔹 Extra Cheese
        System.out.print("Add extra cheese? (true/false): ");
        boolean cheese = sc.nextBoolean();
        if(cheese){
            pizza.addextraCheese();
        }

        // 🔹 Extra Toppings
        System.out.print("Add extra toppings? (true/false): ");
        boolean toppings = sc.nextBoolean();
        if(toppings){
            pizza.addextraToppings();
        }

        // 🔹 Takeaway
        System.out.print("Takeaway? (true/false): ");
        boolean takeaway = sc.nextBoolean();
        if(takeaway){
            pizza.takeway();
        }

        // 🔹 Personal Info
        sc.nextLine(); // clear buffer
        Personalinfo pi = new Personalinfo();
        pi.getDetails();
        pi.display();

        // 🔹 Final Bill
        pizza.getBill();
    }
}