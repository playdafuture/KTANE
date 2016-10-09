package BombDefusal;

public class module_maze {
    //All possible paths
    static final String[][] maze_1 = {
        {"Y5","X5","X6","C6","C5","B5","A5","A6","B6"}, //1-2
        {"Y5","X5","X6","C6","C5","B5","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","B4"}, //1-3
        {"Y5","X5","X6","C6","C5","B5","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","X4","X3","Y3","Z3","Z2","Y2","X2","X1","Y1","Z1"}, //1-4
        {"Y5","X5","X6","C6","C5","B5","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","X4","X3","Y3","Z3","Z4","Y4"}, //1-5
        {"Y5","X5","X6","C6","C5","B5","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","X4","X3","Y3","Z3","Z4","Z5","Z6","Y6"}, //1-6
        {"B6","A6","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","B4"}, //2-3
        {"B6","A6","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","X4","X3","Y3","Z3","Z2","Y2","X2","X1","Y1","Z1"}, //2-4
        {"B6","A6","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","X4","X3","Y3","Z3","Z4","Y4"}, //2-5
        {"B6","A6","A5","A4","A3","A2","A1","B1","C1","C2",
            "B2","B3","C3","C4","X4","X3","Y3","Z3","Z4","Z5","Z6","Y6"}, //2-6
        {"B4","C4","X4","X3","Y3","Z3","Z2","Y2","X2","X1","Y1","Z1"}, //3-4
        {"B4","C4","X4","X3","Y3","Z3","Z4","Y4"}, //3-5
        {"B4","C4","X4","X3","Y3","Z3","Z4","Z5","Z6","Y6"}, //3-6
        {"Y4","Z4","Z3","Z2","Y2","X2","X1","Y1","Z1"}, //4-5 (reverse)
        {"Y6","Z6","Z5","Z4","Z3","Z2","Y2","X2","X1","Y1","Z1"}, //4-6 (reverse)
        {"Y4","Z4","Z5","Z6","Y6"} //5-6
    };
    static final String[][] maze_2 = {
        {"A1","B1","C1"}, //1-2
        {"A1","B1","B2","A2","A3","A4","A5","A6"}, //1-3
        {"A1","B1","B2","A2","A3","A4","B4","B3","C3","C2","X2","X1","Y1","Z1"}, //1-4
        {"A1","B1","B2","A2","A3","A4","B4","B3","C3","C2","X2","X1","Y1","Y2",
            "Z2","Z3","Z4","Z5","Z6","Y6","X6","X5","Y5","Y4"}, //1-5
        {"A1","B1","B2","A2","A3","A4","B4","B3","C3","C2","X2","X1","Y1","Y2",
            "Z2","Z3","Y3","X3","X4","C4","C5","C6","B6","B5"}, //1-6
        {"C1","B1","B2","A2","A3","A4","A5","A6"}, //2-3
        {"C1","B1","B2","A2","A3","A4","B4","B3","C3","C2","X2","X1","Y1","Z1"}, //2-4
        {"C1","B1","B2","A2","A3","A4","B4","B3","C3","C2","X2","X1","Y1","Y2",
            "Z2","Z3","Z4","Z5","Z6","Y6","X6","X5","Y5","Y4"}, //2-5
        {"C1","B1","B2","A2","A3","A4","B4","B3","C3","C2","X2","X1","Y1","Y2",
            "Z2","Z3","Y3","X3","X4","C4","C5","C6","B6","B5"}, //2-6
        {"A6","A5","A4","B4","B3","C3","C2","X2","X1","Y1","Z1"}, //3-4
        {"A6","A5","A4","B4","B3","C3","C2","X2","X1","Y1","Y2",
            "Z2","Z3","Z4","Z5","Z6","Y6","X6","X5","Y5","Y4"}, //3-5
        {"A6","A5","A4","B4","B3","C3","C2","X2","X1","Y1","Y2",
            "Z2","Z3","Y3","X3","X4","C4","C5","C6","B6","B5"}, //3-6
        {"Z1","Y1","Y2","Z2","Z3","Z4","Z5","Z6","Y6","X6","X5","Y5","Y4"}, //4-5
        {"Z1","Y1","Y2","Z2","Z3","Y3","X3","X4","C4","C5","C6","B6","B5"}, //4-6
        {"Y4","Y5","X5","X6","Y6","Z6","Z5","Z4",
            "Z3","Y3","X3","X4","C4","C5","C6","B6","B5"} //5-6        
    };
    static final String[][] maze_3 = {
        {"A2","A1","B1","C1","C2","C3","C4","C5","B5","B4","B3","B2"}, //1-2
        {"A2","A1","B1","C1","C2","C3","C4","C5","B5","B4","B3","A3","A4",
            "A5","A6","B6","C6","X6","X5","X4","X3","Y3","Y4","Y5","Y6","Z6",
            "Z5","Z4","Z3","Z2","Z1","Y1","Y2","X2","X1"}, //1-3
        {"B2","B3","A3","A4","A5","A6","B6","C6","X6","X5","X4","X3","Y3",
            "Y4","Y5","Y6","Z6","Z5","Z4","Z3","Z2","Z1","Y1","Y2","X2","X1"} //2-3   
    };
    static final String[][] maze_4 = {
        {"X6","Y6","Y5","X5","C5","B5","A5","A6","B6","C6"}, //1-2
        {"X6","Y6","Y5","X5","C5","B5","A5","A4","A3","A2","A1","B1","B2","B3",
            "C3","C2","X2","Y2","Z2","Z1","Y1","X1","C1"}, //1-3
        {"X6","Y6","Y5","X5","C5","B5","A5","A4","A3","A2","A1","B1","B2","B3",      
            "C3","C2","X2","Y2","Z2","Z3","Z4","Y4","X4","C4","B4"}, //1-4
        {"X6","Y6","Y5","X5","C5","B5","A5","A4","A3","A2","A1","B1","B2","B3",
            "C3","C2","X2","Y2","Z2","Z3","Z4","Y4","X4","X3","Y3"}, //1-5
        {"X6","Y6","Y5","X5","C5","B5","A5","A4","A3","A2","A1","B1","B2","B3",
            "C3","C2","X2","Y2","Z2","Z3","Z4","Z5","Z6"}, //1-6
        {"C6","B6","A6","A5","A4","A3","A2","A1","B1","B2","B3","C3","C2","X2",
            "Y2","Z2","Z1","Y1","X1","C1"}, //2-3
        {"C6","B6","A6","A5","A4","A3","A2","A1","B1","B2","B3","C3","C2","X2",
            "Y2","Z2","Z3","Z4","Y4","X4","C4","B4"}, //2-4
        {"C6","B6","A6","A5","A4","A3","A2","A1","B1","B2","B3","C3","C2","X2",
            "Y2","Z2","Z3","Z4","Y4","X4","X3","Y3"}, //2-5
        {"C6","B6","A6","A5","A4","A3","A2","A1","B1","B2","B3","C3","C2","X2",
            "Y2","Z2","Z3","Z4","Z5","Z6"}, //2-6
        {"C1","X1","Y1","Z1","Z2","Z3","Z4","Y4","X4","C4","B4"}, //3-4
        {"C1","X1","Y1","Z1","Z2","Z3","Z4","Y4","X4","X3","Y3"}, //3-5
        {"C1","X1","Y1","Z1","Z2","Z3","Z4","Z5","Z6"}, //3-6
        {"B4","C4","X4","X3","Y3"}, //4-5
        {"B4","C4","X4","Y4","Z4","Z5","Z6"}, //4-6
        {"Y3","X3","X4","Y4","Z4","Z5","Z6"} //5-6     
    };
    static final String[][] maze_5 = {
        {"A1","B1","C1","X1","Y1","Z1","Z2"}, //1-2
        {"A1","B1","C1","X1","Y1","Y2","X2","X3","C3"}, //1-3
        {"A1","B1","C1","X1","Y1","Y2","X2","C2","B2","A2","A3","A4","A5","A6"}, //1-4
        {"A1","B1","C1","X1","Y1","Y2","X2","C2","B2","A2","A3","B3","B4","C4",
            "X4","X5","Y5"}, //1-5
        {"A1","B1","C1","X1","Y1","Y2","X2","C2","B2","A2","A3","B3","B4","C4",
            "X4","X5","C5","B5","B6","C6","X6","Y6","Z6","Z5","Z4","Z3","Y3","Y4"}, //1-6
        {"Z2","Z1","Y1","Y2","X2","X3","C3"}, //2-3
        {"Z2","Z1","Y1","Y2","X2","C2","B2","A2","A3","A4","A5","A6"}, //2-4
        {"Z2","Z1","Y1","Y2","X2","C2","B2","A2","A3","B3","B4","C4","X4","X5","Y5"}, //2-5
        {"Z2","Z1","Y1","Y2","X2","C2","B2","A2","A3","B3","B4","C4","X4","X5",
            "C5","B5","B6","C6","X6","Y6","Z6","Z5","Z4","Z3","Y3","Y4"}, //2-6
        {"C3","X3","X2","C2","B2","A2","A3","A4","A5","A6"}, //3-4
        {"C3","X3","X2","C2","B2","A2","A3","B3","B4","C4","X4","X5","Y5"}, //3-5
        {"C3","X3","X2","C2","B2","A2","A3","B3","B4","C4","X4","X5","C5","B5",
            "B6","C6","X6","Y6","Z6","Z5","Z4","Z3","Y3","Y4"}, //3-6
        {"A6","A5","A4","A3","B3","B4","C4","X4","X5","Y5"}, //4-5
        {"A6","A5","A4","A3","B3","B4","C4","X4","X5","C5","B5","B6","C6","X6",
            "Y6","Z6","Z5","Z4","Z3","Y3","Y4"}, //4-6
        {"Y5","X5","C5","B5","B6","C6","X6","Y6","Z6","Z5","Z4","Z3","Y3","Y4"} //5-6     
    };
    static final String[][] maze_6 = {
        {"A1","A2","A3","B3","B2","B1","C1","C2","C3"}, //1-2
        {"A1","A2","A3","A4","B4","B5","A5","A6","B6","C6","X6","X5","X4","C4","C5"}, //1-3
        {"A1","A2","A3","A4","B4","B5","A5","A6","B6","C6","X6","X5","X4","X3",
            "X2","Y2","Y1","X1"}, //1-4
        {"A1","A2","A3","A4","B4","B5","A5","A6","B6","C6","X6","X5","X4","X3",
            "X2","Y2","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z4"}, //1-5
        {"A1","A2","A3","A4","B4","B5","A5","A6","B6","C6","X6","X5","X4","X3",
            "X2","Y2","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z6","Y6"}, //1-6
        {"C3","C2","C1","B1","B2","B3","A3","A4","B4","B5","A5","A6","B6","C6",
            "X6","X5","X4","C4","C5"}, //2-3
        {"C3","C2","C1","B1","B2","B3","A3","A4","B4","B5","A5","A6","B6","C6",
            "X6","X5","X4","X3","X2","Y2","Y1","X1"}, //2-4
        {"C3","C2","C1","B1","B2","B3","A3","A4","B4","B5","A5","A6","B6","C6",
            "X6","X5","X4","X3","X2","Y2","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z4"}, //2-5
        {"C3","C2","C1","B1","B2","B3","A3","A4","B4","B5","A5","A6","B6","C6",
            "X6","X5","X4","X3","X2","Y2","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z6","Y6"}, //2-6
        {"C5","C4","X4","X3","X2","Y2","Y1","X1"}, //3-4
        {"C5","C4","X4","X3","X2","Y2","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z4"}, //3-5
        {"C5","C4","X4","X3","X2","Y2","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z6","Y6"}, //3-6
        {"X1","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z4"}, //4-5
        {"X1","Y1","Z1","Z2","Z3","Y3","Y4","Y5","Z5","Z6","Y6"}, //4-6
        {"Z4","Z5","Z6","Y6"} //5-6     
    };
    static final String[][] maze_7 = {
        {"C2","B2","B3","A3","A2","A1","B1","C1","X1","X2","Y2","Y1","Z1","Z2",
            "Z3","Y3","Y4","X4","C4","C3","X3"}, //1-2
        {"C2","B2","B3","A3","A2","A1","B1","C1","X1","X2","Y2","Y1","Z1","Z2",
            "Z3","Y3","Y4","X4","C4","C5","X5","Y5","Y6","Z6","Z5","Z4"}, //1-3
        {"C2","B2","B3","A3","A2","A1","B1","C1","X1","X2","Y2","Y1","Z1","Z2",
            "Z3","Y3","Y4","X4","C4","C5","X5","Y5","Y6","X6","C6","B6","A6",
            "A5","A4","B4","B5"}, //1-4
        {"X3","C3","C4","C5","X5","Y5","Y6","Z6","Z5","Z4"}, //2-3
        {"X3","C3","C4","C5","X5","Y5","Y6","X6","C6","B6","A6","A5","A4","B4","B5"}, //2-4
        {"Z4","Z5","Z6","Y6","X6","C6","B6","A6","A5","A4","B4","B5"} //3-4    
    };
    static final String[][] maze_8 = {
        {"A1","A2","A3","A4","A5","A6","B6","B5"}, //1-2
        {"A1","A2","A3","A4","A5","A6","B6","C6","X6","Y6","Z6"}, //1-3
        {"A1","A2","B2","C2"}, //1-4
        {"A1","A2","B2","B1","C1","X1","X2","Y2","Y1","Z1","Z2","Z3","Z4","Y4","X4"}, //1-5
        {"A1","A2","B2","B1","C1","X1","X2","Y2","Y1","Z1","Z2","Z3","Z4","Y4","Y3","X3","C3","B3","B4","C4","C5","X5","Y5","Z5"}, //1-6
        {"B5","B6","C6","X6","Y6","Z6"}, //2-3
        {"B5","B6","A6","A5","A4","A3","A2","B2","C2"}, //2-4
        {"B5","B6","A6","A5","A4","A3","A2","B2","B1","C1","X1","X2","Y2","Y1",
            "Z1","Z2","Z3","Z4","Y4","X4"}, //2-5
        {"B5","B6","A6","A5","A4","A3","A2","B2","B1","C1","X1","X2","Y2","Y1",
            "Z1","Z2","Z3","Z4","Y4","Y3","X3","C3","B3","B4","C4","C5","X5","Y5","Z5"}, //2-6
        {"Z6","Y6","X6","C6","B6","A6","A5","A4","A3","A2","B2","C2"}, //3-4
        {"Z6","Y6","X6","C6","B6","A6","A5","A4","A3","A2","B2","B1","C1","X1",
            "X2","Y2","Y1","Z1","Z2","Z3","Z4","Y4","X4"}, //3-5
        {"Z6","Y6","X6","C6","B6","A6","A5","A4","A3","A2","B2","B1","C1","X1",
            "X2","Y2","Y1","Z1","Z2","Z3","Z4","Y4","Y3","X3","C3","B3","B4","C4","C5","X5","Y5","Z5"}, //3-6
        {"C2","B2","B1","C1","X1","X2","Y2","Y1","Z1","Z2","Z3","Z4","Y4","X4"}, //4-5
        {"C2","B2","B1","C1","X1","X2","Y2","Y1","Z1","Z2","Z3","Z4","Y4","Y3",
            "X3","C3","B3","B4","C4","C5","X5","Y5","Z5"}, //4-6
        {"X4","Y4","Y3","X3","C3","B3","B4","C4","C5","X5","Y5","Z5"} //5-6     
    };
    static final String[][] maze_9 = {
        {"A1","A2","A3","A4","A5","A6","B6","B5","B4"}, //1-2
        {"A1","A2","A3","B3","C3","C2","X2"}, //1-3
        {"A1","A2","A3","B3","B2","B1","C1","X1","Y1","Y2","Y3","X3","X4","C4","C5","C6","X6","X5","Y5","Y6","Z6"}, //1-4
        {"A1","A2","A3","B3","B2","B1","C1","X1","Y1","Z1","Z2","Z3","Z4","Y4"}, //1-5
        {"A1","A2","A3","B3","B2","B1","C1","X1","Y1","Z1","Z2","Z3","Z4","Z5"}, //1-6
        {"B4","B5","B6","A6","A5","A4","A3","B3","C3","C2","X2"}, //2-3
        {"B4","B5","B6","A6","A5","A4","A3","B3","B2","B1","C1","X1","Y1","Y2","Y3","X3","X4","C4","C5","C6","X6","X5","Y5","Y6","Z6"}, //2-4
        {"B4","B5","B6","A6","A5","A4","A3","B3","B2","B1","C1","X1","Y1","Z1","Z2","Z3","Z4","Y4"}, //2-5
        {"B4","B5","B6","A6","A5","A4","A3","B3","B2","B1","C1","X1","Y1","Z1","Z2","Z3","Z4","Z5"}, //2-6
        {"X2","C2","C3","B3","B2","B1","C1","X1","Y1","Y2","Y3","X3","X4","C4","C5","C6","X6","X5","Y5","Y6","Z6"}, //3-4
        {"X2","C2","C3","B3","B2","B1","C1","X1","Y1","Z1","Z2","Z3","Z4","Y4"}, //3-5
        {"X2","C2","C3","B3","B2","B1","C1","X1","Y1","Z1","Z2","Z3","Z4","Z5"}, //3-6
        {"Z6","Y6","Y5","X5","X6","C6","C5","C4","X4","X3","Y3","Y2","Y1","Z1","Z2","Z3","Z4","Y4"}, //4-5
        {"Z6","Y6","Y5","X5","X6","C6","C5","C4","X4","X3","Y3","Y2","Y1","Z1","Z2","Z3","Z4","Z5"}, //4-6
        {"Y4","Z4","Z5"} //5-6     
    };
    static String[][] currentMaze;
    static String[] currentPath;
    static int startIdx, endIdx;
    
