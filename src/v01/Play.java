/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v01;

import java.util.LinkedList;
import java.util.Random;
import io.MyLib;

/**
 * V01 - Guessing Game
 *
 * @author TuPTCE181028
 */
public class Play {

    //Create list
    LinkedList<Integer> totalGames = new LinkedList<>();
    //Create fields
    private int totalGuesses,
            luckyNumber,
            highScore;
    private boolean check;

    /**
     * Get "totalGuesses" value.
     *
     * @return the value of the "totalGuesses"
     */
    public int getTotalGuesses() {
        // Get "totalGuesses" value
        return totalGuesses;
    }

    /**
     * Set "totalGuesses" value.
     *
     * @param totalGuesses an integer
     */
    public void setTotalGuesses(int totalGuesses) {
        // Set "totalGuesses" value
        this.totalGuesses = totalGuesses;
    }

    /**
     * Get "luckyNumber" value.
     *
     * @return the value of the "luckyNumber"
     */
    public int getLuckyNumber() {
        // get "luckyNumber" value
        return luckyNumber;
    }

    /**
     * Set "totalGuesses" value.
     *
     * @param luckyNumber an integer
     */
    public void setLuckyNumber(int luckyNumber) {
        // Set "luckyNumber" value
        this.luckyNumber = luckyNumber;
    }

    /**
     * Get "highScore" value.
     *
     * @return the value of the "highScore"
     */
    public int getHighScore() {
        // Get "highScore" value
        return highScore;
    }

    /**
     * Set "highScore" value.
     *
     * @param highScore an integer
     */
    public void setHighScore(int highScore) {
        // Set "highScore" value
        this.highScore = highScore;
    }

    /**
     * Get "check" value.
     *
     * @return the value of the "check"
     */
    public boolean isCheck() {
        // Get "check" value
        return check;
    }

    /**
     * Set "check" value.
     *
     * @param check an boolean
     */
    public void setCheck(boolean check) {
        // Set "check" value
        this.check = check;
    }

    /**
     * Create a lucky number for the game
     *
     * @return a random number
     */
    private int createLuckyNumber() {
        // Create a new instance of the Random algorithm
        Random ran = new Random();
        System.out.println("Creating a lucky number................ \n"
                + "The number is between 1 - 100.\n"
                + "|-------------------------------------|");
        // Return a random number between 1 and 100
        return ran.nextInt(100) + 1;
    }

    /**
     * Check the guess of player
     *
     * @param a an integer that the user enters
     */
    private void check(int a) {
        // Check if the guess is right or wrong
        if (a == getLuckyNumber()) {
            System.out.println("CORRECT!!!");
            // Check if the guess is bigger than lucky number
        } else if (a < getLuckyNumber()) {
            System.out.println("The lucky number is bigger!");
            // Update the value of check is false
            setCheck(false);
        } else { // Check if the guess is smaller than lucky number
            System.out.println("The lucky number is smaller!");
            // Update the value of check is false
            setCheck(false);
        }
    }

    /**
     * Play the game
     */
    public void guess() {
        // Call createLuckyNumber method
        setLuckyNumber(createLuckyNumber());
        // Update the totalGuesses value is 1
        setTotalGuesses(1);
        do {
            // Update the check value is true
            setCheck(true);
            // Call check method and input the guess number
            this.check(MyLib.getInteger("Enter a number: ", "Please enter again! Input must be a number from 1 to 100!!", 1, 100, "="));
            // Check if the value of check is false
            if (isCheck() == false) {
                // Add 1 into the totalGuesses after 1 turn
                setTotalGuesses(getTotalGuesses() + 1);
            }
            System.out.println("------------------------------------");
        } while (!isCheck()); // Loop if the guess is wrong
        // Check if the totalGuesses's value is equal to 1
        if (getTotalGuesses() == 1) {
            System.out.println("CONGRATULATIONS, YOU GUESSED THE LUCKY NUMBER CORRECTLY IN THE FIRST TURN!!!!!!!!!!!");
        }
    }

    /**
     * Conclude the last played game.
     */
    public void total() {
        // Print out the data
        System.out.println("You have guessed right the lucky number '" + getLuckyNumber() + "' after " + getTotalGuesses() + " times");
        // Update the 'highScore' if 'totalGuesses' < 'highScore' or it is the first game
        if (getTotalGuesses() < getHighScore() || this.totalGames.isEmpty()) {
            setHighScore(getTotalGuesses());
        }
        // And the played game into the list
        this.totalGames.add(getTotalGuesses());
    }

    /**
     * Conclude all the played games.
     */
    public void conclude() {
        System.out.println("|------------[TOTAL]------------|");
        //Check if there is only 1 time playing
        if (this.totalGames.size() == 1) {
            System.out.printf("You have played %d time\n", this.totalGames.size());
        } else {
            System.out.printf("You have played %d times\n", this.totalGames.size());
        }
        // Check if the avegrage guess is 1 guess
        if (calculateAvgGuess() == 1) {
            System.out.printf("Your avegrage guess is %d time\n", calculateAvgGuess());
        } else {
            System.out.printf("Your avegrage guess is %d times\n", calculateAvgGuess());
        }
        // Check if the best game is 1 guess
        if (getHighScore() == 1) {
            System.out.printf("Your best game is with %d guess\n", getHighScore());
        } else {
            System.out.printf("Your best game is with %d guesses\n", getHighScore());
        }
        System.out.println("|-----------[Thanks]------------|");
    }

    /**
     * Calculate average guesses times.
     *
     * @return Average guesses times
     */
    private int calculateAvgGuess() {
        int total = 0;
        // Add the value of all the guesses from all the times playing
        for (Integer g : totalGames) {
            total += g;
        }
        // Return the average guesses times
        return Math.floorDiv(total, this.totalGames.size());
    }

    /**
     * Get the answer to play again.
     *
     * @return a string about the answer to play again
     */
    public String askToContinue() {
        // Return a string about the answer to play again
        return MyLib.getString("Do you want to play again? \n"
                + "YES/yes or Y/y to continue \n"
                + "NO/no or N/n to quit the game \n"
                + "Select your choice: ", "Don't leave it blank!").toLowerCase().trim();

    }

    /**
     * Restart the game if the user input "y" or "yes".
     *
     * @return true when the user enter "y" or "yes" string value or false when
     * the user enter "n" or "no"
     */
    public boolean playAgain() {
        String ans;

        do {
            ans = askToContinue();

            // Check if ans is "y" or "yes"
            if ("y".equals(ans) || "yes".equals(ans)) {
                // Return true if user entered "y" or "yes"
                return true;
                // Check if ans is "n" or "no"
            } else if ("n".equals(ans) || "no".equals(ans)) {
                // Return false if user entered "n" or "no"
                return false;
            } else {
                System.out.println("Invalid input. Please enter again!!!");
            }
        } while (true); // Loop until valid input is received
    }

}
