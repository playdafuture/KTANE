package BombDefusal;

public class module_button {
    public static void main() {
        String tempString;
        String color, text;
        while (true) {
            if (main.tuto) {
                System.out.println("Enter color of button, then 1st letter of word.");
                System.out.println("e.g. RH means Red Button that says HOLD");
            }
            System.out.print("Enter Button Info: ");
            tempString = main.sc.next();
            if (tempString.equalsIgnoreCase("x")) {
                return;
            } else {
                color = tempString.substring(0, 1);                
                text = tempString.substring(1);
            }
            if (text.equalsIgnoreCase("d") || text.equalsIgnoreCase("detonate")) {
                if (main.zaBomb.numBatt() > 1) {
                    System.out.println(">>> Press RELEASE!");
                    return;
                } else {
                    pressHold();
                    return;
                }
            } else if (color.equalsIgnoreCase("r") || color.equalsIgnoreCase("red")) {
                if (text.equalsIgnoreCase("h") || text.equalsIgnoreCase("hold")) {
                    System.out.println(">>> Press RELEASE!");
                    return;
                } else {
                    pressHold();
                    return;
                }
            } else if (main.zaBomb.numBatt() > 2) {
                if (main.zaBomb.frk()) {
                    System.out.println(">>> Press RELEASE!");
                    return;
                } else {
                    pressHold();
                    return;
                }
            } else {
                pressHold();
                return;
            }
        }
    }

    private static void pressHold() {
        System.out.println(">>> Press HOLD!");
        if (main.tuto) {
            System.out.println("Color of Stripe: (R)ed, (Y)ellow, (B)lue, (W)hite, (O)ther or e(X)it");
        } else {
            System.out.print("Stripe color: ");
        }        
        String s = main.sc.next();
        if (!s.equalsIgnoreCase("x")) {
            if (s.equalsIgnoreCase("b")) {
                System.out.println(">>> RELEASE on 4!");
            } else if (s.equalsIgnoreCase("w")) {
                System.out.println(">>> RELEASE on 1!");
            } else if (s.equalsIgnoreCase("y")) {
                System.out.println(">>> RELEASE on 5!");
            } else {
                System.out.println(">>> RELEASE on 1!");
            }
        }
    }
}