    public static void main() {
        while (true) {
            System.out.print("Enter circle coordinates: ");
            String c1 = main.sc.next();
            if (c1.equalsIgnoreCase("x")) {
                return;
            }
            String c2 = main.sc.next();
            if (c2.equalsIgnoreCase("x")) {
                return;
            }
            currentMaze = findMaze(c1,c2);
            if (currentMaze == null) {
                System.out.println("Invalid Coordinates, try again!");
            } else {
                String s,e;
                if (main.tuto) {
                    System.out.println("Starting location = white square dot");
                    System.out.println("Ending location = red triangle");
                }
                System.out.print("Enter starting and ending coordinates: ");
                s = main.sc.next();
                e = main.sc.next();
                solve(s,e);
                return;
            }
        }
    }

    private static String[][] findMaze(String c1, String c2) {
        if ((c1.equalsIgnoreCase("A2") && c2.equalsIgnoreCase("Z3"))
                || (c2.equalsIgnoreCase("A2") && c1.equalsIgnoreCase("Z3"))) {
            return maze_1;
        } else if ((c1.equalsIgnoreCase("B4") && c2.equalsIgnoreCase("Y2"))
                || (c2.equalsIgnoreCase("B4") && c1.equalsIgnoreCase("Y2"))) {
            return maze_2;
        } else if ((c1.equalsIgnoreCase("X4") && c2.equalsIgnoreCase("Z4"))
                || (c2.equalsIgnoreCase("X4") && c1.equalsIgnoreCase("Z4"))) {
            return maze_3;
        } else if ((c1.equalsIgnoreCase("A1") && c2.equalsIgnoreCase("A4"))
                || (c2.equalsIgnoreCase("A1") && c1.equalsIgnoreCase("A4"))) {
            return maze_4;
        } else if ((c1.equalsIgnoreCase("X6") && c2.equalsIgnoreCase("Y3"))
                || (c2.equalsIgnoreCase("X6") && c1.equalsIgnoreCase("Y3"))) {
            return maze_5;
        } else if ((c1.equalsIgnoreCase("C5") && c2.equalsIgnoreCase("Y1"))
                || (c2.equalsIgnoreCase("C5") && c1.equalsIgnoreCase("Y1"))) {
            return maze_6;
        } else if ((c1.equalsIgnoreCase("B1") && c2.equalsIgnoreCase("B6"))
                || (c2.equalsIgnoreCase("B1") && c1.equalsIgnoreCase("B6"))) {
            return maze_7;
        } else if ((c1.equalsIgnoreCase("C4") && c2.equalsIgnoreCase("X1"))
                || (c2.equalsIgnoreCase("C4") && c1.equalsIgnoreCase("X1"))) {
            return maze_8;
        } else if ((c1.equalsIgnoreCase("A5") && c2.equalsIgnoreCase("C2"))
                || (c2.equalsIgnoreCase("A5") && c1.equalsIgnoreCase("C2"))) {
            return maze_9;
        }
        return null;
    }

