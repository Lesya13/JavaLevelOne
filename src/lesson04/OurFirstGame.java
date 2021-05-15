package lesson04;

import java.util.Random;
import java.util.Scanner;

public class OurFirstGame {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char emptyField = '_';

    public static Scanner pencil = new Scanner(System.in);
    public static Random random = new Random();



    public static void main(String[] args) {
        createMap();
        printMap();

        while (true) {
            // ход человека
            turnHuman();
            printMap();
            // проверка: если победа человека или ничья:
            if (win(human)) {
                System.out.println("Human win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }
            // ход компьютера
            turnAi();
            printMap();
            // проверка: если победа компьютера или ничья:
            if (win(ai)) {
                System.out.println("AI is win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }
        }
        System.out.println("Game over");
    }

    public static void createMap() {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = emptyField;
            }
        }
    }

    public static void printMap() {
        System.out.print(" ");

        for (int i = 0; i < mapSizeX * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : (i / 2 + 1) );
        }
        System.out.println();

        for (int y = 0; y < mapSizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void turnHuman() {
        int x;
        int y;

        do {
            System.out.println("Enter your coordinates from 1 until " + mapSizeY + " : ");
            x = pencil.nextInt() -1;
            y = pencil.nextInt() -1;

        } while (!validField(y, x) || !emptyField(y, x));
        map[y][x] = human;
        System.out.println("Your move is [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static void turnAi() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX); //[0,3)
            y = random.nextInt(mapSizeY); //[0,3)
        } while (!emptyField(y, x));

        map[y][x] = ai;
        System.out.println("AI move is [" + (x + 1) + ":" + (y + 1) + "]");

    }

    public static boolean  win(char player) {

        if(map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if(map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if(map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if(map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if(map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if(map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        if(map[0][1] == player && map[1][1] == player && map[2][2] == player) return true;
        if(map[0][2] == player && map[1][2] == player && map[2][0] == player) return true;

        return false;
    }

    public static boolean fullMap() {
        for (int y = 0; y < mapSizeX; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validField(int y, int x) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean emptyField(int y, int x) {
        return map[y][x] == emptyField;
    }
}
