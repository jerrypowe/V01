/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v01;

/**
 * V01 - Guessing Game
 *
 * @author TuPTCE181028
 */
public class V01 {

    /**
     * The main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new instance of the Play class
        Play play = new Play();
        System.out.println("|-----------+Guessing game+-----------|");
        do {
            // Call guess method from play
            play.guess();

            // Call total method from play
            play.total();
        } while (play.playAgain()); // Loop if the player want to play agian

        // Call the conclude method from play
        play.conclude();
    }

}
