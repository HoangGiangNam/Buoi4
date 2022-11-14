package BTbuoi4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        ArrayList<Integer> scoreBoard = new ArrayList<>();
        scoreBoard.add(1);
        scoreBoard.add(4);
        scoreBoard.add(7);
        scoreBoard.add(3);
        scoreBoard.add(6);
        System.out.println("List:" + scoreBoard);
        System.out.println("Sum Score:" + sumScores(scoreBoard));
        System.out.println("High Score:" + getHighScore(scoreBoard));
        System.out.println("Average Score:" + average(scoreBoard));
        System.out.println("Reverse Score:" + reverseScore(scoreBoard));


    }

    public static int sumScores(ArrayList<Integer> scoreBoard) {
        int sum = 0;
        for (Integer item : scoreBoard
        ) {
            sum += item;

        }

        return sum;
    }

    public static int getHighScore(ArrayList<Integer> scoreBoard) {
        int max = scoreBoard.get(0);
        for (Integer item : scoreBoard
        ) {
            if (max < item)
                max = item;

        }
        return max;
    }

    public static double average(ArrayList<Integer> scoreBoard) {
        int sum = sumScores(scoreBoard);
        int length = scoreBoard.size();
        double avg = (double) sum / length;
        return avg;
    }

    public static ArrayList<Integer> reverseScore(ArrayList<Integer> scoreBoard) {
        ArrayList<Integer> reverseScore = new ArrayList<>();
        int position = 0;
        for (int index = scoreBoard.size() - 1; index >= 0; index--) {
            reverseScore.add(position, scoreBoard.get(index));
            position++;
        }
        return reverseScore;
    }


}
