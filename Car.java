public class Car implements Vehicle{

    private String model;
    private int day;

    public Car(String model, int day) {
        this.model = model;
        this.day = day;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public double calculateRental() {
        return 50*day;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: "+model);
        System.out.println("Daily Rental Rate:$50.0");
        System.out.println("Rental Cost:$"+calculateRental());

    }
}
