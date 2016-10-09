package BombDefusal;

class module_whosOnFirst {

    public static void main() {
        String buttonLabel; 
        String display;

        while (true) {
            Boolean valid = false;
            while (!valid) {
                System.out.println("Which word is showing on the display?");
                System.out.println("(If there is no word on the display, enter ND.)");
                System.out.print("Display: ");
                display = main.sc.nextLine();
                if (display.equals("")) {
                    display = main.sc.nextLine();
                }
                display = display.toLowerCase();

                if (display.equals("x")) {
                    return;
                }

                switch(display) {
                    case "ur":
                        System.out.println(">>> UPPER LEFT");
                        valid = true;
                        break;
                    case "first":
                    case "okay":
                    case "c":
                        System.out.println(">>> UPPER RIGHT");
                        valid = true;
                        break;
                    case "yes":
                    case "nothing":
                    case "led":
                    case "they are":
                        System.out.println(">>> MIDDLE LEFT");
                        valid = true;
                        break;
                    case "blank":
                    case "read":
                    case "red":
                    case "you":
                    case "your":
                    case "you're":
                    case "their":
                        System.out.println(">>> MIDDLE RIGHT");
                        valid = true;
                        break;
                    case "nd":
                    case "reed":
                    case "leed":
                    case "they're":
                        System.out.println(">>> BOTTOM LEFT");
                        valid = true;
                        break;
                    case "display":
                    case "says":
                    case "no":
                    case "lead":
                    case "hold on":
                    case "you are":
                    case "there":
                    case "see":
                    case "cee":
                        System.out.println(">>> BOTTOM RIGHT");
                        valid = true;
                        break;
                    default:
                        System.out.println("Invalid DISPLAY word, try again!");
                        break;
                }
            }

            Boolean correctInput = false;
            String[] wordArray = new String[]{}; 

            while (!correctInput) {
                System.out.print("Button Label: ");
                buttonLabel = main.sc.nextLine().toLowerCase();                      

                if (buttonLabel.equals("ready")) {
                    wordArray = new String[]{"YES","OKAY","WHAT","MIDDLE","LEFT","PRESS","RIGHT","BLANK","READY (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("first")) {
                    wordArray = new String[]{"LEFT", "OKAY", "YES", "MIDDLE", "NO", "RIGHT", "NOTHING", "UHHH", "WAIT", "READY", "BLANK", "WHAT", "PRESS", "FIRST (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("no")) {
                    wordArray = new String[]{"BLANK", "UHHH", "WAIT", "FIRST", "WHAT", "READY", "RIGHT", "YES", "NOTHING", "LEFT", "PRESS", "OKAY", "NO (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("blank")) {
                    wordArray = new String[]{"WAIT", "RIGHT", "OKAY", "MIDDLE", "BLANK (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("nothing")) {
                    wordArray = new String[]{"UHHH", "RIGHT", "OKAY", "MIDDLE", "YES", "BLANK", "NO", "PRESS", "LEFT", "WHAT", "WAIT", "FIRST", "NOTHING (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("yes")) {
                    wordArray = new String[]{"OKAY", "RIGHT", "UHHH", "MIDDLE", "FIRST", "WHAT", "PRESS", "READY", "NOTHING", "YES (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("what")) {
                    wordArray = new String[]{"UHHH", "WHAT (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("uhhh")) {
                    wordArray = new String[]{"READY", "NOTHING", "LEFT", "WHAT", "OKAY", "YES", "RIGHT", "NO", "PRESS", "BLANK", "UHHH (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("left")) {
                    wordArray = new String[]{"RIGHT", "LEFT (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("right")) {
                    wordArray = new String[]{"YES", "NOTHING", "READY", "PRESS", "NO", "WAIT", "WHAT", "RIGHT (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("middle")) {
                    wordArray = new String[]{"BLANK", "READY", "OKAY", "WHAT", "NOTHING", "PRESS", "NO", "WAIT", "LEFT", "MIDDLE (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("okay")) {
                    wordArray = new String[]{"MIDDLE", "NO", "FIRST", "YES", "UHHH", "NOTHING", "WAIT", "OKAY (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("wait")) {
                    wordArray = new String[]{"UHHH", "NO", "BLANK", "OKAY", "YES", "LEFT", "FIRST", "PRESS", "WHAT", "WAIT (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("press")) {
                    wordArray = new String[]{"RIGHT", "MIDDLE", "YES", "READY", "PRESS (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("you")) {
                    wordArray = new String[]{"SURE", "YOU ARE", "YOUR", "YOU'RE", "NEXT", "UH HUH", "UR", "HOLD", "WHAT?", "YOU (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("you are")) {
                    wordArray = new String[]{"YOUR", "NEXT", "LIKE", "UH HUH", "WHAT?", "DONE", "UH UH", "HOLD", "YOU", "U", "YOU'RE", "SURE", "UR", "YOU ARE (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("your")) {
                    wordArray = new String[]{"UH UH", "YOU ARE", "UH HUH", "YOUR (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("you're")) {
                    wordArray = new String[]{"YOU", "YOU'RE (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("ur")) {
                    wordArray = new String[]{"DONE", "U", "UR (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("u")) {
                    wordArray = new String[]{"UH HUH", "SURE", "NEXT", "WHAT?", "YOU'RE", "UR", "UH UH", "DONE", "U (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("uh huh")) {
                    wordArray = new String[]{"UH HUH (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("uh uh")) {
                    wordArray = new String[]{"UR", "U", "YOU ARE", "YOU'RE", "NEXT", "UH UH (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("what?")) {
                    wordArray = new String[]{"YOU", "HOLD", "YOU'RE", "YOUR", "U", "DONE", "UH UH", "LIKE", "YOU ARE", "UH HUH", "UR", "NEXT", "WHAT? (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("done")) {
                    wordArray = new String[]{"SURE", "UH HUH", "NEXT", "WHAT?", "YOUR", "UR", "YOU'RE", "HOLD", "LIKE", "YOU", "U", "YOU ARE", "UH UH", "DONE (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("next")) {
                    wordArray = new String[]{"WHAT?", "UH HUH", "UH UH", "YOUR", "HOLD", "SURE", "NEXT (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("hold")) {
                    wordArray = new String[]{"YOU ARE", "U", "DONE", "UH UH", "YOU", "UR", "SURE", "WHAT?", "YOU'RE", "NEXT", "HOLD (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("sure")) {
                    wordArray = new String[]{"YOU ARE", "DONE", "LIKE", "YOU'RE", "YOU", "HOLD", "UH HUH", "UR", "SURE (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("like")) {
                    wordArray = new String[]{"YOU'RE", "NEXT", "U", "UR", "HOLD", "DONE", "UH UH", "WHAT?", "UH HUH", "YOU", "LIKE (This must be there)"};
                    correctInput = true;
                } else if (buttonLabel.equals("x")) {
                    return;
                } else {
                    System.out.println("Invalid Button Label. What does the button read on the specified location?");					
                }
            }
                
            if (main.tuto) {
                System.out.println("ENTER to show next word, N for (N)ext stage, X to e(x)it");
            }

            int i = 0;
            String inputString = "";

            while ((!inputString.equalsIgnoreCase("N")) && (i < wordArray.length)) {
                if (inputString.equalsIgnoreCase("X")) {
                    return;
                }
                System.out.println(wordArray[i++]);
                inputString = main.sc.nextLine();
            }
            
            if (i == wordArray.length) {
                System.out.println("END OF WORDLIST!");
            }
        }
    }
}