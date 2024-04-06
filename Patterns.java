import StringPraactice.countNumber;

public class Patterns {
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void Holo_bolo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Number_Para(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void flod_Pattern(int n) {
        int counter = 1;
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // InnerLoop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void Half_Binary(int n) {
        // Outer Loop
        for (int i = 0; i <= n; i++) {
            // Inner Loop
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // ButterFly Pattern
    public static void Butter_Fly(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2 nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // Solid Rombus
    public static void Solid_Rombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // holow Rombus
    public static void Holo_Rombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2 nd half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        // hollow_rectangle(5, 8);
        // Holo_bolo(8);
        // Number_Para(7);
        // flod_Pattern(7);
        // Half_Binary(7);
        // Butter_Fly(8);
        // Solid_Rombus(5);
        // Holo_Rombus(7);
        Diamond(8);

    }

}