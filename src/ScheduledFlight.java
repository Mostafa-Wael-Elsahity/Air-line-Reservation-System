import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScheduledFlight {
    private FlightDescriptions flightDescriptions = new FlightDescriptions(false);

    private LocalDateTime dateMade;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    ScheduledFlight(Boolean wantToFill){
        if(wantToFill){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Flight Descriptions : ");
            FlightDescriptions flightDescriptions = new FlightDescriptions(true);
            setFlightDescriptions(flightDescriptions);
            System.out.print("Enter take of time (yyyy/MM/dd HH:mm:ss) : ");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String data = scan.nextLine();
            LocalDateTime dateTime = (LocalDateTime) dtf.parse(data);
            setDateMade(dateTime);
        }
    }

    ScheduledFlight(){

    }
    void showData(){
        System.out.println("Flight Descriptions : ");
        flightDescriptions.showData();
        System.out.println("Take off time : "+dateMade);
    }
    public FlightDescriptions getFlightDescriptions() {
        return flightDescriptions;
    }

    public void setFlightDescriptions(FlightDescriptions flightDescriptions) {
        this.flightDescriptions = flightDescriptions;
    }

    public LocalDateTime getDateMade() {
        return dateMade;
    }

    public void setDateMade(LocalDateTime dateMade) {
        this.dateMade = dateMade;
    }
}
