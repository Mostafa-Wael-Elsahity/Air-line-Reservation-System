import java.util.Scanner;

public class Airport {
    private String name, address;

    Airport(Boolean wantToFill) {
        if (wantToFill) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Name of Airport : ");
            String name = scan.nextLine();
            setName(name);
            System.out.print("Enter Address of Airport : ");
            String address = scan.nextLine();
            setAddress(address);
        }
    }

    public void showData() {
        System.out.println("Name is " + getName());
        System.out.println("Address is " + getAddress());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
