import java.util.Scanner;

public class FlightDescriptions {
    private String to, from;
    private static int counterOfFlight = 0;
    private int numberOfFlight ;
    private Double prise;
    private int capacity;
    private Airport arrival = new Airport(false);
    private Airport departure = new Airport(false);

    FlightDescriptions(Boolean wantToFill) {
        if (wantToFill) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Flight to : ");
            String to = scan.nextLine();
            setTo(to);
            System.out.print("Flight From : ");
            String from = scan.nextLine();
            setFrom(from);
            System.out.print("Prise : ");
            Double prise = scan.nextDouble();
            setPrise(prise);
            System.out.print("Capacity : ");
            int capacity = scan.nextInt();
            setCapacity(capacity);
            System.out.println("Enter Description of Arrival Airport : ");
            Airport arrival = new Airport(true);
            setArrival(arrival);
            System.out.println("Enter Description of Departure Airport : ");
            Airport departure = new Airport(true);
            setArrival(departure);
            counterOfFlight++;
            setNumberOfFlight(counterOfFlight);
            System.out.println("Flight number "+getNumberOfFlight()+" has been created successfully!");
        }
    }

    public void showData(){
        System.out.println("Flight to : "+getTo());
        System.out.println("Flight From : "+getFrom());
        System.out.println("Prise : "+getPrise());
        System.out.println("Capacity : "+getCapacity());
        System.out.println("Description of Arrival Airport : ");
        arrival.showData();
        System.out.println("Description of Departure Airport : ");
        departure.showData();
    }

    public Airport getArrival() {
        return arrival;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }
}
