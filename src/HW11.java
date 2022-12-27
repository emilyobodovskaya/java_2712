import java.util.Scanner;
public class HW11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Parameter of N:\n");
        int n = scanner.nextInt();
        System.out.print("Parameter of M:\n");
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        System.out.println("\nMatrix:\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = m*i + j;
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println();
        System.out.println("Transport matrix:");
        System.out.println();
        for (int[] ints : b) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }
