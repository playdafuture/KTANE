package BombDefusal;

public class module_wires {
    public static void main() {
        String tempString;
        while (true) {
            if (main.tuto) {
                System.out.println("Input wires: "
                    + main.ANSI_RED + "(R)ed" + main.ANSI_RESET
                    + ", "
                    + main.ANSI_YELLOW + "(Y)ellow" + main.ANSI_RESET
                    + ", "
                    + main.ANSI_BLUE + "(B)lue" + main.ANSI_RESET
                    + ", "
                    + main.ANSI_WHITE + "(W)hite" + main.ANSI_RESET
                    + ", "
                    + "blac(K)"
                    + " or e(X)it");		
            } else {
                System.out.print("Input wires: ");
            }            

            tempString = main.sc.next();
            if (tempString.equalsIgnoreCase("X")) {
                return;
            }

            if (tempString.length() == 3) {
                String c = tempString.substring(2,3);
                if (countColor(tempString,"r") == 0) {
                    System.out.println(">>> Cut 2nd wire");
                } else if (c.equalsIgnoreCase("w")) {
                    System.out.println(">>> Cut 3rd/last wire");
                } else if (countColor(tempString,"b") > 1) {
                    if (c.equalsIgnoreCase("b")) {
                        System.out.println(">>> Cut 3rd/last wire");
                    } else {
                        System.out.println(">>> Cut 2nd wire");
                    }
                } else {
                    System.out.println(">>> Cut 3rd/last wire");
                }
                return;
            } //end of 3 module_wires

            else if (tempString.length() == 4) {
                if ((countColor(tempString,"r") > 1) && main.zaBomb.SNlastOdd()) {
                    int pos = tempString.lastIndexOf("r");
                    System.out.print(">>> Cut ");
                    if (pos == 3) {
                        System.out.print("4th/last");
                    } else if (pos == 2) {
                        System.out.print("3rd");
                    } else {
                        System.out.print("2nd");
                    }                    
                    System.out.println(" wire");
                } else if ((tempString.charAt(3) == 'y') && (countColor(tempString,"r") == 0)) {
                    System.out.println(">>> Cut 1st wire");
                }
                else if (countColor(tempString,"b") == 1) {
                    System.out.println(">>> Cut 1st wire");
                } else if (countColor(tempString,"y") > 1) {
                    System.out.println(">>> Cut 4th/last wire");
                } else {
                    System.out.println("Cut 2nd wire");
                }
                return;
            } //end of 4 module_wires

            else if (tempString.length() == 5) {
                String e = tempString.substring(4,5);                    
                if (e.equalsIgnoreCase("k") && main.zaBomb.SNlastOdd()) {
                    System.out.println(">>> Cut 4th wire");
                } else if ((countColor(tempString,"r") == 1) && (countColor(tempString,"y") > 1)) {
                    System.out.println(">>> Cut 1st wire");
                } else if (countColor(tempString,"k") == 0) {
                    System.out.println(">>> Cut 2nd wire");
                } else {
                    System.out.println(">>> Cut 1st wire");
                }
                return;
            } //end of 5 module_wires
            
            else if (tempString.length() == 6) {
                if ((countColor(tempString,"y") == 0) && main.zaBomb.SNlastOdd()) {
                    System.out.println(">>> Cut 3rd wire");
                } else if ((countColor(tempString,"y") == 1) && (countColor(tempString,"w") > 1)) {
                    System.out.println(">>> Cut 4th wire");
                } else if (countColor(tempString,"r") == 0) {
                    System.out.println(">>> Cut 6th/last wire");
                } else {
                    System.out.println(">>> Cut 4th wire");
                }
                return;
            } //end of 6 module_wires
            
            else {
                System.out.println("Invalid Input, try again or X to exit");
            } //end of module_wires
        } //end of while true loop
    }
    
    private static int countColor(String passedString, String c) {
        int count = 0;
        for (int i = 0; i < passedString.length(); i++) {
            if (passedString.substring(i, i+1).equalsIgnoreCase(c)) {
                count++;
            }
        }
        return count;
    }
}
