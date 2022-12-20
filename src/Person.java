import java.util.Scanner;

public abstract class Person {
    private String name, address, phoneNumber, nationalID;

    Person(Boolean wantToFill) {
        if (wantToFill) {
            Scanner scan = new Scanner(System.in);
            String name, address, phoneNumber, nationalID;
            System.out.print("Enter name of person : ");
            name = scan.nextLine();
            setName(name);
            System.out.print("Enter address of person : ");
            address = scan.nextLine();
            setAddress(address);
            System.out.print("Enter phone number of person : ");
            phoneNumber = scan.nextLine();
            setPhoneNumber(phoneNumber);
            System.out.print("Enter national ID of person : ");
            nationalID = scan.nextLine();
            setNationalID(nationalID);
        }
    }
    
    public void showData() {
        System.out.println("Name is " + getName());
        System.out.println("Address is " + getAddress());
        System.out.println("Phone number is " + getPhoneNumber());
        System.out.println("National ID is "+getNationalID());
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
}
