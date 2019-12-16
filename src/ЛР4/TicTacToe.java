package ЛР4;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static char [][] map = new char[3][3];
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static final int cnstnt = 1;

    public static void MapСreate () {
        for (int i = 0; i < 3; i++) { // пробег по массиву и прсотавление точек
            for (int j = 0; j < 3; j++) {
                map[i][j] = '.';
            }
        }
    }

    public static void MapRepeat() {
        System.out.println("0 1 2 3"); // проставление координат и вывод в консоль
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }                        // 2 sout - перевод строки
        System.out.println();
    }
    //
    //
    //
    public static void main (String [] args) {
        MapСreate(); // создаём карту
        MapRepeat(); // печатаем карту в консоль

        while (true) {
            manTurn(); // ход
            MapRepeat();
            if (checkWin('X')) { // проверка победы игрока
                System.out.println("Вы победили");
                break;
            }
            if (MapFull()) break;
            AITurn(); // ход компьютера
            MapRepeat();
            if (checkWin('O')) { // проверка победы компа
                System.out.println("Победил компьютер");
                break;
            }
            if (MapFull()) break;
        }
        System.out.println("Игра закончена");
    }
    //
    //
    //
    private static void manTurn () { // Человек
        int x, y;
        do {
            System.out.println("Введите координаты x и y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!CellEmpty(x,y));
        map[y][x]='X';
    }

    private static void AITurn () { // Комп
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!CellEmpty(x, y));
        map[y][x] = 'O';
    }

    public static boolean checkWin (char OX) {
        return (map[0][0] == OX && map[0][1] == OX && map[0][2] == OX)||
                (map[1][0] == OX && map[1][1] == OX && map[1][2] == OX)||
                (map[2][0] == OX && map[2][1] == OX && map[2][2] == OX)||
                (map[0][0] == OX && map[1][0] == OX && map[2][0] == OX)||
                (map[0][1] == OX && map[1][1] == OX && map[2][1] == OX)||
                (map[0][2] == OX && map[1][2] == OX && map[2][2] == OX)||
                (map[0][0] == OX && map[1][1] == OX && map[2][2] == OX)||
                (map[2][0] == OX && map[1][1] == OX && map[0][2] == OX);
    }

    private static boolean MapFull () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == '.') return false;
            }
        }
        return true;
    }

    public static boolean CellEmpty (int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) return false;
        if (map[y][x] != '.')return false;
        return true;
    }
}


// неупрощённый вид чека
/*
 public static boolean checkWin (char OX) {
        if ((map[0][0] == OX && map[0][1] == OX && map[0][2] == OX)||
                (map[1][0] == OX && map[1][1] == OX && map[1][2] == OX)||
                (map[2][0] == OX && map[2][1] == OX && map[2][2] == OX)||
                (map[0][0] == OX && map[1][0] == OX && map[2][0] == OX)||
                (map[0][1] == OX && map[1][1] == OX && map[2][1] == OX)||
                (map[0][2] == OX && map[1][2] == OX && map[2][2] == OX)||
                (map[0][0] == OX && map[1][1] == OX && map[2][2] == OX)||
                (map[2][0] == OX && map[1][1] == OX && map[0][2] == OX))return true;
        return false;
    }
 */