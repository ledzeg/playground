import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int dayOfTheWeek;

        int subChoice;

        System.out.println("************ MENU *****************");
        System.out.println("These are the choices for week of the day. \n Please enter only values from 1-7:\n");

        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");

        System.out.println("***********************************");

        System.out.println("Enter your choice of the day (1-7):");
        dayOfTheWeek = keyboard.nextInt();
        keyboard.nextLine(); // to clean buffer
        switch(dayOfTheWeek) {

            case 1:
                System.out.println("Monday: It is back to work.....");

                System.out.println("Did you have your breakfast?");

                System.out.println("************ SUB MENU *****************");
                System.out.println("1. Yes, I had my breakfast");
                System.out.println("2. No, I would like one ");
                System.out.println("****************************************");

                System.out.println("Enter choice (1 or 2):");
                subChoice = keyboard.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.println("Good. Now you have a catchup meeting at 9 A.M. Prepare your notes. ");
                        break;
                    case 2:
                        System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                        break;
                    default :
                        System.out.println("NO such choice available");
                }

                break;

            case 2:
                System.out.println("Tuesday: It is coding time");

                break;

            case 3:
                System.out.println("Wednesday: Design the program");

                break;

            case 4:
                System.out.println("Thursday: Start coding.....");

                break;

            case 5:
                System.out.println("Friday: Run tests and check if the program is working as expected.......");

                break;

            case 6:
                System.out.println("Saturday: Rest a bit and study a bit.......");

                break;

            case 7:
                System.out.println("Sunday: I am going to chill .........");

                break;

            default:
                System.out.println("Invalid week of DAY");

        }

    }

}