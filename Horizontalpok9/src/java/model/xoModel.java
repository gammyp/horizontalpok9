/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.reflect.Array;

/**
 *
 * @author abyss
 */
public class xoModel {
<<<<<<< HEAD
    private int turn,tieScore,winScorePlayer1,winScorePlayer2;
    private String player1,player2;
    private int[] arrayOfBoard;

    public xoModel() {
        this.turn = 1;
        this.tieScore = 0;
        this.winScorePlayer1 = 0;
        this.winScorePlayer2 = 0;
        this.player1 = "Player1";
        this.player2 = "Player2";
        this.arrayOfBoard = new int[9];
    }

=======


    private int turn,tieScore,winScorePlayer1,winScorePlayer2;
    private int[] arrayOfBoard = new int[9];


>>>>>>> 084582572b2acbd743a1d7e610de6eb847a6571f
    public int getTurn() {
        return turn;
    }

<<<<<<< HEAD
=======
    public int[] getArrayOfBoard() {
        return arrayOfBoard;
        
    }

    public void setArrayOfBoard(int[] arrayOfBoard) {
        this.arrayOfBoard = arrayOfBoard;
    }


>>>>>>> 084582572b2acbd743a1d7e610de6eb847a6571f
    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getTieScore() {
        return tieScore;
    }

    public void setTieScore(int tieScore) {
        this.tieScore = tieScore;
    }

    public int getWinScorePlayer1() {
        return winScorePlayer1;
    }

    public void setWinScorePlayer1(int winScorePlayer1) {
        this.winScorePlayer1 = winScorePlayer1;
    }

    public int getWinScorePlayer2() {
        return winScorePlayer2;
    }

    public void setWinScorePlayer2(int winScorePlayer2) {
        this.winScorePlayer2 = winScorePlayer2;
    }

<<<<<<< HEAD
    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
    
    public int[] getArrayOfBoard() {
        return arrayOfBoard;
    }
    
    public void insertValueToArray(int selected, int value) {
        if (this.arrayOfBoard[selected] == 0) {
            this.arrayOfBoard[selected] = value;
        } else {
            System.err.println("This block had value!!");
        }
    }
=======

    int checkTurn(int turn) {
        int afterMod = turn%2;
        int symbolXO = 1;
        if(afterMod==0){
             symbolXO = 2;
        }else{
             symbolXO = 1;
        }
        return symbolXO;
    }   

    public void setArrayOfBoard(int i,int val) {
        this.arrayOfBoard[i] = val;
    }

>>>>>>> 084582572b2acbd743a1d7e610de6eb847a6571f
    
    public boolean checkDiagoanl(int player) {
        boolean result = false;
        
            if (this.arrayOfBoard[0] == player && this.arrayOfBoard[4] == player && this.arrayOfBoard[8] == player) {
                result = true;
            } else if (this.arrayOfBoard[2] == player && this.arrayOfBoard[4] == player && this.arrayOfBoard[6] == player) {
                result = true;
            }
        

        return result;
    }


}
