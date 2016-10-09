package BombDefusal;

public class module_simonSays {
    static String toPress;
    static String lights;
    static String input;
    static int strikes;
    public static void main() {
        strikes = 0;
        toPress = "";
        lights = "";
        main.zaBomb.SNhasVowel();
        if (main.tuto) {
            System.out.println("(RM) to reset module, (RS) to reset strikes to 0, (S) to add a strike.");
            System.out.println("(R)ed, (G)reen, (Y)ellow, (B)lue or e(X)it");
        }
        while (true) {            
            if (main.tuto) {
                System.out.println("Current Strikes = " + strikes + ". Enter last light");
            } else {
                System.out.print("Last light = ");
            }
            
            input = main.sc.next();
            if (input.equalsIgnoreCase("RM")) {
                strikes = 0;
                toPress = "";
                lights = "";
                System.out.println("Module Reset!");
            } else if (input.equalsIgnoreCase("RS")) {
                strikes = 0;
                System.out.println("Strikes set back to 0!");
            } else if (input.equalsIgnoreCase("S")) {
                strikes++;
                toPress = "";
                lights = "";
            } else if (input.equalsIgnoreCase("X")){
                return;
            } else {
                if (input.equalsIgnoreCase("R")) {
                    lights = lights + "R";
                } else if (input.equalsIgnoreCase("G")) {
                    lights = lights + "G";
                } else if (input.equalsIgnoreCase("B")) {
                    lights = lights + "B";
                } else if (input.equalsIgnoreCase("Y")) {
                    lights = lights + "Y";
                } else {
                    System.out.println("Invalid input!");
                    if (lights.length() == 0) {
                        System.out.println("No valid input yet");
                    } else {
                        System.out.println("Current Flashes: " + lights);
                        System.out.println("Latest Press: " + toPress);
                    }                    
                    continue;
                }
                decipher();
            }
        }        
    }

    private static void decipher() {
        if (lights.length() == 0) {
            System.out.println("No valid input yet");
            return;
        }
        System.out.println("Current Flashes: " + lights);
        String l = input.substring(input.length() - 1);
        if (main.zaBomb.SNhasVowel()) {
            if (strikes == 0) {
                if (l.equalsIgnoreCase("R")) {
                    toPress = toPress + " >Blue";
                } else if (l.equalsIgnoreCase("B")) {
                    toPress = toPress + " >Red";
                } else if (l.equalsIgnoreCase("G")) {
                    toPress = toPress + " >Yellow";
                } else if (l.equalsIgnoreCase("Y")) {
                    toPress = toPress + " >Green";
                }
            } else if (strikes == 1) {
                if (l.equalsIgnoreCase("R")) {
                    toPress = toPress + " >Yellow";
                } else if (l.equalsIgnoreCase("B")) {
                    toPress = toPress + " >Green";
                } else if (l.equalsIgnoreCase("G")) {
                    toPress = toPress + " >Blue";
                } else if (l.equalsIgnoreCase("Y")) {
                    toPress = toPress + " >Red";
                }
            } else if (strikes == 2) {
                if (l.equalsIgnoreCase("R")) {
                    toPress = toPress + " >Green";
                } else if (l.equalsIgnoreCase("B")) {
                    toPress = toPress + " >Red";
                } else if (l.equalsIgnoreCase("G")) {
                    toPress = toPress + " >Yellow";
                } else if (l.equalsIgnoreCase("Y")) {
                    toPress = toPress + " >Blue";
                }
            }
        } else { //no vowel
            if (strikes == 0) {
                if (l.equalsIgnoreCase("R")) {
                    toPress = toPress + " >Blue";
                } else if (l.equalsIgnoreCase("B")) {
                    toPress = toPress + " >Yellow";
                } else if (l.equalsIgnoreCase("G")) {
                    toPress = toPress + " >Green";
                } else if (l.equalsIgnoreCase("Y")) {
                    toPress = toPress + " >Red";
                }
            } else if (strikes == 1) {
                if (l.equalsIgnoreCase("R")) {
                    toPress = toPress + " >Red";
                } else if (l.equalsIgnoreCase("B")) {
                    toPress = toPress + " >Blue";
                } else if (l.equalsIgnoreCase("G")) {
                    toPress = toPress + " >Yellow";
                } else if (l.equalsIgnoreCase("Y")) {
                    toPress = toPress + " >Green";
                }
            } else if (strikes == 2) {
                if (l.equalsIgnoreCase("R")) {
                    toPress = toPress + " >Yellow";
                } else if (l.equalsIgnoreCase("B")) {
                    toPress = toPress + " >Green";
                } else if (l.equalsIgnoreCase("G")) {
                    toPress = toPress + " >Blue";
                } else if (l.equalsIgnoreCase("Y")) {
                    toPress = toPress + " >Red";
                }
            }
        } //end of no vowel
        System.out.println(">>> Press ->  " + toPress);
    }
}
