package BombDefusal;

class module_knobs {
    public static void main() {
        if (main.tuto) {
            System.out.println("Enter 6 digit LED status");
            System.out.println("Left side inner 3, then left side outer 3, from left to right");
            System.out.println("0 indicates OFF, and 1 indicates ON");
            System.out.println("X to e(x)it");
        }
        while (true) {            
            System.out.print("Input LED Staus: ");
            String s = main.sc.next();
            if (s.equals("001111") || s.equals("101011")) {
                System.out.println(">>> UP");
                return;
            } else if (s.equals("011111") || s.equals("101010")) {
                System.out.println(">>> DOWN");
                return;
            } else if (s.equals("000100") || s.equals("000000")) {
                System.out.println(">>> LEFT");
                return;
            } else if (s.equals("101111")) {
                System.out.println(">>> RIGHT");
                return;
            } else if (s.equalsIgnoreCase("x")) {
                return;
            } else {
                System.out.println("Invalid input, try again!");
                System.out.println("Enter 6 digit LED status");
                System.out.println("Left side inner 3, then left side outer 3, from left to right");
                System.out.println("0 indicates OFF, and 1 indicates ON");
                System.out.println("X to e(x)it");
            }
        }
        
        
    }
}
