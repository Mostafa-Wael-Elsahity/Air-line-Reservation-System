import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Airport> airports = new ArrayList<Airport>();
        ArrayList<FlightDescriptions> flightDescriptions = new ArrayList<FlightDescriptions>();
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        ArrayList<Reservations> reservations = new ArrayList<Reservations>();
        ArrayList<ScheduledFlight> scheduledFlights = new ArrayList<ScheduledFlight>();
        System.out.println("****************** Welcome to our program ******************");
        char still = 'Y';
        do {
            clearTerminal();
            int selectEntities = entities();
            int selectMenu = menu(selectEntities);
            if (selectEntities > 0 && selectEntities < 6 && selectMenu > 0 && selectMenu < 5) {
                if (selectEntities == 1) { // passenger
                    int numOfPassengers = passengers.size();
                    if (selectMenu == 1) { // create
                        passengers.add(new Passenger(true));
                    } else if (selectMenu < 4) { // delete and inquire
                        System.out.print("Enter national ID : ");
                        String nationalID = scan.nextLine();
                        int position = -1;
                        for (int i = 0; i < numOfPassengers; i++)
                            if (passengers.get(i).getNationalID().equals(nationalID)) {
                                position = i;
                                break;
                            }
                        if (position == -1) {
                            System.out.println("This national ID is not existing!");
                        } else if (selectMenu == 2) { // delete
                            passengers.remove(position);
                        } else { // inquire
                            passengers.get(position).showData();
                        }
                    } else {
                        if (numOfPassengers > 0) {
                            for (int i = 0; i < numOfPassengers; i++) {
                                System.out.println("********************* " + (i + 1) + " *********************");
                                passengers.get(i).showData();
                                System.out.println("*********************************************");
                            }
                        } else {
                            System.out.println("It's Empty!");
                        }
                    }
                } else if (selectEntities == 2) { // Reservation
                    int numberOfReservation = reservations.size();
                    if (selectMenu == 1) { // create
                        reservations.add(new Reservations(true));
                    } else if (selectMenu < 4) {
                        int position = -1;
                        System.out.print("Enter ID of passenger : ");
                        String ID = scan.nextLine();
                        for (int i = 0; i < numberOfReservation; i++)
                            if (reservations.get(i).getPassenger().getNationalID().equals(ID)) {
                                position = i;
                                break;
                            }
                        if (position == -1) {
                            System.out.println("This is not existing!");
                        } else if (selectMenu == 2) { // delete
                            reservations.remove(position);
                        } else { // inquire
                            reservations.get(position).showData();
                        }
                    } else {
                        if (numberOfReservation > 0) {
                            for (int i = 0; i < numberOfReservation; i++) {
                                System.out.println("********************* " + (i + 1) + " *********************");
                                reservations.get(i).showData();
                                System.out.println("*********************************************");
                            }
                        } else {
                            System.out.println("It's Empty!");
                        }
                    }
                } else if (selectEntities == 3) { // airport
                    int numberOfAirports = airports.size();
                    if (selectMenu == 1) { // create
                        airports.add(new Airport(true));
                    } else if (selectMenu < 4) {
                        int position = -1;
                        System.out.print("Enter name : ");
                        String name = scan.nextLine();
                        for (int i = 0; i < airports.size(); i++)
                            if (airports.get(i).getName().equals(name)) {
                                position = i;
                                break;
                            }
                        if (position == -1) {
                            System.out.println("This name is not existing!");
                        }
                        if (selectMenu == 2) { // delete
                            airports.remove(position);
                        } else { // inquire
                            airports.get(position).showData();
                        }
                    } else {
                        if (numberOfAirports > 0) {
                            for (int i = 0; i < numberOfAirports; i++) {
                                System.out.println("********************* " + (i + 1) + " *********************");
                                airports.get(i).showData();
                                System.out.println("*********************************************");
                            }
                        } else {
                            System.out.println("It's Empty!");
                        }
                    }
                } else if (selectEntities == 4) { // Scheduled Flight
                    int numberOfScheduledFlight = scheduledFlights.size();
                    if (selectMenu == 1) { // create
                        scheduledFlights.add(new ScheduledFlight(true));
                    } else if (selectMenu < 4) {
                        int position = -1;
                        System.out.print("Enter number of flight : ");
                        int numberOfFlight = scan.nextInt();
                        for (int i = 0; i < numberOfScheduledFlight; i++)
                            if (scheduledFlights.get(i).getFlightDescriptions().getNumberOfFlight() == numberOfFlight) {
                                position = i;
                                break;
                            }
                        if (position == -1) {
                            System.out.println("This is not existing!");
                        } else if (selectMenu == 2) { // delete
                            scheduledFlights.remove(position);
                        } else { // inquire
                            scheduledFlights.get(position).showData();
                        }
                    } else {
                        if (numberOfScheduledFlight > 0) {
                            for (int i = 0; i < numberOfScheduledFlight; i++) {
                                System.out.println("********************* " + (i + 1) + " *********************");
                                scheduledFlights.get(i).showData();
                                System.out.println("*********************************************");
                            }
                        } else {
                            System.out.println("It's Empty!");
                        }
                    }
                } else { // Flight
                    int numOfFlights = flightDescriptions.size();
                    if (selectMenu == 1) { // create
                        flightDescriptions.add(new FlightDescriptions(true));
                    } else if (selectMenu < 3) {
                        int position = -1;
                        System.out.print("Enter number of flight : ");
                        int numberOfFlight = scan.nextInt();
                        for (int i = 0; i < numOfFlights; i++)
                            if (flightDescriptions.get(i).getNumberOfFlight() == numberOfFlight) {
                                position = i;
                                break;
                            }
                        if (position == -1) {
                            System.out.println("This is not existing!");
                        } else if (selectMenu == 2) { // delete
                            flightDescriptions.remove(position);
                        } else { // inquire
                            flightDescriptions.get(position).showData();
                        }
                    } else {
                        if (numOfFlights > 0) {
                            for (int i = 0; i < numOfFlights; i++) {
                                System.out.println("********************* " + (i + 1) + " *********************");
                                flightDescriptions.get(i).showData();
                                System.out.println("*********************************************");
                            }
                        } else {
                            System.out.println("It's empty!");
                        }
                    }
                }
            } else { // exit
                break;
            }
            System.out.print("If you want to continue enter Y or anything else to exit : ");
            still = scan.nextLine().charAt(0);
        } while (still == 'Y');
        System.out.println("Exit successfully");
    }

    public static int entities() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1- Passenger");
        System.out.println("2- Reservation");
        System.out.println("3- Airport");
        System.out.println("4- Flight Schedule");
        System.out.println("5- Flight");
        System.out.println("-Anything else to Exit!");
        System.out.print("Enter your choice : ");
        int choice = scan.nextInt();
        clearTerminal();
        return choice;
    }

    public static int menu(int select) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        if (select > 0 && select < 6) {
            if (select == 1) { // passenger
                System.out.println("1- To create a Passenger.");
                System.out.println("2- To Delete a Passenger.");
                System.out.println("3- To Inquire about a Passenger.");
                System.out.println("4- To show all data about Passengers.");
            } else if (select == 2) { // reservation
                System.out.println("1- To create a Reservation.");
                System.out.println("2- To Delete a Reservation.");
                System.out.println("3- To Inquire about a Reservation.");
                System.out.println("4- To show all data about Reservations.");
            } else if (select == 3) {// airport
                System.out.println("1- To create an Airport.");
                System.out.println("2- To Delete an Airport.");
                System.out.println("3- To Inquire about an Airport.");
                System.out.println("4- To show all data about Airports.");
            } else if (select == 4) {// flight schedule
                System.out.println("1- To create a Scheduled Flight.");
                System.out.println("2- To Delete a Scheduled Flight.");
                System.out.println("3- To Inquire about a Scheduled Flight.");
                System.out.println("4- To show all data about Flight Schedule.");
            } else if (select == 5) { // flight
                System.out.println("1- To create a Flight Description.");
                System.out.println("2- To Delete a Flight Description.");
                System.out.println("3- To Inquire about a Flight Description.");
                System.out.println("4- To show all data about Flights Description.");
            }
            // exit
            System.out.println("-Anything else to Exit!");
            System.out.print("Enter Number to execute operation : ");
            choice = scan.nextInt();
            clearTerminal();
        }
        return choice;
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}