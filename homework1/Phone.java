package homework1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("11111222", "iPhone Xs", 0.4);
        Phone phone2 = new Phone("13233445", "iPhone 11 Pro", 0.42);
        Phone phone3 = new Phone("77777777", "iPhone 13 mini", 0.29);

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.model);
        System.out.println("Weight: " + phone1.weight);
        phone1.receiveCall("John Doe");

        System.out.println("\nPhone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.model);
        System.out.println("Weight: " + phone2.weight);
        phone2.receiveCall("Jake Smith");

        System.out.println("\nPhone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.model);
        System.out.println("Weight: " + phone3.weight);
        phone3.receiveCall("Alex Smith");
    }
}
