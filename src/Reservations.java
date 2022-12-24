import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservations {

    private LocalDateTime dateMade;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private Passenger passenger = new Passenger(false);
    private ScheduledFlight scheduledFlight = new ScheduledFlight(false);
    Reservations(Boolean wantToFill){
        if(wantToFill) {
            System.out.println("Enter Passenger Information : ");
            Passenger passenger = new Passenger(true);
            setPassenger(passenger);
            System.out.println("Enter Scheduled Flight : ");
            ScheduledFlight scheduledFlight = new ScheduledFlight(true);
            setScheduledFlight(scheduledFlight);
            dateMade = LocalDateTime.now();
        }
    }
    Reservations(){

    }
    void showData(){
        passenger.showData();
        scheduledFlight.showData();
        System.out.println("Time : "+dateMade);
    }
    public LocalDateTime getDateMade() {
        return dateMade;
    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public ScheduledFlight getScheduledFlight() {
        return scheduledFlight;
    }

    public void setScheduledFlight(ScheduledFlight scheduledFlight) {
        this.scheduledFlight = scheduledFlight;
    }
}
