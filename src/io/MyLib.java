/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.Scanner;

/**
 * V01 - Guessing game
 *
 * Student's library
 *
 * @author TuPTCE181028
 */
public class MyLib {

    /**
     * Ask the system to give memory to Scanner
     */
    public static Scanner sc = new Scanner(System.in);

    /**
     * Input an integer
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @return An integer
     */
    public static int getInteger(String iMsg, String eMsg) {
        int n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input an integer value from screen
                n = Integer.parseInt(sc.nextLine().trim());
                // Return an integer
                return n;
            } catch (NumberFormatException e) {
                // Print out the error message if the input isn't integer
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input an integer with one side condition
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @param con Condition
     * @param type '<' if the integer has to be smaller than the conditions |
     * '<=' if the integer has to be smaller or equal to the conditions | '>' if
     * the integer has to be bigger than the conditions | '>=' if the integer
     * has to be bigger or equal to the conditions
     * @return An integer
     */
    public static int getInteger(String iMsg, String eMsg, int con, String type) {
        int n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input an integer value from screen
                n = Integer.parseInt(sc.nextLine().trim());
                //Switch to the chosen type
                switch (type) {
                    case "<": // Smaller than
                        // Throw exception if the input is bigger or equal the condition
                        if (n >= con) {
                            throw new Exception();
                        }
                        break;
                    case ">": // Bigger than
                        // Throw exception if the input is smaller or equal the condition
                        if (n <= con) {
                            throw new Exception();
                        }
                        break;
                    case "<=": // Smaller or equal
                        // Throw exception if the input is bigger than the condition
                        if (n > con) {
                            throw new Exception();
                        }
                        break;
                    case ">=": // Bigger or equal
                        // Throw exception if the input is smaller than the condition
                        if (n < con) {
                            throw new Exception();
                        }
                        break;
                    default: // If the type is not those above
                        System.out.println("Please check the code!"); //Warn the user to check the code
                        return 0;
                }
                // Return an integer 
                return n;
            } catch (Exception e) {
                // Print out the error message if the input doesn't match the condition or isn't integer
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input an integer with two side condition
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @param from Condition 1
     * @param to Condition 2
     * @param type '=' if include the conditions | '!=' if not include the
     * conditions
     * @return An integer
     */
    public static int getInteger(String iMsg, String eMsg, int from, int to, String type) {
        // Swap to make sure 'from' is smaller than 'to'
        //Check if 'from' is bigger than 'to'
        if (from > to) {
            // Swap the values
            int tmp = from;
            from = to;
            to = tmp;
        }
        int n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input an integer value from the screen
                n = Integer.parseInt(sc.nextLine().trim());
                //Switch to the chosen type
                switch (type) {
                    case "=": // Include the conditions
                        if (n < from || n > to) {
                            // Throw exception if the input is smaller than 'from' or bigger than 'to'
                            throw new Exception();
                        }
                        break;
                    case "!=": // Not include the conditions
                        // Throw exception if the input is bigger or equal to 'from' or bigger or equal to 'to'
                        if (n <= from || n >= to) {
                            throw new Exception();
                        }
                        break;
                    default: // If the type is not those above
                        System.out.println("Please check the code!");//Warn the user to check the code
                        return 0;
                }
                // Return an integer
                return n;
            } catch (Exception e) {
                // Print out the error message if the input doesn't match the condition or isn't integer
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input a real number
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @return A real number
     */
    public static double getdouble(String iMsg, String eMsg) {
        double n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input a double value from the screen
                n = Double.parseDouble(sc.nextLine().trim());
                // Return the real number
            } catch (NumberFormatException e) {
                // Print out the error message if the input isn't real number
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input a real number with one side condition
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @param con Condition
     * @param type '<' if the real number has to be smaller than the conditions
     * |
     * '<=' if the real number has to be smaller or equal to the conditions | '>'
     * if the real number has to be bigger than the conditions | '>=' if the
     * real number has to be bigger or equal to the conditions
     * @return A real number
     */
    public static double getdouble(String iMsg, String eMsg, double con, String type) {
        double n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input a double value from the screen
                n = Double.parseDouble(sc.nextLine().trim());
                //Switch to the chosen type
                switch (type) {
                    case "<": // Smaller than
                        // Throw exception if the input is bigger or equal the condition
                        if (n >= con) {
                            throw new Exception();
                        }
                        break;
                    case ">": // Bigger than
                        // Throw exception if the input is smaller or equal the condition
                        if (n <= con) {
                            throw new Exception();
                        }
                        break;
                    case "<=": // Smaller or equal
                        // Throw exception if the input is bigger than the condition
                        if (n > con) {
                            throw new Exception();
                        }
                        break;
                    case ">=": // Bigger or equal
                        // Throw exception if the input is smaller than the condition
                        if (n < con) {
                            throw new Exception();
                        }
                        break;
                    default: // If the type is not those above
                        System.out.println("Can't detect!"); //Warn the user to check the code
                        return 0;
                }
                // Return the real number
                return n;
            } catch (Exception e) {
                // Print out the error message if the input doesn't match the condition or isn't real number
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input a real number with two side condition
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @param from Condition 1
     * @param to Condition 2
     * @param type '=' if include the condition | '!=' if not include the
     * condition
     * @return A real number
     */
    public static double getdouble(String iMsg, String eMsg, double from, double to, String type) {
        // Swap to make sure 'from' is smaller than 'to'
        //Check if 'from' is bigger than 'to'
        if (from > to) {
            // Swap the values
            double tmp = from;
            from = to;
            to = tmp;
        }
        double n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input a double value from the screen
                n = Double.parseDouble(sc.nextLine().trim());
                // Switch to the chosen type
                switch (type) {
                    case "=": // Include the conditions
                        if (n < from || n > to) {
                            // Throw exception if the input is smaller than 'from' or bigger than 'to'
                            throw new Exception();
                        }
                        break;
                    case "!=": // Not include the conditions
                        // Throw exception if the input is bigger or equal to 'from' or bigger or equal to 'to'
                        if (n <= from || n >= to) {
                            throw new Exception();
                        }
                        break;
                    default: // If the type is not those above
                        System.out.println("Can't detect!");//Warn the user to check the code
                        return 0;
                }
                // Return the real number
                return n;
            } catch (Exception e) {
                // Print out the error message if the input doesn't match the condition or isn't real number
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input a string
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @return a string
     */
    public static String getString(String iMsg, String eMsg) {
        String n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input a string value from the screen
                n = sc.nextLine().trim();
                if (n.isEmpty()) {
                    // Throw exception if the input is empty
                    throw new Exception();
                }
                // Return a string
                return n;
            } catch (Exception e) {
                // Print out the error message if the input doesn't match the condition or isn't string
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input a string with specific length
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @param gLength given Length
     * @return a string
     */
    public static String getString(String iMsg, String eMsg, int gLength) {
        String n;
        // While loops untill the input matches the condition
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input a String variable from the screen
                n = sc.nextLine().trim();
                if (n.isEmpty() || n.length() != gLength) {
                    // Throw exception if the input is empty or the length doesn't equal the 'gLength'
                    throw new Exception();
                }
                // Return a string
                return n;
            } catch (Exception e) {
                // Print out the error message if the input doesn't match the condition or isn't string
                System.out.println(eMsg);
            }
        }
    }

    /**
     * Input a string with limited length
     *
     * @param iMsg Input message
     * @param eMsg Error message
     * @param min Condition 1
     * @param max Condition 2
     * @return a string
     */
    public static String getString(String iMsg, String eMsg, int min, int max) {
        // Swap to make sure 'from' is smaller than 'to'
        //Check if 'min' is bigger than 'max'
        if (min > max) {
            // Swap the values
            int temp = min;
            min = max;
            max = temp;
        }
        String n;
        while (true) {
            try {
                // Print out the input message
                System.out.print(iMsg);
                // Input a string value from the screen
                n = sc.nextLine().trim();
                if (n.isEmpty() || n.length() < min || n.length() > max) {
                    // Throw exception if the input is empty or smaller than 'min or bigger than 'max'
                    throw new Exception();
                }
                // Return a string
                return n;
            } catch (Exception e) {
                // Print out the error message if the input doesn't match the condition or isn't string
                System.out.println(eMsg);
            }
        }
    }

}
