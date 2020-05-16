package kcg;

public class A_2 {
    public static void main(String[] args) {

        int [][] a = new int [3][2];
        int [][] b = {{1,2}, {3,4}, {5,6}};
        int [][][] c = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {10, 11, 12}
                },
                {
                        {13, 14, 15},
                        {16, 17, 18},
                        {19, 20, 21},
                        {22, 23, 24}
                }
        };

        int i, j, k;
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c[0].length; j++) {
                for (k = 0; k < c[0][0].length; k++) {
                    System.out.print(c[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
