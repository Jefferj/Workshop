// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Captain captain = new Captain("Juan", "Perez", "123456");
        Sailboat sailboat = new Sailboat(captain, 1000.0, 20000, 2022, 15.0, 5);
        Yacht yacht = new Yacht(captain, 2000.0, 0, 2023, 20.0, 8);

        double rentalAmountSailboat = sailboat.rentalAmount();
        double rentalAmountYacht = yacht.rentalAmount();

        boolean sizeSailboat = sailboat.sizeSailboat();
        boolean luxuryYacht = yacht.luxuryYacht();

        System.out.println("Monto de alquiler del velero: $" + rentalAmountSailboat);
        System.out.println("Monto de alquiler del yate: $" + rentalAmountYacht);
        System.out.println("El velero es grande: " + sizeSailboat);
        System.out.println("El yate tiene mayor lujo: " + luxuryYacht);

    }
}