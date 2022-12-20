public class Passenger extends Person {
    private int number;
    private static int counterOfPassenger = 0;

    Passenger(Boolean wantToFill) {
        super(wantToFill);
        if (wantToFill) {
            number = ++counterOfPassenger;
            System.out.println("Creation Successfully!");
        }
    }

    public void showData() {
        super.showData();
        System.out.println("His number is " + getNumber());
    }

    public int getNumber() {
        return number;
    }
}
