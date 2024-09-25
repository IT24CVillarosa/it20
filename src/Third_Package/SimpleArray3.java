/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Third_Package;

/**
 *
 * @author Erick James Rubin
 */
public class SimpleArray3 {
    
    public static void main(String[] args) {
        
        char[][] ticTacToeBoard = {
            {'X', 'O', 'X'},
            {' ', 'X', 'O'},
            {'O', ' ', ' '}
        };

       
        printBoard(ticTacToeBoard);
    }

    
    public static void printBoard(char[][] board) {
        System.out.println("Tic-Tac-Toe Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < board.length - 1) System.out.println("---------");
        }
    }
}

    