    private static void solve(String start, String end) {
        currentPath = null;
        for (int i = 0; i < currentMaze.length; i++) {
            if (find(currentMaze[i],start,end)) {
                currentPath = currentMaze[i];
                break;
            }
        }
        if (currentPath == null) {
            System.out.println("No available path found! Double check coordinates!");
        } else {
            printPath();
        }
    }

    private static boolean find(String[] path, String start, String end) {
        //path must contain both start and end to return true, otherwise return false
        Boolean foundStart = false;
        Boolean foundEnd = false;
        for (int i = 0; i < path.length; i++) {
            if (path[i].equalsIgnoreCase(start)) {
                foundStart = true;
                startIdx = i;
            } else if (path[i].equalsIgnoreCase(end)){
                foundEnd = true;
                endIdx = i;
            }
        }
        return (foundStart && foundEnd);
    }

    private static void printPath() {
        if (startIdx == endIdx) {
            System.out.println("Yeah, very funny! There's a bomb about to blow and you're kidding me");
        }
        
        if (startIdx > endIdx) {
            currentPath = reverse(currentPath);
        }
        currentPath = trim(currentPath, startIdx, endIdx);
        
        //at this point, current path is the coordinates of the actual solution
        System.out.println(">>> Total moves required: " + (currentPath.length - 1));
        for (int i = 0; i < currentPath.length - 1; i++) {
            String from = currentPath[i];
            String to = currentPath[i+1];
            if (i%3 == 0 && i > 0) {
                System.out.println(); //every 3 moves make a new line
            }
            if (from.charAt(0) == to.charAt(0)) {
                //same column, either up or down
                if (from.charAt(1) < to.charAt(1)) {
                    System.out.print("DOWN ");
                } else {
                    System.out.print("UP ");
                }
            } else {
                //Either left or right
                if (from.charAt(0) < to.charAt(0)) {
                    System.out.print("RIGHT ");
                } else {
                    System.out.print("LEFT ");
                }
            }
            
        }
        System.out.println();
    }

    private static String[] reverse(String[] s) {
        int l = s.length;
        String[] result = new String[l];
        for (int i = 0; i < l; i++) {
            result[i] = s[l - i - 1];
        }
        startIdx = l - startIdx - 1;
        endIdx = l - endIdx - 1;
        return result;
    }
    private static String[] trim(String[] s, int start, int end) {
        int newLength = end - start + 1;
        String[] newS = new String[newLength];
        for (int i = 0; i < newLength; i++) {
            newS[i] = s[start+i];
        }
        return newS;
    }
    
    
}
