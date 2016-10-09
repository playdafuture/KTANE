package BombDefusal;

public class module_password {
    static final String[] origList = {
        "about","after","again","below","could",
        "every","first","found","great","house",
        "large","learn","never","other","place",
        "plant","point","right","small","sound",
        "spell","still","study","their","there",
        "these","thing","think","three","water",
        "where","which","world","would","write"
    };
    static String[] tempList;
    static int[] vars;
    static String input;
    static String readPositions;
    
    public static void main() {
        copyList();
        calcVar();
        readPositions = "";
        while (true) {
            if (main.tuto) {
                System.out.println("Input position, followed by available letters.");
                System.out.println("e.g. 3anyzxu means ANYZXU are available at 3rd position");
            }
            if (readPositions.length() < 5) {
                System.out.print("Suggest read position " + (maxVar() + 1) + ": ");
            } else {
                System.out.print("Position ERROR. Enter any info: ");
            }
            
            input = main.sc.next();
            if (input.equalsIgnoreCase("X")) {
                return;
            } else if (input.equalsIgnoreCase("R")) {                
                copyList();
                calcVar();
                readPositions = "";
                System.out.println("Module Reset!");
            } else {
                eliminate();
                calcVar();
                if (listSize() > 6) {
                    System.out.println("List size = " + listSize());
                } else if (listSize() == 1) {
                    System.out.print(">>> Password = ");
                    printList();
                    return;
                } else {
                    System.out.println("Possible passwords: ");
                    printList();
                }
                
            }
        }
    }

    private static void printList() {
        for (int i = 0; i < 35; i++) {
            if (tempList[i].length() > 1) {
                System.out.print(tempList[i] + " ");
            }                
        }
        System.out.println();
    }

    private static void copyList() {
        tempList = new String[35];
        for (int i = 0; i < 35; i++) {
            tempList[i] = origList[i];
        }
    }

    private static void calcVar() {
        vars = new int[5];
        for (int i = 0; i < 5; i++) {
            String s = "";
            for (int j = 0; j < 35; j++) {
                if (tempList[j].length() > 1 && !s.contains(tempList[j].substring(i, i+1))) {
                    vars[i]++;
                    s = s+tempList[j].substring(i, i+1);
                }
            }
            //System.out.println(i + ":" + vars[i]); //debug
        }
    }
    
    private static int listSize() {
        int count = 0;
        for (int i = 0; i < 35; i++) {
            if (tempList[i].length() > 1) {
                count++;
            }
        }
        return count;
    }
    
    private static int maxVar() {
        if (readPositions.length() > 5) {
            return -1;
        }
        int max = 0;
        int idx = -1;
        for (int i = 0; i < 5; i++) {
            if ((!readPositions.contains(""+(i+1))) && vars[i] > max) {
                max = vars[i];
                idx = i;
            }
        }
        return idx;
    }

    private static void eliminate() {
        char first = input.charAt(0);   
        int pos;
        if (first >= 1 && first <= 5) {
            //a digit is specified
            pos = Integer.parseInt(input.substring(0, 1));
        } else {
            //use suggested location
            pos = (maxVar() + 1);
        }
        
        for (int i = 0; i < 35; i++) {
            if (tempList[i].length() > 1) {
                String c = tempList[i].substring(pos - 1, pos); //the "POS"th letter of "i"th word in 35 list
                if (!input.contains(c)) {
                    tempList[i] = "";
                }
            }            
        }
        
        if (!readPositions.contains(""+pos)) {
            readPositions += pos;
        }        
    }
    
}
