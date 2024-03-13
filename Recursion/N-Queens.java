import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean arr[][] = new boolean[n][n];
        List<List<String>> ll = new ArrayList<>();
        solver(arr, n, 0, ll);
        return ll;
    }

    public static void solver(boolean arr[][], int tq, int row, List<List<String>> ll) {
        if (tq == 0) {
            func(arr, ll);
            return;
        }
        for (int col = 0; col < arr[0].length; col++) {
            if (isSafe(arr, row, col)) {
                arr[row][col] = true;
                solver(arr, tq - 1, row + 1, ll); // Incrementing row properly
                arr[row][col] = false; // Resetting the position
            }
        }
    }

    public static boolean isSafe(boolean arr[][], int row, int col) {
        int r = row;
        int c = col;
        while (r >= 0) {
            if (arr[r][col]) {
                return false;
            }
            r--;
        }
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (arr[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r >= 0 && c < arr[0].length) {
            if (arr[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void func(boolean arr[][], List<List<String>> ll) {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]) {
                    s.append("Q");
                } else {
                    s.append(".");
                }
            }
            l.add(s.toString());
        }
        ll.add(l);
    }
}
