package com.pluralsight.Exrecise2RollTheDice;

public class RollTheDice {
    public static void main(String[] args) {

        Dice dice = new Dice(); // create a dice object / new(keyword that created the instance in memory

        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i < 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2){
                twoCounter++;

            }
            else if (sum == 4){
                fourCounter++;
            }
            else if (sum == 6){
                sixCounter++;
            }
            else if (sum == 7){
                sevenCounter++;
            }

        }

        // display output
        System.out.println( "== Dice summery==");
        System.out.println("Sum of 2 rolled: " + twoCounter + " times");
        System.out.println("Sum of 4 rolled: " + fourCounter + " times");
        System.out.println("Sum of 6 rolled: " + sixCounter + " times");
        System.out.println("Sum of 7 rolled: " + sevenCounter + " times");

    }
}
