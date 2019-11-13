package kwan.org.demospringswing.learn;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameMain1 {

    public static void main(String[] args) {
        Random random = new Random();
        String [][] map = {
                {"*" , "*" , "*" , "*"},
                {"*" , "*" , "*" , "*"},
                {"*" , "*" , "*" , "*"},
                {"*" , "*" , "*" , "*"}
        };



        int playerX = 0;
        int playerY = 0;
        int enemy1X = 0;
        int enemy1Y = 0;

        List<Point> list = new ArrayList<>();
        for (int i = 0 ; i< map.length ; i++) {
            for (int j = 0 ; j< map[i].length ; j++) {
                list.add(new Point(i , j));
            }
        }

        Point point = list.remove(random.nextInt(list.size()));
        playerX = point.x;
        playerY = point.y;

        point = list.remove(random.nextInt(list.size()));
        enemy1X = point.x;
        enemy1Y = point.y;

        map[playerX][playerY] = "P";
        map[enemy1X][enemy1Y] = "E";

        while (true) {

            for (int i=0 ; i < map.length ; i++){
                for (int j = 0 ; j< map[i].length ; j++){
                    System.out.print(map[j][i] + " ");
                }
                System.out.println();
            }
            System.out.println("Nhap ban phim");
            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();
            map[playerX][playerY] = "*";
            switch (key) {
                case "a" :
                    if (playerX == 0){
                        playerX=3;
                    } else {
                        playerX -=1;
                    }

                    break;
                case "s":
                    if (playerY == 3){
                        playerY=0;
                    } else {
                        playerY +=1;
                    }

                    break;
                case "d":
                    if (playerX == 3){
                        playerX=0;
                    } else {
                        playerX +=1;
                    }

                    break;
                case "w":
                    if (playerY == 0){
                        playerY=3;
                    } else {
                        playerY -=1;
                    }

                    break;
            }

            if (playerX == enemy1X && playerY == enemy1Y) {
                System.out.println("Lost");
                break;
            }

            map[playerX][playerY] = "P";
            map[enemy1X][enemy1Y] = "*";

            enemy1Y = (enemy1Y + 1) % 4;
            map[enemy1X][enemy1Y] = "E";

            if (playerX == enemy1X && playerY == enemy1Y) {
                System.out.println("Lost");
                break;
            }

        }
    }

}
