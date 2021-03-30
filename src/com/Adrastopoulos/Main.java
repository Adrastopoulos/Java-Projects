package com.Adrastopoulos;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        char[][] gameBoard={
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };
        boolean winner=false;
        while(!winner) {
            System.out.println("Pick a board position (1-9)");

            Scanner scanner=new Scanner(System.in);
            placePiece("player", scanner.nextInt(), gameBoard);
            printGameBoard(gameBoard);
            winner=checkWinner("player", gameBoard);

            if(winner) break;

            System.out.println("CPU turn!");
            placePiece("computer", (int)(1+Math.random()*9), gameBoard);
            printGameBoard(gameBoard);

            winner=checkWinner("cpu", gameBoard);
        }
    }

    public static void printGameBoard(char[][] board) {
        for(char[] row:board) {
            for(char c:row) System.out.print(c);
            System.out.println();
        }
    }

    public static void placePiece(String user, int pos, char[][] gameBoard) {
        char symbol;
        if(user.equals("player")) symbol='X';
        else symbol='O';
        if(gameBoard[((pos-1)/3)*2][(pos-1)%3*2]==' ') {
            switch (pos) {
                default:
                    break;
                case 1:
                    gameBoard[0][0] = symbol;
                    break;
                case 2:
                    gameBoard[0][2] = symbol;
                    break;
                case 3:
                    gameBoard[0][4] = symbol;
                    break;
                case 4:
                    gameBoard[2][0] = symbol;
                    break;
                case 5:
                    gameBoard[2][2] = symbol;
                    break;
                case 6:
                    gameBoard[2][4] = symbol;
                    break;
                case 7:
                    gameBoard[4][0] = symbol;
                    break;
                case 8:
                    gameBoard[4][2] = symbol;
                    break;
                case 9:
                    gameBoard[4][4] = symbol;
                    break;
            }
        }
        else {
            if(user.equals("player")) {
                System.out.println("Position Occupied!");
                System.out.println("Pick a board position (1-9)");
                Scanner scanner = new Scanner(System.in);
                placePiece(user, scanner.nextInt(), gameBoard);
            }
            else placePiece("computer", (int)(1+Math.random()*9), gameBoard);
        }
    }
    public static boolean checkWinner(String user, char[][] gameBoard) {
        char symbol = user.equals("player") ? 'X': 'O';
        // 0,0 0,2 0,4 row 1
        if (gameBoard[0][0] == symbol && gameBoard[0][2] == symbol && gameBoard[0][4] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        // 2,0 2,2 2,4 row 2
        if (gameBoard[2][0] == symbol && gameBoard[2][2] == symbol && gameBoard[2][4] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        // 4,0 4,2 4,4 row 3
        if (gameBoard[4][0] == symbol && gameBoard[4][2] == symbol && gameBoard[4][4] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        // 0,0 2,0 4,0 column 1
        if (gameBoard[0][0] == symbol && gameBoard[2][0] == symbol && gameBoard[4][0] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        // 0,2 2,2 4,2 column 2
        if (gameBoard[0][2] == symbol && gameBoard[2][2] == symbol && gameBoard[4][2] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        // 0,4 2,4 4,4 column 3
        if (gameBoard[0][4] == symbol && gameBoard[2][4] == symbol && gameBoard[4][4] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        // 0,0 2,2 4,4 dialog 1
        if (gameBoard[0][0] == symbol && gameBoard[2][2] == symbol && gameBoard[4][4] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        // 0,4 2,2 4,0 dialog 2
        if (gameBoard[0][4] == symbol && gameBoard[2][2] == symbol && gameBoard[4][0] == symbol) {
            System.out.println(user+" has won!");
            return true;
        }
        return false;
    }
}


