//ALCOlator
//29/12/2023
//Mateusz Siwiec
//Special thanks to Emily Michaela Peel for calling me so I work on this project
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class prototypev2 {

        private static double unitsDrank = 0;

        public static void main(String[] args) {
            displayMenu();
        }

        private static void manualCalculator(){

            System.out.println("Manual Calculator\n");
            System.out.println("1. Add drink");
            System.out.println("2. How many units have I drank?");
            System.out.println("3. Return to main menu");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addDrinkManual();
                    break;
                case 2:
                    getTotalUnitsDrank();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }

        private static void displayMenu() {
            System.out.println("ALCOlator");
            System.out.println("You must be 18+ to buy alcohol, do not drink and drive, drink responsibly");
            System.out.println("It’s recommended to drink no more than 14 units of alcohol a week spread across 3 days or more\n");

            System.out.println("Select Menu Option 1-5\n");
            System.out.println("1. How many Units have I drank?");
            System.out.println("2. Manual calculator");
            System.out.println("3. How long until I'm sober?");
            System.out.println("4. Show alcohol unit values");
            System.out.println("5. Show safe drinking tips");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pickDrinkList();
                    break;
                case 2:
                    manualCalculator();
                    break;
                case 3:
                    calculateTimeToSober();
                    break;
                case 4:
                    showAlcoholUnitValues();
                    break;
                case 5:
                    showSafeDrinkingTip();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }

        private static void getTotalUnitsDrank() {
            System.out.println("Total units drank: " + unitsDrank);

            if (unitsDrank > 14){
                System.out.println("You have drank over the weekly 14 unit recommendation, reduce your alcohol intake ");
            }
            else{
                System.out.println("You are under the 14 unit recommendation, good!");
            }


            displayMenu();
        }

        private static void pickDrinkList() {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:


                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

        }
        private static void addDrink(){
            try {
                File file = new File("alcohol_unit_values.txt");
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading alcohol unit values from the file.");
            }

        }

    private static void addDrinkManual() {
            System.out.println("Select a drink:");
            //Reads the list of alcohols from a text file and displays them


            System.out.println("Enter the ABV% of the drink:");
            double abv = new Scanner(System.in).nextDouble();

            System.out.println("Enter the volume of the drink in milliliters:");
            int volume = new Scanner(System.in).nextInt();

            double drinkUnits = (abv*volume)/1000;
            unitsDrank += drinkUnits;

            System.out.println("Added " + drinkUnits + " units to total units drank.");
            manualCalculator();
        }

        private static void calculateTimeToSober() {
            System.out.println("Enter the number of units you have drunk:");
            double units = new Scanner(System.in).nextDouble();

            double timeToSober = units * 1;
            System.out.println("It will take approximately " + timeToSober + " hours to become sober.");
            displayMenu();
        }

        private static void showAlcoholUnitValues() {
            //Read and display alcohol unit values, their name, and the unit size from a text file
            System.out.println("List of alcohol unit values:");
            readAlcoholUnitValuesFromFile();
            displayMenu();
        }

        private static void showSafeDrinkingTip() {
            //display a random safe drinking tip from the array
            String[] tips = {
                    "Hydrate Between Drinks: Alternate alcoholic beverages with water to stay hydrated and pace yourself.",
                    "Eat Before Drinking: Consuming a meal before drinking helps slow down alcohol absorption.",
                    "Know Your Limits: Be aware of your alcohol tolerance and stick to a moderate drinking pace.",
                    "Designate a Driver: Plan transportation in advance if you're consuming alcohol. Designate a sober driver or use public transportation.",
                    "Understand Standard Drink Sizes: Familiarize yourself with the standard sizes of alcoholic drinks to gauge your intake accurately.",
                    "Avoid Mixing Drugs and Alcohol: Combining alcohol with medications or recreational drugs can have unpredictable and dangerous effects.",
                    "Stay In Control: Don't let peer pressure influence your drinking decisions. Drink at your own pace.",
                    "Don't Drink on an Empty Stomach: Drinking on an empty stomach can lead to faster alcohol absorption and intoxication.",
                    "Watch Your Drink: Keep an eye on your beverage to avoid potential tampering.",
                    "Learn to Say No: It's okay to decline a drink if you feel uncomfortable or have had enough.",
                    "Know Emergency Contacts: Be aware of emergency contacts and locations, just in case assistance is needed.",
                    "Avoid Binge Drinking: Consuming large amounts of alcohol in a short time can lead to health risks and loss of control.",
                    "Respect Others' Choices: Everyone has different tolerances. Respect others' decisions regarding drinking.",
                    "Educate Yourself: Stay informed about the alcohol content in different beverages and how it affects your body.",
                    "Monitor Your Blood Alcohol Content (BAC): Understand how your BAC changes based on the number and types of drinks consumed.",
                    "Be Mindful of Cocktails: Mixed drinks can contain more alcohol than you might realize. Be cautious of their strength.",
                    "Choose Lower ABV Drinks: Opt for beverages with lower alcohol by volume (ABV) to moderate your intake.",
                    "Take Breaks: Give your body time to metabolize alcohol by taking breaks between drinks.",
                    "Don't Drink and Drive: Never operate a vehicle under the influence. Arrange for alternative transportation.",
                    "Look Out for Friends: Be aware of your friends' well-being and intervene if someone appears to be struggling with alcohol consumption."
            };

            Random random = new Random();
            int randomIndex = random.nextInt(tips.length);

            System.out.println("Safe Drinking Tip: " + tips[randomIndex]);
            displayMenu();
        }

        private static void readAlcoholUnitValuesFromFile() {
            try {
                File file = new File("alcohol_unit_values.txt");
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading alcohol unit values from the file.");
            }
        }
    }


