// Vehicle Class
class Vehicle {
    private String vehicleNumber;
    private String type;

    public Vehicle(String vehicleNumber, String type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type);
    }
}

// Traffic Signal Class
class TrafficSignal {
    private String color;

    public TrafficSignal() {
        this.color = "RED"; // default
    }

    public void changeSignal(String color) {
        this.color = color;
        System.out.println("Signal changed to: " + color);
    }

    public String getSignal() {
        return color;
    }
}

// Road Class
class Road {
    private String roadName;
    private Vehicle[] vehicles;
    private int count;

    public Road(String roadName, int capacity) {
        this.roadName = roadName;
        vehicles = new Vehicle[capacity];
        count = 0;
    }

    public void addVehicle(Vehicle v) {
        if (count < vehicles.length) {
            vehicles[count++] = v;
            System.out.println("Vehicle added to " + roadName);
        } else {
            System.out.println("Road is full!");
        }
    }

    public void showVehicles() {
        System.out.println("Vehicles on " + roadName + ":");
        for (int i = 0; i < count; i++) {
            vehicles[i].displayVehicle();
        }
    }
}

// Traffic Controller Class
class TrafficController {
    private TrafficSignal signal;

    public TrafficController(TrafficSignal signal) {
        this.signal = signal;
    }

    public void controlTraffic() {
        signal.changeSignal("GREEN");
        System.out.println("Vehicles can move");

        signal.changeSignal("YELLOW");
        System.out.println("Get ready to stop");

        signal.changeSignal("RED");
        System.out.println("Vehicles must stop");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Create vehicles
        Vehicle v1 = new Vehicle("MH12AB1234", "Car");
        Vehicle v2 = new Vehicle("MH14XY5678", "Bike");

        // Create road
        Road road = new Road("Highway 1", 5);
        road.addVehicle(v1);
        road.addVehicle(v2);

        road.showVehicles();

        // Create traffic signal
        TrafficSignal signal = new TrafficSignal();

        // Controller
        TrafficController controller = new TrafficController(signal);
        controller.controlTraffic();
    }
}