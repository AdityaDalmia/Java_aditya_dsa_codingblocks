public class Pattern8 {
    public static void main(String[] args) {
        int rows = 9;
        int cols = 9;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 && j == 1) || (i == 0 && j == 7) ||
                    (i == 2 && j == 3) || (i == 2 && j == 5) ||
                    (i == 4 && j == 4) ||
                    (i == 6 && j == 3) || (i == 6 && j == 5) ||
                    (i == 8 && j == 1) || (i == 8 && j == 7)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
