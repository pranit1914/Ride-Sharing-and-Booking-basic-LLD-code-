import java.util.*;

// ---------------- USER ----------------
class User {
    private String name;
    private String address;
    private Long Monumber;

    public User(String name, String address, Long Monumber) {
        this.name = name;
        this.address = address;
        this.Monumber = Monumber;
    }

    public String getPersonaldetails() {
        return name + " - " + address + " - " + Monumber;
    }
}

// ---------------- ABSTRACTION ----------------
abstract class Discount {
    abstract double applyDiscount(double totalAmount);
}

// ---------------- COUPONS ----------------
class PercentageCoupon extends Discount {
    private double percent;

    public PercentageCoupon(double percent) {
        this.percent = percent;
    }

    double applyDiscount(double totalAmount) {
        return totalAmount - (totalAmount * percent / 100);
    }
}

class Flatcoupon extends Discount {
    private double amount;

    public Flatcoupon(double amount) {
        this.amount = amount;
    }

    double applyDiscount(double totalAmount) {
        return totalAmount - amount;
    }
}

// ---------------- PRODUCT ----------------
class Product {
    private String name;
    private double price;
    private double gst;

    public Product(String name, double price, double gst) {
        this.name = name;
        this.price = price;
        this.gst = gst;
    }

    public double getFinalPrice() {
        return price + (price * gst / 100);
    }

    public String getName() {
        return name;
    }
}

// ---------------- CART ----------------
class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getFinalPrice();
        }
        return total;
    }

    public void showProducts() {
        for (Product p : products) {
            System.out.println(p.getName());
        }
    }
}

// ---------------- ORDER ----------------
class Order {
    private Cart cart;
    private Discount discount;
    private User user;

    public Order(User user, Cart cart, Discount discount) {
        this.user = user;
        this.cart = cart;
        this.discount = discount;
    }

    public void generateBill() {
        System.out.println("\nUser: " + user.getPersonaldetails());

        System.out.println("\nProducts:");
        cart.showProducts();

        double total = cart.getTotal();
        System.out.println("\nTotal with GST: " + total);

        if (discount != null) {
            total = discount.applyDiscount(total);
            System.out.println("After Discount: " + total);
        }

        System.out.println("Order Placed Successfully!");
    }
}

// ---------------- MAIN ----------------
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- USER INPUT --------
        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter Mobile Number:");
        Long number = sc.nextLong();

        User user = new User(name, address, number);

        // -------- PRODUCT INPUT --------
        Cart cart = new Cart();

        System.out.println("How many products?");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Product Name:");
            String pname = sc.nextLine();

            System.out.println("Enter Price:");
            double price = sc.nextDouble();

            System.out.println("Enter GST %:");
            double gst = sc.nextDouble();
            sc.nextLine();

            Product p = new Product(pname, price, gst);
            cart.addProduct(p);
        }

        // -------- COUPON INPUT --------
        System.out.println("\nChoose Coupon:");
        System.out.println("1. Percentage Coupon");
        System.out.println("2. Flat Coupon");
        System.out.println("3. No Coupon");

        int choice = sc.nextInt();

        Discount discount = null;

        if (choice == 1) {
            System.out.println("Enter percentage:");
            double percent = sc.nextDouble();
            discount = new PercentageCoupon(percent);

        } else if (choice == 2) {
            System.out.println("Enter flat amount:");
            double amount = sc.nextDouble();
            discount = new Flatcoupon(amount);
        }

        // -------- ORDER --------
        Order order = new Order(user, cart, discount);
        order.generateBill();
    }
}