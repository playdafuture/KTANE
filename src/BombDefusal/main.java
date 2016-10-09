/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BombDefusal;

import java.util.Scanner;

/**
 *
 * @author Future
 */
public class main {
    public static bombInfo zaBomb;
    public static boolean tuto;
    public static Scanner sc;
    
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_RESET = "";
    public static final String ANSI_BLACK = "";
    public static final String ANSI_RED = "";
    public static final String ANSI_GREEN = "";
    public static final String ANSI_YELLOW = "";
    public static final String ANSI_BLUE = "";
    public static final String ANSI_PURPLE = "";
    public static final String ANSI_CYAN = "";
    public static final String ANSI_WHITE = "";
    
    public static void main (String[] args) {
        System.out.println("Bomb defusal assistant online.");
        System.out.println("Initializing...");
        zaBomb = new bombInfo();
        zaBomb.reset();
        tuto = true;
        
        String input;
        sc = new Scanner(System.in);
        
        while(true) {
            
            if (tuto) {
                System.out.println("Main Menu");
                System.out.println("W. Wires | B. The Button | CW. Complex Wires");
                System.out.println("M. Memry | S. Simon Says | WS. WireSequences");
                System.out.println("K. Knobs | P. Password   | WF. Who's on 1st");
                System.out.println("MZ. Maze | MC. Morse Code (RAW)");
                System.out.println("R. Reset | I. Bomb Info. | T. Toggle Detailed Instructions");
            } else {
                System.out.print("Select Module: ");
            }
            input = sc.next();
            if (input.equalsIgnoreCase("EXIT")) {
                break;
            } else if (input.equalsIgnoreCase("W")) {
                module_wires.main();
            } else if (input.equalsIgnoreCase("B") || input.equalsIgnoreCase("BB")) {
                module_button.main();
            } else if (input.equalsIgnoreCase("CW")) {
                module_complexWires.main();
            } else if (input.equalsIgnoreCase("M")) {
                module_memory.main();
            } else if (input.equalsIgnoreCase("S") || input.equalsIgnoreCase("SS")) {
                module_simonSays.main();
            } else if (input.equalsIgnoreCase("WS")) {
                module_wireSequence.main();
            } else if (input.equalsIgnoreCase("P") || input.equalsIgnoreCase("PW")) {
                module_password.main();
            } else if (input.equalsIgnoreCase("WF") || input.equalsIgnoreCase("WOF")) {
                module_whosOnFirst.main();
            } else if (input.equalsIgnoreCase("K")) {
                module_knobs.main();
            } else if (input.equalsIgnoreCase("MZ")) {
                module_maze.main();
            } else if (input.equalsIgnoreCase("MS") || input.equalsIgnoreCase("MC")) {
                module_morseCode.main();
            }
            else if (input.equalsIgnoreCase("R")) {
                zaBomb.reset();
                System.out.println("Reset successful! Ready for new bomb!");
                System.out.println("-------------------------------------");
            }
            else if (input.equalsIgnoreCase("I")) {   
                if (tuto) {
                    System.out.println("Detailed instructions");
                } else {
                    System.out.println("Simple instructions");
                }
                System.out.println("Bomb Info:");
                zaBomb.print();
                System.out.println("-------------------------------------");
            } else if (input.equalsIgnoreCase("T")) {                
                if (tuto) {
                    tuto = false;
                    System.out.println("Switched to SIMPLE INSTRUCTIONS");
                } else {
                    tuto = true;
                    System.out.println("Switched to DETAIL INSTRUCTIONS");
                }
            }
            else {
                System.out.println("Invalid Selection! Try again!");
            }
        }
    }
}
