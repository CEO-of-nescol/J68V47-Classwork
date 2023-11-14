public class l8e3 {


    public static void main(String[] args) {
        // Set up the directions array

        newArray();

        // Print out each direction

    }

    public static String[] newArray() {
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.", "After turning onto Elm Street, walk past the grocery store on your right.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment."
        };
        int step = 1;
        for (String direction : directions) {
            System.out.format("%d. %s %n", step, direction);
            step++;
        }
        return directions;
    }
}