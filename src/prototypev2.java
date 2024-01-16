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
//initialise unitsDrank variable as a double globally

        public static void main(String[] args) {
            displayMenu();
            //calls the function to display the main menu and offer options to choose for the user
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
                    manualCalculator();
                    break;
            }
        }

        private static void displayMenu() {
//displays warning messages to the user about drinking
            System.out.println("ALCOlator");
            System.out.println("You must be 18+ to buy alcohol, do not drink and drive, drink responsibly\n");
            System.out.println("It’s recommended to drink no more than 14 units of alcohol a week spread across 3 days or more\n");
//displays menu options
            System.out.println("Select Menu Option 1-5\n");
            System.out.println("1. How many Units have I drank?");
            System.out.println("2. Manual calculator");
            System.out.println("3. How long until I'm sober?");
            System.out.println("4. Show alcohol unit values");
            System.out.println("5. Show safe drinking tips");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
//recieves input from the user which runs the connected function
            switch (choice) {
                //switch takes the choice variable and compares it to cases and whichever match it enacts that cases subprogram
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
                    displayMenu();
                    break;
                    //if any other input than the cases is given by the user this error message shows
            }
        }

        private static void getTotalUnitsDrank() {
            System.out.println("Total units drank: " + unitsDrank);
//displays to the user the text and how many units they have drank by printing unitsDrank
            if (unitsDrank > 14){
                System.out.println("You have drank over the weekly 14 unit recommendation, reduce your alcohol intake ");
            }
            else{
                System.out.println("You are under the 14 unit recommendation, good!");
            }
//if statement checks if unitsDrank is over 14 and displays a message to drink less to the user, if it is under 14, displays a congratulation message to the user
            displayMenu();
            //goes back to main menu of the program by calling the displayMenu function
        }

        private static void pickDrinkList() {
            Double[] unitArray = {1.0,1.5,1.5,1.7,2.4,2.0,2.1,3.0,3.0};
            //initialise the unitArray list as a double
            System.out.println("1: Add a drink");
            System.out.println("2: Get the total amount of units drank");
            System.out.println("3: Main menu");
            //displays menu options to the user
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addDrink(unitArray);
                    break;
                case 2:
                    getTotalUnitsDrank();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    pickDrinkList();
                    break;
            }
//same as the main menu displays selection options to the user using a switch
        }


    private static void addDrink(Double[] unitArray){
//initialises the addDrink function and passes the unitArray variable through the parameters
            try {
                File file = new File("alcohol_unit_values.txt");
                Scanner scanner = new Scanner(file);
                int counter = 0;
                // set counter for numbering each line in text file for user to select later
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    counter = counter + 1;
                    System.out.print(counter + ": ");
                    System.out.println(line);
                }
                //prints all lines of the alcohol_unit_values.txt file adding the number of the line at the start of each one
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading alcohol unit values from the file.");
            }
            System.out.println("10: Return to menu");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                unitsDrank = unitsDrank + unitArray[0];
                break;
            case 2:
                unitsDrank = unitsDrank + unitArray[1];
                break;
            case 3:
                unitsDrank = unitsDrank + unitArray[2];
                break;
            case 4:
                unitsDrank = unitsDrank + unitArray[3];
                break;
            case 5:
                unitsDrank = unitsDrank + unitArray[4];
                break;
            case 6:
                unitsDrank = unitsDrank + unitArray[5];
                break;
            case 7:
                unitsDrank = unitsDrank + unitArray[6];
                break;
            case 8:
                unitsDrank = unitsDrank + unitArray[7];
                break;
            case 9:
                unitsDrank = unitsDrank + unitArray[8];
                break;
            case 10:
                pickDrinkList();
                break;
//menu to choose how many units to add to unitsDrank and option to return to the submenu
            default:
                System.out.println("Invalid choice, please select a valid option.");
                addDrink(unitArray);
                break;
        }
        pickDrinkList();
        //returns to submenu function when function finishes
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
//gets the amount of units the user has drank using scanner and puts them into initialised variable units, datatype double,
            double timeToSober = units * 1;
            //initialises timeToSober as a double and is variable units times one
            System.out.println("It will take approximately " + timeToSober + " hours to become sober.");
            //displays message of how many hours it will take for the user to become sober and returns to main menu using the displayMenu function
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
            String[] tips = { // tips list is initialised as String datatype
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
//takes the length  of the tips list and picks a random number within the length of the list, creates an integer datatype variable
            //randomIndex and uses that to print a random safe drinking tip to the user using the tips list
            System.out.println("Safe Drinking Tip: " + tips[randomIndex]);
            displayMenu();
        }

        private static void readAlcoholUnitValuesFromFile() {
            //function displays to the user the alcohol_unit_values.txt file
            try {
                File file = new File("alcohol_unit_values.txt");
                Scanner scanner = new Scanner(file);
//assigns the file alcohol_unit_values.txt to the File variable file, and uses Scanner to input that to variable scanner
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
//while loop prints every line in the file until there are no more lines using .hasNextLine
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading alcohol unit values from the file.");
                //catch to display an error message to the user
            }
        }
    }


