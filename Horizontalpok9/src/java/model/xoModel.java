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

    private int turn,tieScore,winScorePlayer1,winScorePlayer2;


    
    private byte[] arrayOfBoard = new byte[9];


    public int getTurn() {
        return turn;
    }


   

    public byte[] getArrayOfBoard() {
        return arrayOfBoard;
        
    }

    public void setArrayOfBoard(byte[] arrayOfBoard) {
        this.arrayOfBoard = arrayOfBoard;
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


    int checkTurn(int turn) {
        int afterMod = turn%2;
        return afterMod;
    }


    
    
    
    
    

    public boolean checkDiagoanl() {
        boolean result = false;
        if (this.arrayOfBoard[1] != 0) {
            if (this.arrayOfBoard[0] == this.arrayOfBoard[4] && this.arrayOfBoard[0] == this.arrayOfBoard[8]) {
                result = true;
            } else if (this.arrayOfBoard[2] == this.arrayOfBoard[4] && this.arrayOfBoard[2] == this.arrayOfBoard[6]) {
                result = true;
            }
        }

        return result;
    }


}
