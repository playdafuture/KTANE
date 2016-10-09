package BombDefusal;

public class bombInfo {
    boolean modified;
    String[] fields = {
        //-1 = not set, 0 = false, 1 = true
        "Total number of batteries",
        "Last Digit of Serial Number is Odd",
        "Serial Number contains a vowel",
        "Has label \"FRK\"",
        "Has Parallel Port"
    };
    /**
     * 0: "Total number of batteries",
     * 1: "Last Digit of Serial Number is Odd",
     * 2: "Serial Number contains a vowel"
     * 3: "Has label \"FRK\""
     * 4: "Has Parallel Port"
     */
    int[] values;
    
    public void reset() {
        values = new int[fields.length];
        for (int i = 0; i < fields.length; i++) {
            values[i] = -1;
        }
        modified = false;
    }
    
    public void print() {
        if (modified) {
            if (values[0] != -1) {
                System.out.println(fields[0] + " = " + values[0]);
            }
            if (values[1] != -1) {
                if (values[1] == 0) {
                    System.out.println("Last Digit of Serial Number is Even");
                } else {
                    System.out.println("Last Digit of Serial Number is Odd");
                }                
            }
            if (values[2] != -1) {
                if (values[2] == 0) {
                    System.out.println("Serial Number does not contain a Vowel");
                } else {
                    System.out.println("Serial Number contains a Vowel");
                }
            }  
            if (values[3] != -1) {
                if (values[3] == 0) {
                    System.out.println("No \"FRK\" label");
                } else {
                    System.out.println("Bomb has \"FRK\" label");
                }
            }
            if (values[4] != -1) {
                if (values[4] == 0) {
                    System.out.println("No parallel port");
                } else {
                    System.out.println("Bomb has parallel port");
                }
            }
        } else {
            System.out.println("No bomb info available.");
        }
    }
    
    public int numBatt() {
        if (values[0] == -1) {
            System.out.print("# of Batt = ");
            String s = main.sc.next();
            int a = Integer.parseInt(s);
            values[0] = a;
            modified = true;
        }
        return values[0];
    }
    
    public boolean SNlastOdd() {
        if (values[1] == -1) {
            modified = true;
            System.out.print("Last digit of Serial#? ");
            String s = main.sc.next();
            int a = Integer.parseInt(s);
            if (a % 2 == 0) {
                values[1] = 0;
                return false;
            } else {
                values[1] = 1;
            }            
        } else if (values[1] == 0) {
            return false;
        }
        return true;
    }
    
    boolean SNhasVowel() {
        if (values[2] == -1) {
            modified = true;
            System.out.print("Serial# contains a vowel? Y/N ");
            String s = main.sc.next();
            if (s.equalsIgnoreCase("Y")) {
                values[2] = 1;
                return true;
            } else {
                values[2] = 0;
            }            
        } else if (values[2] == 1) {
            return true;
        }
        return false;
    }
    
    public boolean frk() {
        if (values[3] == -1) {
            modified = true;
            System.out.print("Bomb has FRK label? Y/N ");
            String s = main.sc.next();
            if (s.equalsIgnoreCase("Y")) {
                values[3] = 1;
                return true;
            } else {
                values[3] = 0;
            }            
        } else if (values[3] == 1) {
            return true;
        }
        return false;
    }

    public boolean hasParaPort() {
        if (values[4] == -1) {
            modified = true;
            System.out.print("Bomb has Parallel Port (Very Wide, 2 rows of pins)? Y/N ");
            String s = main.sc.next();
            if (s.equalsIgnoreCase("Y")) {
                values[4] = 1;
                return true;
            } else {
                values[4] = 0;
            }            
        } else if (values[4] == 1) {
            return true;
        }
        return false;
    }

    
}
