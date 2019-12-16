package ЛР1;

public class Fourth {
    public static void main(String[] args) {
        //создание квадратной матрицы
        int mtx[][] = new int[3][3];
        // цикл заполнения
        for (int i = 0; i < mtx.length; i++) {
            System.out.println();
            for (int j = 0; j < mtx[i].length; j++) {

                /*  1 вариант
                mtx [0] [0] = 1;
                mtx [1] [1] = 1;
                mtx [2] [2] = 1;
                */

                // 2 вариант
                if (i == j) {
                    mtx[i][j] = 1;
                }
                if (j == mtx.length) {
                    mtx[i][j] = 1;
                }
                System.out.print(mtx[i][j] + "    ");
                //System.out.print(i + "," + j + "  ");
            }
        }
    }
}