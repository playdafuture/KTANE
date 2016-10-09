package BombDefusal;

public class module_memory {
    static int[] pos;
    static int[] lab;
    static int stage;
    static String s;
    public static void main() {
        pos = new int[6];
        lab = new int[6];
        stage = 1;        
        while (stage < 6) {
            if (main.tuto) {
                System.out.println("Enter 4 digits+display, R to Start Over, or X to Exit");
            }            
            System.out.print("Stage " + stage + ": ");
            s = main.sc.next();
            if (s.equalsIgnoreCase("x")) {
                return;
            } else if (s.equalsIgnoreCase("r")) {
                System.out.println("Module reset! Start over from stage 1");
                pos = new int[6];
                lab = new int[6];
                stage = 1;
            } else {
                int disp = labOf(5);
                
                if (stage == 1) {
                    if (disp == 1) {
                        lab[1] = labOf(2);
                        pos[1] = 2;
                        pp(2);
                    } else if (disp == 2) {
                        lab[1] = labOf(2);
                        pos[1] = 2;
                        pp(2);
                    } else if (disp == 3) {
                        lab[1] = labOf(3);
                        pos[1] = 3;
                        pp(3);
                    } else if (disp == 4) {
                        lab[1] = labOf(4);
                        pos[1] = 4;
                        pp(4);
                    }
                    stage++;
                } else if (stage == 2) {                   
                    if (disp == 1) {
                        lab[2] = 4;
                        pos[2] = posOf(4);
                        pl(4);
                    } else if (disp == 2) {
                        lab[2] = labOf(pos[1]);
                        pos[2] = pos[1];
                        pp(pos[1]);
                    } else if (disp == 3) {
                        lab[2] = labOf(1);
                        pos[2] = 1;
                        pp(1);
                    } else if (disp == 4) {
                        lab[2] = labOf(pos[1]);
                        pos[2] = pos[1];
                        pp(pos[1]);
                    }
                    stage++;
                } else if (stage == 3) {                    
                    if (disp == 1) {
                        lab[3] = lab[2];
                        pos[3] = posOf(lab[2]);
                        pl(lab[2]);
                    } else if (disp == 2) {
                        lab[3] = lab[1];
                        pos[3] = posOf(lab[1]);;
                        pl(lab[1]);
                    } else if (disp == 3) {
                        lab[3] = labOf(3);
                        pos[3] = 3;
                        pp(3);
                    } else if (disp == 4) {
                        lab[3] = 4;
                        pos[3] = posOf(4);
                        pl(4);
                    }
                    stage++;
                } else if (stage == 4) {                    
                    if (disp == 1) {
                        lab[4] = labOf(pos[1]);
                        pos[4] = pos[1];
                        pp(pos[1]);
                    } else if (disp == 2) {
                        lab[4] = labOf(1);
                        pos[4] = 1;
                        pp(1);
                    } else if (disp == 3) {
                        lab[4] = labOf(pos[2]);
                        pos[4] = pos[2];
                        pp(pos[2]);
                    } else if (disp == 4) {
                        lab[4] = labOf(pos[2]);
                        pos[4] = pos[2];
                        pp(pos[2]);
                    }
                    stage++;
                } else if (stage == 5) {                    
                    if (disp == 1) {
                        pl(lab[1]);
                    } else if (disp == 2) {
                        pl(lab[2]);
                    } else if (disp == 3) {
                        pl(lab[4]);
                    } else if (disp == 4) {
                        pl(lab[3]);
                    }
                    stage++;
                }
            }
            
        }        
    }

    private static void pp(int i) {
        if (i == 1) {
            System.out.println(">>> Press 1st Position");
        } else if (i == 2) {
            System.out.println(">>> Press 2nd Position");
        } else if (i == 3) {
            System.out.println(">>> Press 3rd Position");
        } else if (i == 4) {
            System.out.println(">>> Press 4th Position");
        }
    }

    private static void pl(int i) {
        System.out.println(">>> Press Label " + i);
    }

    private static int posOf(int i) {
        String temp = "" + i;
        return s.indexOf(temp)+1;
    }

    private static int labOf(int po) {
        return Integer.parseInt(s.substring(po-1, po));
    }
}
