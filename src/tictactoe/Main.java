package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] board = new char[9];
        int i = 0;
        for (int j = 0; j< 9; j++){
            board[j] = (char)(j+1 + (int)'0') ;
        }
        boolean p1turn = true;
        Scanner sc = new Scanner(System.in);

        while(i<9){
            printBoard(board);
            if (p1turn){
                System.out.println("Player X ,please enter your move no");
                int x = sc.nextInt();
                if(x <=0 || x > 9 || board[x-1] =='X'  || board [x-1] == 'O'){
                    System.out.println("Please enter a valid move");
                    continue;
                }
                board[x-1] = 'X';
            }else{
                System.out.println("Player O ,please enter your move no");
                int x = sc.nextInt();
                if(x <=0 || x > 9 || board[x-1] =='X'  || board [x-1] == 'O'){
                    System.out.println("Please enter a valid move");
                    continue;
                }
                board[x-1] = 'O';
            }
            if(checkWinner(board)) break;
            p1turn = !p1turn;
            i++;
        }
        System.out.println("Draw");
    }
    public  static void printBoard(char[] board){
        for(int i = 0; i< 9; i++){
            System.out.print(" " + board[i] +" ");
            if(i%3 ==2 ) System.out.println();

        }
    }
    public static boolean checkWinner(char[] board){
        char winner = 'X';
        if(board[0] == board[1] && board[0] == board[2]) winner = board[0];
        else if (board[3] == board[4]  && board[4] == board[5]) winner = board[3];
        else if (board[6] == board[7]  && board[7] == board[8]) winner = board[6];
        else if (board[0] == board[3]  && board[3] == board[6]) winner = board[0];
        else if (board[2] == board[5]  && board[5] == board[8]) winner = board[2];
        else if (board[1] == board[4]  && board[4] == board[7]) winner = board[1];
        else if (board[0] == board[4]  && board[4] == board[8]) winner = board[0];
        else if (board[2] == board[4]  && board[4] == board[6]) winner = board[2];
        else{
            return false;
        }
        System.out.println("Player " + winner + " won");
        printBoard(board);
        System.exit(0);
        return true;
    }
}
