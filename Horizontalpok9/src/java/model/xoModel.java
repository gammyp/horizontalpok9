/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author abyss
 */
public class xoModel {

    private int turn, tieScore, winScorePlayer1, winScorePlayer2;
    private int[] arrayOfBoard = new int[9];

    public int getTurn() {
        return turn;
    }

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

    public int[] getArrayOfBoard() {
        return arrayOfBoard;
    }

    public void setArrayOfBoard(int i,int val) {
        this.arrayOfBoard[i] = val;
    }

    
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
