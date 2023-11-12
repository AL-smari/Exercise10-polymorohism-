import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicle = new ArrayList<>();
        int chose ;
        System.out.println("1.Rent a Car");
        System.out.println("2.Rent a Bike");
        System.out.println("3.Rent a Truck");
        System.out.println("4.View Rented Vehicle");
        System.out.println("5.Exit");

        do{
            System.out.println("Enter your choice:");
            chose =s.nextInt();
            if(chose==1){
                System.out.println("Enter Car Model:");
                s.nextLine();
                String model = s.nextLine();
                System.out.println("Enter Rental Days:");
                int day = s.nextInt();
                Vehicle v = new Car(model,day);
                System.out.println("Rental Details:");
                v.displayDetails();
                rentedVehicle.add(v);

            }else if(chose==2){
                System.out.println("Enter Bike Brand:");
                s.nextLine();
                String brand = s.nextLine();
                System.out.println("Enter Rental Hours:");
                int hour = s.nextInt();
                Vehicle v = new Bike(brand,hour);
                System.out.println("Rental Details:");
                v.displayDetails();
                rentedVehicle.add(v);

            }else if(chose==3){
                System.out.println("Enter Truck Type:");
                s.nextLine();
                String type = s.nextLine();
                System.out.println("Enter Rental Weeks:");
                int week= s.nextInt();
                Vehicle v = new Truck(type,week);
                System.out.println("Rental Details:");
                v.displayDetails();
                rentedVehicle.add(v);

            }else if(chose==4){
                for(Vehicle v:rentedVehicle){
                    v.displayDetails();
                    System.out.println();
                }

            }

        }while(chose!=5);
        System.out.println("Thank you for using the Vehicle Rental System!");

    }
}