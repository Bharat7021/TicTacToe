import java.util.*;

public class ticTacToe {
    static String base[][] = { { " ", "_", " ", "_", " ", "_", " " },
            { "|", " ", "|", " ", "|", " ", "|" },
            { " ", "_", " ", "_", " ", "_", " " },
            { "|", " ", "|", " ", "|", " ", "|" },
            { " ", "_", " ", "_", " ", "_", " " },
            { "|", " ", "|", " ", "|", " ", "|" },
            { " ", "_", " ", "_", " ", "_", " " } };
    static int inp[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int i = 0;
    static int test() {
        if (((base[1][1] == "X") && (base[1][3] == "X") && (base[1][5] == "X"))
                || ((base[3][1] == "X") && (base[3][3] == "X") && (base[3][5] == "X"))
                || ((base[5][1] == "X") && (base[5][3] == "X") && (base[5][5] == "X"))
                || ((base[1][1] == "X") && (base[3][1] == "X") && (base[5][1] == "X"))
                || ((base[1][3] == "X") && (base[3][3] == "X") && (base[5][3] == "X"))
                || ((base[1][5] == "X") && (base[3][5] == "X") && (base[5][5] == "X"))
                || ((base[1][1] == "X") && (base[3][3] == "X") && (base[5][5] == "X"))
                || ((base[1][5] == "X") && (base[3][3] == "X") && (base[5][1] == "X"))) {
            return 1;
        }
        if (((base[1][1] == "O") && (base[1][3] == "O") && (base[1][5] == "O"))
                || ((base[3][1] == "O") && (base[3][3] == "O") && (base[3][5] == "O"))
                || ((base[5][1] == "O") && (base[5][3] == "O") && (base[5][5] == "O"))
                || ((base[1][1] == "O") && (base[3][1] == "O") && (base[5][1] == "O"))
                || ((base[1][3] == "O") && (base[3][3] == "O") && (base[5][3] == "O"))
                || ((base[1][5] == "O") && (base[3][5] == "O") && (base[5][5] == "O"))
                || ((base[1][1] == "O") && (base[3][3] == "O") && (base[5][5] == "O"))
                || ((base[1][5] == "O") && (base[3][3] == "O") && (base[5][1] == "O"))) {
            return 2;
        } else {
            return 0;
        }
    }

    static void checkp1(int k) {
        if (inp[k] == 0) {
            inp[k] = 1;
            switch (k) {
                case 0:
                    base[1][1] = "X";
                    break;
                case 1:
                    base[1][3] = "X";
                    break;
                case 2:
                    base[1][5] = "X";
                    break;
                case 3:
                    base[3][1] = "X";
                    break;
                case 4:
                    base[3][3] = "X";
                    break;
                case 5:
                    base[3][5] = "X";
                    break;
                case 6:
                    base[5][1] = "X";
                    break;
                case 7:
                    base[5][3] = "X";
                    break;
                case 8:
                    base[5][5] = "X";
                    break;
            }
        } else {
            i--;
        }
    }

    static void checkp2(int k) {
        if (inp[k] == 0) {
            inp[k] = 1;
            switch (k) {
                case 0:
                    base[1][1] = "O";
                    break;
                case 1:
                    base[1][3] = "O";
                    break;
                case 2:
                    base[1][5] = "O";
                    break;
                case 3:
                    base[3][1] = "O";
                    break;
                case 4:
                    base[3][3] = "O";
                    break;
                case 5:
                    base[3][5] = "O";
                    break;
                case 6:
                    base[5][1] = "O";
                    break;
                case 7:
                    base[5][3] = "O";
                    break;
                case 8:
                    base[5][5] = "O";
                    break;
            }
        } else {
            i--;
        }
    }

    public static void main(String args[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 4);
        map.put(6, 5);
        map.put(7, 6);
        map.put(8, 7);
        map.put(9, 8);
        // int base[][] =
        // {{1,1,1},{2,1,3},{3,1,5},{4,3,1},{5,3,3},{6,3,5},{7,5,1},{8,5,3},{9,5,5}};
        Scanner a = new Scanner(System.in);
        for (i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Player 1 enter the box number to continue: ");
                int p1 = a.nextInt();
                if (map.containsKey(p1)) {
                    checkp1(map.get(p1));
                } else {
                    i--;
                    continue;
                }
            } else if (i % 2 != 0) {
                System.out.println("Player 2 enter the box number to continue: ");
                int p2 = a.nextInt();
                if (map.containsKey(p2)) {
                    checkp2(map.get(p2));
                } else {
                    i--;
                    continue;
                }
            } else {
                System.out.println("Enter a valid input");
            }
            for (int k = 0; k < 7; k++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(base[k][j]);
                }
                System.out.println("\t");
            }
            int ans = test();
            if (ans == 1) {
                System.out.println("Player 1 wins");
                break;
            } else if (ans == 2) {
                System.out.println("Player 2 wins");
                break;
            } else {
                continue;
            }
        }
    }
}