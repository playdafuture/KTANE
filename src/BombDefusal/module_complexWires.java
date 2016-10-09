package BombDefusal;

public class module_complexWires {
    public static void main() {
        String s;
        while (true) {
            if (main.tuto) {
                System.out.println("Enter the wires in the following format: ");
                System.out.println("LED 0/1 + Colors Abbreviations + Star Y/N");
                System.out.println("e.g. 0RWY means no light, red and white wire, yes star");
                System.out.println("Type B for (B)atch Mode");
                System.out.println("Type X to e(X)it at any point");
            } else {
                System.out.print("Input wire info: ");
            }
            s = main.sc.next();
            if (s.equalsIgnoreCase("x")) {
                return;
            } else if (s.equalsIgnoreCase("b")) {
                int caseCode = 0;
                //isEven - hasPPort - 2+Batt
                if (!main.zaBomb.SNlastOdd()) {
                    caseCode += 100;
                }
                if (main.zaBomb.hasParaPort()) {
                    caseCode += 10;
                }
                if (main.zaBomb.numBatt() >= 2) {
                    caseCode += 1;
                }
                if (caseCode == 0) {
                    System.out.println(">>> Cut all White with NO LED regardless of Star");
                    System.out.println(">>> Cut all Red with NO LED, YES Star");
                } else if (caseCode == 1) {
                    System.out.println(">>> Cut all White except LED, No Star");
                    System.out.println(">>> Cut all Red except No LED, No Star");
                } else if (caseCode == 10) {
                    System.out.println(">>> Cut all White with NO LED regardless of Star");
                    System.out.println(">>> Cut all Red & Red/Blue with NO LED, YES Star");
                    System.out.println(">>> Cut all Blue with LED regardless of Star");
                } else if (caseCode == 11) {
                    System.out.println(">>> Cut all Star'd wires except 0-Blue and 1-Blue/Red");                    
                    System.out.println(">>> Cut NO Star wires with 0-White, 1-Blue and 1-Red");
                } else if (caseCode == 100) {
                    System.out.println(">>> Cut all NO LED except Blue Star and Red/Blue Star");
                    System.out.println(">>> Cut all LED Red/Blue NO Star");
                } else if (caseCode == 101) {
                    System.out.println(">>> Cut all NO LED except Blue Star and Red/Blue Star");
                    System.out.println(">>> Cut all Red wires with LED regardless of Star");
                    System.out.println(">>> Cut 1-White-Star and 1-Red/Blue-NoStar");
                } else if (caseCode == 110) {
                    System.out.println(">>> Cut all NO LED except Blue Star");
                    System.out.println(">>> Cut all LED blue wires regardless of Star");
                    System.out.println(">>> Cut 1-Red/Blue-NoStar");
                } else if (caseCode == 111) {
                    System.out.println(">>> Cut all NO LED except Blue Star");
                    System.out.println(">>> Cut all LED except White NO Star and Red/Blue Star");
                } else {
                    System.out.println("ERROR: Somehow got an invalid caseCode: " + caseCode);
                }                
            }
            else {
                String LED,Colors,Star;
                LED = s.substring(0, 1);
                Colors = s.substring(1, s.length() - 1);
                Star = s.substring(s.length() - 1);
                if (!(LED.equalsIgnoreCase("0")||LED.equalsIgnoreCase("1"))) {
                    System.out.println("Invalid input on LED!");
                } else if (!(Star.equalsIgnoreCase("Y")||Star.equalsIgnoreCase("N")||Star.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid input on LED!");
                } else { //valid input
                    String wireCode = "";
                    if (LED.equalsIgnoreCase("1")) {
                        wireCode = wireCode + "1";
                    } else {
                        wireCode = wireCode + "0";
                    }
                    Colors = Colors.toUpperCase();
                    if (Colors.contains("R")) {
                        wireCode = wireCode + "1";
                    } else {
                        wireCode = wireCode + "0";
                    }
                    if (Colors.contains("B")) {
                        wireCode = wireCode + "1";
                    } else {
                        wireCode = wireCode + "0";
                    }
                    if (Star.equalsIgnoreCase("N")) {
                        wireCode = wireCode + "0";
                    } else {
                        wireCode = wireCode + "1";
                    }
                    if (solve(wireCode)) {
                        System.out.println(">>> CUT!");
                    } else {
                        System.out.println(">>> LEAVE!");
                    }
                }
            }
        }        
    }

    private static boolean solve(String wireCode) {
        //LED,Red,Blue,Star
        if (wireCode.equals("0000") || wireCode.equals("0001") || wireCode.equals("0101")) {
            return true;
        } else if (wireCode.equals("0011") || wireCode.equals("1111") || wireCode.equals("1000")) {
            return false;
        } else if (wireCode.equals("0111") || wireCode.equals("1011") || wireCode.equals("1010")) {
            if (main.zaBomb.hasParaPort()) {
                return true;
            } else {
                return false;
            }
        } else if (wireCode.equals("1100") || wireCode.equals("1101") || wireCode.equals("1001")) {
            if (main.zaBomb.numBatt() >= 2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (!main.zaBomb.SNlastOdd()) {
                return true;
            } else {
                return false;
            }
        }     
    }
}
