public class l8e2 {

    public static void main(String[] args) {

        int[] score = {92, 23, 56, 76, 28, 28, 59, 23, 87, 73};


        Float totalScore = (float) 0;
        for (int index = 0; index < score.length; index++) {
            System.out.println(score[index]);
        }
        for (int index = 0; index < score.length; index++) {

            totalScore = totalScore + score[index];
        }
        Float averageScore = totalScore/score.length;

        System.out.print("The average score is: " + averageScore);


    }

}
