package BombDefusal;

public class module_wireSequence {
    static String input;
    static String tempWire;
    public static void main() {
        input = "";
        tempWire = "";
		
        int redCounter = 0;
        int blueCounter = 0;
        int blackCounter = 0;
        
        if (main.tuto) {
            System.out.println("(R)ed, (B)lue, or blac(K), to A, B or C. One wire at a time");
            System.out.println("e.g. RA means Red wire to slot A. X to e(X)it at anytime.");
            System.out.println("Type (RM) to reset the module.");
        }
        
        while (true) {
            if (input.length() == 0) {
                System.out.print("Input wire(s): ");
                while (input.length() == 0)
                input = main.sc.nextLine();
            }
            getWire();
            //tempWire = main.sc.next();

            if (tempWire.equalsIgnoreCase("X")) {
                return;
            }
            if (tempWire.equalsIgnoreCase("RS") || tempWire.equalsIgnoreCase("RM") || tempWire.equalsIgnoreCase("ReSet")) {
                redCounter = 0;
                blueCounter = 0;
                blackCounter = 0;
                System.out.println("Module Reset!");
                continue;
            }
            if (tempWire.charAt(0) == 'R' || tempWire.charAt(0) == 'r') {
                redWire(tempWire.charAt(1), redCounter);
                redCounter++;
            } else if (tempWire.charAt(0) == 'B' || tempWire.charAt(0) == 'b') {
                blueWire(tempWire.charAt(1), blueCounter);
                blueCounter++;
            } else if (tempWire.charAt(0) == 'K' || tempWire.charAt(0) == 'k') {
                blackWire(tempWire.charAt(1), blackCounter);
                blackCounter++;
            } else {
                System.out.println("Invalid input, try again!");
            }
        }
    }
    
    public static void redWire(char connectedTo, int counter)	{
        if (counter == 0 && (connectedTo == 'C' || connectedTo == 'c'))
                System.out.println(">> CUT!");	
        else if (counter == 1 && (connectedTo == 'B' || connectedTo == 'b'))
                System.out.println(">> CUT!");	
        else if (counter == 2 && (connectedTo == 'A' || connectedTo == 'a'))
                System.out.println(">> CUT!");	
        else if (counter == 3 && (connectedTo != 'B' && connectedTo != 'b'))
                System.out.println(">> CUT!");	
        else if (counter == 4 && (connectedTo == 'B' || connectedTo == 'b'))
                System.out.println(">> CUT!");	
        else if (counter == 5 && (connectedTo != 'B' && connectedTo != 'b'))
                System.out.println(">> CUT!");	
        else if (counter == 6)
                System.out.println(">> CUT!");	
        else if (counter == 7 && (connectedTo != 'C' && connectedTo != 'c'))
                System.out.println(">> CUT!");	
        else if (counter == 8 && (connectedTo == 'B' || connectedTo == 'b'))
                System.out.println(">> CUT!");	
        else 
                System.out.println(">> Do NOT cut!");
    }
	public static void blueWire(char connectedTo, int counter)
	{
		if (counter == 0 && (connectedTo == 'B' || connectedTo == 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 1 && (connectedTo != 'B' && connectedTo != 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 2 && (connectedTo == 'B' || connectedTo == 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 3 && (connectedTo == 'A' || connectedTo == 'a'))
			System.out.println(">> CUT!");	
		else if (counter == 4 && (connectedTo == 'B' || connectedTo == 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 5 && (connectedTo != 'A' && connectedTo != 'a'))
			System.out.println(">> CUT!");	
		else if (counter == 6 && (connectedTo == 'C' || connectedTo == 'c'))
			System.out.println(">> CUT!");	
		else if (counter == 7 && (connectedTo != 'B' && connectedTo != 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 8 && (connectedTo == 'A' || connectedTo == 'a'))
			System.out.println(">> CUT!");	
		else 
			System.out.println(">> Do NOT cut!");
	}
	public static void blackWire(char connectedTo, int counter)
	{
		if (counter == 0)
			System.out.println(">> CUT!");	
		else if (counter == 1 && (connectedTo != 'B' && connectedTo != 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 2 && (connectedTo == 'B' || connectedTo == 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 3 && (connectedTo != 'B' && connectedTo != 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 4 && (connectedTo == 'B' || connectedTo == 'b'))
			System.out.println(">> CUT!");	
		else if (counter == 5 && (connectedTo != 'A' && connectedTo != 'a'))
			System.out.println(">> CUT!");	
		else if (counter == 6 && (connectedTo != 'C' && connectedTo != 'c'))
			System.out.println(">> CUT!");	
		else if (counter == 7 && (connectedTo == 'C' || connectedTo == 'c'))
			System.out.println(">> CUT!");	
		else if (counter == 8 && (connectedTo == 'C' || connectedTo == 'c'))
			System.out.println(">> CUT!");	
		else 
			System.out.println(">> Do NOT cut!");
	}

    private static void getWire() {
        input = input.trim();
        int i = input.indexOf(" ");
        if (i == -1) {
            tempWire = input;
            input = "";
        } else {
            tempWire = input.substring(0,i);
            input = input.substring(i);            
        }
        input = input.trim();
    }
}
